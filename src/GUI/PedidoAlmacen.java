package GUI;

import datos.Alimentos;
import datos.Aseo;
import datos.Licores;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PedidoAlmacen extends javax.swing.JFrame {

    private String codigo;
    private String busqueda;

    private DefaultTableModel tablaLicores;
    private DefaultTableModel tablaAlimentos;
    private DefaultTableModel tablaAseo;

    public PedidoAlmacen() {

        initComponents();
        this.setTitle("POO Comercial - Vendedor");
        setLocationRelativeTo(null);
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("empresa/logo.png"));
        this.setIconImage(logo);

        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        this.txtNombre.setEnabled(false);
        this.txtPrecio.setEnabled(false);

    }

    private void tablaAlimentos() {

        String[] titulos = {"CÓDIGO", "Nombre", "Cajas Disponibles", "Unidades por Caja", "Precio ($)"};
        Object[] registro = new Object[5];

        tablaAlimentos = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (Login.alimentosAdmin.size() > 0) {
                int i = 1;
                for (Alimentos alimento : Login.alimentosAdmin) {
                    registro[0] = "A100" + i++;
                    registro[1] = alimento.getNombre();
                    registro[2] = alimento.getCajas();
                    registro[3] = alimento.getUnidadesCaja();
                    registro[4] = alimento.getPrecio();

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

        String[] titulos = {"CÓDIGO", "Nombre", "Cajas Disponibles", "Unidades por Caja", "Precio ($)"};
        Object[] registro = new Object[5];

        tablaAseo = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (Login.aseoAdmin.size() > 0) {
                int i = 1;
                for (Aseo aseo : Login.aseoAdmin) {
                    registro[0] = "B100" + i++;
                    registro[1] = aseo.getNombre();
                    registro[2] = aseo.getCajas();
                    registro[3] = aseo.getUnidadesCaja();
                    registro[4] = aseo.getPrecio();

                    String codigo = (String) registro[0];
                    aseo.setCodigo(codigo);

                    tablaAseo.addRow(registro);
                }
                tblAseo.setModel(tablaAseo);
            }
        } catch (Exception e) {
        }

    }

    private void tablaLicores() {

        String[] titulos = {"CÓDIGO", "Nombre", "Cajas Disponibles", "Unidades por Caja", "Precio ($)"};
        Object[] registro = new Object[5];

        tablaLicores = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (Login.licoresAdmin.size() > 0) {
                int i = 1;
                for (Licores licor : Login.licoresAdmin) {
                    registro[0] = "C100" + i++;
                    registro[1] = licor.getNombre();
                    registro[2] = licor.getCajas();
                    registro[3] = licor.getUnidadesCaja();
                    registro[4] = licor.getPrecio();

                    String codigo = (String) registro[0];
                    licor.setCodigo(codigo);

                    tablaLicores.addRow(registro);
                }
                tblLicor.setModel(tablaLicores);
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Licores = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cboxCajas = new javax.swing.JComboBox<>();
        btnPedir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlimentos = new javax.swing.JTable();
        btnMostrarAlimentos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAseo = new javax.swing.JTable();
        btnMostrarAseo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLicor = new javax.swing.JTable();
        btnMostrarLicor = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuVendedor/pedido a bodega Icono.png"))); // NOI18N
        jLabel2.setText("    Pedido al Almacen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4))
        );

        Licores.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("En las pestañas alternas, podra encontrar el codigo de cada producto, ingreselo a ");

        jLabel10.setText("disponibilidad del producto. Para finalizar presione el botón pedir.");

        jLabel6.setText("continuación y escoja el numero  de cajas que piensa  ordenar tenga  en cuenta la ");

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PEDIDO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Código:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Precio ($): ");

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/20X20-CANCEL.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cant. Cajas");

        cboxCajas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboxCajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        btnPedir.setBackground(new java.awt.Color(255, 153, 0));
        btnPedir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedir.setForeground(new java.awt.Color(255, 255, 255));
        btnPedir.setText("Pedir");
        btnPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(txtNombre))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel9)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar)
                                    .addComponent(cboxCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPedir)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cboxCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Licores.addTab("Hacer Pedido", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tblAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Cajas Disponibles", "Precio ($)", "Fabricante"
            }
        ));
        jScrollPane1.setViewportView(tblAlimentos);

        btnMostrarAlimentos.setBackground(new java.awt.Color(255, 153, 0));
        btnMostrarAlimentos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrarAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarAlimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuAdministrador/despensaIcono.png"))); // NOI18N
        btnMostrarAlimentos.setText("Mostrar Productos");
        btnMostrarAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlimentosActionPerformed(evt);
            }
        });

        jLabel15.setText("de la pestaña *Hacer Pedido*.");

        jLabel16.setText("Recuerde ingresar el código del producto que desea pedir en la barra de busqueda ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarAlimentos)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarAlimentos)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        Licores.addTab("Alimentos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblAseo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Cajas Disponibles", "Precio ($)", "Fabricante"
            }
        ));
        jScrollPane2.setViewportView(tblAseo);

        btnMostrarAseo.setBackground(new java.awt.Color(255, 153, 0));
        btnMostrarAseo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrarAseo.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarAseo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuAdministrador/aseoIcono.png"))); // NOI18N
        btnMostrarAseo.setText("Mostrar Productos");
        btnMostrarAseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAseoActionPerformed(evt);
            }
        });

        jLabel13.setText("de la pestaña *Hacer Pedido*.");

        jLabel14.setText("Recuerde ingresar el código del producto que desea pedir en la barra de busqueda ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarAseo)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarAseo)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        Licores.addTab("Productos de Aseo", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tblLicor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Cajas Disponibles", "Precio ($)", "Fabricante"
            }
        ));
        jScrollPane3.setViewportView(tblLicor);

        btnMostrarLicor.setBackground(new java.awt.Color(255, 153, 0));
        btnMostrarLicor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrarLicor.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarLicor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuAdministrador/licoresIcono.png"))); // NOI18N
        btnMostrarLicor.setText("Mostrar Productos");
        btnMostrarLicor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLicorActionPerformed(evt);
            }
        });

        jLabel12.setText("de la pestaña *Hacer Pedido*.");

        jLabel11.setText("Recuerde ingresar el código del producto que desea pedir en la barra de busqueda ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrarLicor)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarLicor)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        Licores.addTab("Licores", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Licores, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Licores, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Vendedor vendedor = new Vendedor();
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea retornar al menu principal?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            vendedor.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        int prueba = 0;

        try {
            busqueda = txtCodigo.getText().toUpperCase();

            if (busqueda.substring(0, 4).equals("A100")) {

                for (Alimentos a : Login.alimentosAdmin) {

                    if (busqueda.equals(a.getCodigo())) {

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
                    limpiarCampos();
                }

            } else if (busqueda.substring(0, 4).equals("B100")) {

                for (Aseo a : Login.aseoAdmin) {

                    if (busqueda.equals(a.getCodigo())) {

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
                    limpiarCampos();
                }

            } else if (busqueda.substring(0, 4).equals("C100")) {

                for (Licores a : Login.licoresAdmin) {

                    if (busqueda.equals(a.getCodigo())) {

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
                    limpiarCampos();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "El código ingresado es erroneo. Asegurese de ingresarlo correctamente.", "¡Alerta!", JOptionPane.WARNING_MESSAGE);
                limpiarCampos();
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirActionPerformed

        Alimentos alimento = null;
        Alimentos alimentoAd = null;
        Aseo aseoProducto = null;
        Aseo aseoProductoAd = null;
        Licores licor = null;
        Licores licorAd = null;
        int aux = 0;
        int cajas = 0;

        String cambio = cboxCajas.getSelectedItem().toString();

        try {
            if (busqueda.substring(0, 4).equals("A100")) {

                cajas = Integer.parseInt(cambio);

                for (Alimentos a : Login.alimentos) {
                    if (a.getCodigo().equals(busqueda)) {
                        alimento = a;
                    }
                }

                for (Alimentos a : Login.alimentosAdmin) {
                    if (a.getCodigo().equals(busqueda)) {
                        alimentoAd = a;
                    }
                }

                if (cajas > alimentoAd.getCajas()) {
                    limpiarCampos();
                    aux = 1;
                    JOptionPane.showMessageDialog(rootPane, "Ha escogido una cantidad de productos mayor a las disponibles\nen el inventario, por favor intente de nuevo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
                }

                if (alimento != null && aux == 0) {

                    int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Desea confirmar el pedido del producto?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
                    if (respuesta == JOptionPane.YES_OPTION) {

                        alimento.setCajas(alimento.getCajas() + cajas);
                        JOptionPane.showMessageDialog(rootPane, "Sus productos llegaran en 3 dias.\n\nTotal a pagar: $" + (cajas * alimento.getPrecio()), "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);

                    }

                    if (alimentoAd != null) {
                        alimentoAd.setCajas(alimentoAd.getCajas() - cajas);
                        tablaAlimentos();
                    }

                }

                limpiarCampos();

            } else if (busqueda.substring(0, 4).equals("B100")) {

                cajas = Integer.parseInt(cambio);

                for (Aseo a : Login.productosAseo) {
                    if (a.getCodigo().equals(busqueda)) {
                        aseoProducto = a;
                    }
                }

                for (Aseo a : Login.aseoAdmin) {
                    if (a.getCodigo().equals(busqueda)) {
                        aseoProductoAd = a;
                    }
                }

                if (cajas > aseoProductoAd.getCajas()) {
                    limpiarCampos();
                    aux = 1;
                    JOptionPane.showMessageDialog(rootPane, "Ha escogido una cantidad de productos mayor a las disponibles\nen el inventario, por favor intente de nuevo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
                }

                if (aseoProducto != null && aux == 0) {

                    int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Desea confirmar el pedido del producto?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
                    if (respuesta == JOptionPane.YES_OPTION) {

                        aseoProducto.setCajas(aseoProducto.getCajas() + cajas);
                        JOptionPane.showMessageDialog(rootPane, "Sus productos llegaran en 3 dias.\n\nTotal a pagar: $" + (cajas * aseoProducto.getPrecio()), "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);

                    }

                    if (aseoProductoAd != null) {
                        aseoProductoAd.setCajas(aseoProductoAd.getCajas() - cajas);
                        tablaAseo();
                    }

                }

                limpiarCampos();

            } else if (busqueda.substring(0, 4).equals("C100")) {

                cajas = Integer.parseInt(cambio);

                for (Licores a : Login.licores) {
                    if (a.getCodigo().equals(busqueda)) {
                        licor = a;
                    }
                }

                for (Licores a : Login.licoresAdmin) {
                    if (a.getCodigo().equals(busqueda)) {
                        licorAd = a;
                    }
                }

                if (cajas > licorAd.getCajas()) {
                    limpiarCampos();
                    aux = 1;
                    JOptionPane.showMessageDialog(rootPane, "Ha escogido una cantidad de productos mayor a las disponibles\nen el inventario, por favor intente de nuevo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
                }

                if (licor != null && aux == 0) {

                    int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Desea confirmar el pedido del producto?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
                    if (respuesta == JOptionPane.YES_OPTION) {

                        licor.setCajas(licor.getCajas() + cajas);
                        JOptionPane.showMessageDialog(rootPane, "Sus productos llegaran en 3 dias.\n\nTotal a pagar: $" + (cajas * licor.getPrecio()), "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);

                    }

                    if (licorAd != null) {
                        licorAd.setCajas(licorAd.getCajas() - cajas);
                        tablaLicores();
                    }

                }

                limpiarCampos();
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnPedirActionPerformed

    private void btnMostrarAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlimentosActionPerformed
        tablaAlimentos();
    }//GEN-LAST:event_btnMostrarAlimentosActionPerformed

    private void btnMostrarLicorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLicorActionPerformed
        tablaLicores();
    }//GEN-LAST:event_btnMostrarLicorActionPerformed

    private void btnMostrarAseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAseoActionPerformed
        tablaAseo();
    }//GEN-LAST:event_btnMostrarAseoActionPerformed

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Licores;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarAlimentos;
    private javax.swing.JButton btnMostrarAseo;
    private javax.swing.JButton btnMostrarLicor;
    private javax.swing.JButton btnPedir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboxCajas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAlimentos;
    private javax.swing.JTable tblAseo;
    private javax.swing.JTable tblLicor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
