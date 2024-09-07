
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
       
        if (caracter >= '0' && caracter <= '9') {
            return "Es número";
        }
        
        else if (caracter >= 'A' && caracter <= 'Z') {
            return "Es letra mayúscula";
        }
        
        else if (caracter >= 'a' && caracter <= 'z') {
            return "Es letra minúscula";
        }
        
        else {
            return "No es letra ni número";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
