
package formularios;

import conexionmysql.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Reportes extends javax.swing.JFrame 
{
    ConexionBD conexion;
    
    public Reportes() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reportes-Hospital");
        conexion= new ConexionBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCitaMedicaPorFecha = new javax.swing.JButton();
        btnMedicosPorEspecialidad = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        btnPacientesPorMedicoCitados = new javax.swing.JButton();
        btnInternamientosPorPaciente = new javax.swing.JButton();
        btnHistorialesPorPaciente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCitaMedicaPorFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCitaMedicaPorFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/cita medica.png"))); // NOI18N
        btnCitaMedicaPorFecha.setBorderPainted(false);
        btnCitaMedicaPorFecha.setContentAreaFilled(false);
        btnCitaMedicaPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaMedicaPorFechaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCitaMedicaPorFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 120, -1));

        btnMedicosPorEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMedicosPorEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/medico espe.png"))); // NOI18N
        btnMedicosPorEspecialidad.setBorderPainted(false);
        btnMedicosPorEspecialidad.setContentAreaFilled(false);
        btnMedicosPorEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicosPorEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedicosPorEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 110, -1));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/izquierdah.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 61, -1));

        btnPacientesPorMedicoCitados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPacientesPorMedicoCitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/paciente por medico2.png"))); // NOI18N
        btnPacientesPorMedicoCitados.setBorderPainted(false);
        btnPacientesPorMedicoCitados.setContentAreaFilled(false);
        btnPacientesPorMedicoCitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesPorMedicoCitadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPacientesPorMedicoCitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 180, 140));

        btnInternamientosPorPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInternamientosPorPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/pacientes.png"))); // NOI18N
        btnInternamientosPorPaciente.setBorderPainted(false);
        btnInternamientosPorPaciente.setContentAreaFilled(false);
        btnInternamientosPorPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternamientosPorPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnInternamientosPorPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, -1));

        btnHistorialesPorPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHistorialesPorPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/historial por paciente.png"))); // NOI18N
        btnHistorialesPorPaciente.setBorderPainted(false);
        btnHistorialesPorPaciente.setContentAreaFilled(false);
        btnHistorialesPorPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialesPorPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistorialesPorPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Internamientos por Paciente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Pacientes por Médico citados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 158, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Médicos por Especialidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Cita Médica por Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Historiales por Paciente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 463, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitaMedicaPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaMedicaPorFechaActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from cita_medica");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                ReporteCitasMédicasPorFecha Objeto=new ReporteCitasMédicasPorFecha();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                ReporteCitasMédicasPorFechaBDVacia Objeto1=new ReporteCitasMédicasPorFechaBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }   
    }//GEN-LAST:event_btnCitaMedicaPorFechaActionPerformed

    private void btnMedicosPorEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicosPorEspecialidadActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from medicos");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                ReporteMedicosPorEspecialidad Objeto=new ReporteMedicosPorEspecialidad();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                ReporteMédicosPorEspecialidadBDVacia Objeto1=new ReporteMédicosPorEspecialidadBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }   
    }//GEN-LAST:event_btnMedicosPorEspecialidadActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        Tablas Objeto=new Tablas();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnPacientesPorMedicoCitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesPorMedicoCitadosActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from cita_medica");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                ReportePacientesPorMedicoCitado Objeto=new ReportePacientesPorMedicoCitado();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                ReportePacientesPorMedicoCitadoBDVacia Objeto1=new ReportePacientesPorMedicoCitadoBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }   
    }//GEN-LAST:event_btnPacientesPorMedicoCitadosActionPerformed

    private void btnInternamientosPorPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternamientosPorPacienteActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from internamientos");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                ReporteInternamientosPorPaciente Objeto=new ReporteInternamientosPorPaciente();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                ReporteInternamientosPorPacienteBDVacia Objeto1=new ReporteInternamientosPorPacienteBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }   
    }//GEN-LAST:event_btnInternamientosPorPacienteActionPerformed

    private void btnHistorialesPorPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialesPorPacienteActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from historial_clinico");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                ReporteHistorialesPorPaciente Objeto=new ReporteHistorialesPorPaciente();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                ReporteHistorialesPorPacienteBDVacia Objeto1=new ReporteHistorialesPorPacienteBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        } 
    }//GEN-LAST:event_btnHistorialesPorPacienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitaMedicaPorFecha;
    private javax.swing.JButton btnHistorialesPorPaciente;
    private javax.swing.JButton btnInternamientosPorPaciente;
    private javax.swing.JButton btnMedicosPorEspecialidad;
    private javax.swing.JButton btnPacientesPorMedicoCitados;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
