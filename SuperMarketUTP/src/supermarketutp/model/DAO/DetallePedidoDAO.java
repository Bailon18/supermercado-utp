package supermarketutp.model.DAO;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import supermarketutp.model.DetallePedido;

public class DetallePedidoDAO {
    
    ArticuloDAO articuloDAO  = new ArticuloDAO();
    
    private File detallesPedidosFile;

    public DetallePedidoDAO() {
        detallesPedidosFile = new File("src/supermarketutp/data/detallesPedidos.txt");
    }
   
    public void guardarDetallesPedido(DetallePedido[] detallesPedido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(detallesPedidosFile, true))) {
            for (DetallePedido detalle : detallesPedido) {
                if (detalle != null) {
                    // Convierte el objeto DetallePedido en una línea de texto en el formato esperado
                    String linea = detalle.getIdPedido() + "," + detalle.getProducto().getNombre() + ","
                            + detalle.getPrecioUnidad() + "," + detalle.getCantidad();
                    // Escribe la línea en el archivo
                    writer.write(linea);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public DetallePedido[] cargarDetallesPedido() throws FileNotFoundException, IOException {
        DetallePedido[] detalles = new DetallePedido[100]; // Tamaño inicial del arreglo (ajústalo según tus necesidades)

        int cantidadDetalles = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(DETALLES_PEDIDOS_FILE)) {
            String linea;
            while ((linea = reader.readLine()) != null) { // arregla aqui <identifier> expected ';' expected

                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    int idPedido = Integer.parseInt(partes[0]);
                    String nombreArticulo = partes[1];
                    double precioUnidad = Double.parseDouble(partes[2]);
                    int cantidad = Integer.parseInt(partes[3]);

                    // Aquí deberías obtener el objeto Articulo correspondiente basado en el nombre del artículo
                    
                    Articulo  ar = new Articulo();
                    ar.setNombre(nombreArticulo);

                    DetallePedido detalle = new DetallePedido(idPedido, ar, precioUnidad, cantidad);
                    detalles[cantidadDetalles] = detalle;
                    cantidadDetalles++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return detalles;
    }*/
}
