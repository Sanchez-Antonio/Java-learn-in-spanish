package practica01;

import javax.swing.JOptionPane;
 
public class Practica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float numero1,numero2;
       
       numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Un Numero "));
       numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingres Otro Nuemero "));
         
       if(numero1%2==0 && numero2%2==0){
           JOptionPane.showMessageDialog(null, "AMBOS numeros Són Pares");
       }
       else if(numero1%2==0 && numero2%2!=0) {
           JOptionPane.showMessageDialog(null, "Solo el primer numero es par");
       }
       else if (numero1%2!=0 && numero2%2==0){
       JOptionPane.showMessageDialog(null, "El Segundo Numero ES Par");
       }
       else {
           JOptionPane.showMessageDialog(null, "Ninguno Es Par");
       }
     
 
    }
}
