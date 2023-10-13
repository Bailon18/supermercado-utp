
package supermarketutp.model.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import supermarketutp.model.Categoria;

public class CategoriaDAO {
    
    private final String filename = "../data/categorias.txt";
    private Categoria[] categorias;
    private int size;

    public CategoriaDAO() {
        // Inicializar un arreglo con un tamaño razonable
        categorias = new Categoria[100]; // Puedes ajustar el tamaño según tus necesidades
        size = 0;

        // Leer las categorías desde el archivo y guardarlas en el arreglo
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (size == categorias.length) {
                    // Si el arreglo está lleno, redimensionar
                    Categoria[] nuevoArreglo = new Categoria[categorias.length * 2];
                    System.arraycopy(categorias, 0, nuevoArreglo, 0, categorias.length);
                    categorias = nuevoArreglo;
                }

                String[] partes = linea.split(",");
                String nombre = partes[0];
                categorias[size] = new Categoria(size, nombre);
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

