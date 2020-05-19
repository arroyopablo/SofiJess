package controlador;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.EditarProveedor;

public class ControladorProveedor {
    public ControladorProveedor(){       
    }
    
    public String buscarProv (int busqueda){
       modelo.DAOProveedor objetoProveedor = new modelo.DAOProveedor();
       objetoProveedor.setNitProv(busqueda);
    
       String resultado = "";
       resultado = objetoProveedor.consultarProveedor();
      
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
      
        }
        return resultado;
    }
    
    public void eliminarProv (int nitPro){
        modelo.DAOProveedor objetoProv =new modelo.DAOProveedor();
        objetoProv.setNitProv(nitPro);
        String resultado = "";
        resultado = objetoProv.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No", "se Elimino",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "CORRECTO","Se Elimino correctamente",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void editProveedor(int nitPro) {
        modelo.DAOProveedor objetoProveedor = new modelo.DAOProveedor();
        objetoProveedor.setNitProv(nitPro);
      
       String resultado = "";
       resultado = objetoProveedor.consultarProveedor();

        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "El proveedor no esta registrado");
           
        }else{
            
            EditarProveedor editar = new EditarProveedor();
            
            editar.setVisible(true);

        }
    }
    
    public String verificarExitencia (int datoBuscar){
       modelo.DAOProveedor objetoProveedor = new modelo.DAOProveedor();
       objetoProveedor.setNitProv(datoBuscar);
    
       String resultado = "";
       resultado = objetoProveedor.consultarExitencia();
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE");
        }
        return resultado;
    }
    
    public void guardarProveedor (String nombre, int nit, int telefon, String direccion, 
            int precio, String nombreproducto){
        modelo.DAOProveedor  objProveedor;
        objProveedor = new modelo.DAOProveedor();
       //cargar la informacion en el objeto
       objProveedor.setNombreProv(nombre);
       //objEmpleado.setCodigoProductoE(codigoproduc);
  
       objProveedor.insertar();
       JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
    }
    
    
}
