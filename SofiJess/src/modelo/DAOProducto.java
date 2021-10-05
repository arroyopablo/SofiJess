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
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;

public class DAOProducto extends Producto {
    controlador.ControladorConectarDB conexionPro;
    DefaultTableModel modeloTabla;
  public DAOProducto(){
      conexionPro = new controlador.ControladorConectarDB();
  }
  
  public void insertar(){
      String sql = "INSERT INTO producto (nombreProduc, codigoProduc, precioCompraProduc, precioVentaProduc, descripcionProduc, "
              + "cantidadProduc, nitProv) VALUES" + "('"+ super.getNombrePro() +"', '"+ super.getCodigoPro() 
              +"', '"+ super.getPrecioPro() +"', '"+ super.getPrecioVentaPro() +"', '"+ super.getDescripcionPro() +"', '"+ super.getCantidadPro() 
              +"', "+ super.getProveedorPro()+ ")";
      conexionPro.insertar(sql);
  }
  
  public String consultarProducto(){
      String SQL = "SELECT * FROM producto WHERE codigoProduc = " + super.getCodigoPro();
      java.sql.ResultSet rs = null;
      rs = conexionPro.consulta(SQL);
      
      try{
          if(rs.next()){
              String nombreProduc = rs.getString(1);
              String precioCompraProduc = rs.getString(3);
              String precioVentaProduc = rs.getString(4);
              String cantidadProduc = rs.getString(6);
              String descripcionProduc = rs.getString(5);
              String nombreprov = rs.getString(7);
              String result = "NOMBRE: " + nombreProduc + "\n" + "PRECIO COMPRA: " + precioCompraProduc + "\n"
                      + "PRECIO VENTA: " + precioVentaProduc + "\n"
                      + "CANTIDAD: " + cantidadProduc + "\n" + "DESCRIPCION: " + descripcionProduc 
                      + "\n" + "PROVEEDOR: " + nombreprov;
              return(result);
          }else{
              return "No se encontró";
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
  
  public String[] consultarProductoEdit(){
      String SQL = "SELECT * FROM producto WHERE codigoProduc = " + super.getCodigoPro();
      java.sql.ResultSet rs = null;
      rs = conexionPro.consulta(SQL);
      String[] vacio = {"","","","","", ""};
      try{
          if(rs.next()){
              String nombreProduc = rs.getString(1);
              String precioCompraProduc = rs.getString(3);
              String precioVentaProduc = rs.getString(4);
              String cantidadProduc = rs.getString(6);
              String descripcionProduc = rs.getString(5);
              String nombreprov = rs.getString(7);              
              String[] niu = {nombreProduc, precioCompraProduc, precioVentaProduc, descripcionProduc, cantidadProduc, nombreprov};
              
              return niu;
          }else{
              return vacio;
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
  
  public String eliminar(){
        String SQL = "DELETE FROM producto WHERE codigoProduc = "+ super.getCodigoPro();
        String resultado = "";
        resultado = conexionPro.eliminar(SQL);
        return resultado;
    }
  
  
    public String modificar(){
        String SQL = "UPDATE  producto SET nombreproduc = '"+super.getNombrePro()+ "', precioCompraProduc = "
                +super.getPrecioPro()+ ", precioVentaProduc = " +super.getPrecioVentaPro()+ ", descripcionproduc = '"+ super.getDescripcionPro()+"', cantidadproduc = "
                +super.getCantidadPro()+", nitProv = "+ super.getProveedorPro()
                +" WHERE codigoproduc = " + super.getCodigoPro();
        //String SQL = "UPDATE FROM Persona  WHERE cedula = '"+ super.getCedula() + "' SET nombre = '"+ super.getNombre()+"'";
        String resultado = "";
        resultado = conexionPro.modifica(SQL);
        return resultado;
    }
   
  public String consultarExitencia (){
        String SQL = "SELECT * FROM producto WHERE codigoproduc = " + super.getCodigoPro();
        java.sql.ResultSet rs = null;
        rs = conexionPro.consulta(SQL);
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
  
  public void listarProdu(String valor, String filtro, JTable tabla) {
        controlador.ControladorProducto produ = new controlador.ControladorProducto();
        String[] columnas = {"NOMBRE", "CÓDIGO", "PRECIO DE COMPRA", "PRECIO DE VENTA", "CANTIDAD", "NIT PROVEEDOR", "TOTAL", "GANANCIA"};
        String[] registros = new String[8];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL;
        
        if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM producto WHERE nombreproduc LIKE '%" + valor + "%'";
        } else if (filtro.equals("Precio")) {
            SQL = "SELECT * FROM producto WHERE precioVentaProduc = " + super.getPrecioPro();
        } else if (filtro.endsWith("Cantidad")){
            SQL = "SELECT * FROM producto WHERE cantidadproduc = " + super.getCantidadPro();
        }else if (filtro.endsWith("Todos")){
            SQL = "SELECT * FROM producto";
        }else{
            SQL = "SELECT *"
                    + "FROM producto WHERE nitprov = " + super.getProveedorPro();
        }
        try {
            java.sql.ResultSet rs = null;
            rs = conexionPro.consulta(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombreProduc");
                registros[1] = rs.getString("codigoproduc");
                registros[2] = "$" + rs.getString("precioCompraProduc");
                String precioCompra = rs.getString("precioCompraProduc");
                registros[3] = "$" + rs.getString("precioVentaProduc");
                String precioVenta = rs.getString("precioVentaProduc");
                registros[4] = rs.getString("cantidadProduc");
                registros[5] = rs.getString("nitProv");
                registros[6] = "$" + String.valueOf(Integer.parseInt(precioVenta) * Integer.parseInt(registros[4]));
                registros[7] = "$" + String.valueOf((Integer.parseInt(precioVenta) - Integer.parseInt(precioCompra)) * Integer.parseInt(registros[4]));
                
                modeloTabla.addRow(registros);
            }
            tabla.setModel(modeloTabla);
            tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer()
            {
                int whichRow = -1;
                int rowCount =0;
                Object lastRowName = "";
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
                {
                    final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    Object cantidad = table.getModel().getValueAt(row, 4);
                    Object name = table.getModel().getValueAt(row, 0);
                    if(whichRow != row && whichRow != -1 && cantidad.equals("0")
                            && !lastRowName.equals(name)){
                        int colNumber = tabla.getModel().getColumnCount();
                        Object[] newRow = new String[colNumber];
                        for (int i = 0; i < colNumber; i++) {
                            newRow[i] = table.getModel().getValueAt(row, i);
                        }
                        lastRowName = newRow[0];
                        modeloTabla.removeRow(row);
                        modeloTabla.insertRow(0, newRow);
                        tabla.setModel(modeloTabla);
                    }
                    if(tabla.getModel().getRowCount()-1 == whichRow){
                        rowCount = rowCount+1;
                    }
                    if(rowCount == tabla.getModel().getColumnCount()){
                        whichRow = -1;
                    } else {
                        whichRow = row;
                    }
                    
                    if(cantidad.equals("0")){
                        c.setForeground(Color.RED);
                    } else{
                        c.setForeground(Color.BLACK);
                    }
                    return c;
                }
                
            });
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }
  public void generarPdf(String dato, String filtro){
        Document documento = new Document();
        String SQL;
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Producto.pdf"));
            Image header = Image.getInstance("src/Imagenes/titulo.PNG");
            //largo y dimension
            header.scaleToFit(150, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma", 16, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("PRODUCTO\n\n");
            
            documento.open();
            
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("Nombre");
            tabla.addCell("Codigo");
            tabla.addCell("Precio");
            tabla.addCell("Descripcion");
            tabla.addCell("Cantidad");
            tabla.addCell("Nombre Proveedor");
            
            if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM producto WHERE nombreProduc LIKE '%" + dato + "%'";
            } else if (filtro.equals("Precio")) {
                SQL = "SELECT * FROM producto WHERE precioProduc = " + super.getPrecioPro();
            }else if (filtro.equals("Nombre Proveedor")){
                SQL = "SELECT *"
                    + "FROM producto WHERE nombreprov LIKE '%" + dato + "%'";
            }else{
                SQL = "SELECT *"
                    + "FROM producto";
            }
               
            try{
                java.sql.ResultSet rs = null;
                rs = conexionPro.consulta(SQL);
                if(rs.next()){
                    do{
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));  
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

    public void listarProdu(int dato, String toString, JTable tblDatos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
  
