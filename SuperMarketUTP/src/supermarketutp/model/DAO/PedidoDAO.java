package supermarketutp.model.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
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
                int idPedido = Integer.parseInt(partes[0]);
                int idProveedor = Integer.parseInt(partes[1]);
                String fechaPedido = partes[2];
                String fechaEnvio = partes[3];
                String fechaEntrega = partes[4];
                int idCompaniaEnvio = Integer.parseInt(partes[5]);
                double cargo = Double.parseDouble(partes[6]);

                if (idPedido > ultimoIdPedido) {
                    ultimoIdPedido = idPedido; 
                }

                Proveedor proveedor = proveedorDAO.obtenerProveedorPorId(idProveedor);
                CompaniaEnvio companiaenvio = companiaDAO.obtenerCompaniaEnvioPorId(idCompaniaEnvio);

                pedidos[size] = new Pedido(idPedido, proveedor, fechaPedido,
                        fechaEnvio, fechaEntrega, companiaenvio, cargo);
                size++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Método para obtener el último ID de pedido
    public int obtenerUltimoIdPedido() {
        return ultimoIdPedido + 1;
    }


}
