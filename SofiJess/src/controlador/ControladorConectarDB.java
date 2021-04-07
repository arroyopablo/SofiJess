package controlador;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ControladorConectarDB {
    
    java.sql.Connection con; //para cargarel Driver  de  JDBC para postgresql 
    java.sql.Statement st; //para conectarse con el motor de DB 
    java.sql.ResultSet res; //procesar las consultas
    DefaultTableModel modeloTabla;
    public ControladorConectarDB(){
        try{
            try{
                Class.forName("org.postgresql.Driver");                  
                System.out.println("Driver correcto");
                
            }catch(ClassNotFoundException ex){
                System.out.println("ERROR CARGANDO");
            }                                        
            
            con = DriverManager.getConnection("jdbc:postgresql://ec2-107-22-245-82.compute-1.amazonaws.com:5432/dd87n7bnbaspv9", "urkqyzgsfiblgw","324a83411bea1af477152eb7743579056f6b4e1ecd8c580402acbcec4d81f728");
            
        }catch(SQLException ex){
            System.out.println("No se pudo conectar: " +ex.getMessage());
        }
        
    }
       public void insertar(String sql){
        try{
            st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
        }catch(SQLException  ex){
            System.out.println("Error insertando "+ ex.toString());
            System.out.println("El dato se inserto");
        }
    }
    
    public java.sql.ResultSet consulta(String sql){
      try{
          st = con.createStatement();
          return st.executeQuery(sql);
      }catch(SQLException ex){
          System.out.println("Error consultando"+ ex.toString());
          return null;
      }  
    }
    
    public String eliminar (String sql){
        try{
            st = con.createStatement();
            int resultado =st.executeUpdate(sql);
            if(resultado == 1){
                return "Elimino";
            }else{
                return "Error";
            }
        }catch(SQLException ex){
            System.out.println("Error insertando"+ ex.toString());
            return "Error";
        }
    }
    
    public String modifica(String sql){
        try{
            st = con.createStatement();
            int resultado = st.executeUpdate(sql);
            if(resultado == 1){
                return "Modifico";
            }else{
                return "Error";
            }
        }catch(SQLException ex){
            System.out.println("Error Insertando" + ex.toString());
            System.out.println("es aqui");
            return "Error";
        }
    }
    public boolean validar(String sql){
        java.sql.ResultSet hoja_resultado = null;
        try{
            st = con.createStatement(); 
            hoja_resultado = st.executeQuery(sql);
            if(hoja_resultado.next()){
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error consultando: "+ e.toString());
            return false;
        }
    }
    
}
