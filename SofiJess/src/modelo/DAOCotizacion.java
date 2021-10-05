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
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DAOCotizacion extends Producto{
    controlador.ControladorConectarDB conexionPro;
    
    public DAOCotizacion(){
      conexionPro = new controlador.ControladorConectarDB();
  }
    public String consultarNombreProducto(){
      String SQL = "SELECT * FROM producto WHERE codigoProduc = " + super.getCodigoPro();
      java.sql.ResultSet rs = null;
      rs = conexionPro.consulta(SQL);
      
      try{
          if(rs.next()){
              String nombreProduc = rs.getString(1);
              return (nombreProduc);
          }else{
              JOptionPane.showMessageDialog(null, "No se encuentra el producto");
              return "";
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
    
  public String consultarPrecio(){
      String SQL = "SELECT * FROM producto WHERE codigoProduc = " + super.getCodigoPro();
      java.sql.ResultSet rs = null;
      rs = conexionPro.consulta(SQL);
      
      try{
          if(rs.next()){
              String precioProduc = rs.getString(3);
              return (precioProduc);
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
  
  public String consultarCodigo(){
      String SQL = "SELECT * FROM producto WHERE codigoProduc = " + super.getCodigoPro();
      java.sql.ResultSet rs = null;
      rs = conexionPro.consulta(SQL);
      
      try{
          if(rs.next()){
              String codigo = rs.getString(2);
              return (codigo);
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
  
  public void generarPdf(int filtro, int ano, String mes){
        int siguienteAno = ano;
        int siguienteMes = filtro;
        
        if(filtro == 12){
            siguienteAno++;
            siguienteMes = 0;
        }else{
            siguienteMes++;
        }
        String anoString = Integer.toString(ano);
      
        Document documento = new Document();
        String SQL;
        try {
            String ruta = System.getProperty("user.home");
            com.itextpdf.text.pdf.PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Ventas_"+ mes + "_" + anoString +".pdf"));
            Image header = Image.getInstance("src/Imagenes/titulo.PNG");
            //largo y dimension
            header.scaleToFit(150, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma", 16, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("VENTAS "+ mes + " DE " + anoString +"\n\n");
            
            documento.open();
            
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("ID FACTURA");
            tabla.addCell("CC CLIENTE");
            tabla.addCell("ID VENDEDOR");
            tabla.addCell("FECHA");
            tabla.addCell("TOTAL COMPRA");
            
            SQL = "SELECT * FROM cotizacion WHERE fechac >= " + "'" + ano + "-"+ filtro +"-01' AND fechac < "+ "'" + siguienteAno + "-"+ siguienteMes +"-01';";            
               
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
  
    public void generarPdfAno(int ano){
        String anoString = Integer.toString(ano);
      
        Document documento = new Document();
        String SQL;
        try {
            String ruta = System.getProperty("user.home");
            com.itextpdf.text.pdf.PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Ventas_" + anoString +".pdf"));
            Image header = Image.getInstance("src/Imagenes/titulo.PNG");
            //largo y dimension
            header.scaleToFit(150, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma", 16, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("VENTAS "+ anoString +"\n\n");
            
            documento.open();
            
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("ID FACTURA");
            tabla.addCell("CC CLIENTE");
            tabla.addCell("ID VENDEDOR");
            tabla.addCell("FECHA VENTA");
            tabla.addCell("TOTAL COMPRA");
            
            SQL = "SELECT * FROM cotizacion WHERE fechac >= " + "'" + ano + "-01-01' AND fechac <= "+ "'" + ano + "-12-31';";            
               
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
