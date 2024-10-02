package forms;
public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVidaMarinha = new javax.swing.JLabel();
        btnAnimaisExtintos = new javax.swing.JButton();
        btnAnimaisÁguaDoce = new javax.swing.JButton();
        btnAnimaisExtinção = new javax.swing.JButton();
        btnLocaisdeProteção = new javax.swing.JButton();
        btnAnimaisÁguaSalgada = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtVidaMarinha.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        txtVidaMarinha.setText("Vida Marinha");

        btnAnimaisExtintos.setText("Animais Extintos");
        btnAnimaisExtintos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimaisExtintosActionPerformed(evt);
            }
        });

        btnAnimaisÁguaDoce.setText("Animais de Água doce");
        btnAnimaisÁguaDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimaisÁguaDoceActionPerformed(evt);
            }
        });

        btnAnimaisExtinção.setText("Animais em Risco de Extinção");
        btnAnimaisExtinção.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimaisExtinçãoActionPerformed(evt);
            }
        });

        btnLocaisdeProteção.setText("Locais de Proteção");
        btnLocaisdeProteção.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocaisdeProteçãoActionPerformed(evt);
            }
        });

        btnAnimaisÁguaSalgada.setText("Animais de Água Salgada");
        btnAnimaisÁguaSalgada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimaisÁguaSalgadaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/bd06d5c0-833e-4974-9539-44abb5b28a8f.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnimaisÁguaSalgada, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnLocaisdeProteção, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnimaisExtinção)
                        .addGap(35, 35, 35)
                        .addComponent(btnAnimaisExtintos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVidaMarinha))
                        .addGap(15, 15, 15)))
                .addGap(29, 29, 29)
                .addComponent(btnAnimaisÁguaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVidaMarinha)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnimaisExtintos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnimaisÁguaDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnimaisExtinção, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocaisdeProteção, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnimaisÁguaSalgada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnimaisExtinçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimaisExtinçãoActionPerformed
    AnimaisExtinção p = new AnimaisExtinção();
            p.setVisible(true);
    }//GEN-LAST:event_btnAnimaisExtinçãoActionPerformed

    private void btnAnimaisExtintosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimaisExtintosActionPerformed
    AnimaisExtintos p = new AnimaisExtintos();
            p.setVisible(true);
    }//GEN-LAST:event_btnAnimaisExtintosActionPerformed

    private void btnAnimaisÁguaDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimaisÁguaDoceActionPerformed
    AnimaisÁguaDoce p = new AnimaisÁguaDoce();
            p.setVisible(true);
    }//GEN-LAST:event_btnAnimaisÁguaDoceActionPerformed

    private void btnAnimaisÁguaSalgadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimaisÁguaSalgadaActionPerformed
        AnimaisAguaSalgada p = new AnimaisAguaSalgada();
            p.setVisible(true);
    }//GEN-LAST:event_btnAnimaisÁguaSalgadaActionPerformed

    private void btnLocaisdeProteçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocaisdeProteçãoActionPerformed
        LocaisdeProteção p = new LocaisdeProteção();
            p.setVisible(true);
    }//GEN-LAST:event_btnLocaisdeProteçãoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimaisExtintos;
    private javax.swing.JButton btnAnimaisExtinção;
    private javax.swing.JButton btnAnimaisÁguaDoce;
    private javax.swing.JButton btnAnimaisÁguaSalgada;
    private javax.swing.JButton btnLocaisdeProteção;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtVidaMarinha;
    // End of variables declaration//GEN-END:variables
}
