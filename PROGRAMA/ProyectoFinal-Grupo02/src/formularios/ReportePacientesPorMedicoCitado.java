
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

public class ReportePacientesPorMedicoCitado extends javax.swing.JFrame 
{
    Render r= new Render();
    ConexionBD conexion;
    DefaultTableModel M;
    
    public ReportePacientesPorMedicoCitado() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pacientes por médico citados");
        conexion= new ConexionBD();
        tblReporte.setDefaultRenderer(Object.class,r);
        
        this.getContentPane().setBackground(Color.lightGray);
        MuestraComboBox();
    }
    
    public void MuestraComboBox()
    {
        int idmed;
        cbMedico.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select distinct refid_medico from cita_medica");
            while(tabla.next())
            {
                idmed=tabla.getInt(1);
                cbMedico.addItem(Médico(idmed));
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
        cbMedico = new javax.swing.JComboBox<>();
        jLabel119 = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        cbIdMedico = new javax.swing.JComboBox<>();
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
        jLabel100.setText("Pacientes por Médico citados");

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

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Búsqueda-Médico:");

        cbMedico.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMedico.setForeground(new java.awt.Color(0, 0, 153));
        cbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedicoActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(51, 51, 51));
        jLabel119.setText("ID-Médico:");

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
            .addComponent(jSeparator20)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 404, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(78, 78, 78)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(472, 472, 472)
                        .addComponent(btnImprimir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel119)
                                .addGap(18, 18, 18)
                                .addComponent(cbIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addGap(17, 17, 17)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel119))
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetroceder)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir)))
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1230, 540));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 580));

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
        M.addColumn("ID Paciente");
        M.addColumn("Nombre");
        M.addColumn("A.Paterno");
        M.addColumn("A.Materno");
        M.addColumn("DNI");
        M.addColumn("T.fijo");
        M.addColumn("T.movil");
        M.addColumn("CP");
        M.addColumn("F.nac.");
        M.addColumn("Edad");
        M.addColumn("Sexo");
        M.addColumn("Peso");
        M.addColumn("Estado");
        M.addColumn("Ocup.");
        M.addColumn("NºExt.");
        M.addColumn("NºInt.");
        M.addColumn("Calle");
        M.addColumn("Distrito");
        M.addColumn("Depart.");
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
    
    private void cbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedicoActionPerformed
        String med=cbMedico.getSelectedItem().toString();

        cbIdMedico.addItem("Apuntador");
        cbIdMedico.setSelectedIndex(0);
        EliminarComboBox(cbIdMedico);
        cbIdMedico.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();

            ResultSet tabla5=instruccion.executeQuery("select id_medico from medicos where nombres_medico= '" + med + "'");

            while(tabla5.next())
            {
                cbIdMedico.addItem(tabla5.getString("id_medico"));
            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
    }//GEN-LAST:event_cbMedicoActionPerformed
    
    public String Médico(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select nombres_medico from medicos where id_medico=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("nombres_medico");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    public void Paciente(int id)
    {
        String nom,appa,apma,dni,tefi,temo,ocup,fenac,sexo,est,calle,distrito,departamento;
        int idpac,cp,edad,ext,inte,idcalle,iddepart,iddistri;
        double peso;
        try
        {
            Statement instruccion=conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select * from pacientes where id_paciente=" + id);
            if(tabla.next())
            {

                idpac=tabla.getInt("id_paciente");
                nom=tabla.getString("nombres_paciente");
                appa=tabla.getString("apellpat_paciente");
                apma=tabla.getString("apellmat_paciente");
                dni=tabla.getString("dni_paciente");
                tefi=tabla.getString("telfijo_paciente");
                temo=tabla.getString("telmovil_paciente");
                cp=tabla.getInt("cp_paciente");
                fenac=tabla.getString("fechanac_paciente");
                edad=tabla.getInt("edad_paciente");
                sexo=tabla.getString("sexo_paciente");
                peso=tabla.getDouble("peso_paciente");
                est=tabla.getString("estacivil_paciente");
                ocup=tabla.getString("ocupacion_paciente");
                ext=tabla.getInt("numext_paciente");
                inte=tabla.getInt("numint_paciente");
                idcalle=tabla.getInt("refid_calle");
                iddistri=tabla.getInt("refid_distrito");
                iddepart=tabla.getInt("refid_departamento");
                distrito=Distrito(iddistri);
                calle=Calle(idcalle);
                departamento=Departamento(iddepart);
                M.addRow(new Object []{idpac,nom,appa,apma,dni,tefi,temo,cp,fenac,edad,sexo,peso,est,ocup,ext,inte,calle,distrito,departamento});
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }
    
    public String Calle(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select calle from calle where id_calle=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("calle");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    public String Distrito(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select distrito from distrito where id_distrito=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("distrito");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    public String Departamento(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select departamento from departamento where id_departamento=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("departamento");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    
    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        String  idmed;
        idmed=cbIdMedico.getSelectedItem().toString();
        int idpac;
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
            
            ResultSet tabla1=instruccion.executeQuery("select distinct refid_paciente from cita_medica where refid_medico= " + idmed);
            InstanciaTabla();
            while(tabla1.next())
            {
                idpac=tabla1.getInt(1);
                Paciente(idpac);
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
            MessageFormat Cabecera= new MessageFormat("Pacientes por Médico");
            MessageFormat PiePagina=new MessageFormat("Hospital San José-Callao");
            tblReporte.print(JTable.PrintMode.FIT_WIDTH,Cabecera,PiePagina);
        }
        catch(PrinterException e)
        {
            Logger.getLogger(ReportePacientesPorMedicoCitado.class.getName()).log(Level.SEVERE,null,e);
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
            java.util.logging.Logger.getLogger(ReportePacientesPorMedicoCitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportePacientesPorMedicoCitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportePacientesPorMedicoCitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportePacientesPorMedicoCitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportePacientesPorMedicoCitado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRetroceder;
    public javax.swing.JComboBox<String> cbIdMedico;
    public javax.swing.JComboBox<String> cbMedico;
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
