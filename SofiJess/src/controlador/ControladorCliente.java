package controlador;

import javax.swing.JOptionPane;
import vista.EditarCliente;


public class ControladorCliente {

    public ControladorCliente() {
    }
    
    public String buscarCli (int datoBuscar){
       modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
       objetoCliente.setCedulaCli(datoBuscar);
    
       String resultado = "";
       resultado = objetoCliente.consultarCliente();
      
        if(resultado.equals("No esta")){      
        }
        return resultado;
    }
 
    
    public void eliminarCli (int documentoCli){
        modelo.DAOCliente objeto =new modelo.DAOCliente();
        objeto.setCedulaCli(documentoCli);
        String resultado = "";
        resultado = objeto.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No", "se Elimino",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente","",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void editCliente(int documentoCli) {
        modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
        objetoCliente.setCedulaCli(documentoCli);
      
       String resultado = "";
       resultado = objetoCliente.consultarCliente();

        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "El usuario no esta registrado");
           
        }else{
            
            EditarCliente editar = new EditarCliente();
            
            editar.setVisible(true);
              
        }
    }
    
    public void guardarCliente (String nombre, String apellido, int cedula, int telefono, 
                                String direccion, String barrio, String correo){
        
        
        modelo.DAOCliente  objCliente;
        objCliente = new modelo.DAOCliente();
       //cargar la informacion en el objeto
       objCliente.setNombreCli(nombre);
       objCliente.setApellidoCli(apellido);
       objCliente.setCedulaCli(cedula);
       objCliente.setTelefonoCli(telefono);
       objCliente.setDireccionCli(direccion);
       objCliente.setBarrioCli(barrio);
       objCliente.setCorreoCli(correo);
  
       objCliente.insertar();
       JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
    } 
    
    public String verificarExitencia (int datoBuscar){
       modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
       objetoCliente.setCedulaCli(datoBuscar);
    
       String resultado = "";
       resultado = objetoCliente.consultarExitencia();
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE");
        }
        return resultado;
    }
    
}
