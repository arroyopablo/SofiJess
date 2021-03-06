package controlador;

import javax.swing.JOptionPane;

public class ControladorCliente {

    public ControladorCliente() {
    }
    
    public String buscarCli (String datoBuscar){
       modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
       objetoCliente.setCedulaCli(datoBuscar);
    
       String resultado = "";
       resultado = objetoCliente.consultarCliente();
      
        if(resultado.equals("No esta")){      
        }
        return resultado;
    }
    
    public String[] buscarCliEdit (String datoBuscar){
       modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
       objetoCliente.setCedulaCli(datoBuscar);
    
       String resultado[] = null;
       resultado = objetoCliente.consultarClienteEdit();
      
        if(resultado.equals("No esta")){      
        }
        return resultado;
    }
    
    public void eliminarCli (String documentoCli){
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
    
    public void editCliente(String documentoCli) {
        modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
        objetoCliente.setCedulaCli(documentoCli);
      
       String resultado = "";
       resultado = objetoCliente.consultarCliente();

        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "El usuario no esta registrado");
           
        }
    }
    
    public void guardarCliente (String nombre, String apellido, String cedula, String telefono, 
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
    
    public String verificarExitencia (String datoBuscar){
       modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
       objetoCliente.setCedulaCli(datoBuscar);
    
       String resultado = "";
       resultado = objetoCliente.consultarExitencia();
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE");
        }
        return resultado;
    }
    
    public String verificarExitenciaCliente (String datoBuscar){
       modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
       objetoCliente.setCedulaCli(datoBuscar);
    
       String resultado = "";
       resultado = objetoCliente.consultarExitencia();
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "Puede registrar los productos");
        }
        return resultado;
    }
}
