
package tarea_cifrado;

/**
 *
 * @author Damián
 */
public class Tarea_Cifrado {

    
    public static void main(String[] args) {
       
       String PMayus="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String PMinus="abcdefghijklmnopqrstuvwxyz";
        
       Metodo_CifradoCesar mc=new Metodo_CifradoCesar(PMayus, PMinus);
        
//        System.out.println(mc.Cifrar("cafe",21));
//        System.out.println(mc.Descifrar("geji",4));
        
        for (int i = 0; i < 26; i++) {
            
             System.out.println(i+ ": "+ mc.Descifrar("QMGLIP VICIW",i)); 
            
        }
        
        
    }
    
}
