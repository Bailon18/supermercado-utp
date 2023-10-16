package supermarketutp.model.DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import supermarketutp.model.Proveedor;

public class ProveedorDAO {

    private Proveedor[] proveedores;
    private int size;

    public ProveedorDAO() {
        proveedores = new Proveedor[100];
        size = 0;

        try (InputStream is = getClass().getResourceAsStream("/supermarketutp/data/proveedores.txt");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (size == proveedores.length) {
                    Proveedor[] nuevoArreglo = new Proveedor[proveedores.length * 2];
                    System.arraycopy(proveedores, 0, nuevoArreglo, 0, proveedores.length);
                    proveedores = nuevoArreglo;
                }

                String[] partes = linea.split(",");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                proveedores[size] = new Proveedor(id, nombre);
                size++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Proveedor[] listarProveedores() {
        Proveedor[] resultado = new Proveedor[size];
        System.arraycopy(proveedores, 0, resultado, 0, size);
        return resultado;
    }
    
    // Método para obtener un proveedor por su ID
    public Proveedor obtenerProveedorPorId(int idProveedor) {
        for (int i = 0; i < size; i++) {
            if (proveedores[i] != null && proveedores[i].getId()== idProveedor) {
                return proveedores[i];
            }
        }
        return null;
    }

    public Proveedor buscarProveedorPorNombre(String nombreProveedor) {
        for (int i = 0; i < size; i++) {
            if (proveedores[i] != null && proveedores[i].getNombre().equalsIgnoreCase(nombreProveedor)) {
                return proveedores[i];
            }
        }
        return null;
    }

}
