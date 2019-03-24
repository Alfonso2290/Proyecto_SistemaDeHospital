package formularios;

import conexionmysql.ConexionBD;
import java.sql.*;
import javax.swing.JOptionPane;

public class Tablas extends javax.swing.JFrame 
{
    ConexionBD conexion;
    
    public Tablas()
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Opciones de Ingreso");
        conexion= new ConexionBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPacientes = new javax.swing.JButton();
        btnInternamiento = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnCitasMedicas = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnMedicos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnEspecialidades = new javax.swing.JButton();
        btnRetornar = new javax.swing.JButton();
        btnRetornar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/recepcion.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPacientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/pacientes.png"))); // NOI18N
        btnPacientes.setText("Pacientes");
        btnPacientes.setBorderPainted(false);
        btnPacientes.setContentAreaFilled(false);
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 240, 130));

        btnInternamiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInternamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/internamiento 4.png"))); // NOI18N
        btnInternamiento.setText("Internamiento");
        btnInternamiento.setBorderPainted(false);
        btnInternamiento.setContentAreaFilled(false);
        btnInternamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternamientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInternamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        btnHistorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Historial.png"))); // NOI18N
        btnHistorial.setText("Historial Clínico");
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.setDefaultCapable(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        btnCitasMedicas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCitasMedicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Citas.png"))); // NOI18N
        btnCitasMedicas.setText("Citas Médicas");
        btnCitasMedicas.setBorderPainted(false);
        btnCitasMedicas.setContentAreaFilled(false);
        btnCitasMedicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasMedicasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCitasMedicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        btnUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Usuario.png"))); // NOI18N
        btnUsuario.setText("Usuario");
        btnUsuario.setBorderPainted(false);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        btnMedicos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/medico.png"))); // NOI18N
        btnMedicos.setText("Médicos");
        btnMedicos.setBorderPainted(false);
        btnMedicos.setContentAreaFilled(false);
        btnMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 160, 79));

        btnEmpleados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/empleados.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        btnEspecialidades.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/especialidades maletin.png"))); // NOI18N
        btnEspecialidades.setText("Especialidades");
        btnEspecialidades.setBorderPainted(false);
        btnEspecialidades.setContentAreaFilled(false);
        btnEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/atras.png"))); // NOI18N
        btnRetornar.setContentAreaFilled(false);
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 65));

        btnRetornar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/salir.png"))); // NOI18N
        btnRetornar1.setContentAreaFilled(false);
        btnRetornar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetornar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Salir");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        btnReportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/reporte.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        this.dispose();
        RegistroEntrada Objeto=new RegistroEntrada();
        Objeto.setVisible(true);
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from pacientes");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                Paciente Objeto=new Paciente();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                PacienteBDVacia Objeto1=new PacienteBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnInternamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternamientoActionPerformed
        AgregarInternamiento Objeto=new AgregarInternamiento();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInternamientoActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        AgregarHistorialClínico Objeto=new AgregarHistorialClínico();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialidadesActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from especialidades");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                Especialidades Objeto=new Especialidades();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                EspecialidadesBDVacia Objeto1=new EspecialidadesBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnEspecialidadesActionPerformed

    private void btnCitasMedicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasMedicasActionPerformed
        CitaMédica Objeto=new CitaMédica();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCitasMedicasActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        RegistroEntradaUsuario Objeto=new RegistroEntradaUsuario();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from empleados");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                Empleado Objeto=new Empleado();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                EmpleadoBDVacia Objeto1=new EmpleadoBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicosActionPerformed
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
                Médico Objeto=new Médico();
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                MédicoBDVacia Objeto1=new MédicoBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnMedicosActionPerformed

    private void btnRetornar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnRetornar1ActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Reportes Objeto=new Reportes();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitasMedicas;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEspecialidades;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInternamiento;
    private javax.swing.JButton btnMedicos;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton btnRetornar1;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
