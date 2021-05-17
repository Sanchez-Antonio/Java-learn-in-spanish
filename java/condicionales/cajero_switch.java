package practica01;

import javax.swing.JOptionPane;
 
public class Practica01 {

    public static void main(String[] args) {
    float saldo=1000,deposito,retiro;
    int opcion;
    
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL CAJERO AUTOMATICO");
        opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCIÓN A CONTINUACION --> \n 1.Ingresar Dinero A La Cuenta. \n 2.Retirar Dinero De La Cuenta. \n 3.Salir "));
        
        switch(opcion){
            
            case 1:
                deposito = Integer.parseInt(JOptionPane.showInputDialog("Digíte El Dinero Que Desea Ingresar"));
                saldo += deposito;
                JOptionPane.showMessageDialog(null, "FELICIDADEZ EL DEPOSITO SE REALIZO CORRECTAMENTE \n Su Saldo Actual Es De $"+saldo);
                break;
            case 2:
                retiro = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONO RETIRAR \n DIGÍTE CUANTO DESEA RETIRAR"));
                if (retiro <=saldo){
                saldo -=retiro;
                JOptionPane.showMessageDialog(null, "FELICIDADEZ RETIRO REALIZADO CON EXITO \n SALDO ACTUAL DE $"+saldo);
                break;
                }
                else {
                JOptionPane.showMessageDialog(null,"NO SE CUENTA CON TANTO DINERO O OCURRIO ALGÚN ERROR","ERROR¡¡¡",JOptionPane.WARNING_MESSAGE);
                break;
                }
            case 3 : 
                JOptionPane.showMessageDialog(null, "SALIO CON EXITO DEL PROGRAMA");
                break;
        
        
        ////en el caso default : es referente a un else (contrario a todas las evaluaciones de los casos)
        
        }
        
        
        
        
        
        
        
        
    }
    
    
}
