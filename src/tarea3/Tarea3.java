/*1. Diseñe un algoritmo que imprima en orden descendente 3 números leídos.*/
package tarea3;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio Aranda
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARACION DE VARIABLES
        float a, b, c;
        
        String uno, dos, tres;
        
        //Leer los valores
        uno = JOptionPane.showInputDialog("Digite el 1 número: " );
        dos = JOptionPane.showInputDialog("Digite el segundo número: " );
        tres = JOptionPane.showInputDialog("Digite el tercer número: " );
        
        a = Float.parseFloat(uno);
        b = Float.parseFloat(dos);
        c = Float.parseFloat(tres);
        
        if (a > b && a > c)
        {
            if(b>c)
            {
                System.out.println(a + "," + b + "," + c );
            }
            else
            {
                System.out.println(a + "," + c + "," + b );
            }
        }
        else if(b > a && b > c)
        {
            if(a>c)
            {
                System.out.println(b + "," + a + "," + c );
            }
            else
            {
                System.out.println(b + "," + c + "," + a );
            }
        }
        else if(c > a && c > b)
        {
            if(a > b)
            {
                System.out.println(c + "," + a + "," + b );
            }
            else
            {
                System.out.println(c + "," + b + "," + a );
            }
        }
    }
    
}
