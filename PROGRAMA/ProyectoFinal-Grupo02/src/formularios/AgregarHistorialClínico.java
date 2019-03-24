
package formularios;

import com.toedter.calendar.JDateChooser;
import conexionmysql.ConexionBD;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgregarHistorialClínico extends javax.swing.JFrame 
{
    public static DefaultTableModel M,N;
    public static String alergia[],enfermedad[];
    ConexionBD conexion;
    
    public AgregarHistorialClínico() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro de Historial Clínico del Paciente");
        this.getContentPane().setBackground(Color.lightGray);
        M=new DefaultTableModel();
        M.addColumn("Otros Antec. Enfermedades");
        this.tblAntecedentes.setModel(M);
        
        N=new DefaultTableModel();
        N.addColumn("Otras Alergias");
        this.tblAlergias.setModel(N);
        
        conexion= new ConexionBD();
        Conexion();
    }
    
    public void Conexion()
    {
        cbMedico.addItem("--Seleccionar--");
        cbPaciente.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select distinct nombres_medico from medicos");
            while(tabla.next())
            {
                cbMedico.addItem(tabla.getString("nombres_medico"));
            }
            
            ResultSet tabla2=instruccion.executeQuery("select distinct nombres_paciente from pacientes");
            while(tabla2.next())
            {
                cbPaciente.addItem(tabla2.getString("nombres_paciente"));
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }
    
    public void EliminarComboBox(JComboBox combo)
    {
        for(int i=0;i<combo.getItemCount();i++)
        {
            combo.removeItemAt(i);
            i--;
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
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        txtNumss = new javax.swing.JTextField();
        txtUltdia = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        calFecre = new com.toedter.calendar.JDateChooser();
        calFeact = new com.toedter.calendar.JDateChooser();
        cbIdpaciente = new javax.swing.JComboBox<>();
        cbIdmedico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        atVacunacion = new javax.swing.JTextArea();
        jLabel117 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAlergias = new javax.swing.JTable();
        btnAgregarAlergias = new javax.swing.JButton();
        txtAlergia = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAntecedentes = new javax.swing.JTable();
        jLabel109 = new javax.swing.JLabel();
        btnAgregarEnfermedad = new javax.swing.JButton();
        txtEnfermedad = new javax.swing.JTextField();
        cbTipSan = new javax.swing.JComboBox<>();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox<>();
        cbMedico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel100.setText("Registro de Historial Clínico del Paciente");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setText("Nº Seguro Social:");

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel103.setText("Vacunación:");

        jLabel104.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel104.setText("Fecha de Creación:");

        jLabel105.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel105.setText("Último diagnóstico:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel113.setText("ID-Paciente:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setText("ID-Médico:");

        jLabel116.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel116.setText("Fecha Actualización:");

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

        atVacunacion.setColumns(20);
        atVacunacion.setRows(5);
        jScrollPane1.setViewportView(atVacunacion);

        jLabel117.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel117.setText("Tipo-Sangre:");

        jLabel108.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel108.setText("Alérgias");

        tblAlergias.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tblAlergias);

        btnAgregarAlergias.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregarAlergias.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregarAlergias.setText("+");
        btnAgregarAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlergiasActionPerformed(evt);
            }
        });

        tblAntecedentes.setModel(new javax.swing.table.DefaultTableModel(
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
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblAntecedentes);

        jLabel109.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel109.setText("Antecedentes enfermedades");

        btnAgregarEnfermedad.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregarEnfermedad.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregarEnfermedad.setText("+");
        btnAgregarEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEnfermedadActionPerformed(evt);
            }
        });

        cbTipSan.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbTipSan.setForeground(new java.awt.Color(0, 0, 153));
        cbTipSan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "A", "B", "AB", "O" }));

        jLabel119.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel119.setText("Paciente:");

        jLabel120.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel120.setText("Médico:");

        cbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPacienteActionPerformed(evt);
            }
        });

        cbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19)
            .addComponent(jSeparator20)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(140, 140, 140))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnAgregarAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel109)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnAgregarEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel117)
                                .addGap(68, 68, 68)
                                .addComponent(cbTipSan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel102)
                                            .addComponent(jLabel104)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel105)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtUltdia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNumss, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(calFecre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel113)
                                            .addComponent(jLabel119)
                                            .addComponent(jLabel120)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel116)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calFeact, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel114)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbIdpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(txtNumss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119)
                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel104)
                        .addComponent(jLabel113)
                        .addComponent(cbIdpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calFecre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(txtUltdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120)
                    .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel116)
                        .addComponent(jLabel114)
                        .addComponent(cbIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calFeact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel117)
                    .addComponent(cbTipSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel108)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEnfermedadActionPerformed
        String enfermedad=txtEnfermedad.getText();
        M.addRow(new Object[] {enfermedad});
        txtEnfermedad.setText("");
        txtEnfermedad.requestFocus();
    }//GEN-LAST:event_btnAgregarEnfermedadActionPerformed

    private void btnAgregarAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlergiasActionPerformed

        String alergia=txtAlergia.getText();
        N.addRow(new Object[] {alergia});
        txtAlergia.setText("");
        txtAlergia.requestFocus();
    }//GEN-LAST:event_btnAgregarAlergiasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       txtNumss.setText("");
       txtUltdia.setText("");
       cbIdmedico.setSelectedIndex(0);
       cbMedico.setSelectedIndex(0);
       cbTipSan.setSelectedIndex(0);
       cbIdpaciente.setSelectedIndex(0);
       cbPaciente.setSelectedIndex(0);
       atVacunacion.setText("");
       EliminarTabla(tblAlergias, N);
       EliminarTabla(tblAntecedentes, M);
       txtNumss.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void EliminarTabla(JTable tabla,DefaultTableModel model)
    {
        for(int i=0;i<tabla.getRowCount();i++)
        {
            model.removeRow(i);
            i--;
        }
    }
    
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
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idpac,idmed,tipsan,fecrea,feact,ultdia,vac,alergia,enfermedad;
        int numss,maxnumhist=0;
        numss=Integer.parseInt(txtNumss.getText());
        ultdia=txtUltdia.getText();
        tipsan=cbTipSan.getSelectedItem().toString();
        idmed=cbIdmedico.getSelectedItem().toString();
        idpac=cbIdpaciente.getSelectedItem().toString();
        vac=atVacunacion.getText();
        fecrea=Date(calFecre);
        feact=Date(calFeact);

        try
        {
           Statement instruccion= conexion.getConexionBD().createStatement();
            
            instruccion.executeUpdate("INSERT INTO historial_clinico(refid_medico,refid_paciente,numsegurosocial,fecreacion_historial,fecultctual_historial,tiposangre,vacunas,ultimodiag) VALUES ("
                                +   idmed + "," + idpac + "," + numss + ",'" + fecrea + "','" + feact + "','" + tipsan + "','" + vac + "','" + ultdia + "')");

            ResultSet tabla=instruccion.executeQuery("select max(num_historial) from historial_clinico order by num_historial");
            if(tabla.next())
                maxnumhist=tabla.getInt("max(num_historial)");
            
            for(int i=0;i<tblAlergias.getRowCount();i++)
            {
                if(tblAlergias.getValueAt(i,0)!=null)
                {
                    alergia=String.valueOf(tblAlergias.getValueAt(i, 0));
                    instruccion.executeUpdate("insert into alergias(refnum_historial,alergia) values (" + maxnumhist + ",'" + alergia + "')");
                }
            }
            
            for(int i=0;i<tblAntecedentes.getRowCount();i++)
            {
                if(tblAntecedentes.getValueAt(i,0)!=null)
                {
                    enfermedad=String.valueOf(tblAntecedentes.getValueAt(i, 0));
                    instruccion.executeUpdate("insert into antecentes_enfermedades(refnum_historial,enfermedad) values (" + maxnumhist + ",'" + enfermedad + "')");
                }
            }
            JOptionPane.showMessageDialog(null,"==> Se han Agregado los registros correctamente <==");
            btnRetrocederActionPerformed(evt);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos han sido mal ingresados <==\n"
                                                 + "==> Es necesario llenar todos los campos <==");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        
        Tablas Objeto=new Tablas();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void cbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedicoActionPerformed
        String med=cbMedico.getSelectedItem().toString();

        cbIdmedico.addItem("Apuntador");
        cbIdmedico.setSelectedIndex(0);
        EliminarComboBox(cbIdmedico);
        cbIdmedico.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();

            ResultSet tabla5=instruccion.executeQuery("select id_medico from medicos where nombres_medico= '" + med + "'");

            while(tabla5.next())
            {
                cbIdmedico.addItem(tabla5.getString("id_medico"));
            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_cbMedicoActionPerformed

    private void cbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPacienteActionPerformed
        String pac=cbPaciente.getSelectedItem().toString();

        cbIdpaciente.addItem("Apuntador");
        cbIdpaciente.setSelectedIndex(0);
        EliminarComboBox(cbIdpaciente);
        cbIdpaciente.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();

            ResultSet tabla5=instruccion.executeQuery("select id_paciente from pacientes where nombres_paciente= '" + pac + "'");

            while(tabla5.next())
            {
                cbIdpaciente.addItem(tabla5.getString("id_paciente"));
            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_cbPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarHistorialClínico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atVacunacion;
    private javax.swing.JButton btnAgregarAlergias;
    private javax.swing.JButton btnAgregarEnfermedad;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public com.toedter.calendar.JDateChooser calFeact;
    public com.toedter.calendar.JDateChooser calFecre;
    public javax.swing.JComboBox<String> cbIdmedico;
    public javax.swing.JComboBox<String> cbIdpaciente;
    public javax.swing.JComboBox<String> cbMedico;
    public javax.swing.JComboBox<String> cbPaciente;
    public javax.swing.JComboBox<String> cbTipSan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    public javax.swing.JTable tblAlergias;
    public javax.swing.JTable tblAntecedentes;
    public javax.swing.JTextField txtAlergia;
    public javax.swing.JTextField txtEnfermedad;
    public javax.swing.JTextField txtNumss;
    public javax.swing.JTextField txtUltdia;
    // End of variables declaration//GEN-END:variables
}
