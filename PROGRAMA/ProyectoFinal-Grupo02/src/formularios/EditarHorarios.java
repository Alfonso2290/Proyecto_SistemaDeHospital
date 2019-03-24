
package formularios;

import JTableColor.Render;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.Collator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditarHorarios extends javax.swing.JFrame 
{
    public static int idmedico,contador=0;
    public static DefaultTableModel M;
    public static String Dialab[],HoraI[],HoraS[];
    ConexionBD conexion;
    Render r= new Render();
    public EditarHorarios(int idmedico) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Edición de Horarios del Médico");
        this.idmedico=idmedico;
        conexion= new ConexionBD();
        tblHorarios.setDefaultRenderer(Object.class,r);
        this.getContentPane().setBackground(Color.lightGray);
        M=new DefaultTableModel();
        M.addColumn("Dias Lab.");
        M.addColumn("H.Entrada");
        M.addColumn("Hora Salida");
        this.tblHorarios.setModel(M);
        
        MuestraRegistro();
    }
    
    public void MuestraRegistro()
    {
        contador=0;
        ImageIcon foto;
        InputStream is;
        try
        {
           Statement instruccion= conexion.getConexionBD().createStatement();
            
            ResultSet tabla4=instruccion.executeQuery("select count(*) from horario_medico where refid_medico=" + idmedico);
            if(tabla4.next())
                contador=tabla4.getInt("count(*)");
            
            ResultSet tabla3=instruccion.executeQuery("select dia_laboral,horaingreso,horasalida from horario_medico where refid_medico=" + idmedico + " order by field (dia_laboral ,'lunes','martes','miercoles','jueves','viernes','sabado')");
            if(contador>0)
            {
                int i=0;
                Dialab=new String[contador];
                HoraI=new String[contador];
                HoraS=new String[contador];
                while(tabla3.next())
                {
                    
                    M.addRow(new Object[]{tabla3.getString("dia_laboral"),tabla3.getString("horaingreso"),tabla3.getString("horasalida")});
                    Dialab[i]=tabla3.getString("dia_laboral");
                    HoraI[i]=tabla3.getString("horaingreso");
                    HoraS[i]=tabla3.getString("horasalida");
                    i++;
                }
            }
            
            ResultSet tabla1=instruccion.executeQuery("select foto_medico from medicos where id_medico=" + idmedico);
            if(tabla1.next())
            {
                is=tabla1.getBinaryStream("foto_medico");
                BufferedImage bi=ImageIO.read(is);
                foto=new ImageIcon(bi);
            
                Image img=foto.getImage();
                Image newimg=img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
            
                ImageIcon newicon=new ImageIcon(newimg);
                lblfoto.setIcon(newicon);
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jSeparator21 = new javax.swing.JSeparator();
        jButton40 = new javax.swing.JButton();
        jTextField95 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jTextField96 = new javax.swing.JTextField();
        jTextField97 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<>();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        jButton39 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtTiemate = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        cbHoraI = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        cbMinI = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        cbSegI = new javax.swing.JComboBox<>();
        cbHoraS = new javax.swing.JComboBox<>();
        cbMinS = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        cbSegSalida = new javax.swing.JComboBox<>();
        jLabel76 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        btnAgregarHorario = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        cbDiaLaboral = new javax.swing.JComboBox<>();
        lblfoto = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel103.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 153));
        jLabel103.setText("Internamiento de Paciente");

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel104.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 153));
        jLabel104.setText("ID:");

        jLabel105.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 153));
        jLabel105.setText("Motivo:");

        jLabel106.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 0, 153));
        jLabel106.setText("Nº Habitación:");

        jLabel107.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(0, 0, 153));
        jLabel107.setText("Fecha de Ingreso:");

        jLabel108.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 153));
        jLabel108.setText("Fecha de Alta:");

        jLabel109.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 0, 153));
        jLabel109.setText("Diagnóstico:");

        jLabel112.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 153));
        jLabel112.setText("Importe a pagar:");

        jLabel115.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 153));
        jLabel115.setText("ID-Paciente:");

        jLabel116.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 153));
        jLabel116.setText("ID-Médico:");

        jLabel117.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 153));
        jLabel117.setText("Tipo-Habitación:");

        jLabel118.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 153));
        jLabel118.setText("Hora de Ingreso:");

        jLabel119.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 153));
        jLabel119.setText("Hora de Alta:");

        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLayeredPane8.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 153));
        jLabel20.setText("FOTO");

        jButton6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 153));
        jButton6.setText("Guardar");

        jButton7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 153));
        jButton7.setText("Cancelar");

        jComboBox1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCION--", "INDIVIDUAL", "COMPARTIDA" }));

        jComboBox4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel21.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("/");

        jComboBox5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel22.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("/");

        jComboBox6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));

        jComboBox10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel24.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("/");

        jComboBox12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel26.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 153));
        jLabel26.setText("/");

        jComboBox14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jComboBox16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox16.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel23.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 153));
        jLabel23.setText("/");

        jComboBox7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox7.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel29.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 153));
        jLabel29.setText("/");

        jComboBox17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox17.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));

        jComboBox18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox18.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel28.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 153));
        jLabel28.setText("/");

        jComboBox19.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox19.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 153));
        jLabel30.setText("/");

        jComboBox20.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox20.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator21)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
            .addComponent(jSeparator22)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(jLabel106)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addComponent(jLabel108)
                            .addComponent(jLabel107)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField97)
                                .addComponent(jTextField96)
                                .addComponent(jTextField95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addComponent(jLabel117)
                    .addComponent(jLabel116)
                    .addComponent(jLabel115)
                    .addComponent(jLabel112)
                    .addComponent(jLabel119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField109)
                        .addComponent(jTextField110, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel20)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel103)
                .addGap(314, 314, 314))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103)
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel104)
                                    .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel115)
                                    .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel105)
                                    .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel116)
                                    .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel106)
                                    .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel117)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel107)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel118)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel108)
                                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel119)
                                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)
                                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel109)
                                    .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel112)
                                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel110.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 153));
        jLabel110.setText("Guardar");

        jLabel111.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 0, 153));
        jLabel111.setText("Cancelar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setOpaque(false);

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel100.setText("Edición de Horarios del Médico");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setText("Hora Ingreso:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel113.setText("Tiempo de atención:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setText("Hora Salida:");

        jButton4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("Guardar");

        jButton5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("Cancelar");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/atras.png"))); // NOI18N
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

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

        cbHoraS.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbHoraS.setForeground(new java.awt.Color(0, 0, 153));
        cbHoraS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        cbMinS.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbMinS.setForeground(new java.awt.Color(0, 0, 153));
        cbMinS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel75.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 153));
        jLabel75.setText("/");

        cbSegSalida.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbSegSalida.setForeground(new java.awt.Color(0, 0, 153));
        cbSegSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel76.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 153));
        jLabel76.setText("/");

        jLabel120.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel120.setText("Días Laborales:");

        btnAgregarHorario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregarHorario.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregarHorario.setText("+");
        btnAgregarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHorarioActionPerformed(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 0, 153));
        jLabel121.setText("Agregar");

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

        cbDiaLaboral.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbDiaLaboral.setForeground(new java.awt.Color(0, 0, 153));
        cbDiaLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado" }));

        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel31.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setText("FOTO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator20)
            .addComponent(jSeparator19)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel102)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114)
                            .addComponent(jLabel120))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(cbHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel76)
                                .addGap(2, 2, 2)
                                .addComponent(cbMinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSegSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbDiaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel121)
                                    .addComponent(btnAgregarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel122)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel113)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTiemate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(78, 78, 78)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(107, 107, 107))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTiemate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel113))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel122)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(btnAgregarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel121))
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel102)
                                            .addComponent(cbHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel71)
                                            .addComponent(cbMinI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel72)
                                            .addComponent(cbSegI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel114)
                                            .addComponent(cbHoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel76)
                                            .addComponent(cbMinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel75)
                                            .addComponent(cbSegSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel120)
                                            .addComponent(cbDiaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)))
                                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnRetroceder))
                .addGap(304, 304, 304)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        MostrarHorarios Objeto=new MostrarHorarios(idmedico);
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String horai,horas,dia;
        double tiempo;
        tiempo=Double.parseDouble(txtTiemate.getText());
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            instruccion.executeUpdate("update horario_medico set tiempoatencion=" + tiempo + " where refid_medico=" + idmedico);

            for(int i=0;i<contador;i++)
            {
                if(tblHorarios.getValueAt(i,0)!=null)
                {
                    dia=String.valueOf(tblHorarios.getValueAt(i, 0));
                    horai=String.valueOf(tblHorarios.getValueAt(i, 1));
                    horas=String.valueOf(tblHorarios.getValueAt(i, 2));
                    instruccion.executeUpdate("update horario_medico set dia_laboral='" + dia + "' where dia_laboral='" + Dialab[i] + "' AND refid_medico=" + idmedico);
                    instruccion.executeUpdate("update horario_medico set horaingreso='" + horai + "' where horaingreso='" + HoraI[i] + "' AND refid_medico=" + idmedico);
                    instruccion.executeUpdate("update horario_medico set horasalida='" + horas + "' where horasalida='" + HoraS[i] + "' AND refid_medico=" + idmedico);
                }
            }
            
            
            JOptionPane.showMessageDialog(null,"==> Se ha actualizado los datos del horario del medico correctamente <==");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos del horario del medico han sido mal ingresados <==\n"
                                                 + "        ==> Es necesario llenar todos los campos <== ");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    public void EliminarTabla(JTable tabla,DefaultTableModel model)
    {
        for(int i=0;i<tabla.getRowCount();i++)
        {
            model.removeRow(i);
            i--;
        }
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
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       txtTiemate.setText("");
       cbDiaLaboral.setSelectedIndex(0);
       cbHoraI.setSelectedIndex(0);
       cbHoraS.setSelectedIndex(0);
       cbMinI.setSelectedIndex(0);
       cbMinS.setSelectedIndex(0);
       cbSegI.setSelectedIndex(0);
       cbSegSalida.setSelectedIndex(0);
       EliminarTabla(tblHorarios, M);
       txtTiemate.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHorarioActionPerformed
        String dia,horai,horas,tiempo;
        tiempo=txtTiemate.getText();
        dia=cbDiaLaboral.getSelectedItem().toString();
        horai=Time(cbHoraI, cbMinI, cbSegI);
        horas=Time(cbHoraS, cbMinS, cbSegSalida);
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            M.addRow(new Object[] {dia,horai,horas});
            instruccion.executeUpdate("insert into horario_medico(refid_medico,horaingreso,horasalida,tiempoatencion,dia_laboral) values ("
                                        + idmedico + ",'" + horai + "','" + horas + "'," + tiempo + ",'" + dia + "')");
            JOptionPane.showMessageDialog(null,"==> Se ha Añadido el registro correctamente <==");
            EliminarItemComboBox(dia);
            cbDiaLaboral.setSelectedIndex(0);
            cbHoraI.setSelectedIndex(0);
            cbHoraS.setSelectedIndex(0);
            cbMinI.setSelectedIndex(0);
            cbMinS.setSelectedIndex(0);
            cbSegI.setSelectedIndex(0);
            cbSegSalida.setSelectedIndex(0);
            cbHoraI.requestFocus();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_btnAgregarHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(EditarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarHorarios(idmedico).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHorario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public javax.swing.JComboBox<String> cbDiaLaboral;
    public javax.swing.JComboBox<String> cbHoraI;
    public javax.swing.JComboBox<String> cbHoraS;
    public javax.swing.JComboBox<String> cbMinI;
    public javax.swing.JComboBox<String> cbMinS;
    public javax.swing.JComboBox<String> cbSegI;
    public javax.swing.JComboBox<String> cbSegSalida;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTable tblHorarios;
    public javax.swing.JTextField txtTiemate;
    // End of variables declaration//GEN-END:variables
}
