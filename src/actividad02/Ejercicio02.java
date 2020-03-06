package actividad02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio02 {
    public static void main(String[] args) {
        // BufferedReader para recoger datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Variables para el menú
        String numeroEscrito;
        int userInputMenu = 0;
        // Variables para café / leche
        double tazaCafe = 0.0;
        double tazaLeche = 0.0;

        // Do/while para volver a mostrar el menú después de cada opción
        do {
            System.out.println("Indica la opción a realizar");
            System.out.println("1 - Añadir café a taza.");
            System.out.println("2 - Añadir leche a la taza.");
            System.out.println("3 - Beber de la taza.");
            System.out.println("0 - Finalizar.\n");
        // Try/catch para recoger datos y controlar excepciones -> que NO acepte letras en vez de números
            try {
                numeroEscrito = br.readLine();
                userInputMenu = Integer.parseInt(numeroEscrito);
            } catch(Exception e) {
                System.out.println("Warning: " + e + ". Esto no es Scrabble. \nEl programa acepta sólo números.");
            }
        // Switch/case del menú ( controlamos que es lo que va hacer cada opción del programa )
            switch (userInputMenu) {
        // Opción 0: Muestra el mensaje de salida y luego se finaliza el programa ( condición while del final del do/while NO cumplida )
                case 0:
                    System.out.println("Deja propina hombre!");
                    break;
        // Opción 1: Pedimos la cantidad de café que el usuario quiere agregar a la taza
                case 1:
                    System.out.println("Cuánta cantidad de café añadimos a la taza?");
            // Try/catch para recoger datos
                    try {
            // Guardamos en un String la opción del usuario via el BufferedReader
                        String userCafe = br.readLine();
            // Convertimos el String a double para poder trabajar con números decimales
                        double userInputCafe = Double.parseDouble(userCafe);
            // If statement para mostrar un mensaje en el caso de que el usuario introduce números negativos
                        if (userInputCafe < 0) {
                            System.out.println("Son válidos sólo números positivos.\n");
                // Break para volver al menú
                            break;
                        }
            // Mensaje de confirmación
                        System.out.println("\nDe acuerdo. Añadimos " + userInputCafe + "ml de café a la taza.");
            // Guardamos en la variable predefinida tazaCafe el valor introducido por el usuario
                        tazaCafe = tazaCafe + userInputCafe;
            // Mensaje de confirmación
                        System.out.println("La taza ahora tiene " + tazaCafe + "ml de café y " + tazaLeche +"ml de leche.\n");
            // Break para volver al menú
                        break;
                    }
            // Catch para controlar excepciones -> que NO acepte letras en vez de números
                    catch (Exception e) {
                        System.out.println("Warning: " + e + ". Esto no es Scrabble. \nEl programa acepta sólo números.\n");
            // Break para volver al menú
                        break;
                    }
        // Opción 2: Pedimos la cantidad de leche que el usuario quiere agregar a la taza
                case 2:
                    System.out.println("Cuánta cantidad de leche añadimos a la taza?");
            // Try/catch para recoger datos
                    try {
            // Guardamos en un String la opción del usuario via el BufferedReader
                        String userLeche = br.readLine();
                        double userInputLeche = Double.parseDouble(userLeche);
            // If statement para mostrar un mensaje en el caso de que el usuario introduce números negativos
                        if (userInputLeche < 0) {
                            System.out.println("Son válidos sólo números positivos.\n");
                // Break para volver al menú
                            break;
                        }
            // Mensaje de confirmación
                        System.out.println("\nDe acuerdo. Añadimos " + userInputLeche + "ml de leche a la taza.");
            // Guardamos en la variable predefinida tazaCafe el valor introducido por el usuario
                        tazaLeche = tazaLeche + userInputLeche;
            // Mensaje de confirmación
                        System.out.println("La taza ahora tiene " + tazaCafe + "ml de café y " + tazaLeche + "ml de leche.\n");
            // Break para volver al menú
                        break;
                    }
            // Catch para controlar excepciones -> que NO acepte letras en vez de números
                    catch (Exception e) {
                        System.out.println("Warning: " + e + ". Esto no es Scrabble. \nEl programa acepta sólo números.\n");
            // Break para volver al menú
                        break;
                    }
        // Opción 2: Pedimos la cantidad de leche y cafe que el usuario quiere beber de la taza
                case 3:
                    System.out.println("Cuántos ml te apetece beber de la taza?");
            // Try/catch para recoger datos
                    try {
            // Guardamos en un String la opción del usuario via el BufferedReader
                        String userBeber = br.readLine();
                        double userInputBeber = Double.parseDouble(userBeber);
            // If statement para mostrar un mensaje en el caso de que el usuario introduce números negativos
                        if (userInputBeber < 0) {
                            System.out.println("Son válidos sólo números positivos.\n");
                // Break para volver al menú
                            break;
                        }
            // Mensaje de confirmación
                        System.out.println("\nDe acuerdo, veo que tienes sed.");
            // Analizamos las 4 posibilidades
                // 1: Si la taza no está vacía Y la cantidad a beber no supera el contenido de la taza
                        if (tazaCafe > 0 && tazaLeche > 0 && (userInputBeber / 2) <= tazaCafe && (userInputBeber / 2) <= tazaLeche) {
                    // Restamos la mitad de la cantidad a beber de cada un ingrediente
                            tazaCafe = tazaCafe - userInputBeber / 2;
                            tazaLeche = tazaLeche - userInputBeber / 2;
                // 2: Si la cantidad a beber supera la cantidad disponible de leche habrá que restar la diferencia de la cantidad de café
                        } else if (tazaCafe > 0 && (userInputBeber / 2) > tazaLeche) {
                    // Declaramos un double con valor del resto de la cantidad de leche/cantidad de leche a beber
                            double db = tazaLeche - userInputBeber / 2;
                    // Guardamos el resultado de restar del café primero la parte proporcional del valor introducido y luego el resto de la leche
                            tazaCafe = (tazaCafe - (userInputBeber / 2)) + db;
                    // En caso que el resultado fuera negativo le ponemos el valor 0 a la taza de café
                            if (tazaCafe < 0) {
                                tazaCafe = 0;
                            }
                    // Y por último como el valor de la taza de leche será negativo, le ponemos el valor 0
                            tazaLeche = 0;
                // 3: Si la cantidad a beber supera la cantidad disponible de café habrá que restar la diferencia de la cantidad de leche
                        } else if (tazaLeche > 0 && (userInputBeber / 2) > tazaCafe) {
                    // Declaramos un double con valor del resto de la cantidad de café/cantidad de café a beber
                            double db = tazaCafe - userInputBeber / 2;
                    // Guardamos el resultado de restar de la leche primero la parte proporcional del valor introducido y luego el resto del café
                            tazaLeche = (tazaLeche - (userInputBeber / 2)) + db;
                    // En caso que el resultado fuera negativo le ponemos el valor 0 a la taza de leche
                            if (tazaLeche < 0) {
                                tazaLeche = 0;
                            }
                    // Y por último como el valor de la taza de café será negativo, le ponemos el valor 0
                            tazaCafe = 0;
                // 4: Si no hay ni café ni leche de donde restar simplemente mostraremos un mensaje
                        } else if (tazaCafe == 0 && tazaLeche == 0) {
                            System.out.println("Pero la taza está vacía!\n");
                    // Break para volver al menú
                            break;
                        }
                    }
            // Catch para controlar excepciones -> que NO acepte letras en vez de números
                    catch (Exception e) {
                        System.out.println("Warning: " + e + ". Esto no es Scrabble. \nEl programa acepta sólo números.\n");
                        break;
                    }
        // Mostramos la cantidad disponible después de cada un case
                    System.out.println("La taza ahora tiene " + tazaCafe + "ml de café y " + tazaLeche +"ml de leche.\n");
        // Break para volver al menú
                    break;
                default:
        // default case para mostrar un mensaje en caso de que el usuario elige un número invalido
                    System.out.println("No busques felicidad más allá de 1 a 4.\n");
            // Break para volver al menú
                    break;
            }
    // Final del bucle do/while que finaliza el programa en caso de que el usuario elija '0'
        } while (userInputMenu != 0);

    }
}
