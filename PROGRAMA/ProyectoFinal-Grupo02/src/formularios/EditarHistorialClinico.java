
package formularios;

import JTableColor.Render;
import com.toedter.calendar.JDateChooser;
import conexionmysql.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditarHistorialClinico extends javax.swing.JFrame 
{
    
    public static int idpaciente,numhistorial,contador2,contador3;
    public static DefaultTableModel M,N;
    public static String alergia[],enfermedad[];
    ConexionBD conexion;
    Render r= new Render();
    
    public EditarHistorialClinico(int idpaciente,int numhistorial) throws IOException 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Edición de Historial Clínico del Paciente");
        conexion= new ConexionBD();
        tblAntecedentes.setDefaultRenderer(Object.class,r);
        tblAlergias.setDefaultRenderer(Object.class,r);
        
        
        this.idpaciente=idpaciente;
        this.numhistorial=numhistorial;
        
        this.getContentPane().setBackground(Color.lightGray);
        M=new DefaultTableModel();
        M.addColumn("Otros Antec. Enfermedades");
        this.tblAntecedentes.setModel(M);
        
        N=new DefaultTableModel();
        N.addColumn("Otras Alergias");
        this.tblAlergias.setModel(N);
        
        Conexion();
    }
    
    public void Conexion()
    {
        cbMedico.addItem("--Seleccionar--");
        contador2=0;contador3=0;
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
            
            ResultSet tabla4=instruccion.executeQuery("select count(*) from alergias where refnum_historial=" + numhistorial);
            if(tabla4.next())
                contador2=tabla4.getInt("count(*)");
            
            ResultSet tabla3=instruccion.executeQuery("select alergia from alergias where refnum_historial=" + numhistorial);
            if(contador2>0)
            {
                int i=0;
                alergia=new String[contador2];
                while(tabla3.next())
                {
                    N.addRow(new Object[]{tabla3.getString("alergia")});
                    alergia[i]=tabla3.getString("alergia");
                    i++;
                }
            }
            
            ResultSet tabla7=instruccion.executeQuery("select count(*) from antecentes_enfermedades where refnum_historial=" + numhistorial);
            if(tabla7.next())
                contador3=tabla7.getInt("count(*)");
            
            ResultSet tabla8=instruccion.executeQuery("select enfermedad from antecentes_enfermedades where refnum_historial=" + numhistorial);
            if(contador3>0)
            {
                int j=0;
                enfermedad=new String[contador3];
                while(tabla8.next())
                {
                    M.addRow(new Object[] {tabla8.getString("enfermedad")});
                    enfermedad[j]=tabla8.getString("enfermedad");
                    j++;
                }
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
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        catch(IOException e)
        {
            System.out.println(e);
        } 
    }
    
    public void EliminarComboBox()
    {
        for(int i=0;i<cbIdmedico.getItemCount();i++)
        {
            cbIdmedico.removeItemAt(i);
            i--;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jSeparator22 = new javax.swing.JSeparator();
        jButton41 = new javax.swing.JButton();
        jTextField95 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField98 = new javax.swing.JTextField();
        jTextField99 = new javax.swing.JTextField();
        jTextField100 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
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
        jPanel7 = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        btnRetroceder = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        txtNumss = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        cbTipSan = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        calFecrea = new com.toedter.calendar.JDateChooser();
        calFeact = new com.toedter.calendar.JDateChooser();
        cbIdmedico = new javax.swing.JComboBox<>();
        jLabel103 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atVacunacion = new javax.swing.JTextArea();
        txtUltdia = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        cbMedico = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAntecedentes = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAlergias = new javax.swing.JTable();
        btnAgregarAlergias = new javax.swing.JButton();
        btnAgregarEnfermedad = new javax.swing.JButton();
        txtAlergia = new javax.swing.JTextField();
        txtEnfermedad = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel108.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 153));
        jLabel108.setText("Internamiento de Paciente");

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel109.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 0, 153));
        jLabel109.setText("ID:");

        jLabel110.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 153));
        jLabel110.setText("Motivo:");

        jLabel111.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 0, 153));
        jLabel111.setText("Nº Habitación:");

        jLabel112.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 153));
        jLabel112.setText("Fecha de Ingreso:");

        jLabel117.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 153));
        jLabel117.setText("Fecha de Alta:");

        jLabel118.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 153));
        jLabel118.setText("Diagnóstico:");

        jLabel119.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 153));
        jLabel119.setText("Importe a pagar:");

        jLabel120.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 153));
        jLabel120.setText("ID-Paciente:");

        jLabel121.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 0, 153));
        jLabel121.setText("ID-Médico:");

        jLabel122.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 153));
        jLabel122.setText("Tipo-Habitación:");

        jLabel123.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(0, 0, 153));
        jLabel123.setText("Hora de Ingreso:");

        jLabel124.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(0, 0, 153));
        jLabel124.setText("Hora de Alta:");

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jButton4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("Guardar");

        jButton5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("Cancelar");

        jComboBox3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 153));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCION--", "INDIVIDUAL", "COMPARTIDA" }));

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
            .addComponent(jSeparator22)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
            .addComponent(jSeparator23)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addComponent(jLabel111)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel109)
                            .addComponent(jLabel117)
                            .addComponent(jLabel112)
                            .addComponent(jLabel110))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField99)
                                .addComponent(jTextField98)
                                .addComponent(jTextField95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel123)
                    .addComponent(jLabel122)
                    .addComponent(jLabel121)
                    .addComponent(jLabel120)
                    .addComponent(jLabel119)
                    .addComponent(jLabel124))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel108)
                .addGap(314, 314, 314))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108)
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel109)
                                    .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel120)
                                    .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel110)
                                    .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel121)
                                    .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel111)
                                    .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel112)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel123)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel117)
                                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel124)
                                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)
                                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel118)
                                    .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel119)
                                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        jLabel100.setText("Edición de Historial Clínico del Paciente");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setText("Nº Seguro Social:");

        jLabel104.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel104.setText("Fecha de Creación:");

        jLabel105.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel105.setText("Último diagnóstico:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setText("ID-Médico:");

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

        cbTipSan.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbTipSan.setForeground(new java.awt.Color(0, 0, 153));
        cbTipSan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "A", "B", "AB", "O" }));

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

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel103.setText("Vacunación:");

        atVacunacion.setColumns(20);
        atVacunacion.setRows(5);
        jScrollPane1.setViewportView(atVacunacion);

        jLabel127.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel127.setText("Médico:");

        cbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedicoActionPerformed(evt);
            }
        });

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
        jScrollPane6.setViewportView(tblAntecedentes);

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

        btnAgregarAlergias.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregarAlergias.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregarAlergias.setText("+");
        btnAgregarAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlergiasActionPerformed(evt);
            }
        });

        btnAgregarEnfermedad.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnAgregarEnfermedad.setForeground(new java.awt.Color(0, 0, 153));
        btnAgregarEnfermedad.setText("+");
        btnAgregarEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEnfermedadActionPerformed(evt);
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
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel102)
                            .addComponent(jLabel116))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(calFeact, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumss, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(calFecrea, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel115)
                                            .addComponent(jLabel114)
                                            .addComponent(jLabel127))
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(cbTipSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3))
                                            .addComponent(cbIdmedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(24, 24, 24))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel106)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(btnAgregarAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel107)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(btnAgregarEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(53, 53, 53))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtUltdia, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(78, 78, 78)))
                .addGap(39, 39, 39))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel100)
                .addGap(243, 243, 243))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel102)
                                    .addComponent(txtNumss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel127))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel114)
                                        .addComponent(cbIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel104))
                                    .addComponent(calFecrea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel115)
                                        .addComponent(cbTipSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel116))
                                    .addComponent(calFeact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel105)
                                    .addComponent(txtUltdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel107))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAgregarAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAgregarEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetroceder)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        MostrarHistorialClínico Objeto=new MostrarHistorialClínico(idpaciente);
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
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idmed,tipsan,fecrea,feact,ultdia,vac,aler,ant;
        int numss;
        numss=Integer.parseInt(txtNumss.getText());
        ultdia=txtUltdia.getText();
        tipsan=cbTipSan.getSelectedItem().toString();
        idmed=cbIdmedico.getSelectedItem().toString();
        vac=atVacunacion.getText();
        fecrea=Date(calFecrea);
        feact=Date(calFeact);

        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            instruccion.executeUpdate("update historial_clinico set refid_medico=" + idmed + " where num_historial=" + numhistorial);
            instruccion.executeUpdate("update historial_clinico set numsegurosocial=" + numss + " where num_historial=" + numhistorial);
            instruccion.executeUpdate("update historial_clinico set fecreacion_historial='" + fecrea + "' where num_historial=" + numhistorial);
            instruccion.executeUpdate("update historial_clinico set fecultctual_historial='" + feact + "' where num_historial=" + numhistorial);
            instruccion.executeUpdate("update historial_clinico set tiposangre='" + tipsan + "' where num_historial=" + numhistorial);
            instruccion.executeUpdate("update historial_clinico set vacunas='" + vac + "' where num_historial=" + numhistorial);
            instruccion.executeUpdate("update historial_clinico set ultimodiag='" + ultdia + "' where num_historial=" + numhistorial);
            
            
            
            
            for(int i=0;i<contador2;i++)
            {
                if(tblAlergias.getValueAt(i,0)!=null)
                {
                    aler=String.valueOf(tblAlergias.getValueAt(i, 0));
                    instruccion.executeUpdate("update alergias set alergia='" + aler + "' where alergia='" + alergia[i] + "' AND refnum_historial=" + numhistorial);
                }
            }
            
            for(int i=0;i<contador3;i++)
            {
                if(tblAntecedentes.getValueAt(i,0)!=null)
                {
                    ant=String.valueOf(tblAntecedentes.getValueAt(i, 0));
                    instruccion.executeUpdate("update 	antecentes_enfermedades set enfermedad='" + ant + "' where enfermedad='" + enfermedad[i] + "' AND refnum_historial=" + numhistorial);
                }
            }
            
            JOptionPane.showMessageDialog(null,"==> Se ha actualizado los datos del historial clinico del paciente correctamente <==");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos del historial del paciente han sido mal ingresados <==\n"
                                                 + "        ==> Es necesario llenar todos los campos <== ");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       txtNumss.setText("");
       txtUltdia.setText("");
       cbIdmedico.setSelectedIndex(0);
       cbMedico.setSelectedIndex(0);
       cbTipSan.setSelectedIndex(0);
       atVacunacion.setText("");
       EliminarTabla(tblAlergias, N);
       EliminarTabla(tblAntecedentes, M);
       txtNumss.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextField97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField97ActionPerformed
        // No usar
    }//GEN-LAST:event_jTextField97ActionPerformed
    
    public void EliminarTabla(JTable tabla,DefaultTableModel model)
    {
        for(int i=0;i<tabla.getRowCount();i++)
        {
            model.removeRow(i);
            i--;
        }
    }
    
    private void cbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedicoActionPerformed
        String med=cbMedico.getSelectedItem().toString();

        cbIdmedico.addItem("Apuntador");
        cbIdmedico.setSelectedIndex(0);
        EliminarComboBox();
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

    private void btnAgregarAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlergiasActionPerformed
        
        String alergia=txtAlergia.getText();
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            N.addRow(new Object[] {alergia});
            instruccion.executeUpdate("insert into alergias(refnum_historial,alergia) values (" + numhistorial + ",'" + alergia + "')");
            JOptionPane.showMessageDialog(null,"==> Se ha Añadido el registro correctamente <==");
            txtAlergia.setText("");
            txtAlergia.requestFocus();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
    }//GEN-LAST:event_btnAgregarAlergiasActionPerformed

    private void btnAgregarEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEnfermedadActionPerformed
        String enfermedad=txtEnfermedad.getText();
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            M.addRow(new Object[] {enfermedad});
            instruccion.executeUpdate("insert into antecentes_enfermedades(refnum_historial,enfermedad) values (" + numhistorial + ",'" + enfermedad + "')");
            JOptionPane.showMessageDialog(null,"==> Se ha Añadido el registro correctamente <==");
            txtEnfermedad.setText("");
            txtEnfermedad.requestFocus();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
    }//GEN-LAST:event_btnAgregarEnfermedadActionPerformed

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
            java.util.logging.Logger.getLogger(EditarHistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarHistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarHistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarHistorialClinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new EditarHistorialClinico(idpaciente,numhistorial).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EditarHistorialClinico.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea atVacunacion;
    private javax.swing.JButton btnAgregarAlergias;
    private javax.swing.JButton btnAgregarEnfermedad;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRetroceder;
    public com.toedter.calendar.JDateChooser calFeact;
    public com.toedter.calendar.JDateChooser calFecrea;
    public javax.swing.JComboBox<String> cbIdmedico;
    public javax.swing.JComboBox<String> cbMedico;
    public javax.swing.JComboBox<String> cbTipSan;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel127;
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
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    private javax.swing.JLabel lblfoto;
    public javax.swing.JTable tblAlergias;
    public javax.swing.JTable tblAntecedentes;
    public javax.swing.JTextField txtAlergia;
    public javax.swing.JTextField txtEnfermedad;
    public javax.swing.JTextField txtNumss;
    public javax.swing.JTextField txtUltdia;
    // End of variables declaration//GEN-END:variables
}
