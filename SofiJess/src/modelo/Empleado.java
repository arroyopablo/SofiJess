package modelo;

public class Empleado {
    
    private String usuarioEmpleado;
    private String contrasenaEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private double cedulaEmpleado;
    private double telefonoEmpleado;
    private String direccionEmpleado;
    private String barrioEmpleado;
    private double sueldo;
    private String cargo;
    private int codigoProductoE;

    public Empleado() {
    }

    public Empleado(String usuarioEmpleado, String contrasenaEmpleado, String nombreEmpleado, 
                    String apellidoEmpleado, double  cedulaEmpleado, double telefonoEmpleado, 
                    String direccionEmpleado, String barrioEmpleado, double sueldo, String cargo, int codigoProductoE){
        this.usuarioEmpleado = usuarioEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.barrioEmpleado = barrioEmpleado;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.codigoProductoE = codigoProductoE;
    }

    

    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(String usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public double getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(double cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public double getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(double telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getBarrioEmpleado() {
        return barrioEmpleado;
    }

    public void setBarrioEmpleado(String barrioEmpleado) {
        this.barrioEmpleado = barrioEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigoProductoE() {
        return codigoProductoE;
    }

    public void setCodigoProductoE(int codigoProductoE) {
        this.codigoProductoE = codigoProductoE;
    }
    
    
}