/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author aluno
 */
public class caos extends javax.swing.JFrame {
    /**
     * Creates new form caos
     */
    public caos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xNew = new javax.swing.JTextField();
        xOld = new javax.swing.JTextField();
        k = new javax.swing.JTextField();
        send4 = new javax.swing.JButton();
        resposta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exit4.setText("Sair");
        exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Meiryo", 3, 18)); // NOI18N
        jLabel1.setText("Xnew = k . Xold . (1 - Xold)");

        jLabel2.setText("Xnew:");

        jLabel3.setText("Xold:");

        jLabel4.setText("k:");

        xNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xNewActionPerformed(evt);
            }
        });
        xNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xNewKeyReleased(evt);
            }
        });

        xOld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xOldKeyReleased(evt);
            }
        });

        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kKeyReleased(evt);
            }
        });

        send4.setText("Enviar");
        send4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Resposta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(send4)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(xOld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(xNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(xNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(xOld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit4)
                    .addComponent(send4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit4ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exit4ActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kActionPerformed

    private void xNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xNewKeyReleased
        xNew.setText(xNew.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_xNewKeyReleased

    private void xOldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xOldKeyReleased
        xOld.setText(xOld.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_xOldKeyReleased

    private void kKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kKeyReleased
        k.setText(k.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_kKeyReleased

    private void xNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xNewActionPerformed

    private void send4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send4ActionPerformed
        //chama funcao para calcular(getxOld, getxNew, getk)
        if(xNew.getText().isEmpty()){
            float xold , _k, res;
            String result;
            xold = Float.parseFloat(xOld.getText());
            _k = Float.parseFloat(k.getText());
            res = _k * xold * (1 - xold);
            result = Float.toString(res);
            resposta.setText(result);
        }
        else if(xOld.getText().isEmpty()){
            float xnew , _k, res;
            String result;
            xnew = Float.parseFloat(xNew.getText());
            _k = Float.parseFloat(k.getText());
            res = xnew / _k;
            result = Float.toString(res);
            resposta.setText(result);
        }
        else if(k.getText().isEmpty()){
            float xnew , xold, res;
            String result;
            xnew = Float.parseFloat(xNew.getText());
            xold = Float.parseFloat(xOld.getText());
            res = xnew / xold * (1 - xnew);
            result = Float.toString(res);
            resposta.setText(result);
        }
    }//GEN-LAST:event_send4ActionPerformed

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
            java.util.logging.Logger.getLogger(caos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField k;
    private javax.swing.JTextField resposta;
    private javax.swing.JButton send4;
    private javax.swing.JTextField xNew;
    private javax.swing.JTextField xOld;
    // End of variables declaration//GEN-END:variables
}
