package formularios;

import JTableColor.Render;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class MostrarHistorialClínico extends javax.swing.JFrame 
{
    public static int cont;
    public static int idpaciente;
    public static DefaultTableModel M,N;
    ConexionBD conexion;
    Render r= new Render();
    
    public MostrarHistorialClínico(int idpaciente) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Historial Clínico del Paciente");
        conexion= new ConexionBD();
        tblAlergias.setDefaultRenderer(Object.class,r);
        tblAntecedentes.setDefaultRenderer(Object.class,r);
        
        cont=1;
        this.idpaciente=idpaciente;
        
        
        this.getContentPane().setBackground(Color.lightGray);
        
        M=new DefaultTableModel();
        M.addColumn("Alergias");
        this.tblAlergias.setModel(M);
        
        N=new DefaultTableModel();
        N.addColumn("Ant. Enfermedades");
        this.tblAntecedentes.setModel(N);
        
        MuestraRegistro();
        
    }
    
    public void MuestraRegistro()
    {
        int contador=0,contador2=0,contador3=0,numhist,idmed;
        String med="",pac="";
        ImageIcon foto;
        InputStream is;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla2=instruccion.executeQuery("select count(*) from historial_clinico where refid_paciente=" + idpaciente);
            if(tabla2.next())
                contador=tabla2.getInt("count(*)");
      
            ResultSet tabla=instruccion.executeQuery("select * from historial_clinico where refid_paciente=" + idpaciente);

            if(contador>=cont)
            { 
                cont++;
                for(int i=1;i<cont;i++)
                {
                    tabla.next();
                }
            }
            txtNumhis.setText(tabla.getInt("num_historial") + "");
            txtNumss.setText(tabla.getInt("numsegurosocial") +"");
            txtFecrea.setText(tabla.getString("fecreacion_historial"));
            txtFeact.setText(tabla.getString("fecultctual_historial"));
            txtTipoSan.setText(tabla.getString("tiposangre"));
            atVacunacion.setText(tabla.getString("vacunas"));
            txtUltdia.setText(tabla.getString("ultimodiag"));
            numhist=tabla.getInt("num_historial");
            idmed=tabla.getInt("refid_medico");
            
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
            
            ResultSet tabla6=instruccion.executeQuery("select nombres_medico,apellpat_medico from medicos where id_medico=" + idmed);
            if(tabla6.next())
                med=tabla6.getString("nombres_medico") + " " + tabla6.getString("apellpat_medico");
            
            ResultSet tabla5=instruccion.executeQuery("select nombres_paciente,apellpat_paciente from pacientes where id_paciente=" + idpaciente);
            if(tabla5.next())
                pac=tabla5.getString("nombres_paciente") + " " + tabla5.getString("apellpat_paciente");
           
            txtMedico.setText(med);
            txtPaciente.setText(pac);
            
            M.addRow(new Object[]{"Apuntador"});
            N.addRow(new Object[]{"Apuntador"});
            LimpiarTablaAlergias();
            LimpiarTablaAntecedentes();
            
            ResultSet tabla4=instruccion.executeQuery("select count(*) from alergias where refnum_historial=" + numhist);
            if(tabla4.next())
                contador2=tabla4.getInt("count(*)");
            
            ResultSet tabla3=instruccion.executeQuery("select alergia from alergias where refnum_historial=" + numhist);
            if(contador2>0)
            {
                while(tabla3.next())
                {
                    M.addRow(new Object[]{tabla3.getString("alergia")});
                }
            }
            else
            {
                M.addRow(new Object[]{"No presenta alergias"});
            }
            ResultSet tabla7=instruccion.executeQuery("select count(*) from antecentes_enfermedades where refnum_historial=" + numhist);
            if(tabla7.next())
                contador3=tabla7.getInt("count(*)");
            
            ResultSet tabla8=instruccion.executeQuery("select enfermedad from antecentes_enfermedades where refnum_historial=" + numhist);
            if(contador3>0)
            {
                while(tabla8.next())
                {
                    N.addRow(new Object[] {tabla8.getString("enfermedad")});
                }
            }
            else
            {
                N.addRow(new Object[] {"No presenta antecedentes"});
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> No hay más Historiales clinicos del paciente por mostrar <==");
        }   
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    
    public void LimpiarTablaAlergias()
    {
        for(int i=0;i<tblAlergias.getRowCount();i++)
        {
            M.removeRow(i);
            i--;
        }
    }
    
    public void LimpiarTablaAntecedentes()
    {
        for(int i=0;i<tblAntecedentes.getRowCount();i++)
        {
            N.removeRow(i);
            i--;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atVacunacion = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAlergias = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAntecedentes = new javax.swing.JTable();
        txtNumhis = new javax.swing.JLabel();
        txtNumss = new javax.swing.JLabel();
        txtUltdia = new javax.swing.JLabel();
        txtFecrea = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JLabel();
        txtMedico = new javax.swing.JLabel();
        txtTipoSan = new javax.swing.JLabel();
        txtFeact = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setOpaque(false);

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel100.setText("Historial Clínico del Paciente");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel101.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel101.setText("Nº Historial:");

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setText("Nº Seguro Social:");

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel103.setText("Último diagnóstico:");

        jLabel104.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel104.setText("Fecha de Creación:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel113.setText("Paciente:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setText("Médico:");

        jLabel115.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel115.setText("Tipo-Sangre:");

        jLabel116.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel116.setText("Fecha Actualización:");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel106.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel106.setText("Alérgias");

        jLabel107.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel107.setText("Antecedentes enfermedades");

        jLabel108.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(153, 0, 0));
        jLabel108.setText("Editar");

        jLabel109.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel109.setText("Vacunación:");

        atVacunacion.setColumns(20);
        atVacunacion.setRows(5);
        jScrollPane2.setViewportView(atVacunacion);

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
        jScrollPane8.setViewportView(tblAntecedentes);

        txtNumhis.setText("       --Ingrese Dato--");
        txtNumhis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNumss.setText("       --Ingrese Dato--");
        txtNumss.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtUltdia.setText("       --Ingrese Dato--");
        txtUltdia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFecrea.setText("       --Ingrese Dato--");
        txtFecrea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPaciente.setText("       --Ingrese Dato--");
        txtPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMedico.setText("       --Ingrese Dato--");
        txtMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTipoSan.setText("       --Ingrese Dato--");
        txtTipoSan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFeact.setText("       --Ingrese Dato--");
        txtFeact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("FOTO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel108))
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(jSeparator20)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel100))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel106)
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel109))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel107)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel101)
                                                    .addComponent(jLabel102))
                                                .addGap(26, 26, 26))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel104)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNumhis, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumss, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFecrea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel103)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUltdia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel115)
                                            .addComponent(jLabel114)
                                            .addComponent(jLabel113))
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel116)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMedico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTipoSan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(txtFeact, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(78, 78, 78)))
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel113)
                                    .addComponent(txtNumhis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel114)
                                    .addComponent(txtNumss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel115)
                                    .addComponent(txtUltdia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTipoSan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel116)
                                    .addComponent(txtFecrea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFeact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel107)
                                    .addComponent(jLabel109))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(50, 50, 50))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)))
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel108))))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 559));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        cont-=2;
        if(cont==0)
        {
            Paciente Objeto=new Paciente();
            Objeto.setVisible(true);
            this.dispose();
        }
        else
        {
            MuestraRegistro();
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
       MuestraRegistro();
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int numhistorial=Integer.parseInt(txtNumhis.getText());
        EditarHistorialClinico Objeto;
        try 
        {
            Objeto = new EditarHistorialClinico(idpaciente,numhistorial);
            Objeto.setVisible(true);
            this.dispose();
        
            Objeto.txtNumss.setText(txtNumss.getText());
            Objeto.txtUltdia.setText(txtUltdia.getText());
            Objeto.atVacunacion.append(atVacunacion.getText());
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(MostrarHistorialClínico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed


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
            java.util.logging.Logger.getLogger(MostrarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarHistorialClínico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarHistorialClínico(idpaciente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea atVacunacion;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTable tblAlergias;
    public javax.swing.JTable tblAntecedentes;
    private javax.swing.JLabel txtFeact;
    private javax.swing.JLabel txtFecrea;
    private javax.swing.JLabel txtMedico;
    private javax.swing.JLabel txtNumhis;
    private javax.swing.JLabel txtNumss;
    private javax.swing.JLabel txtPaciente;
    private javax.swing.JLabel txtTipoSan;
    private javax.swing.JLabel txtUltdia;
    // End of variables declaration//GEN-END:variables
}
