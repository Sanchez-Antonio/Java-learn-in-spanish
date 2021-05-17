package practica01;

import javax.swing.JOptionPane;
 //CONDICIONAL PARA TOMAR DESICIONES ENTORNO A LA EVALUACION DE UNA VARIABLE Y EL VALOR QUE TOME
public class Practica01 {

    public static void main(String[] args) {
        
        String opcion;
        int numero1,numero2,operacion;
        //si no existe un break seguira leyendo el codigo
        opcion = JOptionPane.showInputDialog("Ingrese que desea hacer a continuacion Ss = Sumar, Rr = Restar,Pp = Producto Dd = division ");
      switch (opcion){
          case "S":
          case "s":
              numero1 =Integer.parseInt(JOptionPane.showInputDialog("selecciono 'SUMA' Elija el primer numero para sumar"));
              numero2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
              operacion = (numero1 + numero2) ;
              JOptionPane.showMessageDialog(null,"el resultado es --> "+operacion);
              break;
          case "R":
          case "r":
              numero1 =Integer.parseInt(JOptionPane.showInputDialog("selecciono 'RESTA'. Elija el primer numero para restar"));
              numero2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
              operacion = (numero1 - numero2) ;
              JOptionPane.showMessageDialog(null,"el resultado es --> "+operacion);
              break;
          case "P":
          case "p":
              numero1 =Integer.parseInt(JOptionPane.showInputDialog("selecciono 'PRODUCTO'. Elija el primer numero para determinar el producto"));
              numero2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
              operacion = (numero1 % numero2) ;
              JOptionPane.showMessageDialog(null,"el resultado es --> "+operacion);
              break;
           case "D":
          case "d":
              numero1 =Integer.parseInt(JOptionPane.showInputDialog("selecciono 'Divicion'. Elija el primer numero para determinar la divicion"));
              numero2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
              operacion = (numero1 / numero2) ;
              JOptionPane.showMessageDialog(null,"el resultado es --> "+operacion);
              break
      
      
      
      
      
      }
 
  
  
  
  }
    
}
