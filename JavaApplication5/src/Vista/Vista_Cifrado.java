/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Metodos.Metodo_Cesar;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Damián
 */
public class Vista_Cifrado extends javax.swing.JFrame {

    Metodo_Cesar mc = new Metodo_Cesar();

    /**
     * Creates new form Vista_Cifrado
     */
    public Vista_Cifrado() {
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

        txt_texto = new javax.swing.JTextField();
        txt_Cifrado = new javax.swing.JTextField();
        btn_cifrar = new javax.swing.JButton();
        cbox_ubi = new javax.swing.JComboBox<>();
        txt_ubi = new javax.swing.JTextField();
        btn_Decifrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_textoKeyTyped(evt);
            }
        });

        txt_Cifrado.setEditable(false);

        btn_cifrar.setText("Cifrar");
        btn_cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cifrarActionPerformed(evt);
            }
        });

        cbox_ubi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rotación 0", "Rotación 1", "Rotación 2", "Rotación 3", "Rotación 4", "Rotación 5", "Rotación 6", "Rotación 7", "Rotación 8", "Rotación 9", "Rotación 10", "Rotación 11", "Rotación 12", "Rotación 13", "Rotación 14", "Rotación 15", "Rotación 16", "Rotación 17", "Rotación 18", "Rotación 19", "Rotación 20", "Rotación 21", "Rotación 22", "Rotación 23", "Rotación 24", "Rotación 25" }));

        txt_ubi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ubiKeyTyped(evt);
            }
        });

        btn_Decifrar.setText("Decifrar");
        btn_Decifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DecifrarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txt_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbox_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Cifrado, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cifrar)
                        .addGap(45, 45, 45)
                        .addComponent(btn_limpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Decifrar)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cifrar)
                    .addComponent(btn_Decifrar)
                    .addComponent(btn_limpiar))
                .addGap(48, 48, 48)
                .addComponent(txt_Cifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cifrarActionPerformed
        // TODO add your handling code here:
//        String PMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String PMinus = "abcdefghijklmnopqrstuvwxyz";
        if (txt_texto.getText().length() != 0 && txt_ubi.getText().length() != 0) {

            mc.Cifrar(txt_texto, txt_ubi, txt_Cifrado);
//        mc.Cifrar2(txt_texto, cbox_ubi, txt_Cifrado);

        } else {
            JOptionPane.showMessageDialog(null, "Campos Vacios");

        }
    }//GEN-LAST:event_btn_cifrarActionPerformed

    private void btn_DecifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DecifrarActionPerformed

        if (txt_texto.getText().length() != 0 && txt_ubi.getText().length() != 0) {

            mc.Descifrar(txt_texto, txt_ubi, txt_Cifrado);

        } else {
            JOptionPane.showMessageDialog(null, "Campos Vacios");

        }


    }//GEN-LAST:event_btn_DecifrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        txt_texto.setText("");
        txt_ubi.setText("");
        txt_Cifrado.setText("");

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_ubiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ubiKeyTyped

        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_txt_ubiKeyTyped

    private void txt_textoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_textoKeyTyped

//        char c= evt.getKeyChar();
//        
//        if((c<'a'|| c>'z')&& (c<'A'|| c>'Z'))evt.consume();
        Character c= evt.getKeyChar();
        
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE ) {
            evt.consume();
        }
        
        

    }//GEN-LAST:event_txt_textoKeyTyped

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
            java.util.logging.Logger.getLogger(Vista_Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Cifrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Decifrar;
    private javax.swing.JButton btn_cifrar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cbox_ubi;
    private javax.swing.JTextField txt_Cifrado;
    private javax.swing.JTextField txt_texto;
    private javax.swing.JTextField txt_ubi;
    // End of variables declaration//GEN-END:variables
}
