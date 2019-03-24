package formularios;

import com.toedter.calendar.JDateChooser;
import conexionmysql.ConexionBD;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JComboBox;

public class AgregarInternamiento extends javax.swing.JFrame 
{
    ConexionBD conexion;
    
    public AgregarInternamiento() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro de Pacientes a internar");
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
        jLabel108 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        txtNumhab = new javax.swing.JTextField();
        txtDiag = new javax.swing.JTextField();
        txtImp = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbHora = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cbMin = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cbSeg = new javax.swing.JComboBox<>();
        cbHr = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbMinu = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cbSegu = new javax.swing.JComboBox<>();
        calFeing = new com.toedter.calendar.JDateChooser();
        calFealta = new com.toedter.calendar.JDateChooser();
        cbIdpaciente = new javax.swing.JComboBox<>();
        cbIdmedico = new javax.swing.JComboBox<>();
        cbTipohab = new javax.swing.JComboBox<>();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
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

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 153));
        jLabel100.setText("Registro de Pacientes a internar");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 153));
        jLabel102.setText("Motivo:");

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 153));
        jLabel103.setText("Nº Habitación:");

        jLabel104.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 153));
        jLabel104.setText("Fecha de Ingreso:");

        jLabel105.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 153));
        jLabel105.setText("Fecha de Alta:");

        jLabel108.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 153));
        jLabel108.setText("Diagnóstico:");

        jLabel112.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 153));
        jLabel112.setText("Importe a pagar:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 153));
        jLabel113.setText("ID-Paciente:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 153));
        jLabel114.setText("ID-Médico:");

        jLabel115.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 153));
        jLabel115.setText("Tipo-Habitación:");

        jLabel116.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 153));
        jLabel116.setText("Hora de Ingreso:");

        jLabel117.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 153));
        jLabel117.setText("Hora de Alta:");

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

        cbHora.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbHora.setForeground(new java.awt.Color(0, 0, 153));
        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel24.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("/");

        cbMin.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMin.setForeground(new java.awt.Color(0, 0, 153));
        cbMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel26.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 153));
        jLabel26.setText("/");

        cbSeg.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSeg.setForeground(new java.awt.Color(0, 0, 153));
        cbSeg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        cbHr.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbHr.setForeground(new java.awt.Color(0, 0, 153));
        cbHr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel28.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 153));
        jLabel28.setText("/");

        cbMinu.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMinu.setForeground(new java.awt.Color(0, 0, 153));
        cbMinu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 153));
        jLabel30.setText("/");

        cbSegu.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSegu.setForeground(new java.awt.Color(0, 0, 153));
        cbSegu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        calFeing.setForeground(new java.awt.Color(0, 0, 153));

        calFealta.setForeground(new java.awt.Color(0, 0, 153));

        cbTipohab.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbTipohab.setForeground(new java.awt.Color(0, 0, 153));
        cbTipohab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Individual", "Compartida" }));

        jLabel118.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 153));
        jLabel118.setText("Paciente:");

        jLabel119.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 153));
        jLabel119.setText("Médico:");

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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipohab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel103)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel102)
                            .addComponent(jLabel112))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumhab, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMotivo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(calFeing, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(calFealta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel114)
                    .addComponent(jLabel116)
                    .addComponent(jLabel113)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(jLabel119))
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMinu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSegu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbIdpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(175, 175, 175))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addGap(11, 11, 11)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(txtDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118)
                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113)
                    .addComponent(cbIdpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(txtNumhab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119)
                    .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel104)
                        .addComponent(jLabel114)
                        .addComponent(cbIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calFeing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calFealta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(cbMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(cbSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105)
                        .addComponent(jLabel116)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addComponent(cbMinu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(cbSegu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel112)
                        .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel117)))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(cbTipohab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        Tablas Objeto=new Tablas();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed
    
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
    
    public String Time(JComboBox h, JComboBox m,JComboBox s)
    {
        String hr,min,seg;
        String hora;
        
        hr=h.getSelectedItem().toString();
        min=m.getSelectedItem().toString();
        seg=s.getSelectedItem().toString();
        
        hora=hr+":"+min+":"+seg;
        
        return hora;
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idpac,idmed,diag,motivo,numhab,feing,fealta,tipohab,horin,horal;
        double imp;
        diag=txtDiag.getText();
        motivo=txtMotivo.getText();
        numhab=txtNumhab.getText();
        tipohab=cbTipohab.getSelectedItem().toString();
        idmed=cbIdmedico.getSelectedItem().toString();
        idpac=cbIdpaciente.getSelectedItem().toString();
        imp=Double.parseDouble(txtImp.getText());
        horin=Time(cbHora,cbMin,cbSeg);
        horal=Time(cbHr,cbMinu,cbSegu);
        feing=Date(calFeing);
        fealta=Date(calFealta);

        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            
            instruccion.executeUpdate("INSERT INTO internamientos(refid_medico,refid_paciente,numhabitacion,tipohabitacion,fechaingreso,horaingreso,fechaalta, horaalta,motivo,diagnostico,importe_internamiento) VALUES ("
                                +   idmed + "," + idpac + ",'" + numhab + "','" + tipohab + "','" + feing + "','" + horin + "','" + fealta + "','" + horal + "','" + motivo + "','" + diag + "'," + imp + ")");
            
            JOptionPane.showMessageDialog(null,"==> Se ha Agregado el registro del paciente internado correctamente <==");
            btnRetrocederActionPerformed(evt);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos del paciente internado han sido mal ingresados <==\n"
                                                 + "        ==> Es necesario llenar todos los campos <== ");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtDiag.setText("");
        txtMotivo.setText("");
        txtImp.setText("");
        txtNumhab.setText("");
        cbIdmedico.setSelectedIndex(0);
        cbMedico.setSelectedIndex(0);
        cbTipohab.setSelectedIndex(0);
        cbHora.setSelectedIndex(0);
        cbHr.setSelectedIndex(0);
        cbMin.setSelectedIndex(0);
        cbMinu.setSelectedIndex(0);
        cbSeg.setSelectedIndex(0);
        cbSegu.setSelectedIndex(0);
        txtDiag.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbCiudad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudad2ActionPerformed
        // Aprete de casualidad
    }//GEN-LAST:event_cbCiudad2ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarInternamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public com.toedter.calendar.JDateChooser calFealta;
    public com.toedter.calendar.JDateChooser calFeing;
    public javax.swing.JComboBox<String> cbHora;
    public javax.swing.JComboBox<String> cbHr;
    public javax.swing.JComboBox<String> cbIdmedico;
    public javax.swing.JComboBox<String> cbIdpaciente;
    public javax.swing.JComboBox<String> cbMedico;
    public javax.swing.JComboBox<String> cbMin;
    public javax.swing.JComboBox<String> cbMinu;
    public javax.swing.JComboBox<String> cbPaciente;
    public javax.swing.JComboBox<String> cbSeg;
    public javax.swing.JComboBox<String> cbSegu;
    public javax.swing.JComboBox<String> cbTipohab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    public javax.swing.JTextField txtDiag;
    public javax.swing.JTextField txtImp;
    public javax.swing.JTextField txtMotivo;
    public javax.swing.JTextField txtNumhab;
    // End of variables declaration//GEN-END:variables
}
