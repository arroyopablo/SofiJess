package modelo;

public class Cotizacion {

private int codigocotizacion;
private int cedulaClien;
private int cedulaEmple;
private String fecha;
private double totalCompra;
//atributos detallecotizacion
private int idDetalleCotizacion;
private int idCotizacion;
private int codigoProducto;
private int cantidad;
private double valorUnitario;
private double iva;
private double total;

    public Cotizacion() {
    }

    public Cotizacion(int codigocotizacion, int cedulaClien, int cedulaEmple, String fecha, double totalCompra, int idDetalleCotizacion, int idCotizacion, int codigoProducto, int cantidad, double valorUnitario, double iva, double total) {
        this.codigocotizacion = codigocotizacion;
        this.cedulaClien = cedulaClien;
        this.cedulaEmple = cedulaEmple;
        this.fecha = fecha;
        this.totalCompra = totalCompra;
        this.idDetalleCotizacion = idDetalleCotizacion;
        this.idCotizacion = idCotizacion;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.iva = iva;
        this.total = total;
    }

    public int getCodigocotizacion() {
        return codigocotizacion;
    }

    public void setCodigocotizacion(int codigocotizacion) {
        this.codigocotizacion = codigocotizacion;
    }

    public int getCedulaClien() {
        return cedulaClien;
    }

    public void setCedulaClien(int cedulaClien) {
        this.cedulaClien = cedulaClien;
    }

    public int getCedulaEmple() {
        return cedulaEmple;
    }

    public void setCedulaEmple(int cedulaEmple) {
        this.cedulaEmple = cedulaEmple;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public int getIdDetalleCotizacion() {
        return idDetalleCotizacion;
    }

    public void setIdDetalleCotizacion(int idDetalleCotizacion) {
        this.idDetalleCotizacion = idDetalleCotizacion;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
