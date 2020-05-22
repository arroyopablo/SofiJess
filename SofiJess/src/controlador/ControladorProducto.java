package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControladorProducto {
    public ControladorProducto(){       
    }
    
    public String buscarPro (String busqueda){
       
        modelo.DAOProducto objetoProducto = new modelo.DAOProducto();
       objetoProducto.setCodigoPro(busqueda);
    
       String resultado = "";
       resultado = objetoProducto.consultarProducto();
      
        if(resultado.equals("No se encontró")){
         
        }
        return resultado;
    }
    
    public String[] buscarProEdit(String busqueda) {

        modelo.DAOProducto objetoProducto = new modelo.DAOProducto();
        objetoProducto.setCodigoPro(busqueda);

        String[] resultado = null;
        resultado = objetoProducto.consultarProductoEdit();

        return resultado;
    }
    
    public void guardarProducto(String nombre, String codigo, String precioCompra, String precioVenta, String descripcion, 
                                String cantidad, String proveedor ){
        modelo.DAOProducto objProducto = new modelo.DAOProducto();
        objProducto.setNombrePro(nombre);
        objProducto.setCodigoPro(codigo);
        objProducto.setPrecioPro(precioCompra);
        objProducto.setPrecioVentaPro(precioVenta);
        objProducto.setDescripcionPro(descripcion);
        objProducto.setCantidadPro(cantidad);
        objProducto.setProveedorPro(proveedor);
        
        objProducto.insertar();
        JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
    }
           
    public void eliminarPro (String codePro){
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
    
    
    public void editProducto(String codePro) {
        modelo.DAOProducto objetoProducto = new modelo.DAOProducto();
        objetoProducto.setCodigoPro(codePro);
      
       String resultado = "";
       resultado = objetoProducto.consultarProducto();

        if(resultado.equals("No esta")){
            JOptionPane.showMessageDialog(null, "El producto no esta registrado");
           
        }
    }
    
    public String verificarExitencia (String datoBuscar){
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
