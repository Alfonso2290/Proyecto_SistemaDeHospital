
package formularios;

import JTableColor.Render;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.Collator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgregarMédico extends javax.swing.JFrame 
{
    public static DefaultTableModel M;
    Render r= new Render();
    ConexionBD conexion;
    FileInputStream file;
    public static int longitudBytes;
    
    public AgregarMédico() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro de Médico");
        conexion= new ConexionBD();
        tblHorarios.setDefaultRenderer(Object.class,r);
         
        txtNom.requestFocus();
        this.getContentPane().setBackground(Color.lightGray);
        M=new DefaultTableModel();
        M.addColumn("Dias Lab.");
        M.addColumn("H.Entrada");
        M.addColumn("Hora Salida");
        this.tblHorarios.setModel(M);
        
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

        jFrame1 = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        jButton39 = new javax.swing.JButton();
        jTextField93 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
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
        jTextField94 = new javax.swing.JTextField();
        jTextField95 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField107 = new javax.swing.JTextField();
        jTextField108 = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLabel62 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<>();
        jTextField34 = new javax.swing.JTextField();
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
        txtApema = new javax.swing.JTextField();
        txtTiemate = new javax.swing.JTextField();
        txtTelfi = new javax.swing.JTextField();
        txtTelmo = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtExt = new javax.swing.JTextField();
        txtInt = new javax.swing.JTextField();
        cbCalle = new javax.swing.JComboBox<>();
        cbDistrito = new javax.swing.JComboBox<>();
        cbDepartamento = new javax.swing.JComboBox<>();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        btnAgregarHorario = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        cbHoraI = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        cbMinI = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        cbSegI = new javax.swing.JComboBox<>();
        cbSegSalida = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        cbMinS = new javax.swing.JComboBox<>();
        cbHoraS = new javax.swing.JComboBox<>();
        jLabel76 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        cbDiaLaboral = new javax.swing.JComboBox<>();
        cbEspecialidad = new javax.swing.JComboBox<>();
        btnAgregarImagen = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel100.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 153));
        jLabel100.setText("Internamiento de Paciente");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel101.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 153));
        jLabel101.setText("ID:");

        jLabel102.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 153));
        jLabel102.setText("Motivo:");

        jLabel103.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 153));
        jLabel103.setText("Nº Habitación:");

        jLabel104.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 153));
        jLabel104.setText("Fecha de Ingreso:");

        jLabel105.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 153));
        jLabel105.setText("Fecha de Alta:");

        jLabel108.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 153));
        jLabel108.setText("Diagnóstico:");

        jLabel112.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 153));
        jLabel112.setText("Importe a pagar:");

        jLabel113.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 153));
        jLabel113.setText("ID-Paciente:");

        jLabel114.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 153));
        jLabel114.setText("ID-Médico:");

        jLabel115.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 153));
        jLabel115.setText("Tipo-Habitación:");

        jLabel116.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 153));
        jLabel116.setText("Hora de Ingreso:");

        jLabel117.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 153));
        jLabel117.setText("Hora de Alta:");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLayeredPane7.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        jLabel62.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 153));
        jLabel62.setText("FOTO");

        jButton11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 153));
        jButton11.setText("Guardar");

        jButton12.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 153));
        jButton12.setText("Cancelar");

        jComboBox3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCION--", "INDIVIDUAL", "COMPARTIDA" }));

        jComboBox4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel63.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 153));
        jLabel63.setText("/");

        jComboBox5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel64.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 153));
        jLabel64.setText("/");

        jComboBox6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));

        jComboBox10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel65.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 153));
        jLabel65.setText("/");

        jComboBox12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel66.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 153));
        jLabel66.setText("/");

        jComboBox14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jComboBox16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox16.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel67.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 153));
        jLabel67.setText("/");

        jComboBox7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox7.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel68.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 153));
        jLabel68.setText("/");

        jComboBox17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox17.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));

        jComboBox18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox18.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel69.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 153));
        jLabel69.setText("/");

        jComboBox19.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox19.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel70.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 153));
        jLabel70.setText("/");

        jComboBox20.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox20.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108)
                    .addComponent(jLabel103)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField95)
                                .addComponent(jTextField94)
                                .addComponent(jTextField93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel67)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel68)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel63)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel64)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel115)
                    .addComponent(jLabel114)
                    .addComponent(jLabel113)
                    .addComponent(jLabel112)
                    .addComponent(jLabel117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField107)
                        .addComponent(jTextField108, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel62)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(314, 314, 314))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100)
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel101)
                                    .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel113)
                                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel102)
                                    .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel114)
                                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel103)
                                    .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel115)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel104)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel63)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel116)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65)
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66)
                                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel105)
                                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel68)
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel117)
                                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69)
                                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70)
                                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel108)
                                    .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel112)
                                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

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
        jLabel45.setText("Registro de Médico");

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
        jLabel50.setText("Tiempo atención:");

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

        jLabel59.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel59.setText("DNI:");

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel17.setText("Departamento:");

        jLabel18.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel18.setText("Ciudad:");

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("Calle:");

        jLabel23.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel23.setText("NºInterno:");

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel24.setText("NºExterno:");

        cbDepartamento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbDepartamento.setForeground(new java.awt.Color(0, 0, 153));
        cbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentoActionPerformed(evt);
            }
        });

        cbSexo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSexo.setForeground(new java.awt.Color(0, 0, 153));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Masculino", "Femenino" }));

        jLabel122.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel122.setText("Horarios:");

        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tblHorarios);

        btnAgregarHorario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregarHorario.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregarHorario.setText("+");
        btnAgregarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHorarioActionPerformed(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel121.setText("Agregar");

        jLabel106.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel106.setText("Hora Ingreso:");

        cbHoraI.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbHoraI.setForeground(new java.awt.Color(0, 0, 153));
        cbHoraI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel71.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 153));
        jLabel71.setText("/");

        cbMinI.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMinI.setForeground(new java.awt.Color(0, 0, 153));
        cbMinI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel72.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 153));
        jLabel72.setText("/");

        cbSegI.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSegI.setForeground(new java.awt.Color(0, 0, 153));
        cbSegI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        cbSegSalida.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSegSalida.setForeground(new java.awt.Color(0, 0, 153));
        cbSegSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel75.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 153));
        jLabel75.setText("/");

        cbMinS.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMinS.setForeground(new java.awt.Color(0, 0, 153));
        cbMinS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        cbHoraS.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbHoraS.setForeground(new java.awt.Color(0, 0, 153));
        cbHoraS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel76.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 153));
        jLabel76.setText("/");

        jLabel118.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel118.setText("Hora Salida:");

        jLabel120.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel120.setText("Días Laborales:");

        cbDiaLaboral.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbDiaLaboral.setForeground(new java.awt.Color(0, 0, 153));
        cbDiaLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado" }));

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

        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator10)
            .addComponent(jSeparator11)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel47))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelfi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelmo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApema, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApepa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel59)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(18, 18, 18)
                                .addComponent(txtTiemate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel121)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel106)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel71)
                                        .addGap(2, 2, 2)
                                        .addComponent(cbMinI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSegI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel118)
                                            .addComponent(jLabel120))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(cbHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel76)
                                                .addGap(2, 2, 2)
                                                .addComponent(cbMinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel75)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbSegSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbDiaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jLabel122))
                .addGap(60, 60, 60)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAgregarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel45)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel47)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel54)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel59)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(cbCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel23)
                                            .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel51)
                                            .addComponent(txtTelfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52)
                                    .addComponent(txtTelmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel55)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50)
                                    .addComponent(txtTiemate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel122)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnAgregarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel121)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel106)
                                                    .addComponent(cbHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel71)
                                                    .addComponent(cbMinI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel72)
                                                    .addComponent(cbSegI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel118)
                                                    .addComponent(cbHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel76)
                                                    .addComponent(cbMinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel75)
                                                    .addComponent(cbSegSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel120)
                                                    .addComponent(cbDiaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarImagen)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar)
                        .addComponent(btnCancelar))
                    .addComponent(btnRetroceder))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 530));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        int cont=0;
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select count(*) from medicos");
            if(tabla.next())
            {
                cont=tabla.getInt("count(*)");
            }
            if(cont>0)
            {
                Médico Objeto=new Médico();
                Objeto.setVisible(true);
                this.dispose();
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
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nom,appa,apma,dni,tefi,temo,sexo,esp,calle,distrito,departamento,dia,horaing,horasal;
        int ext,inte,idcalle=0,iddepart=0,iddistri=0,idesp=0,maxidmed=0;
        double tiempo;
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
        tiempo=Double.parseDouble(txtTiemate.getText());
        
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
 
            String sql="INSERT INTO medicos(nombres_medico,apellpat_medico,apellmat_medico,dni_medico,telfijo_medico,telmovil_medico,sexo_medico,numext_medico,numint_medico,foto_medico,refid_calle,refid_distrito,refid_departamento,refid_especialidad) VALUES  (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement inst=conexion.getConexionBD().prepareStatement(sql);
            inst.setString(1,nom);
            inst.setString(2,appa);
            inst.setString(3,apma);
            inst.setString(4,dni);
            inst.setString(5,tefi);
            inst.setString(6,temo);
            inst.setString(7,sexo);
            inst.setInt(8,ext);
            inst.setInt(9,inte);
            inst.setBinaryStream(10,file,longitudBytes);
            inst.setInt(11,idcalle);
            inst.setInt(12,iddistri);
            inst.setInt(13,iddepart);
            inst.setInt(14,idesp);
            inst.execute();
            
            
            ResultSet tabla5=instruccion.executeQuery("select max(id_medico) from medicos order by id_medico");
            if(tabla5.next())
                maxidmed=tabla5.getInt("max(id_medico)");
            
            for(int i=0;i<tblHorarios.getRowCount();i++)
            {
                if(tblHorarios.getValueAt(i,0)!=null)
                {
                    dia=String.valueOf(tblHorarios.getValueAt(i, 0));
                    horaing=String.valueOf(tblHorarios.getValueAt(i, 1));
                    horasal=String.valueOf(tblHorarios.getValueAt(i, 2));
                    instruccion.executeUpdate("INSERT INTO horario_medico(refid_medico,horaingreso,horasalida,tiempoatencion,dia_laboral) VALUES (" + maxidmed + ",'" + horaing + "','" + horasal + "'," + tiempo + ",'" + dia + "')");
                }
            }
            
            JOptionPane.showMessageDialog(null,"==> Se ha Agregado el registro correctamente <==");
            btnRetrocederActionPerformed(evt);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos han sido mal ingresados <==\n"
                                                 + " ==> Es necesario llenar todos los campos <== ");
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
        txtTiemate.setText("");
        cbDiaLaboral.setSelectedIndex(0);
        cbHoraI.setSelectedIndex(0);
        cbHoraS.setSelectedIndex(0);
        cbMinI.setSelectedIndex(0);
        cbMinS.setSelectedIndex(0);
        cbSegI.setSelectedIndex(0);
        cbSegSalida.setSelectedIndex(0);
        EliminarTabla(tblHorarios, M);
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

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jComboBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox22ActionPerformed
        //No hacer nada
    }//GEN-LAST:event_jComboBox22ActionPerformed
    
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
    
    public void EliminarTabla(JTable tabla,DefaultTableModel model)
    {
        for(int i=0;i<tabla.getRowCount();i++)
        {
            model.removeRow(i);
            i--;
        }
    }
    
    public void EliminarItemComboBox(String dia)
    {
        Collator com=Collator.getInstance();
        com.setStrength(Collator.PRIMARY);
        for(int i=0;i<cbDiaLaboral.getItemCount();i++)
        {
            if(com.compare(cbDiaLaboral.getItemAt(i),dia)==0)
                cbDiaLaboral.removeItemAt(i);
        }
    }
    
    private void btnAgregarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHorarioActionPerformed
        String dia,horai,horas,tiempo;
        tiempo=txtTiemate.getText();
        dia=cbDiaLaboral.getSelectedItem().toString();
        horai=Time(cbHoraI, cbMinI, cbSegI);
        horas=Time(cbHoraS, cbMinS, cbSegSalida);
        M.addRow(new Object[] {dia,horai,horas});
        EliminarItemComboBox(dia);
        cbDiaLaboral.setSelectedIndex(0);
        cbHoraI.setSelectedIndex(0);
        cbHoraS.setSelectedIndex(0);
        cbMinI.setSelectedIndex(0);
        cbMinS.setSelectedIndex(0);
        cbSegI.setSelectedIndex(0);
        cbSegSalida.setSelectedIndex(0);
        cbHoraI.requestFocus();
    }//GEN-LAST:event_btnAgregarHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMédico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMédico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHorario;
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public javax.swing.JComboBox<String> cbCalle;
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbDiaLaboral;
    public javax.swing.JComboBox<String> cbDistrito;
    public javax.swing.JComboBox<String> cbEspecialidad;
    public javax.swing.JComboBox<String> cbHoraI;
    public javax.swing.JComboBox<String> cbHoraS;
    public javax.swing.JComboBox<String> cbMinI;
    public javax.swing.JComboBox<String> cbMinS;
    public javax.swing.JComboBox<String> cbSegI;
    public javax.swing.JComboBox<String> cbSegSalida;
    public javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton39;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTable tblHorarios;
    public javax.swing.JTextField txtApema;
    public javax.swing.JTextField txtApepa;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtExt;
    public javax.swing.JTextField txtInt;
    public javax.swing.JTextField txtNom;
    public javax.swing.JTextField txtTelfi;
    public javax.swing.JTextField txtTelmo;
    public javax.swing.JTextField txtTiemate;
    // End of variables declaration//GEN-END:variables
}
