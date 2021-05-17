package practica01;
//realizar un juego para adivinar un unumero.Para ello generar un numero alteratorio entre 0-100 y luego ir pidiendo
//numeros indicando es mayor o meno segun sea . el proceso termina cuando el usuario acierte y mostrar el numero de intentos.
import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
       
    Scanner reading = new Scanner(System.in);
    int contador = 0;
    int numero_ingresado,alteratorio;
    
    alteratorio = (int)Math.floor(Math.random()*100);
    
    while (true){
        System.out.println("Ingrese el numero entre 1 y 100 ");
        numero_ingresado = reading.nextInt();
        if (alteratorio > numero_ingresado){
            System.out.println("EL NUMERO ES MAYOR");
            }
        else if (alteratorio < numero_ingresado){
        
            System.out.println("EL NUMERO ES MENOR");
        }
        else {
            System.out.println("FELICIDADEZ EL NUMERO ERA " + alteratorio);
            break;
        }
       
        
    }
    
       
        
        
        
    }
    
    
}
