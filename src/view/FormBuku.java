/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import javax.swing.JOptionPane;
import control.bukuControl;
import model.Buku;
import exception.*;

/**
 *
 * @author haikak
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    
    private bukuControl BC;
    String action;
    Buku buku;
    
    public FormBuku() {
        initComponents();
        BC=new bukuControl();
        setEnDis(false);
    }
    
     public void setEnDis(boolean val)
    {
        txtID_Buku.setEnabled(val);
        txtJudul.setEnabled(val);
        txtPenerbit.setEnabled(val);
        txtPengarang.setEnabled(val);
        txtJumlah.setEnabled(val);
        txtHarga.setEnabled(val);
        btnBatal.setEnabled(val);  
        btnSelesai.setEnabled(val);
    }
    
    public void clearTxt()
    {
        txtID_Buku.setText("");
        txtJudul.setText("");
        txtPenerbit.setText("");
        txtPengarang.setText("");
        txtJumlah.setText("");
        txtHarga.setText("");     
        txtCari.setText("");
    }
    
    public void ExHarga() throws exHarga
    {
            if(Double.parseDouble(txtHarga.getText())<=0)    
            {
                throw new exHarga();
            }
    }
    
     public void ExJumlah() throws exJumlah
    {
            if(Integer.parseInt(txtJumlah.getText())<=0)    
            {
                throw new exJumlah();
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCari = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtID_Buku = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 73, 30));

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, 30));

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, 30));

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, 30));

        btnTampil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTampil.setText("Tampil");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });
        getContentPane().add(btnTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 80, 30));

        btnKembali.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKembali.setText("Log Out");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 80, 30));

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jumlah      :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, 30));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Buku     :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, 30));

        jLabel4.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pengarang :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 30));

        jLabel5.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Judul         :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, 30));

        jLabel6.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Penerbit    :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 80, 30));

        jLabel7.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga        :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, 30));

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 300, 30));
        getContentPane().add(txtID_Buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 300, 30));
        getContentPane().add(txtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 300, 30));
        getContentPane().add(txtPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 300, 30));

        txtPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPenerbitActionPerformed(evt);
            }
        });
        getContentPane().add(txtPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 300, 30));

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 300, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/logo.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 160, 80));
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 440, 30));

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Buku   :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 70, 20));

        btnBatal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 80, 30));

        btnSelesai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSelesai.setText("Selesai");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 323, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Bg Tembok.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPenerbitActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if(action.equalsIgnoreCase("editAtauDeleteBuku"))
        {
            BC.deleteBuku(txtID_Buku.getText());
            JOptionPane.showMessageDialog(this, "Buku Berhasil Dihapus");
        }          
        clearTxt();
        btnBatal.setEnabled(false);
        txtCari.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        // TODO add your handling code here:
        FormListBuku LB = new FormListBuku();
        LB.setVisible(true);
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        action="Tambah";   
        setEnDis(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        clearTxt();
        btnSelesai.setEnabled(false); 
        setEnDis(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
         if(BC.searchBuku(txtCari.getText())==null)
             JOptionPane.showMessageDialog(this,"Cari Dahulu ");
         else
         {
        if(action.equalsIgnoreCase("editAtauDeleteBuku"))
        {                    
            setEnDis(true);
            btnSelesai.setEnabled(true);
            btnBatal.setEnabled(true);            
        }
        else
            setEnDis(false);
         }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        // TODO add your handling code here:
         try
        {
            if(action.equalsIgnoreCase("Tambah"))
            {
                ExHarga();
                ExJumlah();
                buku=new Buku(txtID_Buku.getText(),txtPengarang.getText(),txtJudul.getText(),
                    Integer.parseInt(txtJumlah.getText()), Double.parseDouble(txtHarga.getText()),
                    txtPenerbit.getText());
                BC.InsertDataBuku(buku);
                JOptionPane.showMessageDialog(this,"Buku Berhasil Ditambah");
            }
            else if(action.equalsIgnoreCase("editAtauDeleteBuku"))
            {
                ExHarga();
                ExJumlah();
               buku=new Buku(txtID_Buku.getText(),txtPengarang.getText(),txtJudul.getText(),
                        Integer.parseInt(txtJumlah.getText()), Double.parseDouble(txtHarga.getText()),
                        txtPenerbit.getText());
                BC.editBuku(buku, txtCari.getText());
                
                JOptionPane.showMessageDialog(this,"Data Buku Berhasil Diedit");
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
        catch(exHarga e)
        {
            JOptionPane.showMessageDialog(this,e.message());
        }
        catch(exJumlah e1)
        {
             JOptionPane.showMessageDialog(this,e1.message());
        }
         
        
        
        clearTxt();
        btnSelesai.setEnabled(false);
        btnBatal.setEnabled(false);
        setEnDis(false);
        txtCari.setText("");
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if(txtCari.getText().isEmpty())
              JOptionPane.showMessageDialog(this, "Isi kolom cari dahulu");
        else
        {
        if(BC.searchBuku(txtCari.getText())!=null)
        {
            buku=BC.searchBuku(txtCari.getText());
            action="editAtauDeleteBuku";
            txtID_Buku.setText(buku.getID_Buku());
            txtPengarang.setText(buku.getPengarang());
            txtPenerbit.setText(buku.getPenerbit());
            txtJudul.setText(buku.getJudul());
            txtJumlah.setText(String.valueOf(buku.getJumlah()));
            txtHarga.setText(String.valueOf(buku.getHarga()));
            btnBatal.setEnabled(rootPaneCheckingEnabled);
        }   
        else
            JOptionPane.showMessageDialog(this, "ID Buku Tidak Ditemukan");
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        FormLogin L = new FormLogin(); dispose();
        L.setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID_Buku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    // End of variables declaration//GEN-END:variables
}
