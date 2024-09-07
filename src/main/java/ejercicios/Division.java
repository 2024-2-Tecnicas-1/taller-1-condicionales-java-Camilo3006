
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {
    public static String evaluar(int dividendo, int divisor) {
      int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;
        
       
        boolean esExacta = (residuo == 0);
        
        
        String respuesta;
        if (esExacta) {
            respuesta = "La división es exacta. ";
        } else {
            respuesta = "La división no es exacta. ";
        }
        respuesta += " Cociente: " + cociente ;
        respuesta += " Residuo: " + residuo;
    
   
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}
