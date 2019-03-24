
package formularios;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CargaSistema extends javax.swing.JFrame {

    public static  Timer timer;  
    public static int n=0;
    public static ActionListener evt;
    
    public CargaSistema() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Carga del Sistema");
        evt=new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                n=probCarga.getValue();
                
                if(n<100)
                { 
                    n++;
                    probCarga.setValue(n);
                }
                else
                {
                    timer.stop();
                    Tablas Objeto=new Tablas();
                    Objeto.setVisible(true);
                    dispose();
                }
                
                
            }
        };
        timer = new Timer(30,evt);
        timer.start(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        probCarga = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        probCarga.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(probCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 312, 52));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("CARGANDO SISTEMA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 148, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRABAJO FINAL IMAGENES/imagen-suave.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(CargaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar probCarga;
    // End of variables declaration//GEN-END:variables
}
