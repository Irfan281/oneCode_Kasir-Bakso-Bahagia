
package GUI;
import proses.Pelanggan;
import proses.Transaksi;
import proses.Keranjang;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
/**
 *
 * @author irfan281
 */
public class StrukGUI extends javax.swing.JFrame {
    private Pelanggan p1;
    private Transaksi t1;
    private Keranjang k1;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
    private LocalDateTime now = LocalDateTime.now();
    
    
    public StrukGUI(String nama, int nomor, int uang, Keranjang k2) {
        p1 = new Pelanggan(nama, nomor);
        t1 = new Transaksi(uang);
        k1 = new Keranjang();
        k1.setKeranjang(k2.getKeranjang2());
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txtMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(55, 85, 157));

        logo.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Logo.png"))); // NOI18N
        logo.setText("Bakso Bahagia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMenu.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        txtMenu.setText("Struk Pembelian");

        jLabel1.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel1.setText("Nama Pelanggan : " + p1.getNama());

        jLabel7.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel7.setText("No. Meja : " + p1.getNomorMeja());

        jLabel8.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel8.setText(k1.makananKeranjang(2));

        jLabel9.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel9.setText(k1.makananKeranjang(1));

        jLabel10.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel10.setText(k1.makananKeranjang(4));

        jLabel11.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel11.setText(k1.makananKeranjang(3));

        jLabel12.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel12.setText(k1.makananKeranjang(5));

        jLabel13.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel13.setText(k1.makananKeranjang(6));

        jLabel14.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel14.setText(k1.makananKeranjang(7));

        jLabel15.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel15.setText(k1.makananKeranjang(8));

        jLabel16.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel16.setText(k1.getJumlah(1, false));

        jLabel17.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel17.setText(k1.getJumlah(2, false));

        jLabel18.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel18.setText(k1.getJumlah(3, false));

        jLabel19.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel19.setText(k1.getJumlah(4, false));

        jLabel20.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel20.setText(k1.getJumlah(8, false));

        jLabel21.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel21.setText(k1.getJumlah(7, false));

        jLabel22.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel22.setText(k1.getJumlah(6, false));

        jLabel23.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel23.setText(k1.getJumlah(5, false));

        jLabel24.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel24.setText(k1.hargaSatuan(1));

        jLabel25.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel25.setText(k1.hargaSatuan(2));

        jLabel26.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel26.setText(k1.hargaSatuan(4));

        jLabel27.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel27.setText(k1.hargaSatuan(3));

        jLabel28.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel28.setText(k1.hargaSatuan(8));

        jLabel29.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel29.setText(k1.hargaSatuan(7));

        jLabel30.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel30.setText(k1.hargaSatuan(6));

        jLabel31.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel31.setText(k1.hargaSatuan(5));

        jLabel32.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText(k1.hargaPerItem(8));

        jLabel33.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText(k1.hargaPerItem(7));

        jLabel34.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText(k1.hargaPerItem(6));

        jLabel35.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText(k1.hargaPerItem(5));

        jLabel36.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText(k1.hargaPerItem(4));

        jLabel37.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText(k1.hargaPerItem(3));

        jLabel38.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText(k1.hargaPerItem(2));

        jLabel39.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText(k1.hargaPerItem(1));

        jLabel40.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel40.setText("Tanggal : " + dtf.format(now));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Total : " + k1.hargaTotal().toString());

        jLabel3.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel3.setText("Uang Pelanggan : " + t1.getUangBayar());

        jLabel41.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel41.setText("Uang Kembalian : " + t1.pembayaran(k1.hargaTotal()));

        jLabel42.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("---Terima Kasih ---");

        btnKembali.setBackground(new java.awt.Color(66, 85, 125));
        btnKembali.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel3)
                            .addComponent(jLabel40)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnKembali)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1))
                                            .addGap(18, 18, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel28)
                                                .addComponent(jLabel30)
                                                .addComponent(jLabel31)
                                                .addComponent(jLabel29)
                                                .addComponent(jLabel26)
                                                .addComponent(jLabel25)
                                                .addComponent(jLabel24)
                                                .addComponent(jLabel27))
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel20)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel23))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel37))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtMenu)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel16)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel19)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGap(32, 32, 32)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addComponent(btnKembali)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        MenuGUI menu = new MenuGUI();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtMenu;
    // End of variables declaration//GEN-END:variables
}
