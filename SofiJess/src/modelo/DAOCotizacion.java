package modelo;

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
}
