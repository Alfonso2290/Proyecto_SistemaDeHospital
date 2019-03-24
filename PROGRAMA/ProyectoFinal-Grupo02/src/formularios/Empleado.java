
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

public class Empleado extends javax.swing.JFrame 
{   
    public static int cont;
    ConexionBD conexion;
    
    public Empleado() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Empleado");
        conexion= new ConexionBD();
        cont=1;
        setLayout(null);
        
        MuestraRegistro();
    }

    
    public void MuestraRegistro()
    {
        int contador=0,iddep,iddis,idcalle;
        String dep="",dis="",call="";
        ImageIcon foto;
        InputStream is;
        
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla2=instruccion.executeQuery("select count(*) from empleados");
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
      
            ResultSet tabla=instruccion.executeQuery("select * from empleados");

            if(contador>=cont)
            { 
                cont++;
                for(int i=1;i<cont;i++)
                {
                    tabla.next();
                }
            }
            txtId.setText(tabla.getInt("id_empleado") + "");
            txtNom.setText(tabla.getString("nombres_empleado"));
            txtApepa.setText(tabla.getString("apellpat_empleado"));
            txtApema.setText(tabla.getString("apellmat_empleado"));
            txtDni.setText(tabla.getString("dni_empleado"));
            txtTelfi.setText(tabla.getString("telfijo_empleado"));
            txtTelmo.setText(tabla.getString("telmovil_empleado"));
            txtSexo.setText(tabla.getString("sexo_empleado"));
            txtEmail.setText(tabla.getString("email_empleado"));
            txtCargo.setText(tabla.getString("cargo_empleado"));
            txtFereg.setText(tabla.getString("fechareg_empleado"));
            txtFemod.setText(tabla.getString("fechamodi_empleado"));
            txtExt.setText(tabla.getInt("numext_empleado") + "");
            txtInt.setText(tabla.getInt("numint_empleado") + "");
            
            is=tabla.getBinaryStream("foto_empleado");
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
            JOptionPane.showMessageDialog(null,"==> No hay más empleados por mostrar <==");
        }   
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNom = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtApepa = new javax.swing.JLabel();
        txtApema = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtTelfi = new javax.swing.JLabel();
        txtTelmo = new javax.swing.JLabel();
        txtFemod = new javax.swing.JLabel();
        txtFereg = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtCalle = new javax.swing.JLabel();
        txtInt = new javax.swing.JLabel();
        txtExt = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));
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

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Empleado");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("Apellido paterno:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Apellido materno:");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("DNI:");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setText("Teléfono fijo:");

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel10.setText("Teléfono movil:");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("Departamento:");

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel14.setText("Cargo:");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel15.setText("Sexo:");

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel16.setText("Email:");

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel17.setText("Calle:");

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel18.setText("Distrito:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel21.setText("Fecha de Registro:");

        jLabel22.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel22.setText("Fecha de Modificación:");

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setText("Búsqueda-ID:");

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

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Agregar");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Editar");

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Borrar");

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setText("NºExterno:");

        jLabel25.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel25.setText("NºInterno:");

        txtNom.setText("       --Ingrese Dato--");
        txtNom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtId.setText("       --Ingrese Dato--");
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApepa.setText("       --Ingrese Dato--");
        txtApepa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApema.setText("       --Ingrese Dato--");
        txtApema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDni.setText("       --Ingrese Dato--");
        txtDni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTelfi.setText("       --Ingrese Dato--");
        txtTelfi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTelmo.setText("       --Ingrese Dato--");
        txtTelmo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFemod.setText("       --Ingrese Dato--");
        txtFemod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFereg.setText("       --Ingrese Dato--");
        txtFereg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCargo.setText("       --Ingrese Dato--");
        txtCargo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSexo.setText("       --Ingrese Dato--");
        txtSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEmail.setText("       --Ingrese Dato--");
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCalle.setText("       --Ingrese Dato--");
        txtCalle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInt.setText("       --Ingrese Dato--");
        txtInt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtExt.setText("       --Ingrese Dato--");
        txtExt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDistrito.setText("       --Ingrese Dato--");
        txtDistrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDepartamento.setText("       --Ingrese Dato--");
        txtDepartamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelfi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel21))
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFereg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtFemod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelmo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(78, 78, 78)))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel8)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel11)))
                        .addGap(189, 189, 189)
                        .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel14)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtApepa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtApema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTelfi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtExt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtTelmo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtFemod, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtFereg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel11))
                            .addComponent(jLabel8))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        int contador=0,cont2=0,idempleado,iddep,iddis,idcalle;
        String dep="",dis="",call="";
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            idempleado=Integer.parseInt(txtBusqueda.getText());
            
            ResultSet tabla3=instruccion.executeQuery("select id_empleado from empleados");
            while(tabla3.next())
            {
                if(tabla3.getInt(1)<=idempleado)
                    cont2++;
            }
            
            ResultSet tabla2=instruccion.executeQuery("select count(*) from empleados where id_empleado=" + idempleado);
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
            ResultSet tabla=instruccion.executeQuery("select * from empleados where id_empleado=" + idempleado);
            tabla.next();
            if(contador>0)
            {
                JOptionPane.showMessageDialog(null,"==> El Empleado ha sido encontrado en la Base de Datos <==");
                cont=cont2 + 1;
                txtId.setText(tabla.getInt("id_empleado") + "");
                txtNom.setText(tabla.getString("nombres_empleado"));
                txtApepa.setText(tabla.getString("apellpat_empleado"));
                txtApema.setText(tabla.getString("apellmat_empleado"));
                txtDni.setText(tabla.getString("dni_empleado"));
                txtTelfi.setText(tabla.getString("telfijo_empleado"));
                txtTelmo.setText(tabla.getString("telmovil_empleado"));
                txtSexo.setText(tabla.getString("sexo_empleado"));
                txtEmail.setText(tabla.getString("email_empleado"));
                txtCargo.setText(tabla.getString("cargo_empleado"));
                txtFereg.setText(tabla.getString("fechareg_empleado"));
                txtFemod.setText(tabla.getString("fechamodi_empleado"));
                txtExt.setText(tabla.getInt("numext_empleado") + "");
                txtInt.setText(tabla.getInt("numint_empleado") + "");
                
                is=tabla.getBinaryStream("foto_empleado");
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

        AgregarEmpleado Objeto=new AgregarEmpleado();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        int idempleado=Integer.parseInt(txtId.getText());
        
        EditarEmpleado Objeto=new EditarEmpleado(idempleado);
        Objeto.setVisible(true);
        this.dispose();

        Objeto.txtNom.setText(txtNom.getText());
        Objeto.txtApepa.setText(txtApepa.getText());
        Objeto.txtApema.setText(txtApema.getText());
        Objeto.txtDni.setText(txtDni.getText());
        Objeto.txtInt.setText(txtInt.getText());
        Objeto.txtExt.setText(txtExt.getText());
        Objeto.txtEmail.setText(txtEmail.getText());
        Objeto.txtTelfi.setText(txtTelfi.getText());
        Objeto.txtTelmo.setText(txtTelmo.getText());
        Objeto.txtCargo.setText(txtCargo.getText());
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int idempleado,contador=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            idempleado=Integer.parseInt(txtId.getText());
            
            instruccion.executeUpdate("delete from empleados where id_empleado=" + idempleado);
            JOptionPane.showMessageDialog(null,"==> Se ha eliminado los datos del empleado correctamente <==");
            
            ResultSet tabla2=instruccion.executeQuery("select count(*) from empleados");
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
                EmpleadoBDVacia Objeto1=new EmpleadoBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    

    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRetroceder;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel txtApema;
    private javax.swing.JLabel txtApepa;
    public javax.swing.JTextField txtBusqueda;
    private javax.swing.JLabel txtCalle;
    private javax.swing.JLabel txtCargo;
    private javax.swing.JLabel txtDepartamento;
    private javax.swing.JLabel txtDistrito;
    private javax.swing.JLabel txtDni;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtExt;
    private javax.swing.JLabel txtFemod;
    private javax.swing.JLabel txtFereg;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtInt;
    private javax.swing.JLabel txtNom;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtTelfi;
    private javax.swing.JLabel txtTelmo;
    // End of variables declaration//GEN-END:variables
}
