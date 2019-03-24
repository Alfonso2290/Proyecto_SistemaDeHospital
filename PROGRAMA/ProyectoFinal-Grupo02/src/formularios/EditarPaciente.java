package formularios;

import conexionmysql.ConexionBD;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class EditarPaciente extends javax.swing.JFrame 
{
    public static int idpaciente;
    FileInputStream file;
    public static int longitudBytes;
    ConexionBD conexion;
    
    public EditarPaciente(int idpaciente) 
    {
        initComponents();
        setLocationRelativeTo(null);
        conexion= new ConexionBD();
        setTitle("Edición de información del Paciente");
        Conexion();
        
        this.idpaciente=idpaciente;
        txtNom.requestFocus();
       
    }
    
    public void Conexion()
    {
        cbDepartamento.addItem("--Seleccionar--");
        cbCalle.addItem("--Seleccionar--");

        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select * from departamento");
            while(tabla.next())
            {
                cbDepartamento.addItem(tabla.getString("departamento"));
            }
            ResultSet tabla3=instruccion.executeQuery("select * from calle");
            while(tabla3.next())
            {
                cbCalle.addItem(tabla3.getString("calle"));
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApepa = new javax.swing.JTextField();
        txtApema = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelmo = new javax.swing.JTextField();
        txtTelfi = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtCp = new javax.swing.JTextField();
        txtOcup = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cbSexo = new javax.swing.JComboBox<>();
        cbEstado = new javax.swing.JComboBox<>();
        calFenac = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cbDistrito = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cbCalle = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtInt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtExt = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setOpaque(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/atras.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Edición de información del Paciente");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("Apellido paterno:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Apellido materno:");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("DNI:");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("Teléfono fijo:");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setText("Teléfono movil:");

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel12.setText("Ocupación:");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("Fecha de nacimiento:");

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel14.setText("CP:");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel15.setText("Sexo:");

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel16.setText("Peso:");

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel17.setText("Estado civil:");

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel18.setText("Edad:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbSexo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSexo.setForeground(new java.awt.Color(0, 0, 153));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Masculino", "Femenino" }));

        cbEstado.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbEstado.setForeground(new java.awt.Color(0, 0, 153));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Soltero", "Casado" }));

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel21.setText("Departamento:");

        cbDepartamento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbDepartamento.setForeground(new java.awt.Color(0, 0, 153));
        cbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setText("Distrito:");

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel25.setText("Calle:");

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setText("NºInterno:");

        jLabel26.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel26.setText("NºExterno:");

        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnAgregarImagen.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregarImagen.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/jpg imagen.png"))); // NOI18N
        btnAgregarImagen.setText("Agregar Imagen");
        btnAgregarImagen.setBorderPainted(false);
        btnAgregarImagen.setContentAreaFilled(false);
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23)
                    .addComponent(jLabel26)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbDistrito, javax.swing.GroupLayout.Alignment.LEADING, 0, 131, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtInt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbCalle, javax.swing.GroupLayout.Alignment.LEADING, 0, 131, Short.MAX_VALUE)
                                        .addComponent(txtExt, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtCp)
                    .addComponent(txtTelfi, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtTelmo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(calFenac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOcup)
                    .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 27, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarImagen)
                        .addGap(31, 31, 31)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(calFenac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel21)
                                            .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel22)
                                            .addComponent(cbDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(cbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(txtTelfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel23)
                                            .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(txtTelmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel12)
                                            .addComponent(txtOcup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetroceder)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 13, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNom.setText("");
        txtApepa.setText("");
        txtApema.setText("");
        txtDni.setText("");
        txtCp.setText("");
        txtTelfi.setText("");
        txtTelmo.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        txtOcup.setText("");
        txtExt.setText("");
        txtInt.setText("");
        cbSexo.setSelectedIndex(0);
        cbEstado.setSelectedIndex(0);
        cbCalle.setSelectedIndex(0);
        cbDistrito.setSelectedIndex(0);
        cbDepartamento.setSelectedIndex(0);
        txtNom.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public String Date()
    {
        int dia,mes,año;
        String fecha;
        
        dia=calFenac.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes=calFenac.getCalendar().get(Calendar.MONTH) + 1;
        año=calFenac.getCalendar().get(Calendar.YEAR);
        
        fecha=año+"-"+mes+"-"+dia;
        
        return fecha;
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 
        String nom,appa,apma,dni,tefi,temo,ocup,fenac,sexo,est,calle,distrito,departamento;
        int cp,edad,ext,inte,idcalle=0,iddepart=0,iddistri=0;
        double peso;
        nom=txtNom.getText();
        appa=txtApepa.getText();
        apma=txtApema.getText();
        dni=txtDni.getText();
        tefi=txtTelfi.getText();
        temo=txtTelmo.getText();
        ocup=txtOcup.getText();
        cp=Integer.parseInt(txtCp.getText());
        edad=Integer.parseInt(txtEdad.getText());
        ext=Integer.parseInt(txtExt.getText());
        inte=Integer.parseInt(txtInt.getText());
        peso=Double.parseDouble(txtPeso.getText());
        sexo=cbSexo.getSelectedItem().toString();
        est=cbEstado.getSelectedItem().toString();
        calle=cbCalle.getSelectedItem().toString();
        distrito=cbDistrito.getSelectedItem().toString();
        departamento=cbDepartamento.getSelectedItem().toString();
        fenac=Date();

        
        try
        {
           Statement instruccion= conexion.getConexionBD().createStatement();
  
            ResultSet tabla3=instruccion.executeQuery("select id_departamento from departamento where departamento='" + departamento + "'");
            if(tabla3.next())
                iddepart=tabla3.getInt("id_departamento");
            
            ResultSet tabla2=instruccion.executeQuery("select id_distrito from distrito where distrito='" + distrito + "'");
            if(tabla2.next())
                iddistri=tabla2.getInt("id_distrito");
              
            ResultSet tabla=instruccion.executeQuery("select id_calle from calle where calle='" + calle + "'");
            if(tabla.next())
                idcalle=tabla.getInt("id_calle");
            
            String sql="update pacientes set nombres_paciente=?,apellpat_paciente=?,apellmat_paciente=?,dni_paciente=?," + 
                        "telfijo_paciente=?,telmovil_paciente=?,cp_paciente=?,edad_paciente=?,ocupacion_paciente=?,numext_paciente=?,"
                        +  "numint_paciente=?, peso_paciente=?,fechanac_paciente=?,sexo_paciente=?,estacivil_paciente=?," + 
                        "refid_departamento=?,refid_distrito=?,refid_calle=?,foto_paciente=? where id_paciente=" + idpaciente;
            PreparedStatement inst=conexion.getConexionBD().prepareStatement(sql);
            inst.setString(1,nom);
            inst.setString(2,appa);
            inst.setString(3,apma);
            inst.setString(4,dni);
            inst.setString(5,tefi);
            inst.setString(6,temo);
            inst.setInt(7,cp);
            inst.setInt(8,edad);
            inst.setString(9,ocup);
            inst.setInt(10,ext);
            inst.setInt(11,inte);
            inst.setDouble(12,peso);
            inst.setString(13,fenac);
            inst.setString(14,sexo);
            inst.setString(15,est);
            inst.setInt(16,iddepart);
            inst.setInt(17,iddistri);
            inst.setInt(18,idcalle);
            inst.setBinaryStream(19,file,longitudBytes);
            inst.execute();
            
            JOptionPane.showMessageDialog(null,"==> Se ha actualizado los datos del paciente correctamente <==");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos del paciente han sido mal ingresados <==\n"
                                                 + "    ==> Es necesario llenar todos los campos <== ");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        Paciente Objeto=new Paciente();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed
    
    
    private void cbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartamentoActionPerformed

        String dep=cbDepartamento.getSelectedItem().toString();
        int id=0;
        
        cbDistrito.addItem("Apuntador");
        cbDistrito.setSelectedIndex(0);
        EliminarComboBox();
        cbDistrito.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla4 =instruccion.executeQuery("select id_departamento from departamento where departamento= '" + dep + "'");
            if(tabla4.next())
                id=tabla4.getInt("id_departamento");
            
            ResultSet tabla5=instruccion.executeQuery("select distrito from distrito where refid_departamento=" + id);
 
            while(tabla5.next())
            {
                cbDistrito.addItem(tabla5.getString("distrito"));
            } 
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }       
    }//GEN-LAST:event_cbDepartamentoActionPerformed

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        lblfoto.setIcon(null);
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado=j.showOpenDialog(null);
        if(estado==JFileChooser.APPROVE_OPTION)
        {
            try
            {
                file=new FileInputStream(j.getSelectedFile());
                this.longitudBytes=(int)j.getSelectedFile().length();
                try
                {
                    Image icono=ImageIO.read(j.getSelectedFile()).getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT);
                    lblfoto.setIcon(new ImageIcon(icono));
                    lblfoto.updateUI();
                }
                catch(IOException e)
                {
                    JOptionPane.showMessageDialog(null,"Imagen: " + e);
                }
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    
    public void EliminarComboBox()
    {
        for(int i=0;i<cbDistrito.getItemCount();i++)
        {
            cbDistrito.removeItemAt(i);
            i--;
        }
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
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPaciente(idpaciente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public com.toedter.calendar.JDateChooser calFenac;
    public javax.swing.JComboBox<String> cbCalle;
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbDistrito;
    public javax.swing.JComboBox<String> cbEstado;
    public javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTextField txtApema;
    public javax.swing.JTextField txtApepa;
    public javax.swing.JTextField txtCp;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtExt;
    public javax.swing.JTextField txtInt;
    public javax.swing.JTextField txtNom;
    public javax.swing.JTextField txtOcup;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtTelfi;
    public javax.swing.JTextField txtTelmo;
    // End of variables declaration//GEN-END:variables
}
