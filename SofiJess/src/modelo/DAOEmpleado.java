package modelo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;




public class DAOEmpleado extends Empleado{

    controlador.ControladorConectarDB objConecta;
    DefaultTableModel modeloTabla;
    public DAOEmpleado() {
        objConecta = new controlador.ControladorConectarDB();
    }
    
    public void insertar(){
        String sql = "INSERT INTO Empleado(usuarioEmple,contrasenaEmple,nombreEmple,apellidoEmple,"
                + "cedulaEmple,telefono,direccionEmple,barrioEmple,sueldo,cargo) VALUES('"
                + super.getUsuarioEmpleado() +"', '"+ super.getContrasenaEmpleado() + "', '"+super.getNombreEmpleado()
                +"','"+super.getApellidoEmpleado()+"',"+super.getCedulaEmpleado()+","+super.getTelefonoEmpleado()
                +",'"+super.getDireccionEmpleado()+"','"+super.getBarrioEmpleado()+"',"+super.getSueldo()+",'"
                +super.getCargo()+"')";
        objConecta.insertar(sql);
    }
    
    public String consultarEmpleado(){
        String SQL = "SELECT * FROM Empleado WHERE cedulaEmple = " + super.getCedulaEmpleado();
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
            
            if(rs.next()){
                String usuarioEmple = rs.getString(1);
                String nombreEmple = rs.getString(3);
                String apellidoEmple = rs.getString(4);
                String cedulaEmple = rs.getString(5);
                String telefonoEmple = rs.getString(6);
                String direccionEmple = rs.getString(7);
                String barrioEmple = rs.getString(8);
                String sueldoEmple = rs.getString(9);
                String cargoEmple = rs.getString(10);
                
                return ("USUARIO: "+ usuarioEmple +"\n "+" \n"+ "NOMBRE: "+ nombreEmple +"\n "+" \n"+"APELLIDO: "+ apellidoEmple + "\n "+
                        " \n"+"CEDULA: "+cedulaEmple +" \n"+" \n"+"TELEFONO: "+ telefonoEmple+" \n"+" \n"+"DIRECCION: "+direccionEmple+
                        " \n"+" \n"+ "BARRIO: " + barrioEmple +" \n"+" \n"+ "SUELDO: "+sueldoEmple+" \n"+" \n"+ "CARGO: "+cargoEmple );
            }else{
                JOptionPane.showMessageDialog(null, "Error Elemento no Encontrado");
                return "No esta";
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String eliminar(){
        String SQL = "DELETE FROM Empleado WHERE cedulaEmple = "+ super.getCedulaEmpleado();
        String resultado = "";
        resultado = objConecta.eliminar(SQL);
        return resultado;
    }
    
    public String modificar(){
        String SQL = "UPDATE  Empleado SET nombreEmple = '"+super.getNombreEmpleado()+ "', apellidoEmple = '"
                +super.getApellidoEmpleado()+"', telefono = "+ super.getTelefonoEmpleado()+", direccionEmple = '"
                +super.getDireccionEmpleado()+"',barrioEmple = '"+super.getBarrioEmpleado()
                +"' WHERE cedulaEmple = " + super.getCedulaEmpleado();
        String resultado = "";
        resultado = objConecta.modifica(SQL);
        return resultado;
    }
    
    public boolean valide(){
        String SQL ="SELECT usuarioEmple, contrasenaEmple FROM Empleado where usuarioEmple='"+ super.getUsuarioEmpleado()
                                               +"' and contrasenaEmple='"+ super.getContrasenaEmpleado()+"'";
        if(objConecta.validar(SQL)==false){
            return false;
        }else{
            return true;
        }
    }
    
    public String consultarCargo(){
        String SQL = "SELECT * FROM Empleado WHERE usuarioEmple = '" + super.getUsuarioEmpleado()+"'";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
            if(rs.next()){
                return rs.getString(10);
            }else{
                JOptionPane.showMessageDialog(null, "Error Elemento no Encontrado");
                return "No esta";
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }    
    public String nombreEmple(){
        String SQL = "SELECT * FROM empleado WHERE usuarioEmple = '" + super.getUsuarioEmpleado()+"'";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            if(rs.next()){  
                String nombre = rs.getString(3);
                return (nombre);
            }
        }catch(SQLException ex){
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String consultarExitencia (){
        String SQL = "SELECT * FROM empleado WHERE cedulaEmple = " + super.getCedulaEmpleado();
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
    
    public void listarEmpl(String valor, String filtro, JTable tabla) {
        String[] columnas = {"USUARIO", "Nombre", "Apellido", "Cedula", "Telefono", "Direccion", "Barrio", "Sueldo","Cargo"};
        String[] registros = new String[9];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL;
        
        if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM empleado WHERE nombreEmple LIKE '%" + valor + "%'";
        } else if (filtro.equals("Barrio")) {
            SQL = "SELECT *"
                    + "FROM empleado WHERE barrioEmple LIKE '%" + valor + "%'";
        } else if (filtro.endsWith("Apellido")){
            SQL = "SELECT *"
                    + "FROM empleado WHERE apellidoEmple LIKE '%" + valor + "%'";
        }else if(filtro.equals("Cargo")){
            SQL = "SELECT *"
                    + "FROM empleado WHERE cargo LIKE '%" + valor + "%'";
        }else if(filtro.equals("Todos")){
            SQL = "SELECT * FROM empleado";
        }else {
           
            SQL = "SELECT * FROM empleado WHERE Sueldo = " + super.getSueldo();
        }
        try {
            java.sql.ResultSet rs = null;
            rs = objConecta.consulta(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("usuarioemple");
                registros[1] = rs.getString("nombreEmple");
                registros[2] = rs.getString("apellidoEmple");
                registros[3] = rs.getString("cedulaEmple");
                registros[4] = rs.getString("telefono");
                registros[5] = rs.getString("direccionEmple");
                registros[6] = rs.getString("barrioEmple");
                registros[7] = rs.getString("Sueldo");
                registros[8] = rs.getString("Cargo");
                modeloTabla.addRow(registros);
            }
            tabla.setModel(modeloTabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }    

    public void setSueldo(JTextField txtValorBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void generarPdf(String dato, String filtro){
        Document documento = new Document();
        String SQL;
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Empleado.pdf"));
            Image header = Image.getInstance("src/Imagenes/titulo.PNG");
            //largo y dimension
            header.scaleToFit(150, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("PAPELERIA SOFIJESS \n\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("EMPLEADO\n\n");
            
            documento.open();
            
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(8);
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Cedula");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");
            tabla.addCell("Barrio");
            tabla.addCell("Sueldo");
            tabla.addCell("Cargo");
            
            if(filtro.equals("Cargo")){
                     SQL = "SELECT *"
                    + "FROM empleado WHERE cargo LIKE '%" + dato + "%'";
            }else if(filtro.equals("Todo")){
                  SQL = "SELECT *"
                    + "FROM empleado";
            }else{
                    SQL = "SELECT * FROM empleado WHERE Sueldo = " + super.getSueldo();
            }
               
            try{
                java.sql.ResultSet rs = null;
                rs = objConecta.consulta(SQL);
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));
                        tabla.addCell(rs.getString(9));
                        tabla.addCell(rs.getString(10));
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
