
package formularios;

import com.toedter.calendar.JDateChooser;
import conexionmysql.ConexionBD;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class EditarRegistroMaster extends javax.swing.JFrame 
{
    public static int idusuario;
    ConexionBD conexion;
    
    public EditarRegistroMaster(int idusuario) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Edición de información del Usuario");
        conexion= new ConexionBD();
        this.idusuario=idusuario;
        Conexion();
        cbEmpleado.requestFocus();
    }
    
    public void Conexion()
    {
        cbEmpleado.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select distinct nombres_empleado from empleados");
            while(tabla.next())
            {
                cbEmpleado.addItem(tabla.getString("nombres_empleado"));
            }
            cbTipo.addItem("--Seleccionar--");
            cbTipo.addItem("master");
            cbTipo.addItem("comun");

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        jButton39 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtCont = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        calFeing = new com.toedter.calendar.JDateChooser();
        calFemod = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        cbIdempleado = new javax.swing.JComboBox<>();
        jLabel103 = new javax.swing.JLabel();
        cbEmpleado = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel104.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 153));
        jLabel104.setText("Guardar");

        jLabel105.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 153));
        jLabel105.setText("Cancelar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setOpaque(false);

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 153));
        jLabel100.setText("Edición de información del Usuario");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 153));
        jLabel102.setText("ID-Empleado:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 153));
        jLabel113.setText("Nombre:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 153));
        jLabel114.setText("Contraseña: ");

        jButton4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("Guardar");

        jButton5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("Cancelar");

        btnCancelar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/cancelar.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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

        btnGuardar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 153));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/guardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 153));
        jLabel115.setText("Fecha de Modificación:");

        jLabel116.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 153));
        jLabel116.setText("Fecha de Ingreso:");

        jLabel117.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 153));
        jLabel117.setText("Tipo:");

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 153));
        jLabel103.setText("Empleado:");

        cbEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpleadoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator20)
            .addComponent(jSeparator19)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel115)
                    .addComponent(jLabel116)
                    .addComponent(jLabel117)
                    .addComponent(jLabel114)
                    .addComponent(jLabel113)
                    .addComponent(jLabel103)
                    .addComponent(jLabel102))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(cbIdempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calFemod, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calFeing, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCont, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100)
                .addGap(33, 33, 33))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(82, 82, 82)
                .addComponent(btnCancelar)
                .addGap(93, 93, 93))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel100)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIdempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102))
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calFeing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calFemod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(51, 51, 51)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(329, 329, 329))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(328, 328, 328)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpleadoActionPerformed
        String emp=cbEmpleado.getSelectedItem().toString();

        cbIdempleado.addItem("Apuntador");
        cbIdempleado.setSelectedIndex(0);
        EliminarComboBox();
        cbIdempleado.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();

            ResultSet tabla5=instruccion.executeQuery("select id_empleado from empleados where nombres_empleado= '" + emp + "'");

            while(tabla5.next())
            {
                cbIdempleado.addItem(tabla5.getString("id_empleado"));
            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_cbEmpleadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nom,cont,tipo,feing,femod;
        String idempleado;
        nom=txtNom.getText();
        cont=txtCont.getText();
        tipo=cbTipo.getSelectedItem().toString();
        idempleado=cbIdempleado.getSelectedItem().toString();
        feing=Date(calFeing);
        femod=Date(calFemod);

        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            instruccion.executeUpdate("update usuario set refid_empleado='" + idempleado + "' where id_usuario=" + idusuario );
            instruccion.executeUpdate("update usuario set nombre_usuario='" + nom + "' where id_usuario=" + idusuario );
            instruccion.executeUpdate("update usuario set clave_usuario='" + cont + "' where id_usuario=" + idusuario );
            instruccion.executeUpdate("update usuario set fechaingreso_usuario='" + feing + "' where id_usuario=" + idusuario );
            instruccion.executeUpdate("update usuario set fechamodificacion_usuario='" + femod + "' where id_usuario=" + idusuario );
            instruccion.executeUpdate("update usuario set tipo_usuario='" + tipo + "' where id_usuario=" + idusuario);

            JOptionPane.showMessageDialog(null,"==> Se ha actualizado los datos del usuario correctamente <==");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos del usuario han sido mal ingresados <==\n"
                + "    ==> Es necesario llenar todos los campos <== ");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        UsuarioMaster Objeto=new UsuarioMaster();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNom.setText("");
        txtCont.setText("");
        cbEmpleado.setSelectedIndex(0);
        cbIdempleado.setSelectedIndex(0);
        cbTipo.setSelectedIndex(0);
        cbEmpleado.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public String Date(JDateChooser calendario)
    {
        int dia,mes,año;
        String fecha;
        
        dia=calendario.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes=calendario.getCalendar().get(Calendar.MONTH) + 1;
        año=calendario.getCalendar().get(Calendar.YEAR);
        
        fecha=año+"-"+mes+"-"+dia;
        
        return fecha;
    }
        
    public void EliminarComboBox()
    {
        for(int i=0;i<cbIdempleado.getItemCount();i++)
        {
            cbIdempleado.removeItemAt(i);
            i--;
        }
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
            java.util.logging.Logger.getLogger(EditarRegistroMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarRegistroMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarRegistroMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarRegistroMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarRegistroMaster(idusuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public com.toedter.calendar.JDateChooser calFeing;
    public com.toedter.calendar.JDateChooser calFemod;
    public javax.swing.JComboBox<String> cbEmpleado;
    public javax.swing.JComboBox<String> cbIdempleado;
    public javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    public javax.swing.JTextField txtCont;
    public javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
