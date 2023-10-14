package supermarketutp.model.DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import supermarketutp.model.Articulo;
import supermarketutp.model.Categoria;
import supermarketutp.model.Proveedor;

public class ArticuloDAO {

    private Articulo[] articulos;
    private int size;

    public ArticuloDAO(Categoria[] categorias, Proveedor[] proveedores) {
        // Tamaño inicial del arreglo
        articulos = new Articulo[100];
        size = 0;

        try (InputStream is = getClass().getResourceAsStream("/supermarketutp/data/articulos.txt");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (size == articulos.length) {
                    // Si el arreglo está lleno, redimensionar al doble de tamaño
                    Articulo[] nuevoArreglo = new Articulo[articulos.length * 2];
                    System.arraycopy(articulos, 0, nuevoArreglo, 0, articulos.length);
                    articulos = nuevoArreglo;
                }

                String[] partes = linea.split(",");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                double precio = Double.parseDouble(partes[2]);
                int idCategoria = Integer.parseInt(partes[3]);
                int idProveedor = Integer.parseInt(partes[4]);

                // Buscar la categoría y el proveedor correspondientes
                Categoria categoria = buscarCategoriaPorID(categorias, idCategoria);
                Proveedor proveedor = buscarProveedorPorID(proveedores, idProveedor);

                articulos[size] = new Articulo(id, nombre, precio, categoria, proveedor);
                size++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Articulo[] listarArticulos() {
        Articulo[] resultado = new Articulo[size];
        System.arraycopy(articulos, 0, resultado, 0, size);
        return resultado;
    }

    // Método para buscar una categoría por ID
    private Categoria buscarCategoriaPorID(Categoria[] categorias, int id) {
        for (Categoria categoria : categorias) {
            if (categoria.getId() == id) {
                return categoria;
            }
        }
        return null; // Retornar null si no se encuentra la categoría
    }

    // Método para buscar un proveedor por ID
    private Proveedor buscarProveedorPorID(Proveedor[] proveedores, int id) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId() == id) {
                return proveedor;
            }
        }
        return null;
    }
    
    // Método para buscar artículos por nombre, categoría, proveedor o precio
    public Articulo[] buscarArticulos(String nombre, String categoria, String proveedor, double precio) {
        
        Articulo[] resultados = new Articulo[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            Articulo articulo = articulos[i];
            boolean coincide = true;

            if (nombre != null && !nombre.isEmpty()) {
                coincide = coincide && articulo.getNombre().toLowerCase().contains(nombre.toLowerCase());
            }

            if (categoria != null && !categoria.isEmpty()) {
                coincide = coincide && articulo.getCategoria().getNombre().toLowerCase().contains(categoria.toLowerCase());
            }

            if (proveedor != null && !proveedor.isEmpty()) {
                coincide = coincide && articulo.getProveedor().getNombre().toLowerCase().contains(proveedor.toLowerCase());
            }

            if (precio > 0) {
                coincide = coincide && articulo.getPrecio() == precio;
            }

            if (coincide) {
                resultados[count] = articulo;
                count++;
            }
        }

        // Crear un nuevo arreglo con el tamaño correcto
        Articulo[] resultadosArray = new Articulo[count];
        System.arraycopy(resultados, 0, resultadosArray, 0, count);

        // Ordenar los resultados por ID de forma descendente usando el algoritmo quicksort
        quicksort(resultadosArray, 0, resultadosArray.length - 1);

        return resultadosArray;
    }

    // Implementación del algoritmo quicksort para ordenar por ID
    private void quicksort(Articulo[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }

    // Método auxiliar para el particionamiento en el algoritmo quicksort
    private int partition(Articulo[] array, int low, int high) {
        int pivot = array[high].getId();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j].getId() > pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    // Método auxiliar para intercambiar dos elementos en el array
    private void swap(Articulo[] array, int i, int j) {
        Articulo temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
