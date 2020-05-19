package modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAOProveedor extends Proveedor{
    controlador.ControladorConectarDB conexionProv;
    DefaultTableModel modeloTabla;
    public DAOProveedor(){
      conexionProv = new controlador.ControladorConectarDB();
  }
    
    public void insertar(){
      String sql = "INSERT INTO proveedor (nombreProv, nitProv, telProv, dirProv, precioProducrov, nombreProducProv) VALUES('"
                   + super.getNombreProv() +"', "+ super.getNitProv() +", "+ super.getTelefonoProv() +", '"
                   + super.getDireccionProv() +"', "+ super.getPrecioProdProv() +", '"+ super.getProductoProv()+ "')";
      conexionProv.insertar(sql);

  }
    public String consultarProveedor(){
      String SQL = "SELECT * FROM proveedor WHERE nitprov = " + super.getNitProv();
      java.sql.ResultSet rs = null;
      rs = conexionProv.consulta(SQL);
      
      try{
          if(rs.next()){
              String nombreprov = rs.getString(1);
              String telprov = rs.getString(3);
              String dirprov = rs.getString(4);
              String nombreproducprov = rs.getString(6);
              String precioproducrov = rs.getString(5);
              
              return ("NOMBRE: " + nombreprov + "\n" + "TELEFONO: " + telprov + "\n" + "DIRECCION: " + dirprov + "\n" + "NOMBRE PRODUCTO: " + nombreproducprov + "\n" + "PRECIO DEL PRODUCTO: " + precioproducrov);
          }else{
              JOptionPane.showMessageDialog(null, "No se encuentra el proveedor");
              return "No se encontró";
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
    
    public String eliminar(){
        String SQL = "DELETE FROM proveedor WHERE nitprov = "+ super.getNitProv();
        String resultado = "";
        resultado = conexionProv.eliminar(SQL);
        return resultado;
    }
    
     public String modificar(){
        String SQL = "UPDATE  proveedor SET nombreprov = '"+super.getNombreProv()+ "', telprov = "
                +super.getTelefonoProv()+", dirprov = '"+ super.getDireccionProv()+"', precioproducrov = "
                +super.getPrecioProdProv()+", nombreproducprov = '"+ super.getProductoProv()
                +"' WHERE nitprov = " + super.getNitProv();
        //String SQL = "UPDATE FROM Persona  WHERE cedula = '"+ super.getCedula() + "' SET nombre = '"+ super.getNombre()+"'";
        String resultado = "";
        resultado = conexionProv.modifica(SQL);
        return resultado;
    }
     
     public String consultarExitencia (){
        String SQL = "SELECT * FROM proveedor WHERE nitprov = " + super.getNitProv();
        java.sql.ResultSet rs = null;
        rs = conexionProv.consulta(SQL);
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
     
     public void listarProve(String valor, String filtro, JTable tabla) {
        String[] columnas = {"nombre", "nit", "telefono", "direccion", "precioProducto", "nombreProducto"};
        String[] registros = new String[6];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL;
        
        if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM proveedor WHERE nombreprov LIKE '%" + valor + "%'";
        } else if (filtro.equals("Precio")) {
            SQL = "SELECT * FROM proveedor WHERE precioproducrov = " + super.getPrecioProdProv();
        } else if (filtro.equals("Todos")) {
            SQL = "SELECT * FROM proveedor";
        } else {
            SQL = "SELECT *"
                    + "FROM proveedor WHERE nombreproducprov LIKE '%" + valor + "%'";
        }
        try {
            java.sql.ResultSet rs = null;
            rs = conexionProv.consulta(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombreprov");
                registros[1] = rs.getString("nitprov");
                registros[2] = rs.getString("telprov");
                registros[3] = rs.getString("dirprov");
                registros[4] = rs.getString("precioproducrov");
                registros[5] = rs.getString("nombreproducprov");
                modeloTabla.addRow(registros);
            }
            tabla.setModel(modeloTabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}
