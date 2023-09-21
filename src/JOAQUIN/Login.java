
package JOAQUIN;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import utilities.MetodoGeneral;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        MetodoGeneral.colocarImagen(lblFondo, "./src/imagenes/fondo2.png");
        MetodoGeneral.colocarImagen(lblFondo2, "./src/imagenes/blanco.png");
        MetodoGeneral.colocarImagen(lblCodigo, "./src/imagenes/perfil.png");
        MetodoGeneral.colocarImagen(lblContra, "./src/imagenes/contraseña.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblCodigo = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnIngresar2 = new javax.swing.JButton();
        lblFondo2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicio.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(102, 0, 255));
        lblInicio.setText("INICIAR SESIÓN");
        jPanel1.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 120, 20));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 204));
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 130, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 230, 10));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 204));
        jLabel4.setText("CODIGO ALUMNO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 130, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(102, 0, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 230, 10));
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 30, 30));
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 30, 30));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 160, 30));
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 160, 30));

        btnIngresar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("DOCENTE");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        btnIngresar2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnIngresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar2.setText("INGRESAR");
        btnIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 110, 30));

        lblFondo2.setBackground(new java.awt.Color(153, 0, 255));
        lblFondo2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 250, 390));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar2ActionPerformed

   
    public static void main(String args[]) {
        try {
//            UIManager.setLookAndFeel( new FlatLightLaf() );
//            FlatGradiantoMidnightBlueIJTheme.setup();
              FlatGradiantoDarkFuchsiaIJTheme.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblContra;
    public javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblInicio;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtContra;
    // End of variables declaration//GEN-END:variables
}
