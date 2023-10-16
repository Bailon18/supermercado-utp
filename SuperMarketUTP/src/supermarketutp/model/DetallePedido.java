package supermarketutp.model;

public class DetallePedido {

    private int idPedido;
    private Articulo producto;
    private double precioUnidad;
    private int cantidad;
    private double descuento;

    public DetallePedido(int idPedido, Articulo producto, double precioUnidad,
            int cantidad) {
        this.idPedido = idPedido;
        this.producto = producto;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Articulo getProducto() {
        return producto;
    }

    public void setProducto(Articulo producto) {
        this.producto = producto;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

}
