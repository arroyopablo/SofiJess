package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
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
      String sql = "INSERT INTO proveedor (nombreProv, nitProv, telProv, dirProv) VALUES('"
                   + super.getNombreProv() +"', "+ super.getNitProv() +", "+ super.getTelefonoProv() +", '"
                   + super.getDireccionProv() + "')";
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
              
              return ("NOMBRE: " + nombreprov + "\n" + "TELEFONO: " + telprov + "\n" + "DIRECCION: " + dirprov );
          }else{
              JOptionPane.showMessageDialog(null, "No se encuentra el proveedor");
              return "No se encontró";
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
    
    public String[] consultProveedorEdit() {
       String SQL = "SELECT * FROM proveedor WHERE nitprov = " + super.getNitProv();
      java.sql.ResultSet rs = null;
      String[] vacio = {"","",""};
      rs = conexionProv.consulta(SQL);
      try{
          if(rs.next()){
              String nombreprov = rs.getString(1);
              String telprov = rs.getString(3);
              String dirprov = rs.getString(4);
              String[] niu = {nombreprov, telprov, dirprov};
              
              return niu;
          }
            return vacio;
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
                +super.getTelefonoProv()+", dirprov = '"+ super.getDireccionProv()            
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
        String[] columnas = {"NOMBRE", "NIT", "TELÉFONO", "DIRECCIÓN"};
        String[] registros = new String[4];
        modeloTabla = new DefaultTableModel(null, columnas);
        String SQL;
        
        if (filtro.equals("Nombre")) {
            SQL = "SELECT *"
                    + "FROM proveedor WHERE nombreprov LIKE '%" + valor + "%'";
        } else {
            SQL = "SELECT * FROM proveedor";
        } 
        try {
            java.sql.ResultSet rs = null;
            rs = conexionProv.consulta(SQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombreProv");
                registros[1] = rs.getString("nitProv");
                registros[2] = rs.getString("telProv");
                registros[3] = rs.getString("dirProv");
                modeloTabla.addRow(registros);
            }
            tabla.setModel(modeloTabla);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}
