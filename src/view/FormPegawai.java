/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;
import control.*;
import dao.*;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormPegawai extends javax.swing.JFrame {

    private PegawaiDAO PD= new PegawaiDAO();
    private  administratorControl AC=new administratorControl();
    private  kasirControl KC=new kasirControl();
    Administrator Ad= new Administrator();
    Kasir Ka = new Kasir();
    DefaultTableModel tabelModel;
    
    String peran="";
    String action;
    public FormPegawai() {
        initComponents();
        setEnableData(false);
        AC = new administratorControl();
        KC = new kasirControl();
        jButtonSelesai.setVisible(false);
        jButtonBatal.setVisible(false);
        setEnableData(false);
    }
    public void setEnableTambah(boolean val)
    {
        jTextID.setEnabled(val);
        jTextNama.setEnabled(val);
        jTextGaji.setEnabled(val);
        jRadioButtonKasir.setEnabled(val);
        jRadioButtonPenyetok.setEnabled(val);
        jTextFieldUserName.setEnabled(val);
        jTextFieldPassword.setEnabled(val);
        jButtonSelesai.setVisible(val);
        jButtonBatal.setVisible(val);
        jButtonSelesai.setEnabled(val);
        jButtonBatal.setEnabled(val);
    }
    
    public void setEnableAdministrator(boolean val)
    {
        jTextID.setEnabled(val);
        jTextNama.setEnabled(val);
        jTextGaji.setEnabled(val);
        jTextFieldUserName.setEnabled(val);
        jTextFieldPassword.setEnabled(val);
        jTextFieldDivisi.setEnabled(val);
        jButtonSelesai.setVisible(val);
        jButtonBatal.setVisible(val);
        jButtonSelesai.setEnabled(val);
        jButtonBatal.setEnabled(val);
    }
    
    public void setEnableKasir(boolean val)
    {
        jTextID.setEnabled(val);
        jTextNama.setEnabled(val);
        jTextGaji.setEnabled(val);
        jTextFieldUserName.setEnabled(val);
        jTextFieldPassword.setEnabled(val);
        jTextFieldJamKerja.setEnabled(val);
        jButtonSelesai.setVisible(val);
        jButtonBatal.setVisible(val);
        jButtonSelesai.setEnabled(val);
        jButtonBatal.setEnabled(val);
    }
    public void setEnableData(boolean val)
    {
        jTextID.setEnabled(val);
        jTextNama.setEnabled(val);
        jTextGaji.setEnabled(val);
        jRadioButtonKasir.setEnabled(val);
        jRadioButtonPenyetok.setEnabled(val);
        jTextFieldDivisi.setEnabled(val);
        jTextFieldJamKerja.setEnabled(val);
        jTextFieldUserName.setEnabled(val);
        jTextFieldPassword.setEnabled(val);
        jButtonSelesai.setVisible(val);
        jButtonBatal.setVisible(val);
    }
    
    public void clearText() {
        jTextID.setText("");
        jTextNama.setText("");
        jTextGaji.setText("");
        jTextFieldDivisi.setText("");
        jTextFieldJamKerja.setText("");
        jTextFieldUserName.setText("");
        jTextFieldPassword.setText("");
        jTextFieldCari.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonKasir = new javax.swing.JRadioButton();
        jRadioButtonPenyetok = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextNama = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jTextGaji = new javax.swing.JTextField();
        jTextFieldDivisi = new javax.swing.JTextField();
        jTextFieldJamKerja = new javax.swing.JTextField();
        jTextFieldUserName = new javax.swing.JTextField();
        jButtonSelesai = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLayeredPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        jLayeredPane1.setForeground(new java.awt.Color(102, 102, 0));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnTambah);
        btnTambah.setBounds(10, 20, 80, 40);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnEdit);
        btnEdit.setBounds(10, 80, 80, 40);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnHapus);
        btnHapus.setBounds(10, 140, 80, 40);

        btnTampil.setText("Tampil");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnTampil);
        btnTampil.setBounds(10, 200, 80, 40);

        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnLogOut);
        btnLogOut.setBounds(10, 330, 80, 40);

        jPanel1.add(jLayeredPane1);
        jLayeredPane1.setBounds(60, 140, 110, 390);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel1.setText("FORM PEGAWAI");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(230, 10, 380, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 60);

        jTextFieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCariActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCari);
        jTextFieldCari.setBounds(60, 100, 460, 30);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari);
        btnCari.setBounds(540, 100, 70, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID Pegawai :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 80, 100, 20);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ID Pegawai         : ");
        jLayeredPane2.add(jLabel3);
        jLabel3.setBounds(30, 30, 130, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Gaji Pegawai       : ");
        jLayeredPane2.add(jLabel4);
        jLabel4.setBounds(30, 110, 140, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nama Pegawai    : ");
        jLayeredPane2.add(jLabel5);
        jLabel5.setBounds(30, 70, 130, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("User Name          : ");
        jLayeredPane2.add(jLabel7);
        jLabel7.setBounds(30, 270, 140, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Peran Pegawai   : ");
        jLayeredPane2.add(jLabel8);
        jLabel8.setBounds(30, 150, 150, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Jam Kerja      : ");
        jLayeredPane2.add(jLabel9);
        jLabel9.setBounds(50, 230, 100, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Divisi             : ");
        jLayeredPane2.add(jLabel10);
        jLabel10.setBounds(50, 190, 100, 30);

        jRadioButtonKasir.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButtonKasir);
        jRadioButtonKasir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonKasir.setText("Kasir");
        jRadioButtonKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKasirActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jRadioButtonKasir);
        jRadioButtonKasir.setBounds(310, 150, 100, 30);

        jRadioButtonPenyetok.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButtonPenyetok);
        jRadioButtonPenyetok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonPenyetok.setText("Penyetok");
        jRadioButtonPenyetok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPenyetokActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jRadioButtonPenyetok);
        jRadioButtonPenyetok.setBounds(160, 150, 90, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Password           : ");
        jLayeredPane2.add(jLabel11);
        jLabel11.setBounds(30, 310, 130, 30);
        jLayeredPane2.add(jTextFieldPassword);
        jTextFieldPassword.setBounds(150, 310, 260, 30);
        jLayeredPane2.add(jTextNama);
        jTextNama.setBounds(150, 70, 260, 30);

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jTextID);
        jTextID.setBounds(150, 30, 260, 30);
        jLayeredPane2.add(jTextGaji);
        jTextGaji.setBounds(150, 110, 260, 30);
        jLayeredPane2.add(jTextFieldDivisi);
        jTextFieldDivisi.setBounds(150, 190, 260, 30);
        jLayeredPane2.add(jTextFieldJamKerja);
        jTextFieldJamKerja.setBounds(150, 230, 260, 30);
        jLayeredPane2.add(jTextFieldUserName);
        jTextFieldUserName.setBounds(150, 270, 260, 30);

        jButtonSelesai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSelesai.setText("Selesai");
        jButtonSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelesaiActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButtonSelesai);
        jButtonSelesai.setBounds(20, 350, 190, 30);

        jButtonBatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButtonBatal);
        jButtonBatal.setBounds(233, 350, 180, 30);

        jPanel1.add(jLayeredPane2);
        jLayeredPane2.setBounds(180, 140, 430, 390);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Bg buku.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 10, 860, 530);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCariActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(peran=="Administrator")
            setEnableAdministrator(true);
        else if(peran=="Kasir")
            setEnableKasir(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if(peran=="Administrator")
        {
           AC.deleteAdministrator(jTextFieldCari.getText());
           clearText();
           JOptionPane.showMessageDialog(this, "Data berhasil dihapus~");
        }
        else if(peran=="Kasir")
        {
            KC.deleteKasir(jTextFieldCari.getText());
           clearText();
           JOptionPane.showMessageDialog(this, "Data berhasil dihapus~");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if(jTextFieldCari.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this, "Masukkan ID yang akan di Cari!!");
        }
        else
        {
            action="Edit atau Hapus";
            setEnableData(false);
            if(AC.searchAdministrator(jTextFieldCari.getText())!=null)
            {
                Administrator A= AC.searchAdministrator(jTextFieldCari.getText());
                if(A.getTugas().equals("Administrator"))
                {
                    jTextID.setText(A.getID_Pegawai());
                    jTextNama.setText(A.getNama());
                    jTextGaji.setText(String.valueOf(A.getGaji()));
                    jRadioButtonPenyetok.setSelected(true);
                    jTextFieldDivisi.setText(A.getDivisi());
                    jTextNama.setText(A.getNama());
                    jTextFieldJamKerja.setText("---");
                    jTextFieldUserName.setText(A.getUsername());
                    jTextFieldPassword.setText(A.getPassword());
                    peran="Administrator";
                }
                
            }
            if(KC.searchKasir(jTextFieldCari.getText())!=null )
            {
                Kasir A= KC.searchKasir(jTextFieldCari.getText());
                if(A.getTugas().equals("Kasir"))
                {

                    jTextID.setText(A.getID_Pegawai());
                    jTextNama.setText(A.getNama());
                    jTextGaji.setText(String.valueOf(A.getGaji()));
                    jRadioButtonKasir.setSelected(true);
                    jTextFieldJamKerja.setText(String.valueOf(A.getJamKerja()));
                    jTextNama.setText(A.getNama());
                    jTextFieldDivisi.setText("---");
                    jTextFieldUserName.setText(A.getUsername());
                    jTextFieldPassword.setText(A.getPassword());
                    peran="Kasir";
                }
            }
            if(peran!="Administrator" && peran!="Kasir")
            {
                JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan!");
            }
        }         
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        setEnableTambah(true);
        action="Tambah";
        clearText();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButtonSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelesaiActionPerformed
        // TODO add your handling code here:
        try
        {
            if(action.equalsIgnoreCase("Tambah"))
            {
                if(peran=="Administrator")
                {    
                    Administrator A= new Administrator(jTextID.getText(),jTextNama.getText(), jTextFieldUserName.getText(), jTextFieldPassword.getText(),
                            Double.valueOf(jTextGaji.getText()), jTextFieldDivisi.getText(), "Administrator");
                    AC.InsertDataAdministrator(A);
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambah!");
                }
                else if(peran=="Kasir")
                {    
                    Kasir A= new Kasir(jTextID.getText(),jTextNama.getText(), jTextFieldUserName.getText(), jTextFieldPassword.getText(), 
                            Double.valueOf(jTextGaji.getText()), Integer.valueOf(jTextFieldJamKerja.getText()), "Kasir");
                    KC.InsertDataKasir(A);
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambah!");
                }
                setEnableData(false);
                clearText();
                jButtonSelesai.setEnabled(false);
                jButtonBatal.setEnabled(false);
                peran="";
            }
            else if(action.equalsIgnoreCase("Edit atau Hapus"))
            {
                setEnableData(true);
                if(peran.equals("Administrator"))
                {
                    Administrator A= new Administrator(jTextID.getText(),jTextNama.getText(), jTextFieldUserName.getText(), jTextFieldPassword.getText(), 
                            Double.valueOf(jTextGaji.getText()), jTextFieldDivisi.getText(), "Administrator");
                    AC.editAdministrator(A,jTextFieldCari.getText());
                }
                else if(peran.equals("Kasir"))
                {
                    Kasir P= new Kasir(jTextID.getText(),jTextNama.getText(), jTextFieldUserName.getText(), jTextFieldPassword.getText(), 
                            Double.valueOf(jTextGaji.getText()), Integer.valueOf(jTextFieldJamKerja.getText()), "Kasir");
                    KC.editKasir(P, jTextFieldCari.getText());

                }
                JOptionPane.showMessageDialog(this, "Data berhasil diedit!");
                clearText();
                setEnableData(false);
            }
        }   
        catch(NumberFormatException e2)
        {
            JOptionPane.showMessageDialog(this, e2.getMessage());
        }
        catch(NullPointerException e4)
        {
            JOptionPane.showMessageDialog(this, e4.getMessage());
        }
    }//GEN-LAST:event_jButtonSelesaiActionPerformed

    private void jRadioButtonPenyetokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPenyetokActionPerformed
        // TODO add your handling code here:
        jTextFieldDivisi.setEnabled(true);
        jTextFieldJamKerja.setEnabled(false);
        jTextFieldJamKerja.setText("");
        peran="Administrator";
    }//GEN-LAST:event_jRadioButtonPenyetokActionPerformed

    private void jRadioButtonKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKasirActionPerformed
        // TODO add your handling code here:
        jTextFieldDivisi.setEnabled(false);
        jTextFieldJamKerja.setEnabled(true);
        jTextFieldDivisi.setText("");
        peran="Kasir";
    }//GEN-LAST:event_jRadioButtonKasirActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        // TODO add your handling code here:
        new FormListPegawai().setVisible(true);
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        FormLogin L = new FormLogin(); 
        dispose();
        L.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        // TODO add your handling code here:
        setEnableData(false);
        clearText();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTampil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonSelesai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonKasir;
    private javax.swing.JRadioButton jRadioButtonPenyetok;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JTextField jTextFieldDivisi;
    private javax.swing.JTextField jTextFieldJamKerja;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JTextField jTextGaji;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNama;
    // End of variables declaration//GEN-END:variables
}
