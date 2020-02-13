
/**
 *
 * @author aykut
 */
public class tas_kagit_makas extends javax.swing.JFrame {

    /**
     * Creates new form tas_kagit_makas
     */
    public tas_kagit_makas() {
        initComponents();
        jpanel_oyun_alani.setVisible(false);
        jpanel_skor_alani.setVisible(false);
    }
    String ad = "";
    int oyuncuskor = 0, bilgisayarskor = 0, oyuncu = 0, bilgisayar = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_oyuncu_bilgi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfield_oyuncu_adi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jpanel_oyun_alani = new javax.swing.JPanel();
        button_resim_oyuncu = new javax.swing.JButton();
        button_resim_bilgisayar = new javax.swing.JButton();
        button_oyna = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combobox_oyuncu = new javax.swing.JComboBox<>();
        combobox_bilgisayar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpanel_skor_alani = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label_oyuncu_skor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label_bilgisayar_skor = new javax.swing.JLabel();
        jbutton_yenioyun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel_oyuncu_bilgi.setBackground(new java.awt.Color(153, 255, 204));
        jpanel_oyuncu_bilgi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setText("Oyuncu Adı: ");

        jButton1.setText("Başla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_oyuncu_bilgiLayout = new javax.swing.GroupLayout(jpanel_oyuncu_bilgi);
        jpanel_oyuncu_bilgi.setLayout(jpanel_oyuncu_bilgiLayout);
        jpanel_oyuncu_bilgiLayout.setHorizontalGroup(
            jpanel_oyuncu_bilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_oyuncu_bilgiLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfield_oyuncu_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanel_oyuncu_bilgiLayout.setVerticalGroup(
            jpanel_oyuncu_bilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_oyuncu_bilgiLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpanel_oyuncu_bilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textfield_oyuncu_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpanel_oyun_alani.setBackground(new java.awt.Color(204, 204, 255));
        jpanel_oyun_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 153, 0))); // NOI18N
        jpanel_oyun_alani.setForeground(new java.awt.Color(255, 255, 204));

        button_resim_oyuncu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        button_resim_bilgisayar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_resim_bilgisayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resim_bilgisayarActionPerformed(evt);
            }
        });

        button_oyna.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_oyna.setForeground(new java.awt.Color(51, 0, 51));
        button_oyna.setText("Oyna");
        button_oyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_oynaActionPerformed(evt);
            }
        });

        jLabel2.setText("Oyuncunun Seçimi");

        jLabel3.setText("Bilgisayarın Seçimi");

        combobox_oyuncu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAŞ", "KAĞIT", "MAKAS" }));
        combobox_oyuncu.setSelectedIndex(-1);
        combobox_oyuncu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_oyuncuİtemStateChanged(evt);
            }
        });

        combobox_bilgisayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAŞ", "KAĞIT", "MAKAS" }));
        combobox_bilgisayar.setSelectedIndex(-1);
        combobox_bilgisayar.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Durum;");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Bilgisayar Kazandı");

        javax.swing.GroupLayout jpanel_oyun_alaniLayout = new javax.swing.GroupLayout(jpanel_oyun_alani);
        jpanel_oyun_alani.setLayout(jpanel_oyun_alaniLayout);
        jpanel_oyun_alaniLayout.setHorizontalGroup(
            jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_oyun_alaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_oyun_alaniLayout.createSequentialGroup()
                        .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(combobox_oyuncu, 0, 100, Short.MAX_VALUE)
                            .addComponent(button_resim_oyuncu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel_oyun_alaniLayout.createSequentialGroup()
                                .addComponent(button_oyna, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_resim_bilgisayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(combobox_bilgisayar, 0, 99, Short.MAX_VALUE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_oyun_alaniLayout.setVerticalGroup(
            jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_oyun_alaniLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_oyna, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_resim_oyuncu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_resim_bilgisayar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpanel_skor_alani.setBackground(new java.awt.Color(255, 153, 153));
        jpanel_skor_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skorlar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Oyuncu: ");

        label_oyuncu_skor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_oyuncu_skor.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Bilgisayar:");

        label_bilgisayar_skor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_bilgisayar_skor.setText("0");

        jbutton_yenioyun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbutton_yenioyun.setForeground(new java.awt.Color(0, 204, 0));
        jbutton_yenioyun.setText("Yeni Oyun");
        jbutton_yenioyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_yenioyunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_skor_alaniLayout = new javax.swing.GroupLayout(jpanel_skor_alani);
        jpanel_skor_alani.setLayout(jpanel_skor_alaniLayout);
        jpanel_skor_alaniLayout.setHorizontalGroup(
            jpanel_skor_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_skor_alaniLayout.createSequentialGroup()
                .addGroup(jpanel_skor_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_skor_alaniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanel_skor_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel_skor_alaniLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_oyuncu_skor))
                            .addGroup(jpanel_skor_alaniLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_bilgisayar_skor))))
                    .addGroup(jpanel_skor_alaniLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbutton_yenioyun, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jpanel_skor_alaniLayout.setVerticalGroup(
            jpanel_skor_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_skor_alaniLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpanel_skor_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(label_oyuncu_skor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel_skor_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(label_bilgisayar_skor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbutton_yenioyun, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel_oyuncu_bilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_oyun_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_skor_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanel_oyuncu_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jpanel_oyun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpanel_skor_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ad = textfield_oyuncu_adi.getText();
        jLabel6.setText(ad);
        textfield_oyuncu_adi.setEnabled(false);
        jpanel_oyuncu_bilgi.setEnabled(false);
        jpanel_oyun_alani.setVisible(true);
        jpanel_skor_alani.setVisible(true);
        jButton1.setEnabled(false);
        button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/bos.png")));
        button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/bos.png")));


    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_resim_bilgisayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resim_bilgisayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_resim_bilgisayarActionPerformed

    private void combobox_oyuncuİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_oyuncuİtemStateChanged
        if (String.valueOf(combobox_oyuncu.getSelectedItem()) == "TAŞ") {
            button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/tas.png")));
        } else if (String.valueOf(combobox_oyuncu.getSelectedItem()) == "KAĞIT") {
            button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/kagit.png")));
        } else if (String.valueOf(combobox_oyuncu.getSelectedItem()) == "MAKAS") {
            button_resim_oyuncu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/makas.png")));
        }

    }//GEN-LAST:event_combobox_oyuncuİtemStateChanged

    private void button_oynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_oynaActionPerformed
        bilgisayar = (int) (Math.random() * 3);
        combobox_bilgisayar.setSelectedIndex(bilgisayar);
        if (bilgisayar == 0) {
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/tas.png")));
        } else if (bilgisayar == 1) {
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/kagit.png")));
        } else if (bilgisayar == 2) {
            button_resim_bilgisayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taskagitmakas_resim/makas.png")));
        }
        kontrol();
    }//GEN-LAST:event_button_oynaActionPerformed

    private void jbutton_yenioyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_yenioyunActionPerformed
        oyuncuskor = 0;
        bilgisayarskor = 0;
        ad = "";
        jpanel_oyun_alani.setVisible(false);
        jpanel_skor_alani.setVisible(false);
        combobox_bilgisayar.setSelectedIndex(-1);
        combobox_oyuncu.setSelectedIndex(-1);
        jpanel_oyuncu_bilgi.setEnabled(true);
        textfield_oyuncu_adi.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jbutton_yenioyunActionPerformed
    public void kontrol() {
        if (oyuncu == 0 & bilgisayar == 0 || oyuncu == 1 & bilgisayar == 1 & oyuncu == 2 & bilgisayar == 2) {
            jLabel5.setText("berabere");
        } else if (oyuncu == 0 & bilgisayar == 1 || oyuncu == 1 & bilgisayar == 2 || oyuncu == 2 & bilgisayar == 0) {
            jLabel5.setText("bilgisayar kazandı");
            bilgisayarskor++;
        } else if (oyuncu == 0 & bilgisayar == 2 || oyuncu == 1 & bilgisayar == 0 || oyuncu == 2 & bilgisayar == 1) {
            jLabel5.setText(ad + " kazandı");
            oyuncuskor++;
        }
        label_oyuncu_skor.setText(String.valueOf(oyuncuskor));
        label_bilgisayar_skor.setText(String.valueOf(bilgisayarskor));

    }

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
            java.util.logging.Logger.getLogger(tas_kagit_makas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tas_kagit_makas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tas_kagit_makas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tas_kagit_makas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tas_kagit_makas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_oyna;
    private javax.swing.JButton button_resim_bilgisayar;
    private javax.swing.JButton button_resim_oyuncu;
    private javax.swing.JComboBox<String> combobox_bilgisayar;
    private javax.swing.JComboBox<String> combobox_oyuncu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbutton_yenioyun;
    private javax.swing.JPanel jpanel_oyun_alani;
    private javax.swing.JPanel jpanel_oyuncu_bilgi;
    private javax.swing.JPanel jpanel_skor_alani;
    private javax.swing.JLabel label_bilgisayar_skor;
    private javax.swing.JLabel label_oyuncu_skor;
    private javax.swing.JTextField textfield_oyuncu_adi;
    // End of variables declaration//GEN-END:variables
}
