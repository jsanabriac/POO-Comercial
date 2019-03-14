package GUI;

import datos.Alimentos;
import datos.Aseo;
import datos.Licores;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proveedores extends javax.swing.JFrame {

    private String codigo;
    private String busqueda;

    private DefaultTableModel tablaLicores;
    private DefaultTableModel tablaAlimentos;
    private DefaultTableModel tablaAseo;

    public Proveedores() {

        initComponents();
        this.setTitle("POO Comercial - Administrador");
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

        String[] titulos = {"CÓDIGO", "Nombre", "Unidades por Caja", "Precio ($)"};
        Object[] registro = new Object[4];

        tablaAlimentos = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (Administrador.alimentosProveedor.size() > 0) {
                int i = 1;
                for (Alimentos alimento : Administrador.alimentosProveedor) {
                    registro[0] = "A100" + i++;
                    registro[1] = alimento.getNombre();
                    registro[2] = alimento.getUnidadesCaja();
                    registro[3] = alimento.getPrecio();

                    String codigo = (String) registro[0];
                    alimento.setCodigo(codigo);

                    tablaAlimentos.addRow(registro);
                }
                tblAlimentosProv.setModel(tablaAlimentos);
            }
        } catch (Exception e) {
        }
    }

    private void tablaAseo() {

        String[] titulos = {"CÓDIGO", "Nombre", "Unidades por Caja", "Precio ($)"};
        Object[] registro = new Object[4];

        tablaAseo = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (Administrador.aseoProveedor.size() > 0) {
                int i = 1;
                for (Aseo aseo : Administrador.aseoProveedor) {
                    registro[0] = "B100" + i++;
                    registro[1] = aseo.getNombre();
                    registro[2] = aseo.getUnidadesCaja();
                    registro[3] = aseo.getPrecio();

                    String codigo = (String) registro[0];
                    aseo.setCodigo(codigo);

                    tablaAseo.addRow(registro);
                }
                tblAseoProv.setModel(tablaAseo);
            }
        } catch (Exception e) {
        }
    }

    private void tablaLicores() {

        String[] titulos = {"CÓDIGO", "Nombre", "Unidades por Caja", "Precio ($)"};
        Object[] registro = new Object[4];

        tablaLicores = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            if (Administrador.licorProveedor.size() > 0) {
                int i = 1;
                for (Licores licor : Administrador.licorProveedor) {
                    registro[0] = "C100" + i++;
                    registro[1] = licor.getNombre();
                    registro[2] = licor.getUnidadesCaja();
                    registro[3] = licor.getPrecio();

                    String codigo = (String) registro[0];
                    licor.setCodigo(codigo);

                    tablaLicores.addRow(registro);
                }
                tblLicorProv.setModel(tablaLicores);
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
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cboxCajas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnPedir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlimentosProv = new javax.swing.JTable();
        btnAlimentosProveedor = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAseoProv = new javax.swing.JTable();
        btnAseoProveedor = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLicorProv = new javax.swing.JTable();
        btnLicorProveedor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empresa/Empresa 2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuAdministrador/almacenIcono.png"))); // NOI18N
        jLabel2.setText("     Pedido a Proveedores");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSalir))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Código:");

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PEDIDO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setText("En las pestañas alternas, podra encontrar el codigo de cada producto, ingreselo a ");

        jLabel6.setText("continuación  y escoja el numero  de cajas  que piensa ordenar. Para finalizar solo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre: ");

        btnBuscar.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Precio ($): ");

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setBorder(null);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrecio.setBorder(null);

        cboxCajas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboxCajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "12", "24", "36", "50", "100" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cant. Cajas");

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

        jLabel10.setText(" presione el botón pedir.");

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decisiones/20X20-CANCEL.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboxCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(31, 90, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cboxCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hacer Pedido", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tblAlimentosProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Unidades por Caja", "Precio ($)"
            }
        ));
        jScrollPane1.setViewportView(tblAlimentosProv);

        btnAlimentosProveedor.setBackground(new java.awt.Color(255, 153, 0));
        btnAlimentosProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlimentosProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnAlimentosProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuAdministrador/despensaIcono.png"))); // NOI18N
        btnAlimentosProveedor.setText("Mostrar Productos");
        btnAlimentosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentosProveedorActionPerformed(evt);
            }
        });

        jLabel11.setText("Recuerde ingresar el código del producto que desea pedir en la barra de busqueda ");

        jLabel12.setText("de la pestaña *Hacer Pedido*.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlimentosProveedor)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlimentosProveedor)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alimentos", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tblAseoProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Unidades por Caja", "Precio ($)"
            }
        ));
        jScrollPane2.setViewportView(tblAseoProv);

        btnAseoProveedor.setBackground(new java.awt.Color(255, 153, 0));
        btnAseoProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAseoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnAseoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuAdministrador/aseoIcono.png"))); // NOI18N
        btnAseoProveedor.setText("Mostrar Productos");
        btnAseoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAseoProveedorActionPerformed(evt);
            }
        });

        jLabel15.setText("de la pestaña *Hacer Pedido*.");

        jLabel16.setText("Recuerde ingresar el código del producto que desea pedir en la barra de busqueda ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAseoProveedor)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAseoProveedor)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos de Aseo", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tblLicorProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "Nombre", "Unidades por Caja", "Precio ($)"
            }
        ));
        jScrollPane3.setViewportView(tblLicorProv);

        btnLicorProveedor.setBackground(new java.awt.Color(255, 153, 0));
        btnLicorProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLicorProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnLicorProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuAdministrador/licoresIcono.png"))); // NOI18N
        btnLicorProveedor.setText("Mostrar Productos");
        btnLicorProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicorProveedorActionPerformed(evt);
            }
        });

        jLabel13.setText("de la pestaña *Hacer Pedido*.");

        jLabel14.setText("Recuerde ingresar el código del producto que desea pedir en la barra de busqueda ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLicorProveedor)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLicorProveedor)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Licores", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Administrador administrador = new Administrador();
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea retornar al menu principal?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            administrador.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLicorProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicorProveedorActionPerformed
        tablaLicores();
    }//GEN-LAST:event_btnLicorProveedorActionPerformed

    private void btnAseoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAseoProveedorActionPerformed
        tablaAseo();
    }//GEN-LAST:event_btnAseoProveedorActionPerformed

    private void btnAlimentosProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentosProveedorActionPerformed
        tablaAlimentos();
    }//GEN-LAST:event_btnAlimentosProveedorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        int prueba = 0;

        try {
            busqueda = txtCodigo.getText().toUpperCase();

            if (busqueda.substring(0, 4).equals("A100")) {

                for (Alimentos a : Administrador.alimentosProveedor) {

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

                for (Aseo a : Administrador.aseoProveedor) {

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
                for (Licores a : Administrador.licorProveedor) {

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirActionPerformed

        Alimentos alimento = null;
        Aseo aseoProducto = null;
        Licores licor = null;
        int cajas = 0;

        String cambio = cboxCajas.getSelectedItem().toString();

        if (busqueda.substring(0, 4).equals("A100")) {

            cajas = Integer.parseInt(cambio);
            System.out.println(cajas);

            for (Alimentos a : Login.alimentos) {

                if (a.getCodigo().equals(busqueda)) {
                    alimento = a;
                }
            }

            if (alimento != null) {

                int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Desea confirmar el pedido del producto?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {

                    alimento.setCajas(alimento.getCajas() + cajas);
                    JOptionPane.showMessageDialog(rootPane, "Sus productos llegaran en 3 dias.\n\nTotal a pagar: $" + (cajas * alimento.getPrecio()), "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            limpiarCampos();

        } else if (busqueda.substring(0, 4).equals("B100")) {

            cajas = Integer.parseInt(cambio);
            System.out.println(cajas);

            for (Aseo a : Login.productosAseo) {

                if (a.getCodigo().equals(busqueda)) {
                    aseoProducto = a;
                }
            }

            if (aseoProducto != null) {

                int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Desea confirmar el pedido del producto?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {

                    aseoProducto.setCajas(aseoProducto.getCajas() + cajas);
                    JOptionPane.showMessageDialog(rootPane, "Sus productos llegaran en 3 dias.\n\nTotal a pagar: $" + (cajas * aseoProducto.getPrecio()), "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);

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

            if (licor != null) {

                int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Desea confirmar el pedido del producto?", "¡Atención!", JOptionPane.ERROR_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {

                    licor.setCajas(licor.getCajas() + cajas);
                    JOptionPane.showMessageDialog(rootPane, "Sus productos llegaran en 3 dias.\n\nTotal a pagar: $" + (cajas * licor.getPrecio()), "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);

                }
            }

            limpiarCampos();
        }

    }//GEN-LAST:event_btnPedirActionPerformed

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlimentosProveedor;
    private javax.swing.JButton btnAseoProveedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLicorProveedor;
    private javax.swing.JButton btnLimpiar;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAlimentosProv;
    private javax.swing.JTable tblAseoProv;
    private javax.swing.JTable tblLicorProv;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
