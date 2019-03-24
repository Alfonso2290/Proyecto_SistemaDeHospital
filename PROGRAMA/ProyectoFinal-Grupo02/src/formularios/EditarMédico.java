package formularios;

import conexionmysql.ConexionBD;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class EditarMédico extends javax.swing.JFrame {

    public static int idmedico;
    FileInputStream file;
    public static int longitudBytes;
    ConexionBD conexion;
    
    public EditarMédico(int idmedico) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Edición de información del Médico");
        this.idmedico=idmedico;
        conexion= new ConexionBD();
        txtNom.requestFocus();
        Conexion();
    }
    
    public void Conexion()
    {
        cbDepartamento.addItem("--Seleccionar--");
        cbCalle.addItem("--Seleccionar--");
        cbEspecialidad.addItem("--Seleccionar--");
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
            ResultSet tabla2=instruccion.executeQuery("select * from especialidades");
            while(tabla2.next())
            {
                cbEspecialidad.addItem(tabla2.getString("nombre_especialidad"));
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

        jLabel61 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApepa = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelfi = new javax.swing.JTextField();
        txtTelmo = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        cbSexo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbDistrito = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbCalle = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtInt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtExt = new javax.swing.JTextField();
        txtApema = new javax.swing.JTextField();
        cbEspecialidad = new javax.swing.JComboBox<>();
        lblfoto = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel61.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 153));
        jLabel61.setText("Cancelar");

        jLabel60.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 153));
        jLabel60.setText("Guardar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.setOpaque(false);

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/atras.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel45.setText("Edición de información del Médico");

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel47.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel47.setText("Nombres:");

        jLabel48.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel48.setText("Apellido paterno:");

        jLabel49.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel49.setText("Apellido materno:");

        jLabel50.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel50.setText("DNI:");

        jLabel51.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel51.setText("Teléfono fijo:");

        jLabel52.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel52.setText("Teléfono movil:");

        jLabel54.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel54.setText("Especialidad:");

        jLabel55.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel55.setText("Sexo:");

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbSexo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSexo.setForeground(new java.awt.Color(0, 0, 153));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Masculino", "Femenino" }));

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

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel17.setText("Departamento:");

        cbDepartamento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbDepartamento.setForeground(new java.awt.Color(0, 0, 153));
        cbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel18.setText("Distrito:");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("Calle:");

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setText("NºInterno:");

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setText("NºExterno:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator10)
            .addComponent(jSeparator11)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel48))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelfi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelmo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(89, 89, 89)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAgregarImagen)
                        .addGap(31, 31, 31)))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel54)
                                            .addComponent(jLabel47)
                                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel48)
                                            .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel49)
                                            .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18)
                                            .addComponent(cbDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel50)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(cbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel51)
                                            .addComponent(txtTelfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23)
                                            .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel52)
                                            .addComponent(txtTelmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22)
                                            .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel55)
                                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 950, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        Médico Objeto=new Médico();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nom,appa,apma,dni,tefi,temo,sexo,esp,calle,distrito,departamento;
        int ext,inte,idcalle=0,iddepart=0,iddistri=0,idesp=0;
        nom=txtNom.getText();
        appa=txtApepa.getText();
        apma=txtApema.getText();
        dni=txtDni.getText();
        tefi=txtTelfi.getText();
        temo=txtTelmo.getText();
        ext=Integer.parseInt(txtExt.getText());
        inte=Integer.parseInt(txtInt.getText());
        sexo=cbSexo.getSelectedItem().toString();
        esp=cbEspecialidad.getSelectedItem().toString();
        calle=cbCalle.getSelectedItem().toString();
        distrito=cbDistrito.getSelectedItem().toString();
        departamento=cbDepartamento.getSelectedItem().toString();

        
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
            
            ResultSet tabla4=instruccion.executeQuery("select id_especialidad from especialidades where nombre_especialidad='" + esp + "'");
            if(tabla4.next())
                idesp=tabla4.getInt("id_especialidad");
            
            String sql="update medicos set nombres_medico=?,apellpat_medico=?,apellmat_medico=?,dni_medico=?," + 
                        "telfijo_medico=?,telmovil_medico=?,numext_medico=?,numint_medico=?,sexo_medico=?,refid_departamento=?,"
                        +  "refid_distrito=?, refid_calle=?,refid_especialidad=?,foto_medico=? where id_medico=" + idmedico;
            PreparedStatement inst=conexion.getConexionBD().prepareStatement(sql);
            inst.setString(1,nom);
            inst.setString(2,appa);
            inst.setString(3,apma);
            inst.setString(4,dni);
            inst.setString(5,tefi);
            inst.setString(6,temo);
            inst.setInt(7,ext);
            inst.setInt(8,inte);
            inst.setString(9,sexo);
            inst.setInt(10,iddepart);
            inst.setInt(11,iddistri);
            inst.setInt(12,idcalle);
            inst.setInt(13,idesp);
            inst.setBinaryStream(14,file,longitudBytes);
            inst.execute();
            
            JOptionPane.showMessageDialog(null,"==> Se ha actualizado los datos del medico correctamente <==");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos del medico han sido mal ingresados <==\n"
                                                 + "    ==> Es necesario llenar todos los campos <== ");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNom.setText("");
        txtApepa.setText("");
        txtApema.setText("");
        txtDni.setText("");
        txtTelfi.setText("");
        txtTelmo.setText("");
        txtExt.setText("");
        txtInt.setText("");
        cbSexo.setSelectedIndex(0);
        cbEspecialidad.setSelectedIndex(0);
        cbCalle.setSelectedIndex(0);
        cbDistrito.setSelectedIndex(0);
        cbDepartamento.setSelectedIndex(0);
        txtNom.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void EliminarComboBox()
    {
        for(int i=0;i<cbDistrito.getItemCount();i++)
        {
            cbDistrito.removeItemAt(i);
            i--;
        }
    }
    
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
            java.util.logging.Logger.getLogger(EditarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarMédico(idmedico).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public javax.swing.JComboBox<String> cbCalle;
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbDistrito;
    public javax.swing.JComboBox<String> cbEspecialidad;
    public javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTextField txtApema;
    public javax.swing.JTextField txtApepa;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtExt;
    public javax.swing.JTextField txtInt;
    public javax.swing.JTextField txtNom;
    public javax.swing.JTextField txtTelfi;
    public javax.swing.JTextField txtTelmo;
    // End of variables declaration//GEN-END:variables
}
