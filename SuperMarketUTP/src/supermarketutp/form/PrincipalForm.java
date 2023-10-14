
package supermarketutp.form;

import javax.swing.JPanel;
import supermarketutp.model.Categoria;
import supermarketutp.model.DAO.ArticuloDAO;
import supermarketutp.model.DAO.CategoriaDAO;
import supermarketutp.model.DAO.ProveedorDAO;
import supermarketutp.model.Proveedor;
import supermarketutp.model.Articulo;

import javax.swing.table.DefaultTableModel;


public class PrincipalForm extends javax.swing.JFrame {
    
    CategoriaDAO categoriadao = new CategoriaDAO();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    ArticuloDAO articuloDAO;
 
    public PrincipalForm() {
        initComponents();
        llenarComboBox();
        llenarTablaArticulo(categoriadao, proveedorDAO);
    }
    
    private void llenarComboBox() {
        
        Categoria[] categorias = categoriadao.listarCategorias();
        for (Categoria categoria : categorias) {
            cboCategoria.addItem(categoria.getNombre());
        }
        
        Proveedor[] proveedores = proveedorDAO.listarProveedores();
        for (Proveedor proveedor : proveedores) {
            cboProveedores.addItem(proveedor.getNombre());
        }
    }
    
    private void llenarTablaArticulo(CategoriaDAO categoriadao, ProveedorDAO proveedorDAO) {
        
        Categoria[] categorias = categoriadao.listarCategorias();
        Proveedor[] proveedores = proveedorDAO.listarProveedores();
        articuloDAO = new ArticuloDAO(categorias, proveedores);

        Articulo[] articulos = articuloDAO.listarArticulos();

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
        panelPedido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelEstadistica = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
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
                .addContainerGap(494, Short.MAX_VALUE))
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

        jLabel3.setText("Pedido");

        javax.swing.GroupLayout panelPedidoLayout = new javax.swing.GroupLayout(panelPedido);
        panelPedido.setLayout(panelPedidoLayout);
        panelPedidoLayout.setHorizontalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(jLabel3)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        panelPedidoLayout.setVerticalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel3)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        panelContenido.add(panelPedido, "card4");

        jLabel4.setText("Estadistica");

        javax.swing.GroupLayout panelEstadisticaLayout = new javax.swing.GroupLayout(panelEstadistica);
        panelEstadistica.setLayout(panelEstadisticaLayout);
        panelEstadisticaLayout.setHorizontalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(jLabel4)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        panelEstadisticaLayout.setVerticalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel4)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        panelContenido.add(panelEstadistica, "card5");

        menuHome.setText("SUPER MERCADO UTP");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHome);

        menuArticulo.setText("Articulo");
        menuArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuArticuloMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuArticulo);

        menuPedido.setText("Pedido");
        menuPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPedidoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPedido);

        menuEstadistica.setText("Estadistica");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        mostrarPanel(panelBienvenido);
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArticuloMouseClicked
        mostrarPanel(panelArticulo);
    }//GEN-LAST:event_menuArticuloMouseClicked

    private void menuPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPedidoMouseClicked
        mostrarPanel(panelPedido);
    }//GEN-LAST:event_menuPedidoMouseClicked

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
        llenarTablaArticulo(categoriadao, proveedorDAO);
    }//GEN-LAST:event_btnLimpiarBusquedaActionPerformed

    private void mostrarPanel(JPanel panelMostrado) {
        panelArticulo.setVisible(panelMostrado == panelArticulo);
        panelBienvenido.setVisible(panelMostrado == panelBienvenido);
        panelEstadistica.setVisible(panelMostrado == panelEstadistica);
        panelPedido.setVisible(panelMostrado == panelPedido);
    }
    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpiarBusqueda;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTotalArticulo1;
    private javax.swing.JMenu menuArticulo;
    private javax.swing.JMenu menuEstadistica;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuPedido;
    private javax.swing.JPanel panelArticulo;
    private javax.swing.JPanel panelBienvenido;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelEstadistica;
    private javax.swing.JPanel panelPedido;
    private javax.swing.JTextField spPrecio;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTextField txtNombreArticulo;
    // End of variables declaration//GEN-END:variables
}
