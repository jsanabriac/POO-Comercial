package GUI;

import datos.Alimentos;
import datos.Aseo;
import datos.Licores;
import datos.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static int entrar = 0;

    public Login() {
        initComponents();
        this.setTitle("Ingreso al Sistema");
        setLocationRelativeTo(null);
        Image logo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("empresa/logo.png"));
        this.setIconImage(logo);

    }

    Usuario administrador = new Usuario("Empresa", "POO Comercial", "administrador", "A10090", "poocomercial", "Administrador");
    Usuario vendedor = new Usuario("Carlos", "Perez", "carlos9011", "1007674374", "zxc123", "Vendedor");

    //Listas de los productos de el administrador
    public static ArrayList<Usuario> vendedores = new ArrayList<>();
    public static ArrayList<Licores> licoresAdmin = new ArrayList<>();
    public static ArrayList<Alimentos> alimentosAdmin = new ArrayList<>();
    public static ArrayList<Aseo> aseoAdmin = new ArrayList<>();

    Licores cerveza = new Licores("Cerveza", "Poker", 50000, 30, 150, "Bavaria", "C1001");
    Licores ron = new Licores("Ron", "Ron Boyaca", 190000, 20, 80, "Licores de Boyaca", "C1002");
    Licores aguardiente = new Licores("Aguardiente", "Lider", 180000, 20, 70, "Licores de Boyaca", "C1003");
    Licores vino = new Licores("Vino", "GatoNegro", 150000, 6, 100, "Viñedo San Pedro", "C1004");

    Alimentos arroz = new Alimentos("Comestibles", "Arroz Diana", 120000, 50, 500, "Diana Corporacion", "A1001");
    Alimentos atun = new Alimentos("Comestibles", "Van Camp´s", 150000, 24, 200, "Van Camp´s", "A1002");
    Alimentos cocaCola = new Alimentos("Bebidas", "Coca Cola", 30000, 6, 450, "Coca Cola Company", "A1003");
    Alimentos oreo = new Alimentos("Comestibles", "Galletas Oreo", 60000, 96, 280, "Nabisco", "A1004");

    Aseo jabon = new Aseo("Aseo Personal", "Jabon Dorado", 45000, 24, 180, "Dersa", "B1001");
    Aseo cremaDental = new Aseo("Aseo Personal", "Colgate", 85000, 50, 230, "Palmolive", "B1002");
    Aseo detergente = new Aseo("Aseo del Hogar", "Detergente", 20000, 10, 80, "Dersa", "B1003");
    Aseo clorox = new Aseo("Aseo del Hogar", "Clorox", 54000, 6, 135, "Clorox Colombia", "B1004");

    //Atributos del Usuario
    public static String nombre = "";
    public static String apellido = "";
    public static String nombreUsuario = "";
    public static String id = "";
    public static String contraseña = "";
    public static String rol = "";
    public static ArrayList<Alimentos> alimentos = new ArrayList<>();
    public static ArrayList<Licores> licores = new ArrayList<>();
    public static ArrayList<Aseo> productosAseo = new ArrayList<>();

    Licores cervezaV = new Licores("Cerveza", "Poker", 50000, 30, 0, "Bavaria", "C1001");
    Licores ronV = new Licores("Ron", "Ron Boyaca", 190000, 20, 0, "Licores de Boyaca", "C1002");
    Licores aguardienteV = new Licores("Aguardiente", "Lider", 180000, 20, 0, "Licores de Boyaca", "C1003");
    Licores vinoV = new Licores("Vino", "GatoNegro", 150000, 6, 0, "Viñedo San Pedro", "C1004");

    Alimentos arrozV = new Alimentos("Comestibles", "Arroz Diana", 120000, 50, 0, "Diana Corporacion", "A1001");
    Alimentos atunV = new Alimentos("Comestibles", "Van Camp´s", 150000, 24, 0, "Van Camp´s", "A1002");
    Alimentos cocaColaV = new Alimentos("Bebidas", "Coca Cola", 30000, 6, 0, "Coca Cola Company", "A1003");
    Alimentos oreoV = new Alimentos("Comestibles", "Galletas Oreo", 60000, 96, 0, "Nabisco", "A1004");

    Aseo jabonV = new Aseo("Aseo Personal", "Jabon Dorado", 45000, 24, 0, "Dersa", "B1001");
    Aseo cremaDentalV = new Aseo("Aseo Personal", "Colgate", 85000, 50, 0, "Palmolive", "B1002");
    Aseo detergenteV = new Aseo("Aseo del Hogar", "Detergente", 20000, 10, 0, "Dersa", "B1003");
    Aseo cloroxV = new Aseo("Aseo del Hogar", "Clorox", 54000, 6, 0, "Clorox Colombia", "B1004");

    private void reiniciar() {
        this.txtUsuario.setText("");
        this.txtContraseña.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        listaRol = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Ingresar al Sistema"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empresa/empresalogin.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/login1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Seleccione su rol");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Usuario");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        listaRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor" }));
        listaRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaRolActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INGRESAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAcceder.setBackground(new java.awt.Color(255, 153, 0));
        btnAcceder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("Acceder");
        btnAcceder.setBorder(null);
        btnAcceder.setBorderPainted(false);
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña)
                            .addComponent(txtUsuario))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(listaRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(134, 134, 134))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(txtUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(btnAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        nombreUsuario = txtUsuario.getText();
        contraseña = txtContraseña.getText();
        rol = listaRol.getSelectedItem().toString();
        vendedores.add(vendedor);

        licoresAdmin.add(cerveza);
        licoresAdmin.add(vino);
        licoresAdmin.add(aguardiente);
        licoresAdmin.add(ron);
        alimentosAdmin.add(arroz);
        alimentosAdmin.add(oreo);
        alimentosAdmin.add(atun);
        alimentosAdmin.add(cocaCola);
        aseoAdmin.add(jabon);
        aseoAdmin.add(detergente);
        aseoAdmin.add(cremaDental);
        aseoAdmin.add(clorox);
        administrador.setAlimentos(alimentosAdmin);
        administrador.setLicores(licoresAdmin);
        administrador.setProductosAseo(aseoAdmin);

        boolean selec = false;

        if (nombreUsuario.equals(administrador.getNombreUsuario()) && contraseña.equals(administrador.getContraseña()) && rol.equals(administrador.getRol())) {
            selec = true;

            nombre = administrador.getNombre();
            apellido = administrador.getApellido();
            nombreUsuario = administrador.getNombreUsuario();
            id = administrador.getId();
            contraseña = administrador.getContraseña();
            rol = administrador.getRol();
            alimentos = administrador.getAlimentos();
            productosAseo = administrador.getProductosAseo();
            licores = administrador.getLicores();

            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            this.setVisible(false);
        }

        for (Usuario a : vendedores) {
            if (nombreUsuario.equals(a.getNombreUsuario()) && contraseña.equals(a.getContraseña()) && rol.equals(a.getRol())) {
                selec = true;

                nombre = a.getNombre();
                apellido = a.getApellido();
                nombreUsuario = a.getNombreUsuario();
                id = a.getId();
                contraseña = a.getContraseña();
                rol = a.getRol();

                licores.add(cervezaV);
                licores.add(vinoV);
                licores.add(aguardienteV);
                licores.add(ronV);
                alimentos.add(arrozV);
                alimentos.add(oreoV);
                alimentos.add(atunV);
                alimentos.add(cocaColaV);
                productosAseo.add(jabonV);
                productosAseo.add(detergenteV);
                productosAseo.add(cremaDentalV);
                productosAseo.add(cloroxV);
                a.setLicores(licores);
                a.setAlimentos(alimentos);
                a.setProductosAseo(productosAseo);

                Vendedor vendedor = new Vendedor();
                vendedor.setVisible(true);
                this.setVisible(false);
            }
        }

        if (selec == false) {
            JOptionPane.showMessageDialog(rootPane, "El usuario ingresado, no se encuentra registrado en el sistema.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAccederActionPerformed


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void listaRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaRolActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> listaRol;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
