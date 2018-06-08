/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Damián
 */
public class Metodo_Cesar {

    private String PMayus="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String PMinus="abcdefghijklmnopqrstuvwxyz";

    public Metodo_Cesar() {
       
    }

    public void Cifrar(JTextField texto, JTextField ubi, JTextField txt_cifrado) {
        String Salida = "";

        String txt = texto.getText();
        int ubicacion = Integer.parseInt(ubi.getText());

        for (int i = 0; i < txt.length(); i++) {

            if ((this.PMayus.indexOf(txt.charAt(i)) != -1) || (this.PMinus.indexOf(txt.charAt(i)) != -1)) {

                Salida += (this.PMayus.indexOf(txt.charAt(i)) != -1) ? this.PMayus.charAt(((this.PMayus.indexOf(txt.charAt(i))) + ubicacion) % this.PMayus.length())
                        : this.PMinus.charAt(((this.PMinus.indexOf(txt.charAt(i))) + ubicacion) % this.PMinus.length());

            } else {
                Salida += txt.charAt(i);

            }

        }
        txt_cifrado.setText(Salida);
    }

    public void Descifrar(JTextField texto, JTextField ubi, JTextField txt_cifrado) {
        String Salida = "";

         String txt = texto.getText();
        int ubicacion = Integer.parseInt(ubi.getText());
        
        for (int i = 0; i < txt.length(); i++) {
            if ((this.PMayus.indexOf(txt.charAt(i)) != -1) || (this.PMinus.indexOf(txt.charAt(i)) != -1)) {

                if (this.PMayus.indexOf(txt.charAt(i)) != -1) {
                    if ((this.PMayus.indexOf(txt.charAt(i)) - ubicacion) < 0) {
                        Salida += this.PMayus.charAt((this.PMayus.length()) + ((this.PMayus.indexOf(txt.charAt(i))) - ubicacion));
                    } else {
                        Salida += this.PMayus.charAt(((this.PMayus.indexOf(txt.charAt(i))) - ubicacion) % (this.PMayus.length()));
                    }
                } else {

                    if (this.PMinus.indexOf(txt.charAt(i)) < 0) {
                        Salida += this.PMinus.charAt((this.PMinus.length()) + ((this.PMinus.indexOf(txt.charAt(i))) - ubicacion));
                    } else {
                        Salida += this.PMinus.charAt(((this.PMinus.indexOf(txt.charAt(i))) - ubicacion) % (this.PMinus.length()));
                    }

                }

            } else {
                Salida += txt.charAt(i);
            }

        }

       txt_cifrado.setText(Salida);

    }

    
    public void Cifrar2(JTextField texto, JComboBox ubi, JTextField txt_cifrado) {
        String Salida = "";

        String txt = texto.getText();
        int ubicacion = Integer.parseInt((String) ubi.getSelectedItem());

        for (int i = 0; i < txt.length(); i++) {

            if ((this.PMayus.indexOf(txt.charAt(i)) != -1) || (this.PMinus.indexOf(txt.charAt(i)) != -1)) {

                Salida += (this.PMayus.indexOf(txt.charAt(i)) != -1) ? this.PMayus.charAt(((this.PMayus.indexOf(txt.charAt(i))) + ubicacion) % this.PMayus.length())
                        : this.PMinus.charAt(((this.PMinus.indexOf(txt.charAt(i))) + ubicacion) % this.PMinus.length());

            } else {
                Salida += txt.charAt(i);

            }

        }
        txt_cifrado.setText(Salida);
    }
    
    
}
