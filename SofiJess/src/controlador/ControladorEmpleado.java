package controlador;

import javax.swing.JOptionPane;


public class ControladorEmpleado {

    public ControladorEmpleado() {
    }
    
    public String buscarEmple (int busqueda){
       modelo.DAOEmpleado objetoEmpleado = new modelo.DAOEmpleado();
       objetoEmpleado.setCedulaEmpleado(busqueda);
    
       String resultado = "";
       resultado = objetoEmpleado.consultarEmpleado();
      
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
        }
        return resultado;
    }
    
    public String[] buscarEmpleEdit (String busqueda){
       modelo.DAOEmpleado objetoEmpleado = new modelo.DAOEmpleado();
       objetoEmpleado.setCedulaEmpleado(Double.valueOf(busqueda));
    
       String resultado[] = null;
       resultado = objetoEmpleado.consultarEmpleadoEdit();
      
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
        }
        return resultado;
    }
    
    public void eliminarEmple (int documentoEmple){
        modelo.DAOEmpleado objeto =new modelo.DAOEmpleado();
        objeto.setCedulaEmpleado(documentoEmple);
        String resultado = "";
        resultado = objeto.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No", "se Elimino",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "CORRECTO","Se Elimino correctamente",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void guardarEmpleado (String Usuario, String contrasena, String nombre, String apellido, 
            double cedula, double telefono, String direccion, String barrio, double sueldo,String cargo){
        modelo.DAOEmpleado  objEmpleado;
        objEmpleado = new modelo.DAOEmpleado();
       //cargar la informacion en el objeto
       objEmpleado.setUsuarioEmpleado(Usuario);
       objEmpleado.setContrasenaEmpleado(contrasena);
       objEmpleado.setNombreEmpleado(nombre);
       objEmpleado.setApellidoEmpleado(apellido);
       objEmpleado.setCedulaEmpleado(cedula);
       objEmpleado.setTelefonoEmpleado(telefono);
       objEmpleado.setDireccionEmpleado(direccion);
       objEmpleado.setBarrioEmpleado(barrio);
       objEmpleado.setSueldo(sueldo);
       objEmpleado.setCargo(cargo);
       //objEmpleado.setCodigoProductoE(codigoproduc);
  
       objEmpleado.insertar();
       JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
    }
    
    public void editarEmpleado(double cedula, String nombre, String apellido, int telefono, String direccion, String barrio){
        modelo.DAOEmpleado objEmpleado = new modelo.DAOEmpleado();
        objEmpleado.setCedulaEmpleado(cedula);
        objEmpleado.setNombreEmpleado(nombre);
        objEmpleado.setApellidoEmpleado(apellido);
        objEmpleado.setTelefonoEmpleado(telefono);
        objEmpleado.setDireccionEmpleado(direccion);
        objEmpleado.setBarrioEmpleado(barrio);
        
        objEmpleado.modificar();
        JOptionPane.showMessageDialog(null,"SE MODIFICO CON EXITO");
    }
    
    public String verificarExitencia (double datoBuscar){
       modelo.DAOEmpleado objetoEmpleado = new modelo.DAOEmpleado();
       objetoEmpleado.setCedulaEmpleado(datoBuscar);
    
       String resultado = "";
       resultado = objetoEmpleado.consultarExitencia();
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE");
        }
        return resultado;
    }
}
