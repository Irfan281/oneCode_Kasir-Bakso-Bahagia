
package GUI;

import proses.Keranjang;
import java.util.HashMap;


public class KeranjangGUI extends javax.swing.JFrame {
    private Keranjang k1;
    
    public KeranjangGUI(Keranjang k2) {
        k1 = new Keranjang();
        k1.setKeranjang(k2.getKeranjang2());
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txtKeranjang = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPesanan = new javax.swing.JLabel();
        txtMenu4 = new javax.swing.JLabel();
        txtMenu5 = new javax.swing.JLabel();
        txtMenu6 = new javax.swing.JLabel();
        txtMenu7 = new javax.swing.JLabel();
        txtMenu29 = new javax.swing.JLabel();
        txtMenu30 = new javax.swing.JLabel();
        txtMenu31 = new javax.swing.JLabel();
        txtMenu32 = new javax.swing.JLabel();
        txtMenu33 = new javax.swing.JLabel();
        txtMenu34 = new javax.swing.JLabel();
        txtMenu35 = new javax.swing.JLabel();
        txtMenu36 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JLabel();
        txtHarga = new javax.swing.JLabel();
        txtMenu9 = new javax.swing.JLabel();
        txtMenu10 = new javax.swing.JLabel();
        txtMenu11 = new javax.swing.JLabel();
        txtMenu12 = new javax.swing.JLabel();
        txtMenu37 = new javax.swing.JLabel();
        txtMenu38 = new javax.swing.JLabel();
        txtMenu39 = new javax.swing.JLabel();
        txtMenu40 = new javax.swing.JLabel();
        txtMenu42 = new javax.swing.JLabel();
        txtMenu41 = new javax.swing.JLabel();
        txtMenu43 = new javax.swing.JLabel();
        txtMenu44 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1036, 581));

        header.setBackground(new java.awt.Color(55, 85, 157));

        logo.setFont(new java.awt.Font("Helvetica", 1, 30)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Logo.png"))); // NOI18N
        logo.setText("Bakso Bahagia");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtKeranjang.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        txtKeranjang.setText("Keranjang");

        btnBayar.setBackground(new java.awt.Color(66, 85, 125));
        btnBayar.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        txtPesanan.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        txtPesanan.setText("List Pesanan");

        txtMenu4.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu4.setText(k1.makananKeranjang(1));

        txtMenu5.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu5.setText(k1.makananKeranjang(2));

        txtMenu6.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu6.setText(k1.makananKeranjang(3));

        txtMenu7.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu7.setText(k1.makananKeranjang(4));

        txtMenu29.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu29.setText(k1.getJumlah(1, true));

        txtMenu30.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu30.setText(k1.getJumlah(2, true));

        txtMenu31.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu31.setText(k1.getJumlah(3, true));

        txtMenu32.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu32.setText(k1.getJumlah(4, true));

        txtMenu33.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu33.setText(k1.hargaPerItem(2));

        txtMenu34.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu34.setText(k1.hargaPerItem(1));

        txtMenu35.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu35.setText(k1.hargaPerItem(4));

        txtMenu36.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu36.setText(k1.hargaPerItem(3));

        txtJumlah.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        txtJumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJumlah.setText("Jumlah");

        txtHarga.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        txtHarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga.setText("Harga");

        txtMenu9.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu9.setText(k1.makananKeranjang(5));

        txtMenu10.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu10.setText(k1.makananKeranjang(6));

        txtMenu11.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu11.setText(k1.makananKeranjang(7));

        txtMenu12.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu12.setText(k1.makananKeranjang(8));

        txtMenu37.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu37.setText(k1.getJumlah(5, true));

        txtMenu38.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu38.setText(k1.getJumlah(6, true));

        txtMenu39.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu39.setText(k1.getJumlah(7, true));

        txtMenu40.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu40.setText(k1.getJumlah(8, true));

        txtMenu42.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu42.setText(k1.hargaPerItem(5));

        txtMenu41.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu41.setText(k1.hargaPerItem(6));

        txtMenu43.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu43.setText(k1.hargaPerItem(7));

        txtMenu44.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        txtMenu44.setText(k1.hargaPerItem(8));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenu4)
                            .addComponent(txtMenu5)
                            .addComponent(txtMenu6)
                            .addComponent(txtMenu7))
                        .addGap(277, 277, 277)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenu32)
                            .addComponent(txtMenu31)
                            .addComponent(txtMenu30)
                            .addComponent(txtMenu29)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesanan)
                        .addGap(237, 237, 237)
                        .addComponent(txtJumlah))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenu9)
                            .addComponent(txtMenu10)
                            .addComponent(txtMenu12)
                            .addComponent(txtMenu11))
                        .addGap(277, 277, 277)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenu38)
                            .addComponent(txtMenu37)
                            .addComponent(txtMenu39)
                            .addComponent(txtMenu40))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(txtMenu42, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100))
                        .addComponent(txtMenu41, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMenu43, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMenu44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenu33, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenu34, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenu35, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenu36, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga))
                        .addGap(92, 92, 92))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesanan)
                    .addComponent(txtJumlah)
                    .addComponent(txtHarga))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu4)
                    .addComponent(txtMenu29)
                    .addComponent(txtMenu34))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu5)
                    .addComponent(txtMenu30)
                    .addComponent(txtMenu33))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu6)
                    .addComponent(txtMenu31)
                    .addComponent(txtMenu36))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu7)
                    .addComponent(txtMenu32)
                    .addComponent(txtMenu35))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu9)
                    .addComponent(txtMenu37)
                    .addComponent(txtMenu42))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu10)
                    .addComponent(txtMenu38)
                    .addComponent(txtMenu41))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu11)
                    .addComponent(txtMenu39)
                    .addComponent(txtMenu43))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenu12)
                    .addComponent(txtMenu40)
                    .addComponent(txtMenu44))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keranjang.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        txtTotalHarga.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        txtTotalHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotalHarga.setText("Total : "+ k1.hargaTotal().toString());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKeranjang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKeranjang)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtTotalHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        InputDataGUI input = new InputDataGUI(k1);
        input.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBayarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtHarga;
    private javax.swing.JLabel txtJumlah;
    private javax.swing.JLabel txtKeranjang;
    private javax.swing.JLabel txtMenu10;
    private javax.swing.JLabel txtMenu11;
    private javax.swing.JLabel txtMenu12;
    private javax.swing.JLabel txtMenu29;
    private javax.swing.JLabel txtMenu30;
    private javax.swing.JLabel txtMenu31;
    private javax.swing.JLabel txtMenu32;
    private javax.swing.JLabel txtMenu33;
    private javax.swing.JLabel txtMenu34;
    private javax.swing.JLabel txtMenu35;
    private javax.swing.JLabel txtMenu36;
    private javax.swing.JLabel txtMenu37;
    private javax.swing.JLabel txtMenu38;
    private javax.swing.JLabel txtMenu39;
    private javax.swing.JLabel txtMenu4;
    private javax.swing.JLabel txtMenu40;
    private javax.swing.JLabel txtMenu41;
    private javax.swing.JLabel txtMenu42;
    private javax.swing.JLabel txtMenu43;
    private javax.swing.JLabel txtMenu44;
    private javax.swing.JLabel txtMenu5;
    private javax.swing.JLabel txtMenu6;
    private javax.swing.JLabel txtMenu7;
    private javax.swing.JLabel txtMenu9;
    private javax.swing.JLabel txtPesanan;
    private javax.swing.JLabel txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
