
package GUI;

import proses.Pelanggan;
import proses.Transaksi;
import proses.Keranjang;


public class InputDataGUI extends javax.swing.JFrame {
    private Pelanggan costumer;
    private Transaksi transaction;
    private Keranjang k1;
    
    public InputDataGUI(Keranjang k2) {
        initComponents();
        transaction = new Transaksi();
        costumer = new Pelanggan();
        k1 = new Keranjang();
        k1.setKeranjang(k2.getKeranjang2());
    }
    
    public Pelanggan getCostumer() {
        return this.costumer;
    }
    
    public Transaksi getTransaction() {
        return this.transaction;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txtMenu = new javax.swing.JLabel();
        btnLanjut = new javax.swing.JButton();
        inputData = new javax.swing.JPanel();
        txtNama = new javax.swing.JLabel();
        txtNomor = new javax.swing.JLabel();
        txtUang = new javax.swing.JLabel();
        tfUang = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfNomor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(55, 85, 157));

        logo.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Logo.png"))); // NOI18N
        logo.setText("Bakso Bahagia");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        txtMenu.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        txtMenu.setText("Input Data");

        btnLanjut.setBackground(new java.awt.Color(66, 85, 125));
        btnLanjut.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnLanjut.setForeground(new java.awt.Color(255, 255, 255));
        btnLanjut.setText("Lanjut");
        btnLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });

        inputData.setBackground(new java.awt.Color(248, 248, 248));
        inputData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtNama.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama.setText("Nama Pelanggan   :");

        txtNomor.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNomor.setText("Uang Pelanggan    :");

        txtUang.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtUang.setText("Nomor Meja            :");

        tfUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputDataLayout = new javax.swing.GroupLayout(inputData);
        inputData.setLayout(inputDataLayout);
        inputDataLayout.setHorizontalGroup(
            inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(inputDataLayout.createSequentialGroup()
                        .addComponent(txtNomor)
                        .addGap(18, 18, 18)
                        .addComponent(tfUang))
                    .addGroup(inputDataLayout.createSequentialGroup()
                        .addComponent(txtUang)
                        .addGap(18, 18, 18)
                        .addComponent(tfNomor))
                    .addGroup(inputDataLayout.createSequentialGroup()
                        .addComponent(txtNama)
                        .addGap(18, 18, 18)
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        inputDataLayout.setVerticalGroup(
            inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUang)
                    .addComponent(tfNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomor)
                    .addComponent(tfUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMenu)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLanjut)
                        .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtMenu)
                .addGap(37, 37, 37)
                .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLanjut)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUangActionPerformed

    private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
        String nama = tfNama.getText();
        costumer.setNama(nama);
        
        int nomor = Integer.valueOf(tfNomor.getText());
        costumer.setNomorMeja(nomor);
        
        int uang = Integer.valueOf(tfUang.getText());
        transaction.setUangBayar(uang);
        
        
        StrukGUI struk = new StrukGUI(nama, nomor, uang, k1);
        struk.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLanjutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnLanjut;
    private javax.swing.JPanel header;
    private javax.swing.JPanel inputData;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNomor;
    private javax.swing.JTextField tfUang;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtNomor;
    private javax.swing.JLabel txtUang;
    // End of variables declaration//GEN-END:variables
}
