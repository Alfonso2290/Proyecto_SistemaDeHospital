
package formularios;

import JTableColor.Render;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReporteCitasMédicasPorFecha extends javax.swing.JFrame 
{
    ConexionBD conexion;
    DefaultTableModel M;
    Render r= new Render();
    
    public ReporteCitasMédicasPorFecha() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Citas médicas por fecha");
        conexion= new ConexionBD();
        tblReporte.setDefaultRenderer(Object.class,r);
        
        this.getContentPane().setBackground(Color.lightGray);
        MuestraComboBox();
    }
    
    public void MuestraComboBox()
    {
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            
            ResultSet tabla=instruccion.executeQuery("select distinct fechaprogramada_cita from cita_medica");
            while(tabla.next())
            {
                cbFecha.addItem(tabla.getString(1));
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
        cbFecha = new javax.swing.JComboBox<>();
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

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 153));
        jLabel100.setText("Citas médicas por Fecha");

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
        jLabel23.setText("Búsqueda-Fecha:");

        cbFecha.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbFecha.setForeground(new java.awt.Color(0, 0, 153));
        cbFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFechaActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 0, 153));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Imprimir.png"))); // NOI18N
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.setDefaultCapable(false);
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
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(121, 121, 121)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389)
                        .addComponent(btnImprimir))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jLabel23)
                    .addComponent(cbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetroceder)
                    .addComponent(btnImprimir))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 540));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        Reportes Objeto=new Reportes();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed
    
    public void InstanciaTabla()
    {
        M=new DefaultTableModel();
        M.addColumn("ID Cita");
        M.addColumn("Paciente");
        M.addColumn("Medico");
        M.addColumn("Especialidad");
        M.addColumn("NºOrden");
        M.addColumn("Fecha Prog.");
        M.addColumn("Hora Prog.");
        M.addColumn("Fecha Reg.");
        M.addColumn("Hora Reg.");
        this.tblReporte.setModel(M);
    }
    
    private void cbFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFechaActionPerformed
        
        String fecha=cbFecha.getSelectedItem().toString();
        int idmed,idpac,numorden,idcita;
        String med,pac,esp,fepro,horapro,fereg,horareg;
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select * from cita_medica where fechaprogramada_cita='" + fecha + "'");
            InstanciaTabla();
            while(tabla.next())
            {

                idcita=tabla.getInt("id_cita");
                idpac=tabla.getInt("refid_paciente");
                idmed=tabla.getInt("refid_medico");
                numorden=tabla.getInt("numorden_cita");
                fepro=tabla.getString("fechaprogramada_cita");
                fereg=tabla.getString("fecharegistro_cita");
                horapro=tabla.getString("horaprogramada_cita");
                horareg=tabla.getString("horaregistro_cita");
                med=Médico(idmed);
                pac=Paciente(idpac);
                esp=Especialidad(idmed);
                M.addRow(new Object []{idcita,pac,med,esp,numorden,fepro,horapro,fereg,horareg});
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_cbFechaActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try
        {
            MessageFormat Cabecera= new MessageFormat("Cítas Médicas por Fecha");
            MessageFormat PiePagina=new MessageFormat("Hospital San José-Callao");
            tblReporte.print(JTable.PrintMode.FIT_WIDTH,Cabecera,PiePagina);
        }
        catch(PrinterException e)
        {
            Logger.getLogger(ReporteCitasMédicasPorFecha.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed
    
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
    
    public String Especialidad(int idmed)
    {
        String nom="";
        int id=0;
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select refid_especialidad from medicos where id_medico=" + idmed);
            if(tabla.next())
            {
                id=tabla.getInt("refid_especialidad");
            }
            
            ResultSet tabla2=instruccion.executeQuery("select nombre_especialidad from especialidades where id_especialidad=" + id);
            
            if(tabla2.next())
            {
                nom=tabla2.getString("nombre_especialidad"); 
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
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
            java.util.logging.Logger.getLogger(ReporteCitasMédicasPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteCitasMédicasPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteCitasMédicasPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteCitasMédicasPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteCitasMédicasPorFecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRetroceder;
    public javax.swing.JComboBox<String> cbFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    public javax.swing.JTable tblReporte;
    // End of variables declaration//GEN-END:variables
}
