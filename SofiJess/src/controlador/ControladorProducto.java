package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import vista.EditarProducto;

public class ControladorProducto {
    public ControladorProducto(){       
    }
    
    public String buscarPro (int busqueda){
       
        modelo.DAOProducto objetoProducto = new modelo.DAOProducto();
       objetoProducto.setCodigoPro(busqueda);
    
       String resultado = "";
       resultado = objetoProducto.consultarProducto();
      
        if(resultado.equals("No se encontró")){
         
        }
        return resultado;
    }
    
    public void guardarProducto(String nombre, int codigo, double precio, String descripcion, 
                                int cantidad, String proveedor ){
        modelo.DAOProducto objProducto = new modelo.DAOProducto();
        objProducto.setNombrePro(nombre);
        objProducto.setCodigoPro(codigo);
        objProducto.setPrecioPro(codigo);
        objProducto.setDescripcionPro(descripcion);
        objProducto.setCantidadPro(cantidad);
        objProducto.setProveedorPro(Integer.parseInt(proveedor));
        
        objProducto.insertar();
        JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
    }
           
    public void eliminarPro (int codePro){
        modelo.DAOProducto objetoPro =new modelo.DAOProducto();
        objetoPro.setCodigoPro(codePro);
        String resultado = "";
        resultado = objetoPro.eliminar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No", "se Elimino",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "CORRECTO","Se Elimino correctamente",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public void editProducto(int codePro) {
        modelo.DAOProducto objetoProducto = new modelo.DAOProducto();
        objetoProducto.setCodigoPro(codePro);
      
       String resultado = "";
       resultado = objetoProducto.consultarProducto();

        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "El producto no esta registrado");
           
        }else{
            
            EditarProducto editar = new EditarProducto();
            
            editar.setVisible(true);

        }
    }
    
    public String verificarExitencia (int datoBuscar){
       modelo.DAOProducto objetoProducto = new modelo.DAOProducto();
       objetoProducto.setCodigoPro(datoBuscar);
    
       String resultado = "";
       resultado = objetoProducto.consultarExitencia();
      
        if(resultado.equals("")){
            JOptionPane.showMessageDialog(null, "EL CLIENTE YA EXISTE");
        }
        return resultado;
    }
      
    public boolean isNumeric(int cadena){
        try {
                Integer.toString(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }

    
    
}
