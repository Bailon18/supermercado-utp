
package supermarketutp.form;

import javax.swing.JPanel;
import supermarketutp.model.DAO.ArticuloDAO;
import supermarketutp.model.DAO.CategoriaDAO;
import supermarketutp.model.DAO.ProveedorDAO;
import supermarketutp.model.*;


import javax.swing.table.DefaultTableModel;
import supermarketutp.model.DAO.CompaniaEnvioDAO;
import supermarketutp.model.DAO.PedidoDAO;


public class PrincipalForm extends javax.swing.JFrame {
    
    CategoriaDAO categoriadao = new CategoriaDAO();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    CompaniaEnvioDAO companiaEnvioDAO = new CompaniaEnvioDAO();
    PedidoDAO pedidoDAO = new PedidoDAO();
    ArticuloDAO articuloDAO;
 
    public PrincipalForm() {
        initComponents();
        llenarComboBox();
        llenarTablaArticulo();
        txtIdPedido.setText(Integer.toString(pedidoDAO.obtenerUltimoIdPedido()));
    }
    
    private void llenarComboBox() {
        
        Categoria[] categorias = categoriadao.listarCategorias();
        for (Categoria categoria : categorias) {
            cboCategoria.addItem(categoria.getNombre());
        }
        
        CompaniaEnvio[] companiasenvio = companiaEnvioDAO.listarCompaniasEnvio();
        for (CompaniaEnvio companiaenvio : companiasenvio) {
            cboCompaniaEnvio.addItem(companiaenvio.getNombreCompania());
        }
        
        Proveedor[] proveedores = proveedorDAO.listarProveedores();
        for (Proveedor proveedor : proveedores) {
            cboProveedores.addItem(proveedor.getNombre());
            cboProveedoresPedido.addItem(proveedor.getNombre());
            cboProveedoresPedidoConsultas.addItem(proveedor.getNombre());
        }
    }
    
    private Articulo[] obtenerArticulos(){
        Categoria[] categorias = categoriadao.listarCategorias();
        Proveedor[] proveedores = proveedorDAO.listarProveedores();
        articuloDAO = new ArticuloDAO(categorias, proveedores);
        return articuloDAO.listarArticulos();
    }
    
    private void llenarComboboxArticulos(Articulo[] articulos){
        
        cboArticulosPedido.removeAllItems();
        
        for (Articulo articulo : articulos) {
            cboArticulosPedido.addItem(articulo.getNombre());
        }
    }
    
    private void llenarTablaArticulo() {
        
        Articulo[] articulos = obtenerArticulos();
        
        DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();

        model.setRowCount(0);

        for (Articulo articulo : articulos) {
            model.addRow(new Object[] { articulo.getId(), articulo.getNombre(),
                articulo.getPrecio(), articulo.getCategoria().getNombre(),
                articulo.getProveedor().getNombre() });
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();
        panelBienvenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelArticulo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cboCategoria = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreArticulo = new javax.swing.JTextField();
        cboProveedores = new javax.swing.JComboBox<>();
        spPrecio = new javax.swing.JTextField();
        btnLimpiarBusqueda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        labelTotalArticulo1 = new javax.swing.JLabel();
        panelPedidoRegistro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetallePedido = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaPedidoR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFechaEntregaR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboCompaniaEnvio = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtFechaEnvioR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cboProveedoresPedido = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cboArticulosPedido = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtCantidadArticulo = new javax.swing.JTextField();
        btnAgregarCarrito = new javax.swing.JButton();
        txtPrecioArticulo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnGenerarPedido = new javax.swing.JButton();
        btnRetornarCancelar = new javax.swing.JButton();
        btnLimpiarPedido = new javax.swing.JButton();
        panelEstadistica = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelPedidoPrincipal = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnFiltrarPedido = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Paisd = new javax.swing.JLabel();
        txtFechaEnvio = new javax.swing.JTextField();
        btnLimpiarBusquedaPedido = new javax.swing.JButton();
        cboCompaniaEnvios = new javax.swing.JComboBox<>();
        txtPais = new javax.swing.JTextField();
        txtFechaPedido = new javax.swing.JTextField();
        cboProveedoresPedidoConsultas = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArticulos1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        btnNuevoPedido = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuArticulo = new javax.swing.JMenu();
        menuPedido = new javax.swing.JMenu();
        menuEstadistica = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenido.setBackground(new java.awt.Color(204, 204, 204));
        panelContenido.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout panelBienvenidoLayout = new javax.swing.GroupLayout(panelBienvenido);
        panelBienvenido.setLayout(panelBienvenidoLayout);
        panelBienvenidoLayout.setHorizontalGroup(
            panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidoLayout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel1)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        panelBienvenidoLayout.setVerticalGroup(
            panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidoLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        panelContenido.add(panelBienvenido, "card2");

        panelArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Articulo"), "Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        cboCategoria.setMinimumSize(null);
        cboCategoria.setPreferredSize(null);

        btnFiltrar.setText("Filtrar");
        btnFiltrar.setMinimumSize(null);
        btnFiltrar.setPreferredSize(null);
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio");

        jLabel6.setText("Categorias");

        jLabel7.setText("Nombre articulo");

        jLabel8.setText("Proveedores");

        txtNombreArticulo.setMinimumSize(null);
        txtNombreArticulo.setPreferredSize(null);

        cboProveedores.setMinimumSize(null);
        cboProveedores.setPreferredSize(null);

        spPrecio.setMinimumSize(null);
        spPrecio.setPreferredSize(null);

        btnLimpiarBusqueda.setText("Limpiar");
        btnLimpiarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelArticulo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1000, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Articulo"), "Lista de articulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CATEGORIA", "PROVEEDOR"
            }
        ));
        jScrollPane2.setViewportView(tablaArticulos);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 950, 400));

        jLabel5.setText("Total de articulos");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, 20));

        labelTotalArticulo1.setText("0");
        jPanel3.add(labelTotalArticulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 70, -1));

        panelArticulo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1000, 490));

        panelContenido.add(panelArticulo, "card3");

        panelPedidoRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrito de pedido"));

        tablaDetallePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ARTICULO", "PRECIO POR UNIDAD", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDetallePedido);
        if (tablaDetallePedido.getColumnModel().getColumnCount() > 0) {
            tablaDetallePedido.getColumnModel().getColumn(0).setResizable(false);
            tablaDetallePedido.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelPedidoRegistro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1020, 340));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel3.setText("Fecha de pedido");

        jLabel9.setText("Fecha de entrega");

        jLabel10.setText("Compañia de envio");

        jLabel14.setText("Fecha de envio");

        jLabel11.setText("Proveedor");

        cboProveedoresPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProveedoresPedidoItemStateChanged(evt);
            }
        });

        jLabel13.setText("Articulo");

        cboArticulosPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboArticulosPedidoItemStateChanged(evt);
            }
        });

        jLabel15.setText("Cantidad");

        btnAgregarCarrito.setText("Agregar al carrito");
        btnAgregarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCarritoMouseClicked(evt);
            }
        });
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });

        jLabel21.setText("Precio");

        txtIdPedido.setEditable(false);

        jLabel22.setText("Id Pedido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(221, 221, 221)
                                .addComponent(jLabel21)
                                .addGap(149, 149, 149)
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFechaPedidoR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtFechaEntregaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtFechaEnvioR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cboProveedoresPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCompaniaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cboArticulosPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cboCompaniaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboProveedoresPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaEnvioR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaEntregaR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel22))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFechaPedidoR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboArticulosPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelPedidoRegistro.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1020, 160));

        jLabel20.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 21)); // NOI18N
        jLabel20.setText("Registro Pedido");
        panelPedidoRegistro.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnGenerarPedido.setText("Generar Pedido");
        btnGenerarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarPedidoMouseClicked(evt);
            }
        });
        panelPedidoRegistro.add(btnGenerarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 170, 25));

        btnRetornarCancelar.setText("cancelar");
        btnRetornarCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetornarCancelarMouseClicked(evt);
            }
        });
        panelPedidoRegistro.add(btnRetornarCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 610, 170, 25));

        btnLimpiarPedido.setText("Limpiar");
        btnLimpiarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarPedidoMouseClicked(evt);
            }
        });
        panelPedidoRegistro.add(btnLimpiarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 170, 25));

        panelContenido.add(panelPedidoRegistro, "card4");

        jLabel4.setText("Estadistica");

        javax.swing.GroupLayout panelEstadisticaLayout = new javax.swing.GroupLayout(panelEstadistica);
        panelEstadistica.setLayout(panelEstadisticaLayout);
        panelEstadisticaLayout.setHorizontalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(jLabel4)
                .addContainerGap(542, Short.MAX_VALUE))
        );
        panelEstadisticaLayout.setVerticalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel4)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        panelContenido.add(panelEstadistica, "card5");

        panelPedidoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Articulo"), "Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        btnFiltrarPedido.setText("Filtrar");
        btnFiltrarPedido.setMinimumSize(null);
        btnFiltrarPedido.setPreferredSize(null);
        btnFiltrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPedidoActionPerformed(evt);
            }
        });

        jLabel12.setText("Fecha de envio");

        jLabel16.setText("Fecha de pedido");

        jLabel17.setText("Nombre proveedor");

        Paisd.setText("Pais");

        txtFechaEnvio.setMinimumSize(null);
        txtFechaEnvio.setPreferredSize(null);

        btnLimpiarBusquedaPedido.setText("Limpiar");
        btnLimpiarBusquedaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarBusquedaPedidoActionPerformed(evt);
            }
        });

        cboCompaniaEnvios.setMinimumSize(null);
        cboCompaniaEnvios.setPreferredSize(null);

        txtPais.setMinimumSize(null);
        txtPais.setPreferredSize(null);

        txtFechaPedido.setMinimumSize(null);
        txtFechaPedido.setPreferredSize(null);

        cboProveedoresPedidoConsultas.setMinimumSize(null);
        cboProveedoresPedidoConsultas.setPreferredSize(null);
        cboProveedoresPedidoConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProveedoresPedidoConsultasActionPerformed(evt);
            }
        });

        jLabel18.setText("Fecha de envio");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboProveedoresPedidoConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Paisd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboCompaniaEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnFiltrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiarBusquedaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Paisd)
                    .addComponent(jLabel12)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboProveedoresPedidoConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiarBusquedaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFiltrarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboCompaniaEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelPedidoPrincipal.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1000, 90));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Articulo"), "Lista de articulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaArticulos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID PEDIDO", "PRODUCTO", "PRECIO POR UNIDAD", "CANTIDAD", "DESCUENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaArticulos1);
        if (tablaArticulos1.getColumnModel().getColumnCount() > 0) {
            tablaArticulos1.getColumnModel().getColumn(0).setResizable(false);
            tablaArticulos1.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaArticulos1.getColumnModel().getColumn(1).setResizable(false);
            tablaArticulos1.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 950, 400));

        panelPedidoPrincipal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1000, 470));

        jLabel19.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 21)); // NOI18N
        jLabel19.setText("Pedidos");
        panelPedidoPrincipal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnNuevoPedido.setText("  +  Nuevo Pedido");
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });
        panelPedidoPrincipal.add(btnNuevoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 40, 150, 25));

        panelContenido.add(panelPedidoPrincipal, "card6");

        jMenuBar1.setPreferredSize(new java.awt.Dimension(418, 25));

        menuHome.setText("SUPER MERCADO UTP");
        menuHome.setMinimumSize(new java.awt.Dimension(134, 15));
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHome);

        menuArticulo.setText("Articulo");
        menuArticulo.setPreferredSize(new java.awt.Dimension(60, 102));
        menuArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuArticuloMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuArticulo);

        menuPedido.setText("Pedido");
        menuPedido.setPreferredSize(new java.awt.Dimension(53, 15));
        menuPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPedidoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPedido);

        menuEstadistica.setText("Estadistica");
        menuEstadistica.setPreferredSize(new java.awt.Dimension(71, 15));
        menuEstadistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEstadisticaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuEstadistica);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        mostrarPanel(panelBienvenido);
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArticuloMouseClicked
        mostrarPanel(panelArticulo);
    }//GEN-LAST:event_menuArticuloMouseClicked

    private void menuEstadisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEstadisticaMouseClicked
        mostrarPanel(panelEstadistica);
    }//GEN-LAST:event_menuEstadisticaMouseClicked

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        
        String nombre = txtNombreArticulo.getText();
        String categoria = cboCategoria.getSelectedItem().toString();
        String proveedor = cboProveedores.getSelectedItem().toString();
        double precio = !spPrecio.getText().isEmpty() ? Double.parseDouble(spPrecio.getText()) : 0.0;


        Articulo[] resultados = articuloDAO.buscarArticulos(nombre, categoria, proveedor, precio);

        DefaultTableModel model = (DefaultTableModel) tablaArticulos.getModel();

        model.setRowCount(0);

        for (Articulo articulo : resultados) {
            model.addRow(new Object[] { articulo.getId(), articulo.getNombre(),
                articulo.getPrecio(), articulo.getCategoria().getNombre(),
                articulo.getProveedor().getNombre() });
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimpiarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBusquedaActionPerformed
        
        txtNombreArticulo.setText("");
        spPrecio.setText("");
        llenarTablaArticulo();
    }//GEN-LAST:event_btnLimpiarBusquedaActionPerformed

    private void btnAgregarCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarritoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCarritoMouseClicked

    private void menuPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPedidoMouseClicked
       mostrarPanel(panelPedidoPrincipal);
    }//GEN-LAST:event_menuPedidoMouseClicked

    private void btnFiltrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPedidoActionPerformed
 
    }//GEN-LAST:event_btnFiltrarPedidoActionPerformed

    private void btnLimpiarBusquedaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBusquedaPedidoActionPerformed

    }//GEN-LAST:event_btnLimpiarBusquedaPedidoActionPerformed

    private void cboProveedoresPedidoConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProveedoresPedidoConsultasActionPerformed
      
    }//GEN-LAST:event_cboProveedoresPedidoConsultasActionPerformed

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
        mostrarPanel(panelPedidoRegistro);
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

    private void btnGenerarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarPedidoMouseClicked
      
    }//GEN-LAST:event_btnGenerarPedidoMouseClicked

    private void btnRetornarCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetornarCancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetornarCancelarMouseClicked

    private void btnLimpiarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarPedidoMouseClicked
     
    }//GEN-LAST:event_btnLimpiarPedidoMouseClicked

    private void cboArticulosPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboArticulosPedidoItemStateChanged
        
        try {
            
            String articuloSeleccionado = cboArticulosPedido.getSelectedItem()
                .toString();
   
            Articulo[] articulos = obtenerArticulos();
            for (Articulo articulo : articulos) {
                if (articulo.getNombre().equals(articuloSeleccionado)) {
                    txtPrecioArticulo.setText(String.valueOf(articulo.getPrecio()));
                    break; 
                }
            }
        }catch (NullPointerException e) {
            
        }

    }//GEN-LAST:event_cboArticulosPedidoItemStateChanged

    private void cboProveedoresPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProveedoresPedidoItemStateChanged
        
        articuloDAO = new ArticuloDAO(categoriadao.listarCategorias(), proveedorDAO.listarProveedores());
       
        String proveedor = cboProveedoresPedido.getSelectedItem().toString();
  
        Articulo[] articulos = articuloDAO.buscarArticulos("", "", proveedor, 0.0); // linea 859
        llenarComboboxArticulos(articulos);
        
    }//GEN-LAST:event_cboProveedoresPedidoItemStateChanged

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        DetallePedido[] detallesPedido = new DetallePedido[100];
        
    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void mostrarPanel(JPanel panelMostrado) {
        panelArticulo.setVisible(panelMostrado == panelArticulo);
        panelBienvenido.setVisible(panelMostrado == panelBienvenido);
        panelEstadistica.setVisible(panelMostrado == panelEstadistica);
        panelPedidoRegistro.setVisible(panelMostrado == panelPedidoRegistro);
        panelPedidoPrincipal.setVisible(panelMostrado == panelPedidoPrincipal);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Paisd;
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnFiltrarPedido;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JButton btnLimpiarBusqueda;
    private javax.swing.JButton btnLimpiarBusquedaPedido;
    private javax.swing.JButton btnLimpiarPedido;
    private javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnRetornarCancelar;
    private javax.swing.JComboBox<String> cboArticulosPedido;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboCompaniaEnvio;
    private javax.swing.JComboBox<String> cboCompaniaEnvios;
    private javax.swing.JComboBox<String> cboProveedores;
    private javax.swing.JComboBox<String> cboProveedoresPedido;
    private javax.swing.JComboBox<String> cboProveedoresPedidoConsultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTotalArticulo1;
    private javax.swing.JMenu menuArticulo;
    private javax.swing.JMenu menuEstadistica;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuPedido;
    private javax.swing.JPanel panelArticulo;
    private javax.swing.JPanel panelBienvenido;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelEstadistica;
    private javax.swing.JPanel panelPedidoPrincipal;
    private javax.swing.JPanel panelPedidoRegistro;
    private javax.swing.JTextField spPrecio;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaArticulos1;
    private javax.swing.JTable tablaDetallePedido;
    private javax.swing.JTextField txtCantidadArticulo;
    private javax.swing.JTextField txtFechaEntregaR;
    private javax.swing.JTextField txtFechaEnvio;
    private javax.swing.JTextField txtFechaEnvioR;
    private javax.swing.JTextField txtFechaPedido;
    private javax.swing.JTextField txtFechaPedidoR;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtNombreArticulo;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPrecioArticulo;
    // End of variables declaration//GEN-END:variables
}
