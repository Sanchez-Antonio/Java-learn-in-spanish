package practica01;
import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        int elementos;
        
        Scanner reading = new Scanner(System.in);
        
        System.out.println("Digíte El Numero De Elementos Que Necesita --> ");
        elementos = reading.nextInt();
       
        int [] numeros = new int [elementos];
        
        System.out.println("Acontinuación Digite Los Elementos Para El Arreglo");
        
        for (int i=0;i<elementos;i++){           
            System.out.println("Elemento "+i);
           // int ingreso = reading.nextInt();
            numeros[i]=reading.nextInt(); 
        }
        System.out.println("SU ARREGLO ESTÁ COMPUESTO POR --> ");
        for(int i=0;i<elementos;i++){
        
            System.out.println(numeros[i]);
        
        
        }
    
    }

}     