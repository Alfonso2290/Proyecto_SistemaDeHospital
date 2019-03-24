
package formularios;

import JTableColor.Render;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Médico extends javax.swing.JFrame 
{
    public static int cont;
    public static DefaultTableModel M;
    ConexionBD conexion;
    Render r= new Render();
    
    public Médico() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Médico");
        conexion= new ConexionBD();
        cont=1;
        
        this.getContentPane().setBackground(Color.lightGray);
        tblDiasLaborales.setDefaultRenderer(Object.class,r);
        M=new DefaultTableModel();
        M.addColumn("Días laborales");
        this.tblDiasLaborales.setModel(M);
        
        MuestraRegistro();
    }
    
    public void MuestraRegistro()
    {
        int contador=0,contador2=0,iddep,iddis,idcalle,idesp,idmed;
        String dep="",dis="",call="",esp="";
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla2=instruccion.executeQuery("select count(*) from medicos");
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
      
            ResultSet tabla=instruccion.executeQuery("select * from medicos");

            if(contador>=cont)
            { 
                cont++;
                for(int i=1;i<cont;i++)
                {
                    tabla.next();
                }
            }
            txtId.setText(tabla.getInt("id_medico") + "");
            txtNom.setText(tabla.getString("nombres_medico"));
            txtApema.setText(tabla.getString("apellmat_medico"));
            txtApepa.setText(tabla.getString("apellpat_medico"));
            txtDni.setText(tabla.getString("dni_medico"));
            txtTelfi.setText(tabla.getString("telfijo_medico"));
            txtTelmo.setText(tabla.getString("telmovil_medico"));
            txtSexo.setText(tabla.getString("sexo_medico"));
            txtExt.setText(tabla.getInt("numext_medico") + "");
            txtInt.setText(tabla.getInt("numint_medico") + "");
            
            is=tabla.getBinaryStream("foto_medico");
            BufferedImage bi=ImageIO.read(is);
            foto=new ImageIcon(bi);
            
            Image img=foto.getImage();
            Image newimg=img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
            
            ImageIcon newicon=new ImageIcon(newimg);
            lblfoto.setIcon(newicon);
            
            idcalle=tabla.getInt("refid_calle");
            iddep=tabla.getInt("refid_departamento");
            iddis=tabla.getInt("refid_distrito");
            idesp=tabla.getInt("refid_especialidad");
            idmed=tabla.getInt("id_medico");
            
            ResultSet tabla4=instruccion.executeQuery("select calle from calle where id_calle=" + idcalle);
            if(tabla4.next())
                call=tabla4.getString("calle");
                
            ResultSet tabla5=instruccion.executeQuery("select distrito from distrito where id_distrito=" + iddis);
            if(tabla5.next())
                dis=tabla5.getString("distrito");
                
            ResultSet tabla6=instruccion.executeQuery("select departamento from departamento where id_departamento=" + iddep);
            if(tabla6.next())
                dep=tabla6.getString("departamento");
            
            ResultSet tabla7=instruccion.executeQuery("select nombre_especialidad from especialidades where id_especialidad=" + idesp);
            if(tabla7.next())
                esp=tabla7.getString("nombre_especialidad");
                
            txtCalle.setText(call);
            txtDistrito.setText(dis);
            txtDepartamento.setText(dep);
            txtEsp.setText(esp);
            
            M.addRow(new Object[]{"Apuntador"});
            LimpiarTabla();
            
            ResultSet tabla1=instruccion.executeQuery("select count(*) from horario_medico where refid_medico=" + idmed);
            if(tabla1.next())
                contador2=tabla1.getInt("count(*)");
            
            ResultSet tabla3=instruccion.executeQuery("select dia_laboral from horario_medico where refid_medico=" + idmed + " order by field (dia_laboral ,'lunes','martes','miercoles','jueves','viernes','sabado')");
            if(contador2>0)
            {
                while(tabla3.next())
                {
                    M.addRow(new Object[]{tabla3.getString("dia_laboral")});
                }
            }
            else
            {
                M.addRow(new Object[]{"No hay registro"});
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> No hay más medicos por mostrar <==");
        }    
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    public void LimpiarTabla()
    {
        for(int i=0;i<tblDiasLaborales.getRowCount();i++)
        {
            M.removeRow(i);
            i--;
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
        btnHorario = new javax.swing.JButton();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblDiasLaborales = new javax.swing.JTable();
        txtId = new javax.swing.JLabel();
        txtNom = new javax.swing.JLabel();
        txtApepa = new javax.swing.JLabel();
        txtApema = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtTelfi = new javax.swing.JLabel();
        txtTelmo = new javax.swing.JLabel();
        txtEsp = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        txtCalle = new javax.swing.JLabel();
        txtExt = new javax.swing.JLabel();
        txtInt = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

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

        btnHorario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnHorario.setForeground(new java.awt.Color(0, 0, 153));
        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/horario.png"))); // NOI18N
        btnHorario.setContentAreaFilled(false);
        btnHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Médico");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Apellido paterno:");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Apellido materno:");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("DNI:");

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Teléfono fijo:");

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Teléfono movil:");

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Departamento:");

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Especialidad:");

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Sexo:");

        jLabel17.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Calle:");

        jLabel18.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Distrito:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 153));
        jLabel20.setText("Días laborales:");

        jLabel21.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
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

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Agregar");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Editar");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Borrar");

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/medico.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("NºExterno:");

        jLabel25.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 153));
        jLabel25.setText("NºInterno:");

        tblDiasLaborales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tblDiasLaborales);

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

        txtTelfi.setText("       --Ingrese Dato--");
        txtTelfi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTelmo.setText("       --Ingrese Dato--");
        txtTelmo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtEsp.setText("       --Ingrese Dato--");
        txtEsp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSexo.setText("       --Ingrese Dato--");
        txtSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("FOTO");

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Horario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelfi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelmo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))
                                .addGap(0, 16, Short.MAX_VALUE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDistrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(78, 78, 78)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnHorario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel11)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel16)))
                        .addGap(105, 105, 105)
                        .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21))
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel14)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel17)
                                    .addComponent(txtApepa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel24)
                                    .addComponent(txtApema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtExt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel25)
                                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel18)
                                    .addComponent(txtTelfi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(txtTelmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addGap(7, 7, 7))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

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
        int contador=0,contador2=0,cont2=0,iddep,iddis,idcalle,idesp,idmed;
        String dep="",dis="",call="",esp="";
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            idmed=Integer.parseInt(txtBusqueda.getText());
            
            ResultSet tabla3=instruccion.executeQuery("select id_medico from medicos");
            while(tabla3.next())
            {
                if(tabla3.getInt(1)<=idmed)
                    cont2++;
            }
            
            ResultSet tabla2=instruccion.executeQuery("select count(*) from medicos where id_medico=" + idmed);
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
            ResultSet tabla=instruccion.executeQuery("select * from medicos where id_medico=" + idmed);
            tabla.next();
            if(contador>0)
            {
                JOptionPane.showMessageDialog(null,"==> El Médico ha sido encontrado en la Base de Datos <==");
                cont=cont2 + 1;
                txtId.setText(tabla.getInt("id_medico") + "");
                txtNom.setText(tabla.getString("nombres_medico"));
                txtApema.setText(tabla.getString("apellmat_medico"));
                txtApepa.setText(tabla.getString("apellpat_medico"));
                txtDni.setText(tabla.getString("dni_medico"));
                txtTelfi.setText(tabla.getString("telfijo_medico"));
                txtTelmo.setText(tabla.getString("telmovil_medico"));
                txtSexo.setText(tabla.getString("sexo_medico"));
                txtExt.setText(tabla.getInt("numext_medico") + "");
                txtInt.setText(tabla.getInt("numint_medico") + "");
                
                is=tabla.getBinaryStream("foto_medico");
                BufferedImage bi=ImageIO.read(is);
                foto=new ImageIcon(bi);
            
                Image img=foto.getImage();
                Image newimg=img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
            
                ImageIcon newicon=new ImageIcon(newimg);
                lblfoto.setIcon(newicon);
                
                idcalle=tabla.getInt("refid_calle");
                iddep=tabla.getInt("refid_departamento");
                iddis=tabla.getInt("refid_distrito");
                idesp=tabla.getInt("refid_especialidad");
                idmed=tabla.getInt("id_medico");
            
                ResultSet tabla4=instruccion.executeQuery("select calle from calle where id_calle=" + idcalle);
                if(tabla4.next())
                    call=tabla4.getString("calle");
                
                ResultSet tabla5=instruccion.executeQuery("select distrito from distrito where id_distrito=" + iddis);
                if(tabla5.next())
                    dis=tabla5.getString("distrito");
                
                ResultSet tabla6=instruccion.executeQuery("select departamento from departamento where id_departamento=" + iddep);
                if(tabla6.next())
                    dep=tabla6.getString("departamento");
            
                ResultSet tabla7=instruccion.executeQuery("select nombre_especialidad from especialidades where id_especialidad=" + idesp);
                if(tabla7.next())
                    esp=tabla7.getString("nombre_especialidad");
                
                txtCalle.setText(call);
                txtDistrito.setText(dis);
                txtDepartamento.setText(dep);
                txtEsp.setText(esp);
            
                M.addRow(new Object[]{"Apuntador"});
                LimpiarTabla();
            
                ResultSet tabla1=instruccion.executeQuery("select count(*) from horario_medico where refid_medico=" + idmed);
                if(tabla1.next())
                    contador2=tabla1.getInt("count(*)");
            
                ResultSet tabla8=instruccion.executeQuery("select dia_laboral from horario_medico where refid_medico=" + idmed);
                if(contador2>0)
                {
                    while(tabla8.next())
                    {
                        M.addRow(new Object[]{tabla8.getString("dia_laboral")});
                    }
                }
                else
                {
                    M.addRow(new Object[]{"No hay registro"});
                }
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

        AgregarMédico Objeto=new AgregarMédico();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int idmedico=Integer.parseInt(txtId.getText());
        
        EditarMédico Objeto=new EditarMédico(idmedico);
        Objeto.setVisible(true);
        this.dispose();

        Objeto.txtNom.setText(txtNom.getText());
        Objeto.txtApepa.setText(txtApepa.getText());
        Objeto.txtApema.setText(txtApema.getText());
        Objeto.txtDni.setText(txtDni.getText());
        Objeto.txtInt.setText(txtInt.getText());
        Objeto.txtExt.setText(txtExt.getText());
        Objeto.txtTelfi.setText(txtTelfi.getText());
        Objeto.txtTelmo.setText(txtTelmo.getText());
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int idmedico,contador=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            idmedico=Integer.parseInt(txtId.getText());
            
            instruccion.executeUpdate("delete from medicos where id_medico=" + idmedico);
            JOptionPane.showMessageDialog(null,"==> Se ha eliminado los datos del medico correctamente <==");
            
            ResultSet tabla2=instruccion.executeQuery("select count(*) from medicos");
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
                MédicoBDVacia Objeto1=new MédicoBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        
        int cont=0,idmedico=Integer.parseInt(txtId.getText());
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from horario_medico where refid_medico=" + idmedico);
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                MostrarHorarios Objeto=new MostrarHorarios(idmedico);
                Objeto.setVisible(true);
                this.dispose();
            }
            else
            {
                MostrarHorariosBDVacia Objeto1=new MostrarHorariosBDVacia();
                Objeto1.setVisible(true);
                this.dispose();
            }
                
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }      
    }//GEN-LAST:event_btnHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Médico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHorario;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTable tblDiasLaborales;
    private javax.swing.JLabel txtApema;
    private javax.swing.JLabel txtApepa;
    public javax.swing.JTextField txtBusqueda;
    private javax.swing.JLabel txtCalle;
    private javax.swing.JLabel txtDepartamento;
    private javax.swing.JLabel txtDistrito;
    private javax.swing.JLabel txtDni;
    private javax.swing.JLabel txtEsp;
    private javax.swing.JLabel txtExt;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtInt;
    private javax.swing.JLabel txtNom;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtTelfi;
    private javax.swing.JLabel txtTelmo;
    // End of variables declaration//GEN-END:variables
}
