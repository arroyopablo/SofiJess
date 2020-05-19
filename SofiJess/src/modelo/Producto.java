package modelo;

public class Producto {
    private String nombrePro;
    private int codigoPro; 
    private int precioPro;
    private String descripcionPro;
    private int cantidadPro;
    private int nitproveedor;
    
   public Producto(){
   }
   
   public Producto(String nombrePro, int codigoPro, int precioPro, 
                   String descripcionPro, int cantidadPro, int nitproveedor){
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

    public int getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }

    public int getPrecioPro() {
        return precioPro;
    }

    public void setPrecioPro(int precioPro) {
        this.precioPro = precioPro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public int getCantidadPro() {
        return cantidadPro;
    }

    public void setCantidadPro(int cantidadPro) {
        this.cantidadPro = cantidadPro;
    }

    public int getProveedorPro() {
        return nitproveedor;
    }

    public void setProveedorPro(int nitproveedor) {
        this.nitproveedor=nitproveedor;
    }
    
    @Override
    public String toString() {
        return "Producto=" + "nombrePro=" + nombrePro + ", codigoPro=" + codigoPro 
                + ", precioPro=" + precioPro + ", descripcionPro=" + descripcionPro 
                + ", cantidadPro=" + cantidadPro + ", proveedorPro=" + nitproveedor + '}';
    }
}