/*
    Este registro es cuando se acceda a "Usuario"
    Master-Comun
 */
package formularios;

import conexionmysql.ConexionBD;
import javax.swing.JOptionPane;
import java.sql.*;

public class RegistroEntradaUsuario extends javax.swing.JFrame 
{
    public static int cont,c;
    ConexionBD conexion;
    
    public RegistroEntradaUsuario() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro");
        conexion= new ConexionBD();
        cont=0;
        c=0;
        
        JOptionPane.showMessageDialog(null,"==> Usted tiene 3 intentos para acceder a los Registro de Usuarios <==");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCont = new javax.swing.JPasswordField();
        btnContinuar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("REGISTRO");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("USUARIO:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("CONTRASEÑA:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCont, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txtUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContinuar)
                    .addComponent(btnRetroceder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        
        IngresoCuenta();
        
    }//GEN-LAST:event_btnContinuarActionPerformed
    
    public void IngresoCuenta()
    {
        String pas,usu,tipo="";
        int idusuario=0;
        usu=txtUsuario.getText();
        pas=txtCont.getText(); 
        cont++;
        try
        {
            Statement instruccion=conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*),nombre_usuario,clave_usuario,id_usuario,tipo_usuario from usuario"
                    + " where nombre_usuario='" + usu +"' AND clave_usuario='" + pas + "'");
            if(tabla.next())
            {
                c=tabla.getInt("count(*)");
                idusuario=tabla.getInt("id_usuario");
                tipo=tabla.getString("tipo_usuario");
            }
            if(c>0)
            {
                if(tipo.compareTo("master")==0)
                {
                    JOptionPane.showMessageDialog(null,"==> Usted ha ingresado correctamente al registro de Usuarios-Master <==");
                    UsuarioMaster Objeto=new UsuarioMaster();
                    Objeto.setVisible(true);
                    this.dispose();
                }
                else
                    if(tipo.compareTo("comun")==0)
                    {
                        JOptionPane.showMessageDialog(null,"==> Usted ha ingresado correctamente al registro de Usuarios-Comun <==");
                        Usuario Objeto2=new Usuario(idusuario);   
                        Objeto2.setVisible(true);
                        this.dispose();
                    }
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
    
    public void Limpiar()
    {
        txtCont.setText("");
        txtUsuario.setText("");
        txtUsuario.requestFocus();
    }
    
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        Tablas Objeto=new Tablas();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegistroEntradaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEntradaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEntradaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEntradaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEntradaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPasswordField txtCont;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
