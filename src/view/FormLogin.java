/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.JOptionPane;
import control.loginControl;
import model.Pegawai;
/**
 *
 * @author haikak
 */
public class FormLogin extends javax.swing.JFrame {
    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
    }
    loginControl LC=new loginControl();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPegawai = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnBatal = new javax.swing.JToggleButton();
        btnLogin = new javax.swing.JToggleButton();
        Bg_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPegawai.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnPegawai.setSelected(true);
        btnPegawai.setText("PEGAWAI");
        btnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 120, 40));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 80, 30));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 80, 30));

        txtUserName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 200, 30));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 200, 30));

        btnBatal.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 120, 40));

        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 120, 40));

        Bg_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/login.jpg"))); // NOI18N
        getContentPane().add(Bg_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_btnBatalActionPerformed
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Pegawai A = LC.Login(txtUserName.getText(), txtPassword.getText());
        if(A != null)
        {
            if(A.getTugas().equals("Kasir"))
            {
                this.hide();            
                this.setVisible(false);
                new FormTransaksi().setVisible(true);
                JOptionPane.showMessageDialog(this,"Login Kasir sukses");
            }
            else if(A.getTugas().equals("Administrator"))
            {
                this.hide();            
                this.setVisible(false);
                new FormBuku().setVisible(true);
                JOptionPane.showMessageDialog(this,"Login Administrator sukses");
            }
            else
                JOptionPane.showMessageDialog(this,"Login Untuk Administrator dan Kasir");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"password dan username salah!");
        }    
    }//GEN-LAST:event_btnLoginActionPerformed
    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        // TODO add your handling code here:
        Pegawai P = LC.Login(txtUserName.getText(), txtPassword.getText());
        if(P != null)
        {
            if(P.getTugas().equals("Manager"))
            {
                this.hide();         
                this.setVisible(false);
                new FormPegawai().setVisible(true);
                JOptionPane.showMessageDialog(this,"Login Manager sukses");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"password dan username salah!");
        }   
    }//GEN-LAST:event_btnPegawaiActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new FormLogin().setVisible(true);
               FormLogin mainFrame = new FormLogin();

mainFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg_Login;
    private javax.swing.JToggleButton btnBatal;
    private javax.swing.JToggleButton btnLogin;
    private javax.swing.JToggleButton btnPegawai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
