package supermarketutp.model;

public class Pedido {

    private int idPedido;
    private Proveedor proveedor;
    private String fechaPedido;
    private String fechaEnvio;
    private String fechaEntrega;
    private CompaniaEnvio companiaEnvio;
    private double cargo;

    public Pedido() {
    }

    public Pedido(int idPedido, Proveedor proveedor, String fechaPedido,
            String fechaEnvio, String fechaEntrega, CompaniaEnvio companiaEnvio,
            double cargo) {
        this.idPedido = idPedido;
        this.proveedor = proveedor;
        this.fechaPedido = fechaPedido;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.companiaEnvio = companiaEnvio;
        this.cargo = cargo;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public CompaniaEnvio getCompaniaEnvio() {
        return companiaEnvio;
    }

    public void setCompaniaEnvio(CompaniaEnvio companiaEnvio) {
        this.companiaEnvio = companiaEnvio;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    
}
