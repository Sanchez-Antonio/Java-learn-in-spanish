package practica01;
import java.util.Scanner;
//leer 5 números por teclado almacenarlos en un arreglo y a continuacion realizar la media de los números positivos,
//la media de los números negativos y contar los numeros 0
public class Practica01 {

    public static void main(String[] args) {
    Scanner reading = new Scanner(System.in);
    int contador_ceros = 0;
    int media_positivos = 0,media_negativos = 0;
    
    int [] numeros = new int [5];

    for (int i = 0 ; i<numeros.length;i++){
    
        System.out.println("Ingrese los numeros-> ");
        numeros[i]=reading.nextInt();
    
        if (numeros[i]==0){
    
            contador_ceros +=1;
    
    }
        else if(numeros[i]>=0){
        media_positivos +=numeros[i];
        
        }
        else{
            
        media_negativos +=numeros[i];
        
        }    
        }
   System.out.println("Los Ceros Existentes En El Arreglo Són -> "+contador_ceros);
        System.out.println("La Media De Los Positivos Es "+ (media_positivos/5));
        System.out.println("La Media De Los Negativos Es "+ (media_negativos/5));
   
   
       
      
    }

    }
  
    
    
  
