package formularios;

import conexionmysql.ConexionBD;
import javax.swing.JOptionPane;
import java.sql.*;

public class RegistroEntrada extends javax.swing.JFrame 
{
    public static int cont,c;
    ConexionBD conexion;
    
    public RegistroEntrada() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro");
        cont=0;
        c=0;
        conexion= new ConexionBD();
        JOptionPane.showMessageDialog(null,"==> Usted tiene 3 intentos para acceder al Sistema <==");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCont = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("USUARIO:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA:");

        btnContinuar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 0, 153));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/atras.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/candado1.png"))); // NOI18N

        btnRegistrarse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 153));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/registrarse usuario.png"))); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setDefaultCapable(false);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCont, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(txtUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(0, 103, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarse))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnContinuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnContinuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnRegistrarse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRetroceder))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 210));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        IngresoCuenta();
    }//GEN-LAST:event_btnContinuarActionPerformed

    public void IngresoCuenta()
    {
        String pas,usu;
        usu=txtUsuario.getText();
        pas=txtCont.getText(); 
        cont++;
        try
        {
            Statement instruccion=conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*),nombre_usuario,clave_usuario from usuario"
                    + " where nombre_usuario='" + usu +"' AND clave_usuario='" + pas + "'");
            if(tabla.next())
            {
                c=tabla.getInt("count(*)");
            }
            if(c>0)
            {
                JOptionPane.showMessageDialog(null,"==> Usted ha ingresado correctamente al Sistema <==");
                CargaSistema Objeto=new CargaSistema();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
                if(cont==1)
                {
                    JOptionPane.showMessageDialog(null,"==> El Nombre de Usuario y/o Contraseña es Incorrecto <==\n"
                                                    + "                            ==> Primer Intento Fallido <==");
                    Limpiar();
                }
                else
                    if(cont==2)
                    {
                        JOptionPane.showMessageDialog(null,"==> El Nombre de Usuario y/o Contraseña es Incorrecto <==\n"
                                                    + "                            ==> Segundo Intento Fallido <==");                    
                        Limpiar();
                    }
                    else
                        if(cont==3)
                        {
                            JOptionPane.showMessageDialog(null,"==> Ha Superado el Limite de Accesos <==\n"
                                                + "             ==> Programa Finalizado <==");
                            System.exit(0);
                        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        NuevoRegistro Objeto=new NuevoRegistro();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    public void Limpiar()
    {
        txtCont.setText("");
        txtUsuario.setText("");
        txtUsuario.requestFocus();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txtCont;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
