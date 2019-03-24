
package formularios;

import com.toedter.calendar.JDateChooser;
import conexionmysql.ConexionBD;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class EditarInternamiento extends javax.swing.JFrame 
{
    public static int idpaciente,idinternamiento;
    ConexionBD conexion;
    
    public EditarInternamiento(int idpaciente,int idinternamiento) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Internamiento de Paciente");
        conexion= new ConexionBD();
        this.idpaciente=idpaciente;
        this.idinternamiento=idinternamiento;
        Conexion();
    }
    
    public void Conexion()
    {
        cbMedico.addItem("--Seleccionar--");
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select distinct nombres_medico from medicos");
            while(tabla.next())
            {
                cbMedico.addItem(tabla.getString("nombres_medico"));
            }
            
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
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        } 
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
    }
    
    public void EliminarComboBox()
    {
        for(int i=0;i<cbIdMedico.getItemCount();i++)
        {
            cbIdMedico.removeItemAt(i);
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
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        txtMoti = new javax.swing.JTextField();
        txtNumhab = new javax.swing.JTextField();
        txtDiag = new javax.swing.JTextField();
        txtImp = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbTipohab = new javax.swing.JComboBox<>();
        cbHoraI = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cbMinI = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cbSegI = new javax.swing.JComboBox<>();
        cbHoraA = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbMinA = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cbSegA = new javax.swing.JComboBox<>();
        calFeing = new com.toedter.calendar.JDateChooser();
        calFealta = new com.toedter.calendar.JDateChooser();
        jLabel113 = new javax.swing.JLabel();
        cbMedico = new javax.swing.JComboBox<>();
        cbIdMedico = new javax.swing.JComboBox<>();
        lblfoto = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
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
        jLabel100.setText("Internamiento de Paciente");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setText("Motivo:");

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel103.setText("Nº Habitación:");

        jLabel104.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel104.setText("Fecha de Ingreso:");

        jLabel105.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel105.setText("Fecha de Alta:");

        jLabel108.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel108.setText("Diagnóstico:");

        jLabel112.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel112.setText("Importe a pagar:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setText("Médico:");

        jLabel115.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel115.setText("Tipo-Habitación:");

        jLabel116.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel116.setText("Hora de Ingreso:");

        jLabel117.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel117.setText("Hora de Alta:");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        cbTipohab.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbTipohab.setForeground(new java.awt.Color(0, 0, 153));
        cbTipohab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Individual", "Compartida" }));

        cbHoraI.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbHoraI.setForeground(new java.awt.Color(0, 0, 153));
        cbHoraI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel24.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("/");

        cbMinI.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMinI.setForeground(new java.awt.Color(0, 0, 153));
        cbMinI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel26.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 153));
        jLabel26.setText("/");

        cbSegI.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSegI.setForeground(new java.awt.Color(0, 0, 153));
        cbSegI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        cbHoraA.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbHoraA.setForeground(new java.awt.Color(0, 0, 153));
        cbHoraA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel28.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 153));
        jLabel28.setText("/");

        cbMinA.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMinA.setForeground(new java.awt.Color(0, 0, 153));
        cbMinA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 153));
        jLabel30.setText("/");

        cbSegA.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSegA.setForeground(new java.awt.Color(0, 0, 153));
        cbSegA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        calFeing.setForeground(new java.awt.Color(0, 0, 153));

        calFealta.setForeground(new java.awt.Color(0, 0, 153));

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel113.setText("Id-Médico:");

        cbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedicoActionPerformed(evt);
            }
        });

        cbIdMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdMedicoActionPerformed(evt);
            }
        });

        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel31.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setText("FOTO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(18, 18, 18)
                        .addComponent(txtImp))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(txtDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel103)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumhab, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMoti, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calFeing, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(calFealta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel115)
                    .addComponent(jLabel114)
                    .addComponent(jLabel117)
                    .addComponent(jLabel113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMinI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSegI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbHoraA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMinA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSegA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbTipohab, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)
                        .addComponent(cbMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbIdMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(78, 78, 78)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(280, 280, 280))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel108)
                                    .addComponent(txtDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel114)
                                    .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel102)
                                    .addComponent(txtMoti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel113)
                                    .addComponent(cbIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel103)
                                    .addComponent(txtNumhab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel115)
                                    .addComponent(cbTipohab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel104)
                                        .addComponent(jLabel116)
                                        .addComponent(cbHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24)
                                        .addComponent(cbMinI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26)
                                        .addComponent(cbSegI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(calFeing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calFealta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel105)
                                        .addComponent(jLabel117)
                                        .addComponent(cbHoraA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28)
                                        .addComponent(cbMinA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel30)
                                        .addComponent(cbSegA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel112)
                                    .addComponent(txtImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetroceder)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        
        MostrarInternamiento Objeto=new MostrarInternamiento(idpaciente);
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
  
        String idmed,diag,motivo,numhab,feing,fealta,tipohab,horin,horal;
        double imp;
        diag=txtDiag.getText();
        motivo=txtMoti.getText();
        numhab=txtNumhab.getText();
        tipohab=cbTipohab.getSelectedItem().toString();
        idmed=cbIdMedico.getSelectedItem().toString();
        imp=Double.parseDouble(txtImp.getText());
        horin=Time(cbHoraI,cbMinI,cbSegI);
        horal=Time(cbHoraA,cbMinA,cbSegA);
        feing=Date(calFeing);
        fealta=Date(calFealta);

        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            instruccion.executeUpdate("update internamientos set refid_medico=" + idmed + " where refid_paciente=" + idpaciente  + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set numhabitacion='" + numhab + "' where refid_paciente=" + idpaciente  + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set tipohabitacion='" + tipohab + "' where refid_paciente=" + idpaciente  + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set fechaingreso='" + feing + "' where refid_paciente=" + idpaciente  + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set horaingreso='" + horin + "' where refid_paciente=" + idpaciente  + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set fechaalta='" + fealta + "' where refid_paciente=" + idpaciente  + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set horaalta='" + horal + "' where refid_paciente=" + idpaciente  + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set motivo='" + motivo + "' where refid_paciente=" + idpaciente   + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set diagnostico='" + diag + "' where refid_paciente=" + idpaciente   + " AND id_internamiento=" + idinternamiento);
            instruccion.executeUpdate("update internamientos set importe_internamiento=" + imp + " where refid_paciente=" + idpaciente   + " AND id_internamiento=" + idinternamiento);
            
            JOptionPane.showMessageDialog(null,"==> Se ha actualizado los datos del paciente internado correctamente <==");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos del paciente internado han sido mal ingresados <==\n"
                                                 + "        ==> Es necesario llenar todos los campos <== ");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtDiag.setText("");
        txtMoti.setText("");
        txtImp.setText("");
        txtNumhab.setText("");
        cbIdMedico.setSelectedIndex(0);
        cbMedico.setSelectedIndex(0);
        cbTipohab.setSelectedIndex(0);
        cbHoraA.setSelectedIndex(0);
        cbHoraI.setSelectedIndex(0);
        cbMinA.setSelectedIndex(0);
        cbMinI.setSelectedIndex(0);
        cbSegA.setSelectedIndex(0);
        cbSegI.setSelectedIndex(0);
        txtDiag.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedicoActionPerformed
        String med=cbMedico.getSelectedItem().toString();
        
        cbIdMedico.addItem("Apuntador");
        cbIdMedico.setSelectedIndex(0);
        EliminarComboBox();
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

    private void cbIdMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarInternamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarInternamiento(idpaciente,idinternamiento).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public com.toedter.calendar.JDateChooser calFealta;
    public com.toedter.calendar.JDateChooser calFeing;
    public javax.swing.JComboBox<String> cbHoraA;
    public javax.swing.JComboBox<String> cbHoraI;
    public javax.swing.JComboBox<String> cbIdMedico;
    public javax.swing.JComboBox<String> cbMedico;
    public javax.swing.JComboBox<String> cbMinA;
    public javax.swing.JComboBox<String> cbMinI;
    public javax.swing.JComboBox<String> cbSegA;
    public javax.swing.JComboBox<String> cbSegI;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTextField txtDiag;
    public javax.swing.JTextField txtImp;
    public javax.swing.JTextField txtMoti;
    public javax.swing.JTextField txtNumhab;
    // End of variables declaration//GEN-END:variables
}
