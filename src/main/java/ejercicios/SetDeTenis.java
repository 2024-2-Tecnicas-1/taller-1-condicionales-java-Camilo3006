package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if (numVictoriasA > 7 || numVictoriasB > 7 || 
            (numVictoriasA == 7 && numVictoriasB < 5) || 
            (numVictoriasB == 7 && numVictoriasA < 5)) {
            return "Inválido";
        }

        if (numVictoriasA == 6 && numVictoriasB <= 4) {
            return "Ganó A";
        } else if (numVictoriasB == 6 && numVictoriasA <= 4) {
            return "Ganó B";
        } else if (numVictoriasA == 7 && (numVictoriasB == 5 || numVictoriasB == 6)) {
            return "Ganó A";
        } else if (numVictoriasB == 7 && (numVictoriasA == 5 || numVictoriasA == 6)) {
            return "Ganó B";
        }

        return "Aún no termina";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
