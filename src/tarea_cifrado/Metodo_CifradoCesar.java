package tarea_cifrado;

/**
 *
 * @author Damián
 */
public class Metodo_CifradoCesar {

    private String PMayus;
    private String PMinus;

    public Metodo_CifradoCesar(String PMayus, String PMinus) {
        this.PMayus = PMayus;
        this.PMinus = PMinus;
    }

    public String Cifrar(String txt, int ubicacion) {
        String Salida = "";

        for (int i = 0; i < txt.length(); i++) {
            if ((this.PMayus.indexOf(txt.charAt(i)) != -1) || (this.PMinus.indexOf(txt.charAt(i)) != -1)) {

                Salida += (this.PMayus.indexOf(txt.charAt(i)) != -1) ? this.PMayus.charAt(((this.PMayus.indexOf(txt.charAt(i))) + ubicacion) % this.PMayus.length())
                        : this.PMinus.charAt(((this.PMinus.indexOf(txt.charAt(i))) + ubicacion) % this.PMinus.length());

            } else {
                Salida += txt.charAt(i);
            }

        }

        return Salida;

    }

    public String Descifrar(String txt, int ubicacion) {
        String Salida = "";

        for (int i = 0; i < txt.length(); i++) {
            if ((this.PMayus.indexOf(txt.charAt(i)) != -1) || (this.PMinus.indexOf(txt.charAt(i)) != -1)) {

                if (this.PMayus.indexOf(txt.charAt(i)) != -1) {
                    if ((this.PMayus.indexOf(txt.charAt(i))- ubicacion) < 0) {
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

        return Salida;

    }

}
