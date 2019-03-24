
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

public class ReporteMedicosPorEspecialidad extends javax.swing.JFrame 
{
    Render r= new Render();
    ConexionBD conexion;
    DefaultTableModel M;
    
    public ReporteMedicosPorEspecialidad() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Médicos por especialidad");
        conexion= new ConexionBD();
        tblReporte.setDefaultRenderer(Object.class,r);
        this.getContentPane().setBackground(Color.lightGray);
        MuestraComboBox();
    }
    
    public void MuestraComboBox()
    {
        int idesp;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select distinct refid_especialidad from medicos");
            while(tabla.next())
            {
                idesp=tabla.getInt("refid_especialidad");
                cbEspecialidad.addItem(IdEspecialidad(idesp));
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
        cbEspecialidad = new javax.swing.JComboBox<>();
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
        jLabel100.setText("Médicos por especialidad");

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

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel23.setText("Búsqueda-Especialidad:");

        cbEspecialidad.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbEspecialidad.setForeground(new java.awt.Color(0, 0, 153));
        cbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspecialidadActionPerformed(evt);
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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(404, 404, 404)
                        .addComponent(btnImprimir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel100)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir)
                    .addComponent(btnRetroceder))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 29, 1100, 490));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 540));

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
        M.addColumn("ID Médico");
        M.addColumn("Nombre");
        M.addColumn("Ape.Paterno");
        M.addColumn("Ape.Materno");
        M.addColumn("DNI");
        M.addColumn("Tel.fijo");
        M.addColumn("Tel.Movil");
        M.addColumn("Sexo");
        M.addColumn("NºExt.");
        M.addColumn("NºInt.");
        M.addColumn("Calle");
        M.addColumn("Distrito");
        M.addColumn("Departam.");
        this.tblReporte.setModel(M);
    }
    
    private void cbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspecialidadActionPerformed
        
        String esp=cbEspecialidad.getSelectedItem().toString();
        int iddep,idcalle,iddis,idesp,idmed,ext,inte;
        String  dep,calle,dis,nom,apepa,apema,dni,telfi,telmo,sexo;       
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
            idesp=Especialidad(esp);
            ResultSet tabla=instruccion.executeQuery("select * from medicos where refid_especialidad=" + idesp);
            InstanciaTabla();
            while(tabla.next())
            {

                idmed=tabla.getInt("id_medico");
                nom=tabla.getString("nombres_medico");
                apepa=tabla.getString("apellpat_medico");
                apema=tabla.getString("apellpat_medico");
                dni=tabla.getString("dni_medico");
                telfi=tabla.getString("telfijo_medico");
                telmo=tabla.getString("telmovil_medico");
                sexo=tabla.getString("sexo_medico");
                ext=tabla.getInt("numext_medico");
                inte=tabla.getInt("numint_medico");
                idcalle=tabla.getInt("refid_calle");
                iddis=tabla.getInt("refid_distrito");
                iddep=tabla.getInt("refid_departamento");
                calle=Calle(idcalle);
                dis=Distrito(iddis);
                dep=Departamento(iddep);
                M.addRow(new Object []{idmed,nom,apepa,apema,dni,telfi,telmo,sexo,ext,inte,calle,dis,dep});
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_cbEspecialidadActionPerformed
    
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
    
    public int Especialidad(String esp)
    {
        int id=0;
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
            
            ResultSet tabla=instruccion.executeQuery("select id_especialidad from especialidades where nombre_especialidad='" + esp + "'");
            
            if(tabla.next())
            {
                id=tabla.getInt("id_especialidad"); 
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return id;
    }
    
    public String IdEspecialidad(int id)
    {
        String nom="";
        try
        {
            
            Statement instruccion= conexion.getConexionBD().createStatement();
      
            ResultSet tabla=instruccion.executeQuery("select nombre_especialidad from especialidades where id_especialidad=" + id);
            if(tabla.next())
            {
                nom=tabla.getString("nombre_especialidad");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        return nom;
    }
    
    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try
        {
            MessageFormat Cabecera= new MessageFormat("Médicos por Especialidad");
            MessageFormat PiePagina=new MessageFormat("Hospital San José-Callao");
            tblReporte.print(JTable.PrintMode.FIT_WIDTH,Cabecera,PiePagina);
        }
        catch(PrinterException e)
        {
            Logger.getLogger(ReporteMedicosPorEspecialidad.class.getName()).log(Level.SEVERE,null,e);
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
            java.util.logging.Logger.getLogger(ReporteMedicosPorEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteMedicosPorEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteMedicosPorEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteMedicosPorEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteMedicosPorEspecialidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRetroceder;
    public javax.swing.JComboBox<String> cbEspecialidad;
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
