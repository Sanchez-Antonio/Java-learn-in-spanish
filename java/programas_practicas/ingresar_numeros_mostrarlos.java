//leer 10 números enteros, guardarlos en un arreglo.Debemos mostrarlos en el siguiente orden : el primero y el ultimo,susesivo
package practica001;
import java.util.Scanner;

public class Practica001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner reading = new Scanner(System.in);
      
      int [] numeros = new int [10];
      
      for (int i=0;i<numeros.length;i++){
      
          System.out.println("ingrese Los Numeros");
          numeros[i]= reading.nextInt();
      }
      
      for (int i=0,o=9;i<5;i++){
          System.out.println(numeros[i]);
          System.out.println(numeros[o]);
          o--;
      
      
      
      }