
package formularios;

import JTableColor.Render;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class MostrarHorarios extends javax.swing.JFrame 
{

    public static int idmedico;
    public static DefaultTableModel M;
    public static String HoraIng[],HoraSal[];
    ConexionBD conexion;
    Render r= new Render(); // instanciamos la clase Render
    public MostrarHorarios(int idmedico) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Horarios del Médico");
        conexion= new ConexionBD();
        this.idmedico=idmedico;
        this.getContentPane().setBackground(Color.lightGray);
        tblHorario.setDefaultRenderer(Object.class,r);
        M=new DefaultTableModel();
        MuestraRegistro();
    }
    
    public void MuestraRegistro()
    {
        int cont=0,i=1;
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select refid_medico,tiempoatencion from horario_medico where refid_medico=" + idmedico);
            tabla.next();
            txtIdmedico.setText(tabla.getInt("refid_medico") + "");
            txtTiemate.setText(tabla.getDouble("tiempoatencion") + "");
            
            ResultSet tabla3=instruccion.executeQuery("select count(*) from horario_medico where refid_medico=" + idmedico);
            if(tabla3.next())
                cont=tabla3.getInt("count(*)");
            HoraIng=new String[cont+1];
            HoraSal=new String[cont+1];
            
            HoraIng[0]="Ingreso";
            HoraSal[0]="Salida";
            M.addColumn("Registro/Dia");
            ResultSet tabla2=instruccion.executeQuery("select distinct dia_laboral,horaingreso,horasalida from horario_medico where refid_medico=" + idmedico + " order by field (dia_laboral ,'lunes','martes','miercoles','jueves','viernes','sabado')");
            while(tabla2.next())
            {
                   M.addColumn(tabla2.getString("dia_laboral"));
                   HoraIng[i]=tabla2.getString("horaingreso");
                   HoraSal[i]=tabla2.getString("horasalida");
                   i++;
            }
            this.tblHorario.setModel(M);

            M.addRow(HoraIng);    
            M.addRow(HoraSal); 
            
            ResultSet tabla1=instruccion.executeQuery("select foto_medico from medicos where id_medico=" + idmedico);
            if(tabla1.next())
            {
                is=tabla1.getBinaryStream("foto_medico");
                BufferedImage bi=ImageIO.read(is);
                foto=new ImageIcon(bi);
            
                Image img=foto.getImage();
                Image newimg=img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
            
                ImageIcon newicon=new ImageIcon(newimg);
                lblfoto.setIcon(newicon);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton44 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorario = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        txtIdmedico = new javax.swing.JLabel();
        txtTiemate = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton44.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton44.setForeground(new java.awt.Color(0, 0, 153));
        jButton44.setText("Editar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setOpaque(false);

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/atras.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel100.setText("Horarios del Médico");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel101.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel101.setText("ID-Médico:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel113.setText("Tiempo de atención:");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblHorario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tblHorario.setForeground(new java.awt.Color(0, 0, 153));
        tblHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblHorario.setMaximumSize(new java.awt.Dimension(2147483647, 320));
        jScrollPane1.setViewportView(tblHorario);

        btnEditar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 153));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/editar.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(204, 0, 0));
        jLabel115.setText("Editar");

        txtIdmedico.setText("       --Ingrese Dato--");
        txtIdmedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTiemate.setText("       --Ingrese Dato--");
        txtTiemate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("FOTO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19)
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addGap(41, 41, 41)
                        .addComponent(txtIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTiemate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(78, 78, 78)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(360, 360, 360))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel115)))
                .addGap(423, 423, 423))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel113)
                                    .addComponent(txtIdmedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTiemate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(81, 81, 81)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)))
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel115))
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        Médico Objeto=new Médico();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int idmedico=Integer.parseInt(txtIdmedico.getText());
        
        EditarHorarios Objeto=new EditarHorarios(idmedico);
        Objeto.setVisible(true);
        this.dispose();
        Objeto.txtTiemate.setText(txtTiemate.getText());
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarHorarios(idmedico).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton jButton44;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTable tblHorario;
    private javax.swing.JLabel txtIdmedico;
    private javax.swing.JLabel txtTiemate;
    // End of variables declaration//GEN-END:variables
}
