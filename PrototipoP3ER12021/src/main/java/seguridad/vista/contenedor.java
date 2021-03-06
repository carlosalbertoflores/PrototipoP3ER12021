package seguridad.vista;

import com.formdev.flatlaf.FlatDarkLaf;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import mantenimineto.vista.maestros;
import mantenimineto.vista.mantenimineto_alumno;
import mantenimineto.vista.sedes;
import proceso.vista.proceso_recuperacion;
import seguridad.dominio.Usuario;

import seguridad.dominio.Permisos;
import seguridad.dominio.Usuario;

/**
 *
 * @author 
 */
public class contenedor extends javax.swing.JFrame {

private proceso_recuperacion proceso_recuperacion; 
    private FmrBitacora formFmrBitacora;
private   mantenimineto_alumno   mantenimineto_alumno ;
private  sedes sedes;
private maestros maestros;
    /**
     * Creates new form MDI_Seguridad
     *
     * @throws java.net.UnknownHostException
     */
    MDI_Components mdi_components = new MDI_Components();

 

    /*------------------------------------------*/
    public contenedor() throws UnknownHostException {
        initComponents();

        this.setTitle("Usuario: " + "[" + Login.usuarioSesion + "]" + " \t" + "IP: [" + mdi_components.getIp() + "]");

        var usuario = Login.usuarioSesion;
        var modulo = "Seguridad";

        //generarPermisos.getPermisos(modulo, usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopPane_Escritorio = new javax.swing.JDesktopPane()
        ;
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        M_ccompras = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        cerrar_sesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hotelero");
        setResizable(false);

        JDesktopPane_Escritorio.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Carlos Alberto Flores  De  paz  9959-19-186");

        JDesktopPane_Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDesktopPane_EscritorioLayout = new javax.swing.GroupLayout(JDesktopPane_Escritorio);
        JDesktopPane_Escritorio.setLayout(JDesktopPane_EscritorioLayout);
        JDesktopPane_EscritorioLayout.setHorizontalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPane_EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(544, Short.MAX_VALUE))
        );
        JDesktopPane_EscritorioLayout.setVerticalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPane_EscritorioLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(603, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        M_ccompras.setText("Catalogos");
        M_ccompras.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem3.setText("Mantenimiento Alumno");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        M_ccompras.add(jMenuItem3);

        jMenuItem4.setText("Mantenientos Maestros");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        M_ccompras.add(jMenuItem4);

        jMenuItem5.setText("Mantenimiento Sedes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        M_ccompras.add(jMenuItem5);

        jMenuBar1.add(M_ccompras);

        jMenu4.setText("Procesos");
        jMenu4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem2.setText("Proceso de Pago de  Recuperacion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu12.setText("Informes");
        jMenu12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenu13.setText("Historial");

        jMenuItem1.setText("Bitacora Comercial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem1);

        jMenu12.add(jMenu13);

        jMenuBar1.add(jMenu12);

        jMenu6.setText("Herramientas");
        jMenu6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ayuda");
        jMenu7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenu11.setText("Ayuda");
        jMenu11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem7.setText("Ayuda Menu");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        jMenu7.add(jMenu11);

        jMenuBar1.add(jMenu7);

        cerrar_sesion.setText("Cerrar Sesi??n");
        cerrar_sesion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_sesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(cerrar_sesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
      


    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        mantenimineto_alumno = new mantenimineto_alumno();
        mantenimineto_alumno.setVisible(true);
        JDesktopPane_Escritorio.add(mantenimineto_alumno);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        proceso_recuperacion = new proceso_recuperacion();
        proceso_recuperacion.setVisible(true);
        JDesktopPane_Escritorio.add(proceso_recuperacion);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_sesionMouseClicked

    }//GEN-LAST:event_cerrar_sesionMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
   maestros = new maestros();
         maestros.setVisible(true);
        JDesktopPane_Escritorio.add( maestros);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
  sedes = new sedes();
       sedes.setVisible(true);
        JDesktopPane_Escritorio.add(sedes);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new contenedor().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(contenedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPane_Escritorio;
    public static javax.swing.JMenu M_ccompras;
    public static javax.swing.JMenu cerrar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    public static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
