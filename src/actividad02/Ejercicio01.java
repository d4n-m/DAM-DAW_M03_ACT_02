package actividad02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio01 {
    public static void main(String[] args) {
        // declaramos el BufferedReader que lo vamos a necesitar luego para recoger datos de la consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // declaramos las variables
        String numeroEscrito;
        int k = 0;
        int i = 0;
        // loop do/while de inicio
        do {
            // pedimos un número al usuario
            System.out.println("Introduzca un número:");
            // leemos el número del usuario via un try/catch statement para captar posibles errores
            // guardamos el número introducido en la variable tipo int 'k'
            try {
                numeroEscrito = br.readLine();
                k = Integer.parseInt(numeroEscrito);
            } catch(Exception e) {
                System.out.println("Algo mal ha pasado..");
            }
        // hacemos que se repita hasta que se introduce un número mayor que 7 con el while de final
        } while (k <= 7);
        // mostramos por consola del 0 hasta el número introducido 'k' con la ayuda de la variable 'i'
        while (k >= i) {
            System.out.println(i);
            ++i;
        }
        // mostramos por consola del número introducido 'k' al 0 con el loop for
        for (int zero = 0; k >= zero; --k) {
            System.out.println(k);
        }
    }
}

