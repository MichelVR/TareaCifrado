/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Damián
 */
public class Metodo_Cesar implements ClipboardOwner{

    private String PMayus="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String PMinus="abcdefghijklmnopqrstuvwxyz";

    public Metodo_Cesar() {
       
    }

    public void copiar(String txt){
        
        StringSelection texto= new StringSelection(txt);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(texto, (ClipboardOwner) this);
    }
    
    public void Cifrar2(JTextArea texto, JComboBox ubi, JTextArea txt_cifrado) {
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
    
      public void Descifrar2(JTextArea texto, JComboBox ubi, JTextArea txt_cifrado) {
        String Salida = "";

         String txt = texto.getText();
        int ubicacion = Integer.parseInt((String) ubi.getSelectedItem());
        
        for (int i = 0; i < txt.length(); i++) {
            if ((this.PMayus.indexOf(txt.charAt(i)) != -1) || (this.PMinus.indexOf(txt.charAt(i)) != -1)) {

                if (this.PMayus.indexOf(txt.charAt(i)) != -1) {
                    if ((this.PMayus.indexOf(txt.charAt(i)) - ubicacion) < 0) {
                        Salida += this.PMayus.charAt((this.PMayus.length()) + ((this.PMayus.indexOf(txt.charAt(i))) - ubicacion));
                    } else {
                        Salida += this.PMayus.charAt(((this.PMayus.indexOf(txt.charAt(i))) - ubicacion) % (this.PMayus.length()));
                    }
                } else {

                    if ((this.PMinus.indexOf(txt.charAt(i)) - ubicacion) < 0) {
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

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
