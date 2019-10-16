
package view;

import javax.swing.JOptionPane;
import model.Buku;
import model.Transaksi;
import control.transaksiControl;
import control.bukuControl;

import exception.*;
public class FormTransaksi extends javax.swing.JFrame {

    private transaksiControl TC;
    private bukuControl BC;
    String action;
    Transaksi trx;
    Buku buku;
    private int cekIn;
    public FormTransaksi() {
        initComponents();
        
                setEnDis(false);
        TC=new transaksiControl();
        BC=new bukuControl();
    }
  public void clearText() {
    txtHargaBuku.setText("");
    txtIDTransaksi.setText("");
    txtJumlahBuku.setText("");
    txtIdBuku.setText("");
    txtNamaBuku.setText("");
    txtPembeli.setText("");
    txtTotalHarga.setText("");
    txtbayar.setText("");
    txtkembali.setText("");
    }
     public void setEnDis(boolean val)
    {
        txtHargaBuku.setEnabled(val);
       txtNamaBuku.setEnabled(val);
       txtkembali.setEnabled(val);
       txtTotalHarga.setEnabled(val);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPembeli = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtIdBuku = new javax.swing.JTextField();
        txtNamaBuku = new javax.swing.JTextField();
        txtHargaBuku = new javax.swing.JTextField();
        txtJumlahBuku = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtkembali = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnTampilTransaksi = new javax.swing.JButton();
        btnTampilBuku = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnCek = new javax.swing.JButton();
        txtIDTransaksi = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        bntKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TRANSAKSI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 210, 60));

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 525));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bayar             :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Pembeli :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Buku         :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Buku    :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga Buku    :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jumlah Buku   :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Harga    :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Harga    :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Harga    :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, 30));
        getContentPane().add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 150, 30));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 90, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Harga    :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, 30));

        txtPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPembeliActionPerformed(evt);
            }
        });
        getContentPane().add(txtPembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 230, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 230, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 230, 30));

        txtIdBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, 30));
        getContentPane().add(txtNamaBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 230, 30));

        txtHargaBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaBukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtHargaBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 230, 30));
        getContentPane().add(txtJumlahBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 80, 30));
        getContentPane().add(txtTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 230, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kembali          : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 130, 30));
        getContentPane().add(txtkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, 30));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 130, 50));

        btnTampilTransaksi.setText("Tampil Transaksi");
        btnTampilTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btnTampilTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 220, 40));

        btnTampilBuku.setText("Lihat Buku");
        btnTampilBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilBukuActionPerformed(evt);
            }
        });
        getContentPane().add(btnTampilBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 220, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/logo.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -20, 170, 100));

        btnTransaksi.setText("Transaksi");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 200, 80));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID Transaksi :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 120, -1));

        btnCek.setText("Cek ");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        getContentPane().add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 73, 30));

        txtIDTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 150, 40));

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 70, 30));

        bntKembali.setText("Kembalian");
        bntKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(bntKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/bg buku2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txtPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPembeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPembeliActionPerformed
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
    private void txtHargaBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaBukuActionPerformed
    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
      
          try{
              trx =new Transaksi (txtIDTransaksi.getText(), txtNamaBuku.getText(), txtPembeli.getText(),
                      Double.parseDouble(txtHargaBuku.getText()),
                      Integer.parseInt(txtJumlahBuku.getText()), Double.parseDouble(txtTotalHarga.getText()));
              TC.InsertDataTransaksi (trx);
               buku.setJumlah(buku.getJumlah()-Integer.parseInt(txtJumlahBuku.getText()));
              BC.editBuku(buku, txtIdBuku.getText());
              JOptionPane.showMessageDialog(this,"Transaksi Berhasil Ditambah");
              clearText();
          }
          catch(NumberFormatException e2)
          {
              JOptionPane.showMessageDialog(this, e2.getMessage());
          }
          catch(NullPointerException e4)
          {
              JOptionPane.showMessageDialog(this, e4.getMessage());
          }   
    }//GEN-LAST:event_btnTransaksiActionPerformed
    private void txtIDTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDTransaksiActionPerformed
    private void txtIdBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBukuActionPerformed
       
    }//GEN-LAST:event_txtIdBukuActionPerformed
    private void btnTampilBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilBukuActionPerformed
         FormListBuku LB = new FormListBuku();
        LB.setVisible(true);
    }//GEN-LAST:event_btnTampilBukuActionPerformed
    private void btnTampilTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilTransaksiActionPerformed
 FormListTransaksi LT = new FormListTransaksi();
        LT.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnTampilTransaksiActionPerformed
    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
    try{
        if(BC.searchBuku(txtIdBuku.getText())!=null)
        {
          buku=BC.searchBuku(txtIdBuku.getText());
          if(buku.getJumlah()>0)
          {
            txtNamaBuku.setText(buku.getJudul());
         txtHargaBuku.setText(String.valueOf(buku.getHarga()));
          }
            else
            JOptionPane.showMessageDialog(this, "Buku tidak ada stok");
        }   
        else
            JOptionPane.showMessageDialog(this, "ID Buku Tidak Ditemukan");
      }
        catch(NumberFormatException e2)
        {
            JOptionPane.showMessageDialog(this, e2.getMessage());
        }
    }//GEN-LAST:event_btnCekActionPerformed
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
     
        buku=BC.searchBuku(txtIdBuku.getText());
        try{
            ExJumlah();
             if( txtJumlahBuku.getText().isEmpty() || txtHargaBuku.getText().isEmpty() ){
             JOptionPane.showMessageDialog(this," pilih buku dan masukkan jumlah");}
              else 
              {
                    if(Integer.parseInt(txtJumlahBuku.getText()) <=buku.getJumlah())
                    {
                        int jumlah=Integer.parseInt(txtJumlahBuku.getText());
                         double harga=Double.parseDouble(txtHargaBuku.getText());
                        txtTotalHarga.setText(String.valueOf(jumlah*harga));
                     }
                    else
                        JOptionPane.showMessageDialog(this," Jumlah pembelian Melebihi Stok");

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
        catch(exJumlah e1)
        {
             JOptionPane.showMessageDialog(this,e1.message());
        }
    }//GEN-LAST:event_btnHitungActionPerformed
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        FormLogin L = new FormLogin(); dispose();
        L.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void bntKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntKembaliActionPerformed
     try
        {
            exBayar();
            
                double kembali=Double.parseDouble(txtbayar.getText())-Double.parseDouble(txtTotalHarga.getText());
                txtkembali.setText(String.valueOf(kembali));
        }
        catch(exBayar e1)
        {
             JOptionPane.showMessageDialog(this,e1.message());
        }
         catch(NullPointerException e4)
        {
            JOptionPane.showMessageDialog(this, e4.getMessage());
        } 
       catch(NumberFormatException e2)
        {
            JOptionPane.showMessageDialog(this, e2.getMessage());
        }
    }//GEN-LAST:event_bntKembaliActionPerformed

    public void ExJumlah() throws exJumlah
    {
            if(Integer.parseInt(txtJumlahBuku.getText())<=0)    
            {
                throw new exJumlah();
            }
    }
    public void exBayar() throws exBayar
    {
        if(Double.parseDouble(txtbayar.getText())<=Double.parseDouble(txtTotalHarga.getText()) )    
            {
                throw new exBayar();
            }
    }
    
     
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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntKembali;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnTampilBuku;
    private javax.swing.JButton btnTampilTransaksi;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtHargaBuku;
    private javax.swing.JTextField txtIDTransaksi;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJumlahBuku;
    private javax.swing.JTextField txtNamaBuku;
    private javax.swing.JTextField txtPembeli;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtkembali;
    // End of variables declaration//GEN-END:variables
}
