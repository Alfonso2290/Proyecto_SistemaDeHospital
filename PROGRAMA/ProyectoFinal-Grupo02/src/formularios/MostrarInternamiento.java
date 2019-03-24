
package formularios;

import conexionmysql.ConexionBD;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MostrarInternamiento extends javax.swing.JFrame 
{
    public static int cont;
    public static int idpaciente;
    ConexionBD conexion;
    
    public MostrarInternamiento(int idpaciente) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Internamiento de Paciente");
        conexion= new ConexionBD();
        cont=1;
        this.idpaciente=idpaciente;
        MuestraRegistro();
    }
    
    public void MuestraRegistro()
    {
        int contador=0,idmed;
        String med="",pac="";
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla2=instruccion.executeQuery("select count(*) from internamientos where refid_paciente=" + idpaciente);
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
      
            ResultSet tabla=instruccion.executeQuery("select * from internamientos where refid_paciente=" + idpaciente);

            if(contador>=cont)
            { 
                cont++;
                for(int i=1;i<cont;i++)
                {
                    tabla.next();
                }
            }
            txtId.setText(tabla.getInt("id_internamiento") + "");
            txtNumhab.setText(tabla.getString("numhabitacion"));
            txtTipohab.setText(tabla.getString("tipohabitacion"));
            txtFeing.setText(tabla.getString("fechaingreso"));
            txtHoraI.setText(tabla.getString("horaingreso"));
            txtFealta.setText(tabla.getString("fechaalta"));
            txtHoraA.setText(tabla.getString("horaalta"));
            txtMotivo.setText(tabla.getString("motivo"));
            txtDiag.setText(tabla.getString("diagnostico"));
            txtImp.setText(tabla.getDouble("importe_internamiento") + "");
            
            idmed=tabla.getInt("refid_medico");
            
            ResultSet tabla1=instruccion.executeQuery("select foto_paciente from pacientes where id_paciente=" + idpaciente);
            if(tabla1.next())
            {
                is=tabla1.getBinaryStream("foto_paciente");
                BufferedImage bi=ImageIO.read(is);
                foto=new ImageIcon(bi);
            
                Image img=foto.getImage();
                Image newimg=img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
            
                ImageIcon newicon=new ImageIcon(newimg);
                lblfoto.setIcon(newicon);
            }
            ResultSet tabla4=instruccion.executeQuery("select nombres_medico,apellpat_medico from medicos where id_medico=" + idmed);
            if(tabla4.next())
                med=tabla4.getString("nombres_medico") + " " + tabla4.getString("apellpat_medico");
            
            ResultSet tabla5=instruccion.executeQuery("select nombres_paciente,apellpat_paciente from pacientes where id_paciente=" + idpaciente);
            if(tabla5.next())
                pac=tabla5.getString("nombres_paciente") + " " + tabla5.getString("apellpat_paciente");
           
            txtMedico.setText(med);
            txtPaciente.setText(pac);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> No hay más Internamientos del paciente por mostrar <==");
        }    
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JLabel();
        txtNumhab = new javax.swing.JLabel();
        txtFeing = new javax.swing.JLabel();
        txtFealta = new javax.swing.JLabel();
        txtDiag = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JLabel();
        txtMedico = new javax.swing.JLabel();
        txtTipohab = new javax.swing.JLabel();
        txtHoraI = new javax.swing.JLabel();
        txtHoraA = new javax.swing.JLabel();
        txtImp = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setOpaque(false);

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/izquierdah.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnAvanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/derechah.png"))); // NOI18N
        btnAvanzar.setBorderPainted(false);
        btnAvanzar.setContentAreaFilled(false);
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

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

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel100.setText("Internamiento de Paciente");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel101.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel101.setText("ID:");

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel102.setText("Motivo:");

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel103.setText("Nº Habitación:");

        jLabel104.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel104.setText("Fecha de Ingreso:");

        jLabel105.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel105.setText("Fecha de Alta:");

        jLabel108.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel108.setText("Diagnóstico:");

        jLabel112.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel112.setText("Importe a pagar:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel113.setText("Paciente:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel114.setText("Médico:");

        jLabel115.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel115.setText("Tipo-Habitación:");

        jLabel116.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel116.setText("Hora de Ingreso:");

        jLabel117.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel117.setText("Hora de Alta:");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel106.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 0, 0));
        jLabel106.setText("Editar");

        txtId.setText("       --Ingrese Dato--");
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMotivo.setText("       --Ingrese Dato--");
        txtMotivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumhab.setText("       --Ingrese Dato--");
        txtNumhab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFeing.setText("       --Ingrese Dato--");
        txtFeing.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFealta.setText("       --Ingrese Dato--");
        txtFealta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDiag.setText("       --Ingrese Dato--");
        txtDiag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPaciente.setText("       --Ingrese Dato--");
        txtPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMedico.setText("       --Ingrese Dato--");
        txtMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipohab.setText("       --Ingrese Dato--");
        txtTipohab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtHoraI.setText("       --Ingrese Dato--");
        txtHoraI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtHoraA.setText("       --Ingrese Dato--");
        txtHoraA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtImp.setText("       --Ingrese Dato--");
        txtImp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel106)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel102))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumhab, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFeing, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFealta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel103))
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel115)
                    .addComponent(jLabel114)
                    .addComponent(jLabel113)
                    .addComponent(jLabel117)
                    .addComponent(jLabel112))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTipohab, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraA, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(78, 78, 78)))
                .addGap(29, 29, 29))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel100)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel113)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel114)
                                    .addComponent(txtMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel115)
                                    .addComponent(txtNumhab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTipohab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel116)
                                    .addComponent(txtFeing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHoraI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel117)
                                    .addComponent(txtFealta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHoraA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel108)
                                    .addComponent(jLabel112)
                                    .addComponent(txtDiag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtImp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)))
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        cont-=2;
        if(cont==0)
        {
            Paciente Objeto=new Paciente();
            Objeto.setVisible(true);
            this.dispose();
        }
        else
        {
            MuestraRegistro();
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
       MuestraRegistro();
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int idinternamiento=Integer.parseInt(txtId.getText());
        EditarInternamiento Objeto=new EditarInternamiento(idpaciente,idinternamiento);
        Objeto.setVisible(true);
        this.dispose();
        
        Objeto.txtDiag.setText(txtDiag.getText());
        Objeto.txtMoti.setText(txtMotivo.getText());
        Objeto.txtNumhab.setText(txtNumhab.getText());
        Objeto.txtImp.setText(txtImp.getText());

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
            java.util.logging.Logger.getLogger(MostrarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarInternamiento(idpaciente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel txtDiag;
    private javax.swing.JLabel txtFealta;
    private javax.swing.JLabel txtFeing;
    private javax.swing.JLabel txtHoraA;
    private javax.swing.JLabel txtHoraI;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtImp;
    private javax.swing.JLabel txtMedico;
    private javax.swing.JLabel txtMotivo;
    private javax.swing.JLabel txtNumhab;
    private javax.swing.JLabel txtPaciente;
    private javax.swing.JLabel txtTipohab;
    // End of variables declaration//GEN-END:variables
}
