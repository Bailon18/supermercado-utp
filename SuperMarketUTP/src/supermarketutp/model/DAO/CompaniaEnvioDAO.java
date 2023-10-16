package supermarketutp.model.DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import supermarketutp.model.CompaniaEnvio;

public class CompaniaEnvioDAO {

    private CompaniaEnvio[] companiasEnvio;
    private int size;

    public CompaniaEnvioDAO() {
        companiasEnvio = new CompaniaEnvio[100];
        size = 0;

        try (InputStream is = getClass().getResourceAsStream("/supermarketutp/data/companiaEnvios.txt");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (size == companiasEnvio.length) {
                    CompaniaEnvio[] nuevoArreglo = new CompaniaEnvio[companiasEnvio.length * 2];
                    System.arraycopy(companiasEnvio, 0, nuevoArreglo, 0, companiasEnvio.length);
                    companiasEnvio = nuevoArreglo;
                }

                String[] partes = linea.split(",");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                CompaniaEnvio companiaEnvio = new CompaniaEnvio(id, nombre);
                companiasEnvio[size] = companiaEnvio;
                size++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CompaniaEnvio[] listarCompaniasEnvio() {
        CompaniaEnvio[] resultado = new CompaniaEnvio[size];
        System.arraycopy(companiasEnvio, 0, resultado, 0, size);
        return resultado;
    }
    
    // Método para obtener un CompaniaEnvio por su ID
    public CompaniaEnvio obtenerCompaniaEnvioPorId(int idCompaniaEnvio) {
        for (int i = 0; i < size; i++) {
            if (companiasEnvio[i] != null && companiasEnvio[i].getIdCompania() 
                    == idCompaniaEnvio) {
                return companiasEnvio[i];
            }
        }
        return null;
    }
    
    public CompaniaEnvio buscarCompaniaPorNombre(String nombreCompania) {
        for (int i = 0; i < size; i++) {
            if (companiasEnvio[i] != null && companiasEnvio[i].getNombreCompania().equalsIgnoreCase(nombreCompania)) {
                return companiasEnvio[i];
            }
        }
        return null;
    }
}
