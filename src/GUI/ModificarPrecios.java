package GUI;

import datos.Alimentos;
import datos.Aseo;
import datos.Licores;
import datos.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModificarPrecios extends javax.swing.JFrame {

    public static String rol = Login.rol;
    public static ArrayList<Alimentos> alimentos = Login.alimentos;
    public static ArrayList<Licores> licores = Login.licores;
    public static ArrayList<Aseo> productosAseo = Login.productosAseo;

    private String codigo;
    private String busqueda;

    private DefaultTableModel tablaLicores;
    private DefaultTableModel tablaAlimentos;
    private DefaultTableModel tablaAseo;

    public ModificarPrecios() {

        initComponents();
        this.setTitle("Modificar Precios - " + rol);
        setLocationRelativeTo(null);
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("empresa/logo.png"));
        this.setIconImage(logo);

        txtBusquedaProducto.setText("");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        this.txtCodigo.setEnabled(false);
        this.txtNombre.setEnabled(false);
    }

    private void tablaAlimentos() {

        String[] titulos = {"Codigo", "Nombre", "Tipo", "Unidades por Caja", "Precio", "Fabricante"};
        Object[] registro = new Object[6];

        tablaAlimentos = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (alimentos.size() > 0) {
                int i = 1;
                for (Alimentos alimento : alimentos) {
                    registro[0] = "A100" + i++;
                    registro[1] = alimento.getNombre();
                    registro[2] = alimento.getTipoAlimento();
                    registro[3] = alimento.getUnidadesCaja();
                    registro[4] = alimento.getPrecio();
                    registro[5] = alimento.getEmpresaFabricante();

                    String codigo = (String) registro[0];
                    alimento.setCodigo(codigo);

                    tablaAlimentos.addRow(registro);
                }
                tblAlimentos.setModel(tablaAlimentos);
            }
        } catch (Exception e) {
        }
    }

    private void tablaAseo() {

        String[] titulos = {"Codigo", "Nombre", "Tipo", "Unidades por Caja", "Precio", "Fabricante"};
        Object[] registro = new Object[6];

        tablaAseo = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (productosAseo.size() > 0) {
                int i = 1;
                for (Aseo aseo : productosAseo) {
                    registro[0] = "B100" + i++;
                    registro[1] = aseo.getNombre();
                    registro[2] = aseo.getTipoProducto();
                    registro[3] = aseo.getUnidadesCaja();
                    registro[4] = aseo.getPrecio();
                    registro[5] = aseo.getEmpresaFabricante();

                    String codigo = (String) registro[0];
                    aseo.setCodigo(codigo);

                    tablaAseo.addRow(registro);
                }
                tblProductosAseo.setModel(tablaAseo);
            }
        } catch (Exception e) {
        }
    }

    private void tablaLicores() {

        String[] titulos = {"Codigo", "Nombre", "Tipo", "Unidades por Caja", "Precio", "Fabricante"};
        Object[] registro = new Object[6];

        tablaLicores = new DefaultTableModel(null, titulos) {

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (licores.size() > 0) {
                int i = 1;
                for (Licores licor : licores) {
                    registro[0] = "C100" + i++;
                    registro[1] = licor.getNombre();
                    registro[2] = licor.getTipoLicor();
                    registro[3] = licor.getUnidadesCaja();
                    registro[4] = licor.getPrecio();
                    registro[5] = licor.getEmpresaFabricante();

                    //Agrego un codigo personalizado a cada producto
                    String codigo = (String) registro[0];
                    licor.setCodigo(codigo);

                    tablaLicores.addRow(registro);
                }
                tblLicores.setModel(tablaLicores);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBusquedaProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReiniciarBusqueda = new javax.swing.JButton();
        menuCambio = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAlimentos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProductosAseo = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblLicores = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empresa/Empresa 2.png"))); // NOI18N

        btnSalir.setBackground(new java.awt.Color(255, 153, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuVendedor/manejoprecios.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Modificar Precios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir)
                        .addComponent(jLabel2))
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("En las tablas podra encontrar el CÓDIGO de cada producto,  ingrese  el  código del producto  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("que desea modificar, luego abra la pestaña Cambio de Precio y ejecute el cambio. Por ultimo,   ");

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBusquedaProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBusquedaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaProductoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Código:");

        btnReiniciarBusqueda.setBackground(new java.awt.Color(255, 153, 0));
        btnReiniciarBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/20X20-CANCEL.png"))); // NOI18N
        btnReiniciarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarBusquedaActionPerformed(evt);
            }
        });

        menuCambio.setBackground(new java.awt.Color(255, 255, 255));
        menuCambio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        menuCambio.setPreferredSize(new java.awt.Dimension(532, 130));

        tblAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Tipo", "Unidades por Caja", "Precio ($)", "Fabricante"
            }
        ));
        jScrollPane5.setViewportView(tblAlimentos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        menuCambio.addTab("Productos Alimenticios", jPanel3);

        tblProductosAseo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Tipo", "Unidades por Caja", "Precio ($)", "Fabricante"
            }
        ));
        jScrollPane6.setViewportView(tblProductosAseo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        menuCambio.addTab("Productos de Aseo", jPanel4);

        tblLicores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Tipo de Licor", "Unidades por Caja", "Precio ($)", "Fabricante"
            }
        ));
        jScrollPane7.setViewportView(tblLicores);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        menuCambio.addTab("Licores", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setMinimumSize(new java.awt.Dimension(0, 109));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Código:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Precio:");

        btnGuardar.setBackground(new java.awt.Color(255, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(14, 14, 14)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtCodigo)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(btnGuardar)
                .addGap(28, 28, 28)
                .addComponent(btnCancelar)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuCambio.addTab("Cambio de Precio", jPanel6);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("guarde los cambios.");

        btnActualizar.setBackground(new java.awt.Color(255, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar ");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnReiniciarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addComponent(btnReiniciarBusqueda))
                .addGap(28, 28, 28)
                .addComponent(menuCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        if (Login.rol == "Vendedor") {
            Vendedor vendedor = new Vendedor();
            int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea retornar al menu principal?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                vendedor.setVisible(true);
                this.setVisible(false);
            }
        } else if (Login.rol == "Administrador") {
            Administrador administrador = new Administrador();
            int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea retornar al menu principal?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                administrador.setVisible(true);
                this.setVisible(false);
            }
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        tablaLicores();
        tablaAlimentos();
        tablaAseo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        int prueba = 0;

        try {
            busqueda = txtBusquedaProducto.getText().toUpperCase();

            if (busqueda.substring(0, 4).equals("A100") == true) {

                for (Alimentos a : alimentos) {

                    if (busqueda.equals(a.getCodigo()) == true) {

                        txtCodigo.setText(a.getCodigo());
                        txtNombre.setText(a.getNombre());
                        double precio = a.getPrecio();
                        String cambio = Double.toString(precio);
                        txtPrecio.setText(cambio);
                        prueba = 1;

                    }

                }

                if (prueba == 0) {
                    JOptionPane.showMessageDialog(rootPane, "El código ingresado no se encuentra en la base de datos.", "¡Alerta!", JOptionPane.WARNING_MESSAGE);
                    reiniciar();
                }

            } else if (busqueda.substring(0, 4).equals("B100") == true) {

                for (Aseo a : productosAseo) {

                    if (busqueda.equals(a.getCodigo()) == true) {

                        txtCodigo.setText(a.getCodigo());
                        txtNombre.setText(a.getNombre());
                        double precio = a.getPrecio();
                        String cambio = Double.toString(precio);
                        txtPrecio.setText(cambio);
                        prueba = 1;

                    }

                }

                if (prueba == 0) {
                    JOptionPane.showMessageDialog(rootPane, "El código ingresado no se encuentra en la base de datos.", "¡Alerta!", JOptionPane.WARNING_MESSAGE);
                    reiniciar();
                }

            } else if (busqueda.substring(0, 4).equals("C100") == true) {
                for (Licores a : licores) {

                    if (busqueda.equals(a.getCodigo()) == true) {

                        txtCodigo.setText(a.getCodigo());
                        txtNombre.setText(a.getNombre());
                        double precio = a.getPrecio();
                        String cambio = Double.toString(precio);
                        txtPrecio.setText(cambio);
                        prueba = 1;
                    }

                }

                if (prueba == 0) {
                    JOptionPane.showMessageDialog(rootPane, "El código ingresado no se encuentra en la base de datos.", "¡Alerta!", JOptionPane.WARNING_MESSAGE);
                    reiniciar();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "El código ingresado es erroneo. Asegurese de ingresarlo correctamente.", "¡Alerta!", JOptionPane.WARNING_MESSAGE);
                reiniciar();
            }

        } catch (Exception e) {

            reiniciar();
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void reiniciar() {
        txtBusquedaProducto.setText("");
    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtBusquedaProducto.setText("");
    }


    private void btnReiniciarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarBusquedaActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarBusquedaActionPerformed

    private void txtBusquedaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaProductoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Alimentos alimento = null;
        Aseo aseoProducto = null;
        Licores licor = null;
        double precio = 0;
        String cambio;

        if (busqueda.substring(0, 4).equals("A100")) {

            cambio = txtPrecio.getText();

            try {
                double num = Double.parseDouble(cambio);
                precio = num;

            } catch (Exception e) {
                limpiarCampos();
                JOptionPane.showMessageDialog(rootPane, "Los valores ingresados no corresponden a numeros, por favor vuelva a intentarlo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }

            for (Alimentos a : Login.alimentos) {

                if (a.getCodigo().equals(busqueda)) {
                    alimento = a;
                }
            }

            if (alimento != null) {

                if (precio > 1000) {
                    alimento.setPrecio(precio);
                    JOptionPane.showMessageDialog(rootPane, "El cambio de precio se ha realizado satisfactoriamente.", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(rootPane, "El precio ingresado es muy bajo, por favor intente nuevamente.", "Atención", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            limpiarCampos();
            tablaAlimentos();

        } else if (busqueda.substring(0, 4).equals("B100")) {

            cambio = txtPrecio.getText();

            try {
                double num = Double.parseDouble(cambio);
                precio = num;
            } catch (Exception e) {
                limpiarCampos();
                JOptionPane.showMessageDialog(rootPane, "Los valores ingresados no corresponden a numeros, por favor vuelva a intentarlo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }

            for (Aseo a : Login.productosAseo) {

                if (a.getCodigo().equals(busqueda)) {
                    aseoProducto = a;
                }
            }

            if (aseoProducto != null) {

                if (precio > 1000) {
                    aseoProducto.setPrecio(precio);
                    JOptionPane.showMessageDialog(rootPane, "El cambio de precio se ha realizado satisfactoriamente.", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(rootPane, "El precio ingresado es muy bajo, por favor intente nuevamente.", "Atención", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            limpiarCampos();
            tablaAseo();

        } else if (busqueda.substring(0, 4).equals("C100")) {

            cambio = txtPrecio.getText();

            try {
                double num = Double.parseDouble(cambio);
                precio = num;
            } catch (Exception e) {
                limpiarCampos();
                JOptionPane.showMessageDialog(rootPane, "Los valores ingresados no corresponden a numeros, por favor vuelva a intentarlo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }

            for (Licores a : Login.licores) {

                if (a.getCodigo().equals(busqueda)) {
                    licor = a;
                }
            }

            if (licor != null) {

                if (precio > 1000) {
                    licor.setPrecio(precio);
                    JOptionPane.showMessageDialog(rootPane, "El cambio de precio se ha realizado satisfactoriamente.", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(rootPane, "El precio ingresado es muy bajo, por favor intente nuevamente.", "Atención", JOptionPane.INFORMATION_MESSAGE);
                }

            }
            limpiarCampos();
            tablaLicores();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea cancelar la modificacion del precio?", "¡Atención!", ERROR_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            limpiarCampos();
        }

    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPrecios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReiniciarBusqueda;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lb1;
    private javax.swing.JTabbedPane menuCambio;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tblAlimentos;
    private javax.swing.JTable tblLicores;
    private javax.swing.JTable tblProductosAseo;
    private javax.swing.JTextField txtBusquedaProducto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
