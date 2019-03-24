
package formularios;

import JTableColor.Render;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReporteHistorialesPorPaciente extends javax.swing.JFrame 
{
    ConexionBD conexion;
    DefaultTableModel M;
    Render r= new Render();
    
    public ReporteHistorialesPorPaciente() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Historiales por paciente");
        conexion= new ConexionBD();
        tblReporte.setDefaultRenderer(Object.class,r);
        
        this.getContentPane().setBackground(Color.lightGray);
        MuestraComboBox();
    }
    
    public void MuestraComboBox()
    {
        int idpac;
        cbPaciente.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select distinct refid_paciente from historial_clinico");
            while(tabla.next())
            {
                idpac=tabla.getInt(1);
                cbPaciente.addItem(PacienteComboBox(idpac));
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> No hay fechas por mostrar <==");
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox<>();
        jLabel119 = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        cbIdPaciente = new javax.swing.JComboBox<>();
        btnImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setOpaque(false);

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/izquierdah.png"))); // NOI18N
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel100.setText("Historiales por Paciente");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        tblReporte.setOpaque(false);
        jScrollPane1.setViewportView(tblReporte);

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 153));
        jLabel23.setText("Búsqueda-Paciente:");

        cbPaciente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbPaciente.setForeground(new java.awt.Color(0, 0, 153));
        cbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPacienteActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 153));
        jLabel119.setText("ID-Paciente:");

        btnBusqueda.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnBusqueda.setForeground(new java.awt.Color(0, 0, 153));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/buscador.png"))); // NOI18N
        btnBusqueda.setBorderPainted(false);
        btnBusqueda.setContentAreaFilled(false);
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 0, 153));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Imprimir.png"))); // NOI18N
        btnImprimir.setBorderPainted(false);
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 363, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addGap(18, 18, 18)
                        .addComponent(cbIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390)
                .addComponent(btnImprimir)
                .addContainerGap(543, Short.MAX_VALUE))
            .addComponent(jSeparator20)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel100))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel119)
                            .addComponent(cbIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnRetroceder)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnImprimir)
                        .addGap(40, 40, 40))))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 540));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        Reportes Objeto=new Reportes();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed
    
    public void InstanciaTabla()
    {
        M=new DefaultTableModel(); //falta
        M.addColumn("Nº Historial");
        M.addColumn("Paciente");
        M.addColumn("Medico");
        M.addColumn("Nº SS");
        M.addColumn("Fecha Creación");
        M.addColumn("Fe.Actualización");
        M.addColumn("Tipo Sangre");
        M.addColumn("Vacunas");
        M.addColumn("Ult.Diagnóstico");
        this.tblReporte.setModel(M);
    }
    
          
    public void EliminarComboBox(JComboBox combo)
    {
        for(int i=0;i<combo.getItemCount();i++)
        {
            combo.removeItemAt(i);
            i--;
        }
    }
    
    private void cbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPacienteActionPerformed
        String pac=cbPaciente.getSelectedItem().toString();

        cbIdPaciente.addItem("Apuntador");
        cbIdPaciente.setSelectedIndex(0);
        EliminarComboBox(cbIdPaciente);
        cbIdPaciente.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();

            ResultSet tabla5=instruccion.executeQuery("select id_paciente from pacientes where nombres_paciente= '" + pac + "'");

            while(tabla5.next())
            {
                cbIdPaciente.addItem(tabla5.getString("id_paciente"));
            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
    }//GEN-LAST:event_cbPacienteActionPerformed
    
    public String PacienteComboBox(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select nombres_paciente from pacientes where id_paciente=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("nombres_paciente");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    public String Paciente(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select nombres_paciente,apellpat_paciente from pacientes where id_paciente=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("nombres_paciente") + tabla.getString("apellpat_paciente");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    public String Médico(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select nombres_medico,apellpat_medico from medicos where id_medico=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("nombres_medico") + tabla.getString("apellpat_medico");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    
    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        
        String pac,med,tipsan,fecrea,feact,ultdia,vac;
        int numss,numhist,idpac,idmed;
        idpac=Integer.parseInt(cbIdPaciente.getSelectedItem().toString());
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
            
            ResultSet tabla=instruccion.executeQuery("select * from historial_clinico where refid_paciente= " + idpac);
            InstanciaTabla();
            while(tabla.next())
            {
                numhist=tabla.getInt("num_historial");
                idmed=tabla.getInt("refid_medico");
                numss=tabla.getInt("numsegurosocial");
                fecrea=tabla.getString("fecreacion_historial");
                feact=tabla.getString("fecultctual_historial");
                tipsan=tabla.getString("tiposangre");
                vac=tabla.getString("vacunas");
                ultdia=tabla.getString("ultimodiag");
                med=Médico(idmed);
                pac=Paciente(idpac);
                M.addRow(new Object []{numhist,pac,med,numss,fecrea,feact,tipsan,vac,ultdia});
            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try
        {
            MessageFormat Cabecera= new MessageFormat("Historiales por Paciente");
            MessageFormat PiePagina=new MessageFormat("Hospital San José-Callao");
            tblReporte.print(JTable.PrintMode.FIT_WIDTH,Cabecera,PiePagina);
        }
        catch(PrinterException e)
        {
            Logger.getLogger(ReporteHistorialesPorPaciente.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteHistorialesPorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteHistorialesPorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteHistorialesPorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteHistorialesPorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteHistorialesPorPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRetroceder;
    public javax.swing.JComboBox<String> cbIdPaciente;
    public javax.swing.JComboBox<String> cbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    public javax.swing.JTable tblReporte;
    // End of variables declaration//GEN-END:variables
}
