package controlador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControladorCotizacion {

    public ControladorCotizacion() {
    }

    public String buscarPro(int busqueda) {
        modelo.DAOCotizacion objetoProducto = new modelo.DAOCotizacion();
        objetoProducto.setCodigoPro(busqueda);

        String resultado = "";
        resultado = objetoProducto.consultarNombreProducto();

        return resultado;
    }

    public String buscarPrecio(int busqueda) {
        modelo.DAOCotizacion objetoProducto = new modelo.DAOCotizacion();
        objetoProducto.setCodigoPro(busqueda);

        String resultado = "";
        resultado = objetoProducto.consultarPrecio();

        return resultado;
    }

    public String buscarCodigo(int busqueda) {
        modelo.DAOCotizacion objetoProducto = new modelo.DAOCotizacion();
        objetoProducto.setCodigoPro(busqueda);

        String resultado = "";
        resultado = objetoProducto.consultarCodigo();
        return resultado;
    }

    public String codigoCotizacion() {
        modelo.DAOCotizacion1 objetoCotizacion = new modelo.DAOCotizacion1();
        objetoCotizacion.codigoCotizacion();

        String resultado = "";
        resultado = objetoCotizacion.codigoCotizacion();
        return resultado;
    }

    public static String fechaActual() {

        Date fecha1 = new Date();
        DateFormat Formato = new SimpleDateFormat("YYYY/MM/dd");
        System.out.println("Fecha: " + Formato.format(fecha1));
        
        return Formato.format(fecha1);
    }

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public void guardarCotizacion(int cedulaCli, int cedulaEmple){
      modelo.DAOCotizacion1 cotizacion =new modelo.DAOCotizacion1();  
      
      cotizacion.setCedulaClien(cedulaCli);
      cotizacion.setCedulaEmple(cedulaEmple);
      
      cotizacion.insertarCotizacion();
    }
    
    public void guardarDetalleC(int cotizacion, int producto, int cantidad, double valor, double iva, double total){
        modelo.DAOCotizacion1 detallecotizacion =new modelo.DAOCotizacion1();
        
        detallecotizacion.setIdCotizacion(cotizacion);
        detallecotizacion.setCodigoProducto(producto);
        detallecotizacion.setCantidad(cantidad);
        detallecotizacion.setValorUnitario(valor);
        detallecotizacion.setIva(iva);
        detallecotizacion.setTotal(total);
        
       detallecotizacion.insertarDetalleCotizacion();
    }
    
    public void updateCompra(double totalcompra,int idcotizacion){
       modelo.DAOCotizacion1 update =new modelo.DAOCotizacion1();
       
       update.setTotalCompra(totalcompra);
       update.setIdCotizacion(idcotizacion);
       
       update.setTotalCompra(totalcompra);
       
       update.updateTotal();
    }
    
    public void cancelarCotizacion (int idcotizacion){
        modelo.DAOCotizacion1 objeto =new modelo.DAOCotizacion1();
        objeto.setIdCotizacion(idcotizacion);
        String resultado = "";
        resultado = objeto.cancelaCotizacion();
    }
    
    public void cancelarProducto (int idproducto){
        modelo.DAOCotizacion1 objeto =new modelo.DAOCotizacion1();
        objeto.setCodigoProducto(idproducto);
        String resultado = "";
        resultado = objeto.cancelaProductoC();
    }
    
    public String buscarCotizacion (int busqueda){
       modelo.DAOCotizacion1 objetocotizacion = new modelo.DAOCotizacion1();
       objetocotizacion.setIdCotizacion(busqueda);
    
       String resultado = "";
       resultado = objetocotizacion.consultarCotizacion();
      
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
        }
        return resultado;
    }
    
    public String buscardetalleCotizacion (int busqueda){
       modelo.DAOCotizacion1 objetocotizacion = new modelo.DAOCotizacion1();
       objetocotizacion.setIdCotizacion(busqueda);
    
       String resultado = "";
       resultado = objetocotizacion.consultarDetalleCotizacion();
      
        if(resultado.equals("No se encontró")){
            JOptionPane.showMessageDialog(null, "No esta");
        }
        return resultado;
    }

}
