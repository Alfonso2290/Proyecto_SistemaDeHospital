package formularios;

import conexionmysql.ConexionBD;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Paciente extends javax.swing.JFrame 
{
    public static int cont;
    ConexionBD conexion;
    
    public Paciente() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Paciente");
        conexion= new ConexionBD();
        cont=1;
        
        MuestraRegistro();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCita = new javax.swing.JButton();
        btnInternamiento = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtNom = new javax.swing.JLabel();
        txtApepa = new javax.swing.JLabel();
        txtApema = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtCalle = new javax.swing.JLabel();
        txtExt = new javax.swing.JLabel();
        txtInt = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JLabel();
        txtCp = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        txtPeso = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        txtEdad = new javax.swing.JLabel();
        txtFenac = new javax.swing.JLabel();
        txtTelfi = new javax.swing.JLabel();
        txtTelmo = new javax.swing.JLabel();
        txtOcup = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        jLabel19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setText("FOTO");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setOpaque(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/izquierdah.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnAvanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/derechah.png"))); // NOI18N
        btnAvanzar.setBorderPainted(false);
        btnAvanzar.setContentAreaFilled(false);
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/agregar4.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 153));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/editar.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 153));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/borrar este si.png"))); // NOI18N
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCita.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCita.setForeground(new java.awt.Color(0, 0, 153));
        btnCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Citas.png"))); // NOI18N
        btnCita.setBorderPainted(false);
        btnCita.setContentAreaFilled(false);
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });

        btnInternamiento.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnInternamiento.setForeground(new java.awt.Color(0, 0, 153));
        btnInternamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/internamiento 4.png"))); // NOI18N
        btnInternamiento.setBorderPainted(false);
        btnInternamiento.setContentAreaFilled(false);
        btnInternamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternamientoActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(0, 0, 153));
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/Historial.png"))); // NOI18N
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setText("Paciente");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("Apellido paterno:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setText("Apellido materno:");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setText("DNI:");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setText("Teléfono fijo:");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel8.setText("Teléfono movil:");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setText("Calle:");

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel10.setText("Distrito:");

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel11.setText("Departamento:");

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel12.setText("Ocupación:");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel13.setText("Fecha de nacimiento:");

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel14.setText("CP:");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel15.setText("Sexo:");

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel16.setText("Peso:");

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel17.setText("Estado civil:");

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel18.setText("Edad:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel21.setText("Búsqueda-ID:");

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

        jLabel20.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 51));
        jLabel20.setText("Editar");

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 51));
        jLabel22.setText("Agregar");

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 0, 51));
        jLabel23.setText("Borrar");

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 51));
        jLabel24.setText(" Citas ");

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 0, 51));
        jLabel25.setText("Internamientos");

        jLabel26.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 51));
        jLabel26.setText("Historial");

        jLabel29.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel29.setText("NºExterno:");

        jLabel31.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel31.setText("NºInterno:");

        txtId.setText("       --Ingrese Dato--");
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNom.setText("       --Ingrese Dato--");
        txtNom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApepa.setText("       --Ingrese Dato--");
        txtApepa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApema.setText("       --Ingrese Dato--");
        txtApema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDni.setText("       --Ingrese Dato--");
        txtDni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCalle.setText("       --Ingrese Dato--");
        txtCalle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtExt.setText("       --Ingrese Dato--");
        txtExt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInt.setText("       --Ingrese Dato--");
        txtInt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDistrito.setText("       --Ingrese Dato--");
        txtDistrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDepartamento.setText("       --Ingrese Dato--");
        txtDepartamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCp.setText("       --Ingrese Dato--");
        txtCp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSexo.setText("       --Ingrese Dato--");
        txtSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPeso.setText("       --Ingrese Dato--");
        txtPeso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEstado.setText("       --Ingrese Dato--");
        txtEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEdad.setText("       --Ingrese Dato--");
        txtEdad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFenac.setText("       --Ingrese Dato--");
        txtFenac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTelfi.setText("       --Ingrese Dato--");
        txtTelfi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTelmo.setText("       --Ingrese Dato--");
        txtTelmo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtOcup.setText("       --Ingrese Dato--");
        txtOcup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("FOTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(106, 106, 106)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOcup, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFenac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelfi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelmo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addGap(113, 113, 113))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(229, 229, 229)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel20)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCita, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnInternamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHistorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel14)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApepa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel17)
                                    .addComponent(txtApema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel18)
                                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFenac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtExt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelfi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel31)
                                    .addComponent(txtInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOcup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInternamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1040, -1));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void MuestraRegistro()
    {
        int contador=0,iddep,iddis,idcalle;
        String dep="",dis="",call="";
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla2=instruccion.executeQuery("select count(*) from pacientes");
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
      
            ResultSet tabla=instruccion.executeQuery("select * from pacientes");

            if(contador>=cont)
            { 
                cont++;
                for(int i=1;i<cont;i++)
                {
                    tabla.next();
                }
            }
            txtId.setText(tabla.getInt("id_paciente") + "");
            txtNom.setText(tabla.getString("nombres_paciente"));
            txtApema.setText(tabla.getString("apellmat_paciente"));
            txtApepa.setText(tabla.getString("apellpat_paciente"));
            txtDni.setText(tabla.getString("dni_paciente"));
            txtTelfi.setText(tabla.getString("telfijo_paciente"));
            txtTelmo.setText(tabla.getString("telmovil_paciente"));
            txtCp.setText(tabla.getInt("cp_paciente") + "");
            txtFenac.setText(tabla.getString("fechanac_paciente"));
            txtEdad.setText(tabla.getInt("edad_paciente") + "");
            txtSexo.setText(tabla.getString("sexo_paciente"));
            txtPeso.setText(tabla.getDouble("peso_paciente") + "");
            txtEstado.setText(tabla.getString("estacivil_paciente"));
            txtOcup.setText(tabla.getString("ocupacion_paciente"));
            txtExt.setText(tabla.getInt("numext_paciente") + "");
            txtInt.setText(tabla.getInt("numint_paciente") + "");
            
            is=tabla.getBinaryStream("foto_paciente");
            BufferedImage bi=ImageIO.read(is);
            foto=new ImageIcon(bi);
            
            Image img=foto.getImage();
            Image newimg=img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
            
            ImageIcon newicon=new ImageIcon(newimg);
            lblfoto.setIcon(newicon);
            
            idcalle=tabla.getInt("refid_calle");
            iddep=tabla.getInt("refid_departamento");
            iddis=tabla.getInt("refid_distrito");
            ResultSet tabla4=instruccion.executeQuery("select calle from calle where id_calle=" + idcalle);
            if(tabla4.next())
                call=tabla4.getString("calle");
                
            ResultSet tabla5=instruccion.executeQuery("select distrito from distrito where id_distrito=" + iddis);
            if(tabla5.next())
                dis=tabla5.getString("distrito");
                
            ResultSet tabla6=instruccion.executeQuery("select departamento from departamento where id_departamento=" + iddep);
            if(tabla6.next())
                dep=tabla6.getString("departamento");
                
            txtCalle.setText(call);
            txtDistrito.setText(dis);
            txtDepartamento.setText(dep);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> No hay más pacientes por mostrar <==");
        }    
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        
        cont-=2;
        if(cont==0)
        {
            Tablas Objeto=new Tablas();
            Objeto.setVisible(true);
            this.dispose();
        }
        else
        {
            MuestraRegistro();
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed

        int contador=0,cont2=0,idpaciente,iddep,iddis,idcalle;
        String dep="",dis="",call="";
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            idpaciente=Integer.parseInt(txtBusqueda.getText());
            
            ResultSet tabla3=instruccion.executeQuery("select id_paciente from pacientes");
            while(tabla3.next())
            {
                if(tabla3.getInt(1)<=idpaciente)
                    cont2++;
            }
            
            ResultSet tabla2=instruccion.executeQuery("select count(*) from pacientes where id_paciente=" + idpaciente);
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
            ResultSet tabla=instruccion.executeQuery("select * from pacientes where id_paciente=" + idpaciente);
            tabla.next();
            if(contador>0)
            {
                JOptionPane.showMessageDialog(null,"==> El Paciente ha sido encontrado en la Base de Datos <==");
                cont=cont2 + 1;
                txtId.setText(tabla.getInt("id_paciente") + "");
                txtNom.setText(tabla.getString("nombres_paciente"));
                txtApema.setText(tabla.getString("apellmat_paciente"));
                txtApepa.setText(tabla.getString("apellpat_paciente"));
                txtDni.setText(tabla.getString("dni_paciente"));
                txtTelfi.setText(tabla.getString("telfijo_paciente"));
                txtTelmo.setText(tabla.getString("telmovil_paciente"));
                txtCp.setText(tabla.getInt("cp_paciente") + "");
                txtFenac.setText(tabla.getString("fechanac_paciente"));
                txtEdad.setText(tabla.getInt("edad_paciente") + "");
                txtSexo.setText(tabla.getString("sexo_paciente"));
                txtPeso.setText(tabla.getDouble("peso_paciente") + "");
                txtEstado.setText(tabla.getString("estacivil_paciente"));
                txtOcup.setText(tabla.getString("ocupacion_paciente"));
                txtExt.setText(tabla.getInt("numext_paciente") + "");
                txtInt.setText(tabla.getInt("numint_paciente") + "");
                
                is=tabla.getBinaryStream("foto_paciente");
                BufferedImage bi=ImageIO.read(is);
                foto=new ImageIcon(bi);
            
                Image img=foto.getImage();
                Image newimg=img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
            
                ImageIcon newicon=new ImageIcon(newimg);
                lblfoto.setIcon(newicon);
                
                idcalle=tabla.getInt("refid_calle");
                iddep=tabla.getInt("refid_departamento");
                iddis=tabla.getInt("refid_distrito");
                ResultSet tabla4=instruccion.executeQuery("select calle from calle where id_calle=" + idcalle);
                if(tabla4.next())
                    call=tabla4.getString("calle");
                
                ResultSet tabla5=instruccion.executeQuery("select distrito from distrito where id_distrito=" + iddis);
                if(tabla5.next())
                    dis=tabla5.getString("distrito");
                
                ResultSet tabla6=instruccion.executeQuery("select departamento from departamento where id_departamento=" + iddep);
                if(tabla6.next())
                    dep=tabla6.getString("departamento");
                
                txtCalle.setText(call);
                txtDistrito.setText(dis);
                txtDepartamento.setText(dep);
                txtBusqueda.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"==> El ID buscado no existe en la Base de Datos <==");
                txtBusqueda.setText("");
                txtBusqueda.requestFocus();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
        catch(IOException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed

        MuestraRegistro();
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        AgregarPaciente Objeto=new AgregarPaciente();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int idpaciente=Integer.parseInt(txtId.getText());
        
        EditarPaciente Objeto=new EditarPaciente(idpaciente);
        Objeto.setVisible(true);
        this.dispose();

        Objeto.txtNom.setText(txtNom.getText());
        Objeto.txtApepa.setText(txtApepa.getText());
        Objeto.txtApema.setText(txtApema.getText());
        Objeto.txtDni.setText(txtDni.getText());
        Objeto.txtInt.setText(txtInt.getText());
        Objeto.txtExt.setText(txtExt.getText());
        Objeto.txtCp.setText(txtCp.getText());
        Objeto.txtPeso.setText(txtPeso.getText());
        Objeto.txtEdad.setText(txtEdad.getText());
        Objeto.txtTelfi.setText(txtTelfi.getText());
        Objeto.txtTelmo.setText(txtTelmo.getText());
        Objeto.txtOcup.setText(txtOcup.getText());
    }//GEN-LAST:event_btnEditarActionPerformed
  
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        int idpaciente,contador=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            idpaciente=Integer.parseInt(txtId.getText());
            
            instruccion.executeUpdate("delete from pacientes where id_paciente=" + idpaciente);
            JOptionPane.showMessageDialog(null,"==> Se ha eliminado los datos del paciente correctamente <==");
            
            ResultSet tabla2=instruccion.executeQuery("select count(*) from pacientes");
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");                                    
            
            if(contador>0)
            {
                if(contador + 2==cont)
                {
                    cont-=2;
                    MuestraRegistro();
                }
                else
                {
                    cont--;
                    MuestraRegistro();
                }
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
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed

        int cont=0;
        int idpaciente;
        idpaciente=Integer.parseInt(txtId.getText());
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from cita_medica where refid_paciente= " + idpaciente);
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                MostrarCitasMédicas Objeto=new MostrarCitasMédicas(idpaciente);
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                MostrarCitasMédicasBDVacia Objeto1=new MostrarCitasMédicasBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnCitaActionPerformed

    private void btnInternamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternamientoActionPerformed
        
        int cont=0;
        int idpaciente;
        idpaciente=Integer.parseInt(txtId.getText());
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from internamientos where refid_paciente= " + idpaciente);
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                MostrarInternamiento Objeto=new MostrarInternamiento(idpaciente);
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                MostrarInternamientoBDVacia Objeto1=new MostrarInternamientoBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnInternamientoActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        
        int cont=0;
        int idpaciente;
        idpaciente=Integer.parseInt(txtId.getText());
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from historial_clinico where refid_paciente= " + idpaciente);
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                MostrarHistorialClínico Objeto=new MostrarHistorialClínico(idpaciente);
                Objeto.setVisible(true);
                this.dispose();

            }
            else
            {
                MostrarHistorialClínicoBDVacia Objeto1=new MostrarHistorialClínicoBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInternamiento;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel txtApema;
    private javax.swing.JLabel txtApepa;
    public javax.swing.JTextField txtBusqueda;
    private javax.swing.JLabel txtCalle;
    private javax.swing.JLabel txtCp;
    private javax.swing.JLabel txtDepartamento;
    private javax.swing.JLabel txtDistrito;
    private javax.swing.JLabel txtDni;
    private javax.swing.JLabel txtEdad;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtExt;
    private javax.swing.JLabel txtFenac;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtInt;
    private javax.swing.JLabel txtNom;
    private javax.swing.JLabel txtOcup;
    private javax.swing.JLabel txtPeso;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtTelfi;
    private javax.swing.JLabel txtTelmo;
    // End of variables declaration//GEN-END:variables
}
