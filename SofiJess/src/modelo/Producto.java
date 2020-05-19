package modelo;

public class Producto {
    private String nombrePro;
    private String codigoPro; 
    private String precioPro;
    private String descripcionPro;
    private String cantidadPro;
    private String nitproveedor;
    
   public Producto(){
   }
   
   public Producto(String nombrePro, String codigoPro, String precioPro, 
                   String descripcionPro, String cantidadPro, String nitproveedor){
       this.nombrePro = nombrePro;
       this.codigoPro = codigoPro;
       this.precioPro = precioPro;
       this.descripcionPro = descripcionPro;
       this.cantidadPro = cantidadPro;
       this.nitproveedor = nitproveedor;
   }
   
   public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(String codigoPro) {
        this.codigoPro = codigoPro;
    }

    public String getPrecioPro() {
        return precioPro;
    }

    public void setPrecioPro(String precioPro) {
        this.precioPro = precioPro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getCantidadPro() {
        return cantidadPro;
    }

    public void setCantidadPro(String cantidadPro) {
        this.cantidadPro = cantidadPro;
    }

    public String getProveedorPro() {
        return nitproveedor;
    }

    public void setProveedorPro(String nitproveedor) {
        this.nitproveedor=nitproveedor;
    }
    
    @Override
    public String toString() {
        return "Producto=" + "nombrePro=" + nombrePro + ", codigoPro=" + codigoPro 
                + ", precioPro=" + precioPro + ", descripcionPro=" + descripcionPro 
                + ", cantidadPro=" + cantidadPro + ", proveedorPro=" + nitproveedor + '}';
    }
}