package practica01;


import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
 
        Scanner reading = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO");
        int numero = reading.nextInt();
        
        while (numero>0){
            
           double resultado = Math.pow(numero, 3) ;
           
            System.out.println("el cuadrado es --> " +resultado);
            
            System.out.println("INGRESE UN NUMERO");
            numero = reading.nextInt();
        }
        System.out.println("PROGRAMA FINALIZADO CORRECTAMENTE");
    }
    
    
}
