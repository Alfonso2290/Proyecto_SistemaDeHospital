
package formularios;

import JTableColor.Render;
import com.toedter.calendar.JDateChooser;
import conexionmysql.ConexionBD;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class CitaMédica extends javax.swing.JFrame 
{
    Render r= new Render();
    ConexionBD conexion;
    DefaultTableModel M;
    public static int aummin,aumhora;
    
    public CitaMédica() 
    {
        
        initComponents();
        tblCitas.setDefaultRenderer(Object.class,r);
        setLocationRelativeTo(null);
        setTitle("Registro de Cita médica");
        conexion= new ConexionBD();
        this.getContentPane().setBackground(Color.lightGray);
        M=new DefaultTableModel();
        M.addColumn("Horario Médico");
        M.addColumn("Disponibilidad de cita médica");
        this.tblCitas.setModel(M);
        Conexion();
    }
    
    public void Conexion()
    {
        cbPaciente.addItem("--Seleccionar--");
        cbEspecialidad.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            
            ResultSet tabla1=instruccion.executeQuery("select nombre_especialidad from especialidades");
            while(tabla1.next())
            {
                cbEspecialidad.addItem(tabla1.getString("nombre_especialidad"));
            }
            
            ResultSet tabla2=instruccion.executeQuery("select distinct nombres_paciente from pacientes");
            while(tabla2.next())
            {
                cbPaciente.addItem(tabla2.getString("nombres_paciente"));
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }    
    }
    
    public void EliminarComboBox(JComboBox combo)
    {
        for(int i=0;i<combo.getItemCount();i++)
        {
            combo.removeItemAt(i);
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
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        txtOrden = new javax.swing.JTextField();
        txtFepro = new javax.swing.JTextField();
        txtFeReg = new javax.swing.JTextField();
        txtHoraReg = new javax.swing.JTextField();
        txtHoraprog = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jLabel118 = new javax.swing.JLabel();
        calFecha = new com.toedter.calendar.JDateChooser();
        btnDisponibilidad = new javax.swing.JButton();
        btnReservarCita = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbIdpaciente = new javax.swing.JComboBox<>();
        jLabel115 = new javax.swing.JLabel();
        cbPaciente = new javax.swing.JComboBox<>();
        jLabel120 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        cbIdmedico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        jLabel100.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel100.setText("Registro de Cita médica");

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel102.setText("Nº Orden:");

        jLabel104.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel104.setText("Fecha Programada:");

        jLabel105.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel105.setText("Fecha de Registro:");

        jLabel113.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel113.setText("ID-Paciente:");

        jLabel114.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel114.setText("Especialidad:");

        jLabel116.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel116.setText("Hora Programada:");

        jLabel117.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel117.setText("Hora de Registro:");

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbEspecialidad.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cbEspecialidad.setForeground(new java.awt.Color(0, 0, 153));
        cbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspecialidadActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel118.setText("Visualizar fecha:");

        btnDisponibilidad.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnDisponibilidad.setForeground(new java.awt.Color(0, 0, 153));
        btnDisponibilidad.setText("Disponibilidad");
        btnDisponibilidad.setBorderPainted(false);
        btnDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibilidadActionPerformed(evt);
            }
        });

        btnReservarCita.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnReservarCita.setForeground(new java.awt.Color(0, 0, 153));
        btnReservarCita.setText("Reservar Cita");
        btnReservarCita.setBorderPainted(false);
        btnReservarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarCitaActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel119.setText("ID-Médico:");

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCitas);

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

        jLabel115.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel115.setText("Paciente:");

        cbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPacienteActionPerformed(evt);
            }
        });

        jLabel120.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel120.setText("Costo de cita:");

        jLabel122.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel122.setText("Médico:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator19)
            .addComponent(jSeparator20)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel122)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel102))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFeReg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFepro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel116)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel117))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHoraprog, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHoraReg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel115)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbIdpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDisponibilidad)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel114)
                                            .addComponent(jLabel119))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(76, 76, 76)
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(btnReservarCita)))
                        .addContainerGap(55, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel100)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addGap(21, 21, 21)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel114)
                                        .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel118))
                                    .addComponent(calFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel119)
                                    .addComponent(cbIdmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnDisponibilidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReservarCita)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel102)
                                    .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel104)
                                    .addComponent(txtFepro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel105)
                                    .addComponent(txtFeReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel115)
                                    .addComponent(cbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel113)
                                    .addComponent(cbIdpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel116)
                                    .addComponent(txtHoraprog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel117)
                                    .addComponent(txtHoraReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel122)
                                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel120)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave xxl.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String HorarioDate(int hora)
    {
        String h;
        if(hora<10)
            h="0" + hora;
        else
            h=hora + "";
        
        return h;
            
    }
    
    
    
    public void Horario(int horaing,int mining,int seging,int horasal,int minsal,int segsal,int tiempo)
    {
        String horarioI,hora,min,seg,horarioS;
        horarioI=HorarioDate(horaing) + ":" + HorarioDate(mining) + ":" +HorarioDate(seging);
        horarioS=HorarioDate(horasal) + ":" + HorarioDate(minsal) + ":" +HorarioDate(segsal);
        aummin=mining;
        aumhora=horaing;
        
        while(horarioI.compareTo(horarioS)<0)
        {
            if(aummin>=60)
            {
                
                aummin=aummin-60;
                aumhora++;
            }
            hora=HorarioDate(aumhora);
            min=HorarioDate(aummin);
            seg=HorarioDate(seging);
            horarioI= hora + ":" + min + ":" + seg;
            if(horarioI.compareTo(horarioS)<0)
            {
                M.addRow(new Object []{horarioI,""});
            }
            
            aummin+= tiempo;
        }
        
    }
    
    public String DiaSemana(int dia)
    {
        String diasem="";
        switch(dia)
        {
            case 1: diasem="domingo";break;
            case 2: diasem="lunes";break;
            case 3: diasem="martes";break;
            case 4: diasem="miercoles";break;
            case 5: diasem="jueves";break;
            case 6: diasem="viernes";break;
            case 7: diasem="sabado";break;
        }
        
        return diasem;
    }
    
    
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
    
    public String GetDate(Calendar calendario)
    {
        int dia,mes,año;
        String fecha;
        
        dia=calendario.get(Calendar.DATE);
        mes=calendario.get(Calendar.MONTH) + 1;
        año=calendario.get(Calendar.YEAR);
        
        fecha=año+"-"+mes+"-"+dia;
        
        return fecha;
    }
    
    public String GetTime(Calendar calendario)
    {
        int hr,min,seg;
        String hora;
        
        hr=calendario.get(calendario.HOUR_OF_DAY);
        min=calendario.get(calendario.MINUTE);
        seg=calendario.get(calendario.SECOND);
        
        hora=HorarioDate(hr)+":"+HorarioDate(min)+":"+HorarioDate(seg);
        
        return hora;
    }
    
    private void btnDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibilidadActionPerformed
        int idmedico=Integer.parseInt(cbIdmedico.getSelectedItem().toString());
        int horai=0,horas=0,mini=0,mins=0,segi=0,segs=0,dia;
        int tiempo=0,contador=0;
        String fecha=Date(calFecha);
        dia=calFecha.getCalendar().get(Calendar.DAY_OF_WEEK);
        try
        {
            Statement instruccion=conexion.getConexionBD().createStatement();
            ResultSet tabla =instruccion.executeQuery("select substring(horaingreso,1,2),substring(horaingreso,4,2),substring(horaingreso,7,2),substring(horasalida,1,2),substring(horasalida,4,2),substring(horasalida,7,2),tiempoatencion from horario_medico where refid_medico= " + idmedico + " and dia_laboral='" + DiaSemana(dia) + "'");
            M=new DefaultTableModel();
            M.addColumn("Horario Médico");
            M.addColumn("Disponibilidad de cita médica");
            this.tblCitas.setModel(M);
            if(tabla.next())
            {
                horai=tabla.getInt(1);
                mini=tabla.getInt(2);
                segi=tabla.getInt(3);
                horas=tabla.getInt(4);
                mins=tabla.getInt(5);
                segs=tabla.getInt(6);
                tiempo=tabla.getInt(7);
                Horario(horai,mini,segi,horas,mins,segs,tiempo);
            }
            
            ResultSet tabla1=instruccion.executeQuery("select count(*) from cita_medica" +
                                                        " where refid_medico=" + idmedico + " and fechaprogramada_cita='" + fecha + "'");
            if(tabla1.next())
            {
                contador=tabla1.getInt("count(*)");
            }
            if(contador>0)
            {
                
                ResultSet tabla2=instruccion.executeQuery("select horaprogramada_cita from cita_medica" +
                                                        " where refid_medico=" + idmedico + " and fechaprogramada_cita='" + fecha + "'");

                while(tabla2.next())
                {
                    for(int i=0;i<tblCitas.getRowCount();i++)
                    {
                        if(tabla2.getString("horaprogramada_cita").compareTo(String.valueOf(tblCitas.getValueAt(i, 0)))==0)
                        {
                            if(tblCitas.isCellEditable(i, 1))
                            {
                                tblCitas.setValueAt("Reservado",i,1);    
                            }   
                        }
                    }
                }
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_btnDisponibilidadActionPerformed

    private void btnReservarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarCitaActionPerformed
        String idmedico=cbIdmedico.getSelectedItem().toString();
        Calendar cal=Calendar.getInstance();
        String med="",fepro="",horapro="",fereg="",horareg="";
        int numorden=0;
        try
        {
            Statement instruccion=conexion.getConexionBD().createStatement();
            
            ResultSet tabla3=instruccion.executeQuery("select nombres_medico,apellpat_medico from medicos where id_medico=" + idmedico);
            if(tabla3.next())
            {
                med=tabla3.getString("nombres_medico") + " " + tabla3.getString("apellpat_medico");
            }
            for(int i=0;i<tblCitas.getRowCount();i++)
            {
                if(String.valueOf(tblCitas.getValueAt(i, 1)).compareTo("cita")==0)
                {
                    numorden=i+1;
                    horapro=String.valueOf(tblCitas.getValueAt(i, 0));
                }  

            }

            fepro=Date(calFecha);
            fereg=GetDate(cal);
            horareg=GetTime(cal);
            txtOrden.setText(numorden + "");
            txtMedico.setText(med);
            txtFepro.setText(fepro);
            txtHoraprog.setText(horapro);
            txtFeReg.setText(fereg);
            txtHoraReg.setText(horareg);
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_btnReservarCitaActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        Tablas Objeto=new Tablas();
        Objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void cbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspecialidadActionPerformed
        String especialidad;
        int id=0;
        double costo=0;
        especialidad=cbEspecialidad.getSelectedItem().toString();
        cbIdmedico.addItem("Apuntador");
        cbIdmedico.setSelectedIndex(0);
        EliminarComboBox(cbIdmedico);
        cbIdmedico.addItem("--Seleccionar--");
        try
        {
            Statement instruccion=conexion.getConexionBD().createStatement();
            ResultSet tabla =instruccion.executeQuery("select * from especialidades where nombre_especialidad= '" + especialidad + "'");
            if(tabla.next())
            {
                id=tabla.getInt("id_especialidad");
                costo=tabla.getDouble("costo_especialidad");
            }
            
            txtCosto.setText(costo + "");
            ResultSet tabla1=instruccion.executeQuery("select id_medico from medicos where refid_especialidad=" + id);
 
            while(tabla1.next())
            {
                cbIdmedico.addItem(tabla1.getString("id_medico"));
            } 
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_cbEspecialidadActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String fepro,horapro,fereg,horareg;
        int idmed,idpac,numorden; 
        idmed=Integer.parseInt(cbIdmedico.getSelectedItem().toString());
        idpac=Integer.parseInt(cbIdpaciente.getSelectedItem().toString());
        numorden=Integer.parseInt(txtOrden.getText());
        fepro=txtFepro.getText();
        horapro=txtHoraprog.getText();
        fereg=txtFeReg.getText();
        horareg=txtHoraReg.getText();
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();
            
            instruccion.executeUpdate("INSERT INTO cita_medica(refid_medico,refid_paciente,fechaprogramada_cita,horaprogramada_cita,fecharegistro_cita,horaregistro_cita,numorden_cita) VALUES("
                                +   idmed + "," + idpac + ",'" + fepro + "','" + horapro + "','" + fereg + "','" + horareg + "'," + numorden + ")");
            
            JOptionPane.showMessageDialog(null,"==> Se ha Agregado el registro de la cita medica del paciente correctamente <==");
            Ticket();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> Los campos de la cita medica internado han sido mal ingresados <==\n"
                                                 + "        ==> Es necesario llenar todos los campos <== ");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    public void Ticket()
    {
        int idmax=0;
        try
        {
            Statement instruccion=conexion.getConexionBD().createStatement();
            ResultSet tabla=instruccion.executeQuery("select max(id_cita) from cita_medica");
            if(tabla.next())
            {
                idmax=tabla.getInt("max(id_cita)");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
        
        TicketCita Objeto=new TicketCita();
        Objeto.setVisible(true);
        this.dispose();
        
        Objeto.txtEsp.setText(cbEspecialidad.getSelectedItem().toString());
        Objeto.txtMed.setText(txtMedico.getText());
        Objeto.txtpac.setText(cbPaciente.getSelectedItem().toString());
        Objeto.txtId.setText(idmax + "");
        Objeto.txtFecha.setText(txtFepro.getText());
        Objeto.txtHora.setText(txtHoraprog.getText());
        Objeto.txtNumorden.setText(txtOrden.getText() + "");
        Objeto.txtHoraReg.setText(txtHoraReg.getText());
        Objeto.txtFereg.setText(txtFeReg.getText());
    }
    public void EliminarTabla()
    {
        
        for(int i=0;i<tblCitas.getRowCount();i++)
        {
            M.removeRow(i);
            i--;
        }
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtOrden.setText("");
        txtCosto.setText("");
        txtFeReg.setText("");
        txtFepro.setText("");
        txtHoraReg.setText("");
        txtHoraprog.setText("");
        txtMedico.setText("");
        EliminarTabla();
        cbEspecialidad.setSelectedIndex(0);
        cbIdmedico.setSelectedIndex(0);
        cbIdpaciente.setSelectedIndex(0);
        cbPaciente.setSelectedIndex(0);
        txtOrden.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPacienteActionPerformed
        String pac=cbPaciente.getSelectedItem().toString();

        cbIdpaciente.addItem("Apuntador");
        cbIdpaciente.setSelectedIndex(0);
        EliminarComboBox(cbIdpaciente);
        cbIdpaciente.addItem("--Seleccionar--");
        try
        {
            Statement instruccion= conexion.getConexionBD().createStatement();

            ResultSet tabla5=instruccion.executeQuery("select id_paciente from pacientes where nombres_paciente= '" + pac + "'");

            while(tabla5.next())
            {
                cbIdpaciente.addItem(tabla5.getString("id_paciente"));
            }

        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"==> La conexion con Mysql es incorrecta <==");
        }
    }//GEN-LAST:event_cbPacienteActionPerformed

    
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
            java.util.logging.Logger.getLogger(CitaMédica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CitaMédica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CitaMédica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CitaMédica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CitaMédica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDisponibilidad;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReservarCita;
    private javax.swing.JButton btnRetroceder;
    public com.toedter.calendar.JDateChooser calFecha;
    public javax.swing.JComboBox<String> cbEspecialidad;
    public javax.swing.JComboBox<String> cbIdmedico;
    public javax.swing.JComboBox<String> cbIdpaciente;
    public javax.swing.JComboBox<String> cbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    public javax.swing.JTable tblCitas;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtFeReg;
    public javax.swing.JTextField txtFepro;
    public javax.swing.JTextField txtHoraReg;
    public javax.swing.JTextField txtHoraprog;
    public javax.swing.JTextField txtMedico;
    public javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables
}
