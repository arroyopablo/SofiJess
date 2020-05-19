package modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOCliente extends Cliente{
    controlador.ControladorConectarDB objConecta;
    DefaultTableModel modeloTabla;
    public DAOCliente(){
        objConecta = new  controlador.ControladorConectarDB();
        
    }
    
    public void insertar(){
        String sql = "INSERT INTO cliente (nombreClien, apellidoClien,cedulaClien,telefonoClien,direccionClien,"
                     + "barrioClien,correoelectro) VALUES('"+ super.getNombreCli() +"', '"+ super.getApellidoCli() 
                     +"', "+ super.getCedulaCli() +", "+ super.getTelefonoCli() +", '"+ super.getDireccionCli() 
                     +"', '"+super.getBarrioCli()+ "','" + super.getCorreoCli()+"')";
        objConecta.insertar(sql);
    }
    
    public String consultarCliente(){
        String SQL = "SELECT * FROM cliente WHERE cedulaClien = " + super.getCedulaCli();
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
           
            if(rs.next()){
                String nombreClien = rs.getString(1);
                String apellidoClien = rs.getString(2);
                String telefonoClien = rs.getString(4);
                String direccionClien = rs.getString(5);
                String barrioClien = rs.getString(6);
                String correoClien = rs.getString(7);
                
                return ("NOMBRE: "+ nombreClien +"\n "+" \n"+ "APELLIDO: "+ apellidoClien +"\n "+" \n"
                       +"TELEFONO: "+ telefonoClien + "\n "+" \n"+"DIRECCION: "+direccionClien +" \n"
                       +" \n"+"BARRIO: "+ barrioClien + " \n"+" \n"+"CORREO: " + correoClien);
            }else{
                JOptionPane.showMessageDialog(null, "Error el cliente no se encuentra registrado");
                return "No esta";
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String eliminar(){
        String SQL = "DELETE FROM cliente WHERE cedulaClien = "+ super.getCedulaCli();
        String resultado = "";
        resultado = objConecta.eliminar(SQL);
        return resultado;
    }

    public String modificar(){
        String SQL = "UPDATE  cliente SET nombreClien = '"+super.getNombreCli()+ "', apellidoClien = '"
                +super.getApellidoCli()+"', telefonoClien = "+ super.getTelefonoCli()+", direccionClien = '"
                +super.getDireccionCli()+"',barrioClien = '"+super.getBarrioCli() + "', correoelectro = '" + super.getCorreoCli()
                +"' WHERE cedulaClien = " + super.getCedulaCli();
        String resultado = "";
        resultado = objConecta.modifica(SQL);
        return resultado;
    }
    
    
    public String consultarNombre(){
        String SQL = "SELECT * FROM cliente WHERE cedulaClien = " + super.getCedulaCli();
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
        
            if(rs.next()){
                String nombreCli = rs.getString(1);
               
                return (nombreCli);
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String consultarExitencia (){
        String SQL = "SELECT * FROM cliente WHERE cedulaClien = " + super.getCedulaCli();
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
        
            if(rs.next()){  
                return ("");
            }else {
                return ("No esta");
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
     public void listarC(String valor, String filtro, JTable tabla) {
        String[] columnas = {"NOMBRE", "APELLIDO", "CEDULA", "TELEFONO", "DIRECCION", "BARRIO", "CORREO"};
        String[] registros = new String[7];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL;
        
        if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM cliente WHERE nombreClien LIKE '%" + valor + "%'";
        } else if (filtro.equals("Barrio")) {
            SQL = "SELECT *"
                    + "FROM cliente WHERE barrioClien LIKE '%" + valor + "%'";
        } else if (filtro.equals("Todos")) {
            SQL = "SELECT *"
                    + "FROM cliente";
        } else {
            SQL = "SELECT *"
                    + "FROM cliente WHERE apellidoClien LIKE '%" + valor + "%'";
        }
        try {
            java.sql.ResultSet rs = null;
            rs = objConecta.consulta(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombreclien");
                registros[1] = rs.getString("apellidoclien");
                registros[2] = rs.getString("cedulaclien");
                registros[3] = rs.getString("telefonoclien");
                registros[4] = rs.getString("direccionclien");
                registros[5] = rs.getString("barrioclien");
                registros[6] = rs.getString("correoelectro");

                modeloTabla.addRow(registros);
                System.out.println(registros);
            }
            tabla.setModel(modeloTabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }   
     
    public void generarPdf(String dato, String filtro){
        Document documento = new Document();
        String SQL;
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Cliente.pdf"));
            Image header = Image.getInstance("src/Imagenes/logo.PNG");
            //largo y dimension
            header.scaleToFit(150, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("SILVER DEVS \n\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("CLIENTES\n\n");
            
            documento.open();
            
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Cedula");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");
            tabla.addCell("Barrio");
            tabla.addCell("Correo");
            
            if (filtro.equals("Nombre")) {
                SQL = "SELECT *"
                    + "FROM cliente WHERE nombreClien LIKE '%" + dato + "%'";
            } else if (filtro.equals("Barrio")) {
                SQL = "SELECT *"
                    + "FROM cliente WHERE barrioClien LIKE '%" + dato + "%'";
            }else {
                SQL = "SELECT *"
                    + "FROM cliente";
            }
               
            try{
                java.sql.ResultSet rs = null;
                rs = objConecta.consulta(SQL);
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        
                    }while(rs.next());
                    documento.add(tabla);
                }
                 
            }catch(DocumentException | SQLException e){
                
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        }catch(DocumentException | HeadlessException | FileNotFoundException ex){
            System.out.println("Error en PDF"+ ex);
        }catch(IOException Ex){
            System.out.println("Error en la imagen"+ Ex);
        }
    }
    
       
}
