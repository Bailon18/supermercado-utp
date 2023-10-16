package supermarketutp.model;

public class CompaniaEnvio {

    private int idCompania;
    private String nombreCompania;

    public CompaniaEnvio(int idCompania, String nombreCompania) {
        this.idCompania = idCompania;
        this.nombreCompania = nombreCompania;
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

}
