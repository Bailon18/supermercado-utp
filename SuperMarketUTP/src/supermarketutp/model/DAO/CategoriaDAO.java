
package supermarketutp.model.DAO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import supermarketutp.model.Categoria;

public class CategoriaDAO {

    private Categoria[] categorias;
    private int size;

    public CategoriaDAO() {
        // Tamaño inicial del arreglo
        categorias = new Categoria[100];
        size = 0;

        try (InputStream is = getClass().getResourceAsStream("/supermarketutp/data/categorias.txt");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (size == categorias.length) {
                    // Si el arreglo está lleno, redimensionar al doble de tamaño
                    Categoria[] nuevoArreglo = new Categoria[categorias.length * 2];
                    System.arraycopy(categorias, 0, nuevoArreglo, 0, categorias.length);
                    categorias = nuevoArreglo;
                }

                String[] partes = linea.split(",");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                categorias[size] = new Categoria(id, nombre);
                size++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Categoria[] listarCategorias() {
        Categoria[] resultado = new Categoria[size];
        System.arraycopy(categorias, 0, resultado, 0, size);
        return resultado;
    }
}
