
package GUI;

import proses.Menu;
import proses.Keranjang;


public class MenuGUI extends javax.swing.JFrame {
    private Menu menu;
    private Keranjang keranjang;
    
    private Integer banyak1 = 0;
    private Integer banyak2 = 0;
    private Integer banyak3 = 0;
    private Integer banyak4 = 0;
    private Integer banyak5 = 0;
    private Integer banyak6 = 0;
    private Integer banyak7 = 0;
    private Integer banyak8 = 0;
    
    public MenuGUI() {
        menu = new Menu();
        keranjang = new Keranjang();
        initComponents();
    }
    
    public Keranjang getKeranjang() {
        return this.keranjang;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        txtMenu = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        btnKeranjang1 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        btnKurang1 = new javax.swing.JButton();
        btnTambah1 = new javax.swing.JButton();
        gambar1 = new javax.swing.JLabel();
        txtNama1 = new javax.swing.JLabel();
        txtHarga1 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        btnKeranjang2 = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        btnKurang2 = new javax.swing.JButton();
        btnTambah2 = new javax.swing.JButton();
        gambar2 = new javax.swing.JLabel();
        txtNama2 = new javax.swing.JLabel();
        txtHarga2 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        btnKeranjang3 = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        btnKurang3 = new javax.swing.JButton();
        btnTambah3 = new javax.swing.JButton();
        gambar3 = new javax.swing.JLabel();
        txtNama3 = new javax.swing.JLabel();
        txtHarga3 = new javax.swing.JLabel();
        menu4 = new javax.swing.JPanel();
        btnKeranjang4 = new javax.swing.JButton();
        tf4 = new javax.swing.JTextField();
        btnKurang4 = new javax.swing.JButton();
        btnTambah4 = new javax.swing.JButton();
        gambar4 = new javax.swing.JLabel();
        txtNama4 = new javax.swing.JLabel();
        txtHarga4 = new javax.swing.JLabel();
        menu5 = new javax.swing.JPanel();
        btnKeranjang5 = new javax.swing.JButton();
        tf5 = new javax.swing.JTextField();
        btnKurang5 = new javax.swing.JButton();
        btnTambah5 = new javax.swing.JButton();
        gambar5 = new javax.swing.JLabel();
        txtNama5 = new javax.swing.JLabel();
        txtHarga5 = new javax.swing.JLabel();
        menu6 = new javax.swing.JPanel();
        btnKeranjang6 = new javax.swing.JButton();
        tf6 = new javax.swing.JTextField();
        btnKurang6 = new javax.swing.JButton();
        btnTambah6 = new javax.swing.JButton();
        gambar6 = new javax.swing.JLabel();
        txtNama6 = new javax.swing.JLabel();
        txtHarga6 = new javax.swing.JLabel();
        menu7 = new javax.swing.JPanel();
        btnKeranjang7 = new javax.swing.JButton();
        tf7 = new javax.swing.JTextField();
        btnKurang7 = new javax.swing.JButton();
        btnTambah7 = new javax.swing.JButton();
        gambar7 = new javax.swing.JLabel();
        txtNama7 = new javax.swing.JLabel();
        txtHarga7 = new javax.swing.JLabel();
        menu8 = new javax.swing.JPanel();
        btnKeranjang8 = new javax.swing.JButton();
        tf8 = new javax.swing.JTextField();
        btnKurang8 = new javax.swing.JButton();
        btnTambah8 = new javax.swing.JButton();
        gambar8 = new javax.swing.JLabel();
        txtNama8 = new javax.swing.JLabel();
        txtHarga8 = new javax.swing.JLabel();
        btnLihatKeranjang = new javax.swing.JButton();
        txtBanyakKeranjang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtMenu.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        txtMenu.setText("Menu");

        menu1.setBackground(new java.awt.Color(248, 248, 248));
        menu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu1.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang1.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang1.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang1.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang1.setText("+ Keranjang");
        btnKeranjang1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang1ActionPerformed(evt);
            }
        });

        tf1.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf1.setText(banyak1.toString());
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        btnKurang1.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang1.setText("-");
        btnKurang1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang1ActionPerformed(evt);
            }
        });

        btnTambah1.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah1.setText("+");
        btnTambah1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/biasa.jpg"))); // NOI18N

        txtNama1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama1.setText("Bakso Biasa");

        txtHarga1.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga1.setText(menu.getMenu().get("Bakso Biasa").toString());

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHarga1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKeranjang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                        .addComponent(tf1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang1)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah1))
                    .addComponent(txtNama1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gambar1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHarga1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu2.setBackground(new java.awt.Color(248, 248, 248));
        menu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu2.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang2.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang2.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang2.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang2.setText("+ Keranjang");
        btnKeranjang2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang2ActionPerformed(evt);
            }
        });

        tf2.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf2.setText(banyak2.toString());
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        btnKurang2.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang2.setText("-");
        btnKurang2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang2ActionPerformed(evt);
            }
        });

        btnTambah2.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah2.setText("+");
        btnTambah2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah2ActionPerformed(evt);
            }
        });

        gambar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/sedang.jpg"))); // NOI18N

        txtNama2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama2.setText("Bakso Sedang");

        txtHarga2.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga2.setText(menu.getMenu().get("Bakso Sedang").toString());

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeranjang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addComponent(tf2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang2)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah2))
                    .addGroup(menu2Layout.createSequentialGroup()
                        .addComponent(gambar2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHarga2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHarga2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu3.setBackground(new java.awt.Color(248, 248, 248));
        menu3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu3.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang3.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang3.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang3.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang3.setText("+ Keranjang");
        btnKeranjang3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang3ActionPerformed(evt);
            }
        });

        tf3.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf3.setText(banyak3.toString());
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });

        btnKurang3.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang3.setText("-");
        btnKurang3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang3ActionPerformed(evt);
            }
        });

        btnTambah3.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah3.setText("+");
        btnTambah3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah3ActionPerformed(evt);
            }
        });

        gambar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/besar.jpg"))); // NOI18N

        txtNama3.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama3.setText("Bakso Besar");

        txtHarga3.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga3.setText(menu.getMenu().get("Bakso Besar").toString());

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeranjang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu3Layout.createSequentialGroup()
                        .addComponent(tf3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang3)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah3))
                    .addGroup(menu3Layout.createSequentialGroup()
                        .addComponent(gambar3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNama3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHarga3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHarga3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu4.setBackground(new java.awt.Color(248, 248, 248));
        menu4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu4.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang4.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang4.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang4.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang4.setText("+ Keranjang");
        btnKeranjang4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang4ActionPerformed(evt);
            }
        });

        tf4.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf4.setText(banyak4.toString());
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });

        btnKurang4.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang4.setText("-");
        btnKurang4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang4ActionPerformed(evt);
            }
        });

        btnTambah4.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah4.setText("+");
        btnTambah4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah4ActionPerformed(evt);
            }
        });

        gambar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/monster.jpg"))); // NOI18N

        txtNama4.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama4.setText("Bakso Monster");

        txtHarga4.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga4.setText(menu.getMenu().get("Bakso Monster").toString());

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeranjang4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu4Layout.createSequentialGroup()
                        .addComponent(tf4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang4)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah4))
                    .addComponent(txtNama4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gambar4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHarga4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu5.setBackground(new java.awt.Color(248, 248, 248));
        menu5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu5.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang5.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang5.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang5.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang5.setText("+ Keranjang");
        btnKeranjang5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang5ActionPerformed(evt);
            }
        });

        tf5.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf5.setText(banyak5.toString());
        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });

        btnKurang5.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang5.setText("-");
        btnKurang5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang5ActionPerformed(evt);
            }
        });

        btnTambah5.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah5.setText("+");
        btnTambah5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah5ActionPerformed(evt);
            }
        });

        gambar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/alpukat.jpg"))); // NOI18N

        txtNama5.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama5.setText("Jus Alpukat");

        txtHarga5.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga5.setText(menu.getMenu().get("Jus Alpukat").toString());

        javax.swing.GroupLayout menu5Layout = new javax.swing.GroupLayout(menu5);
        menu5.setLayout(menu5Layout);
        menu5Layout.setHorizontalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeranjang5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu5Layout.createSequentialGroup()
                        .addComponent(tf5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang5)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah5))
                    .addGroup(menu5Layout.createSequentialGroup()
                        .addComponent(gambar5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNama5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHarga5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu5Layout.setVerticalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHarga5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu6.setBackground(new java.awt.Color(248, 248, 248));
        menu6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu6.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang6.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang6.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang6.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang6.setText("+ Keranjang");
        btnKeranjang6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang6ActionPerformed(evt);
            }
        });

        tf6.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf6.setText(banyak6.toString());
        tf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf6ActionPerformed(evt);
            }
        });

        btnKurang6.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang6.setText("-");
        btnKurang6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang6ActionPerformed(evt);
            }
        });

        btnTambah6.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah6.setText("+");
        btnTambah6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah6ActionPerformed(evt);
            }
        });

        gambar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mangga.jpg"))); // NOI18N

        txtNama6.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama6.setText("Jus Mangga");

        txtHarga6.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga6.setText(menu.getMenu().get("Jus Mangga").toString());

        javax.swing.GroupLayout menu6Layout = new javax.swing.GroupLayout(menu6);
        menu6.setLayout(menu6Layout);
        menu6Layout.setHorizontalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeranjang6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu6Layout.createSequentialGroup()
                        .addComponent(tf6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang6)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah6))
                    .addComponent(txtNama6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gambar6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu6Layout.setVerticalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHarga6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu7.setBackground(new java.awt.Color(248, 248, 248));
        menu7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu7.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang7.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang7.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang7.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang7.setText("+ Keranjang");
        btnKeranjang7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang7ActionPerformed(evt);
            }
        });

        tf7.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf7.setText(banyak7.toString());
        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });

        btnKurang7.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang7.setText("-");
        btnKurang7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang7ActionPerformed(evt);
            }
        });

        btnTambah7.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah7.setText("+");
        btnTambah7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah7ActionPerformed(evt);
            }
        });

        gambar7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/jeruk.jpg"))); // NOI18N

        txtNama7.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama7.setText("Jus Jeruk");

        txtHarga7.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga7.setText(menu.getMenu().get("Jus Jeruk").toString());

        javax.swing.GroupLayout menu7Layout = new javax.swing.GroupLayout(menu7);
        menu7.setLayout(menu7Layout);
        menu7Layout.setHorizontalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeranjang7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu7Layout.createSequentialGroup()
                        .addComponent(tf7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang7)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gambar7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNama7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHarga7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu7Layout.setVerticalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHarga7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu8.setBackground(new java.awt.Color(248, 248, 248));
        menu8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        menu8.setPreferredSize(new java.awt.Dimension(196, 196));

        btnKeranjang8.setBackground(new java.awt.Color(225, 128, 83));
        btnKeranjang8.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        btnKeranjang8.setForeground(new java.awt.Color(255, 255, 255));
        btnKeranjang8.setText("+ Keranjang");
        btnKeranjang8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeranjang8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjang8ActionPerformed(evt);
            }
        });

        tf8.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        tf8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf8.setText(banyak8.toString());
        tf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf8ActionPerformed(evt);
            }
        });

        btnKurang8.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnKurang8.setText("-");
        btnKurang8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKurang8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurang8ActionPerformed(evt);
            }
        });

        btnTambah8.setFont(new java.awt.Font("Helvetica", 0, 11)); // NOI18N
        btnTambah8.setText("+");
        btnTambah8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTambah8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah8ActionPerformed(evt);
            }
        });

        gambar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tehbotol.jpg"))); // NOI18N

        txtNama8.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtNama8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNama8.setText("Teh Botol");

        txtHarga8.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txtHarga8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHarga8.setText(menu.getMenu().get("Teh Botol").toString());

        javax.swing.GroupLayout menu8Layout = new javax.swing.GroupLayout(menu8);
        menu8.setLayout(menu8Layout);
        menu8Layout.setHorizontalGroup(
            menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeranjang8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu8Layout.createSequentialGroup()
                        .addComponent(tf8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKurang8)
                        .addGap(2, 2, 2)
                        .addComponent(btnTambah8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gambar8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNama8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHarga8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu8Layout.setVerticalGroup(
            menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gambar8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHarga8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeranjang8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnLihatKeranjang.setBackground(new java.awt.Color(66, 85, 125));
        btnLihatKeranjang.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        btnLihatKeranjang.setForeground(new java.awt.Color(255, 255, 255));
        btnLihatKeranjang.setText("Keranjang");
        btnLihatKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatKeranjangActionPerformed(evt);
            }
        });

        txtBanyakKeranjang.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtBanyakKeranjang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBanyakKeranjang.setText("Jumlah Keranjang : 0 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMenu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBanyakKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLihatKeranjang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(txtBanyakKeranjang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLihatKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLihatKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatKeranjangActionPerformed
        KeranjangGUI k = new KeranjangGUI(keranjang);
        k.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLihatKeranjangActionPerformed

    private void btnKeranjang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang1ActionPerformed
        banyak1 = Integer.valueOf(tf1.getText());
        keranjang.tambahKeranjang("Bakso Biasa", banyak1);
        banyak1 = 0;
        tf1.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());
    }//GEN-LAST:event_btnKeranjang1ActionPerformed

    private void btnKurang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang1ActionPerformed
        if(banyak1 > 0) {
            banyak1--;
            tf1.setText(banyak1.toString());   
        }
    }//GEN-LAST:event_btnKurang1ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        
    }//GEN-LAST:event_tf1ActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        banyak1++;
        tf1.setText(banyak1.toString());
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnKeranjang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang3ActionPerformed
        banyak3 = Integer.valueOf(tf3.getText());
        keranjang.tambahKeranjang("Bakso Besar", banyak3);
        banyak3 = 0;
        tf3.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());
    }//GEN-LAST:event_btnKeranjang3ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        
    }//GEN-LAST:event_tf3ActionPerformed

    private void btnKurang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang3ActionPerformed
        if(banyak3 > 0) {
            banyak3--;
            tf3.setText(banyak3.toString());   
        }
    }//GEN-LAST:event_btnKurang3ActionPerformed

    private void btnTambah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah3ActionPerformed
        banyak3++;
        tf3.setText(banyak3.toString());
    }//GEN-LAST:event_btnTambah3ActionPerformed

    private void btnKeranjang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang2ActionPerformed
        banyak2 = Integer.valueOf(tf2.getText());
        keranjang.tambahKeranjang("Bakso Sedang", banyak2);
        banyak2 = 0;
        tf2.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());
    }//GEN-LAST:event_btnKeranjang2ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        
    }//GEN-LAST:event_tf2ActionPerformed

    private void btnKurang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang2ActionPerformed
        if(banyak2 > 0) {
            banyak2--;
            tf2.setText(banyak2.toString());   
        }
    }//GEN-LAST:event_btnKurang2ActionPerformed

    private void btnTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah2ActionPerformed
        banyak2++;
        tf2.setText(banyak2.toString());
    }//GEN-LAST:event_btnTambah2ActionPerformed

    private void btnKeranjang4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang4ActionPerformed
        banyak4 = Integer.valueOf(tf4.getText());
        keranjang.tambahKeranjang("Bakso Monster", banyak4);
        banyak4 = 0;
        tf4.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());
    }//GEN-LAST:event_btnKeranjang4ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        
    }//GEN-LAST:event_tf4ActionPerformed

    private void btnKurang4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang4ActionPerformed
        if(banyak4 > 0) {
            banyak4--;
            tf4.setText(banyak4.toString());   
        }
    }//GEN-LAST:event_btnKurang4ActionPerformed

    private void btnTambah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah4ActionPerformed
        banyak4++;
        tf4.setText(banyak4.toString());
    }//GEN-LAST:event_btnTambah4ActionPerformed

    private void btnKeranjang6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang6ActionPerformed
        banyak6 = Integer.valueOf(tf6.getText());
        keranjang.tambahKeranjang("Jus Mangga", banyak6);
        banyak6 = 0;
        tf6.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());

    }//GEN-LAST:event_btnKeranjang6ActionPerformed

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        
    }//GEN-LAST:event_tf6ActionPerformed

    private void btnKurang6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang6ActionPerformed
        if(banyak6 > 0) {
            banyak6--;
            tf6.setText(banyak6.toString());   
        }

    }//GEN-LAST:event_btnKurang6ActionPerformed

    private void btnTambah6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah6ActionPerformed
        banyak6++;
        tf6.setText(banyak6.toString());
    }//GEN-LAST:event_btnTambah6ActionPerformed

    private void btnKeranjang5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang5ActionPerformed
        banyak5 = Integer.valueOf(tf5.getText());
        keranjang.tambahKeranjang("Jus Alpukat", banyak5);
        banyak5 = 0;
        tf5.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());

    }//GEN-LAST:event_btnKeranjang5ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        
    }//GEN-LAST:event_tf5ActionPerformed

    private void btnKurang5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang5ActionPerformed
        if(banyak5 > 0) {
            banyak5--;
            tf5.setText(banyak5.toString());   
        }

    }//GEN-LAST:event_btnKurang5ActionPerformed

    private void btnTambah5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah5ActionPerformed
        banyak5++;
        tf5.setText(banyak5.toString());
    }//GEN-LAST:event_btnTambah5ActionPerformed

    private void btnKeranjang7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang7ActionPerformed
        banyak7 = Integer.valueOf(tf7.getText());
        keranjang.tambahKeranjang("Jus Jeruk", banyak7);
        banyak7 = 0;
        tf7.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());

    }//GEN-LAST:event_btnKeranjang7ActionPerformed

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        
    }//GEN-LAST:event_tf7ActionPerformed

    private void btnKurang7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang7ActionPerformed
        if(banyak7 > 0) {
            banyak7--;
            tf7.setText(banyak7.toString());   
        }

    }//GEN-LAST:event_btnKurang7ActionPerformed

    private void btnTambah7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah7ActionPerformed
        banyak7++;
        tf7.setText(banyak7.toString());
    }//GEN-LAST:event_btnTambah7ActionPerformed

    private void btnKeranjang8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjang8ActionPerformed
        banyak8 = Integer.valueOf(tf8.getText());
        keranjang.tambahKeranjang("Teh Botol", banyak8);
        banyak8 = 0;
        tf8.setText("0");
        txtBanyakKeranjang.setText("Jumlah Keranjang : " + keranjang.jumlahKeranjang());

    }//GEN-LAST:event_btnKeranjang8ActionPerformed

    private void tf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf8ActionPerformed
        
    }//GEN-LAST:event_tf8ActionPerformed

    private void btnKurang8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurang8ActionPerformed
        if(banyak8 > 0) {
            banyak8--;
            tf8.setText(banyak8.toString());   
        }

    }//GEN-LAST:event_btnKurang8ActionPerformed

    private void btnTambah8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah8ActionPerformed
        banyak8++;
        tf8.setText(banyak8.toString());
    }//GEN-LAST:event_btnTambah8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeranjang1;
    private javax.swing.JButton btnKeranjang2;
    private javax.swing.JButton btnKeranjang3;
    private javax.swing.JButton btnKeranjang4;
    private javax.swing.JButton btnKeranjang5;
    private javax.swing.JButton btnKeranjang6;
    private javax.swing.JButton btnKeranjang7;
    private javax.swing.JButton btnKeranjang8;
    private javax.swing.JButton btnKurang1;
    private javax.swing.JButton btnKurang2;
    private javax.swing.JButton btnKurang3;
    private javax.swing.JButton btnKurang4;
    private javax.swing.JButton btnKurang5;
    private javax.swing.JButton btnKurang6;
    private javax.swing.JButton btnKurang7;
    private javax.swing.JButton btnKurang8;
    private javax.swing.JButton btnLihatKeranjang;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton btnTambah2;
    private javax.swing.JButton btnTambah3;
    private javax.swing.JButton btnTambah4;
    private javax.swing.JButton btnTambah5;
    private javax.swing.JButton btnTambah6;
    private javax.swing.JButton btnTambah7;
    private javax.swing.JButton btnTambah8;
    private javax.swing.JLabel gambar1;
    private javax.swing.JLabel gambar2;
    private javax.swing.JLabel gambar3;
    private javax.swing.JLabel gambar4;
    private javax.swing.JLabel gambar5;
    private javax.swing.JLabel gambar6;
    private javax.swing.JLabel gambar7;
    private javax.swing.JLabel gambar8;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel menu5;
    private javax.swing.JPanel menu6;
    private javax.swing.JPanel menu7;
    private javax.swing.JPanel menu8;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JLabel txtBanyakKeranjang;
    private javax.swing.JLabel txtHarga1;
    private javax.swing.JLabel txtHarga2;
    private javax.swing.JLabel txtHarga3;
    private javax.swing.JLabel txtHarga4;
    private javax.swing.JLabel txtHarga5;
    private javax.swing.JLabel txtHarga6;
    private javax.swing.JLabel txtHarga7;
    private javax.swing.JLabel txtHarga8;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtNama1;
    private javax.swing.JLabel txtNama2;
    private javax.swing.JLabel txtNama3;
    private javax.swing.JLabel txtNama4;
    private javax.swing.JLabel txtNama5;
    private javax.swing.JLabel txtNama6;
    private javax.swing.JLabel txtNama7;
    private javax.swing.JLabel txtNama8;
    // End of variables declaration//GEN-END:variables
}
