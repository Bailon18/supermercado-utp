package supermarketutp.model.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import supermarketutp.model.*;

public class PedidoDAO {

    private Pedido[] pedidos;
    private int size;
    private int ultimoIdPedido; // Variable para almacenar el último ID de pedido
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    CompaniaEnvioDAO companiaDAO = new CompaniaEnvioDAO();
    
    
    public PedidoDAO() {
        this.leerPedidos();
    }
    
    public Pedido[] leerPedidos() {
        pedidos = new Pedido[100];
        size = 0;
        ultimoIdPedido = 0; // Valor predeterminado

        try (InputStream is = getClass().getResourceAsStream("/supermarketutp/data/pedidos.txt");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (size == pedidos.length) {
                    Pedido[] nuevoArreglo = new Pedido[pedidos.length * 2];
                    System.arraycopy(pedidos, 0, nuevoArreglo, 0, pedidos.length);
                    pedidos = nuevoArreglo;
                }

                String[] partes = linea.split(",");
                int idPedido = Integer.parseInt(partes[0]); //
                String nombreproveedor = partes[1]; //
                String fechaPedido = partes[2];
                String fechaEnvio = partes[3];
                String fechaEntrega = partes[4];
                String nombreCompania = partes[5];
                double cargo = Double.parseDouble(partes[6]);

                if (idPedido > ultimoIdPedido) {
                    ultimoIdPedido = idPedido;
                }

                Proveedor proveedor = proveedorDAO.buscarProveedorPorNombre(nombreproveedor);
                CompaniaEnvio companiaenvio = companiaDAO.buscarCompaniaPorNombre(nombreCompania);

                pedidos[size] = new Pedido(idPedido, proveedor, fechaPedido, fechaEnvio, fechaEntrega, companiaenvio, cargo);
                size++;
            }

            Pedido[] resultado = new Pedido[size];
            System.arraycopy(pedidos, 0, resultado, 0, size);
            return resultado;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    

    // Método para obtener el último ID de pedido
    public int obtenerUltimoIdPedido() {
        return ultimoIdPedido + 1;
    }
    
    public void guardarPedido(Pedido pedido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/supermarketutp/data/pedidos.txt", true))) {
            // Crear una cadena con los datos del pedido
            String pedidoString = pedido.getIdPedido() + "," + pedido.getProveedor().getNombre() + ","
                    + pedido.getFechaPedido() + "," + pedido.getFechaEnvio() + ","
                    + pedido.getFechaEntrega() + "," + pedido.getCompaniaEnvio().getNombreCompania() + ","
                    + pedido.getCargo() + System.lineSeparator();

            // Escribir los datos del pedido al archivo
            writer.write(pedidoString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
