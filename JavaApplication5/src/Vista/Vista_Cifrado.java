
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

    
    public Vista_Cifrado() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cifrar = new javax.swing.JButton();
        cbox_ubi = new javax.swing.JComboBox<String>();
        btn_Decifrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_copiar = new javax.swing.JButton();
        btn_copiar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Cifrado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        btn_cifrar.setText("Cifrar");
        btn_cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cifrarActionPerformed(evt);
            }
        });

        cbox_ubi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

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

        btn_copiar.setText("Copiar ");
        btn_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copiarActionPerformed(evt);
            }
        });

        btn_copiar1.setText("Pegar ");
        btn_copiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copiar1ActionPerformed(evt);
            }
        });

        jScrollPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jScrollPane1FocusLost(evt);
            }
        });

        txt_Area.setColumns(20);
        txt_Area.setRows(5);
        txt_Area.setMaximumSize(new java.awt.Dimension(10, 10));
        txt_Area.setPreferredSize(new java.awt.Dimension(160, 90));
        txt_Area.setLineWrap(true);
        txt_Area.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txt_Area);

        txt_Cifrado.setEditable(false);
        txt_Cifrado.setColumns(20);
        txt_Cifrado.setRows(5);
        txt_Cifrado.setLineWrap(true);
        txt_Cifrado.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txt_Cifrado);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese texto");

        jLabel2.setText("Numero de Rotacion:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Resultado");

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Damián Díaz - Michel Valenzuela");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cifrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Decifrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_copiar1)
                    .addComponent(btn_copiar))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbox_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btn_cifrar)
                                .addGap(36, 36, 36)
                                .addComponent(btn_Decifrar)
                                .addGap(37, 37, 37)
                                .addComponent(btn_limpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(btn_copiar1)
                        .addGap(40, 40, 40)
                        .addComponent(btn_copiar)))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cifrarActionPerformed
       
        if (txt_Area.getText().length() != 0 && cbox_ubi.getSelectedItem().toString().length() > -1
                && cbox_ubi.getSelectedItem().toString() != "-----") {

            mc.Cifrar2(txt_Area, cbox_ubi, txt_Cifrado);

        } else {
            JOptionPane.showMessageDialog(null, "Campos Vacios o Numero de rotacion no establecido");

        }
    }//GEN-LAST:event_btn_cifrarActionPerformed

    private void btn_DecifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DecifrarActionPerformed

        if (txt_Area.getText().length() != 0 && cbox_ubi.getSelectedItem().toString().length() > -1
                && cbox_ubi.getSelectedItem().toString() != "-----") {

            mc.Descifrar2(txt_Area, cbox_ubi, txt_Cifrado);

        } else {
            JOptionPane.showMessageDialog(null, "Campos Vacios o Numero de rotacion no establecido");

        }


    }//GEN-LAST:event_btn_DecifrarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        txt_Area.setText("");
        cbox_ubi.setSelectedItem("-----");
        txt_Cifrado.setText("");

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copiarActionPerformed

        mc.copiar(txt_Cifrado.getText());
        txt_Area.setText("");
        cbox_ubi.setSelectedItem("-----");
        txt_Cifrado.setText("");
    }//GEN-LAST:event_btn_copiarActionPerformed

    private void btn_copiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copiar1ActionPerformed
        txt_Area.setText("");
        cbox_ubi.setSelectedItem("-----");
        txt_Cifrado.setText("");
        txt_Area.paste();
    }//GEN-LAST:event_btn_copiar1ActionPerformed

    private void jScrollPane1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jScrollPane1FocusLost
        
    }//GEN-LAST:event_jScrollPane1FocusLost
    
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Cifrado().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Decifrar;
    private javax.swing.JButton btn_cifrar;
    private javax.swing.JButton btn_copiar;
    private javax.swing.JButton btn_copiar1;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cbox_ubi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_Area;
    private javax.swing.JTextArea txt_Cifrado;
    // End of variables declaration//GEN-END:variables
}
