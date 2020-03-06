package actividad02;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        int userInputMenuItem; //para el menú
        int userInputModifyPosition; //para el caso de modificar una posición
        double userInputNewDouble; //un nuevo número para la posición modificada

        Scanner sc = new Scanner(System.in);

        double[] miArray = new double[5]; //inicializar el array

        System.out.println("Dime 5 números (pueden ser decimales):"); //popular el array
        for (int i = 0; i < 5; i++) {
            miArray[i] = sc.nextDouble(); //pedimos cada uno de los números al usuario
        }

        System.out.println("\n\t" + "Posición 1" + "\t" + "Posición 2" + "\t" + "Posición 3" + "\t" + "Posición 4" + "\t" + "Posición 5" + "\t"); //mostramos una cabecera
        for (double element : miArray) { //mostramos todos los elementos del array delimitados con tab's
            System.out.print("\t " + element + " \t");
        }
        do {
            System.out.println("\n\nIndica la opción a realizar:"); // mostramos el menú
            System.out.println("1 - Modificar un valor almacenado.");
            System.out.println("2 - Mostrar el valor más bajo almacenado.");
            System.out.println("3 - Mostrar el valor medio almacenado.");
            System.out.println("0 - Finalizar.\n");

            userInputMenuItem = sc.nextInt(); //pedimos al usuario un case(opción)

            switch (userInputMenuItem) {
                case 0: // finaliza el programa
                    System.out.println("¡Hasta luego!");
                    break;
                case 1: // modifica una posición
                    System.out.println("De que posición quieres modificar datos? Elige de 1 a 5:");
                    userInputModifyPosition = sc.nextInt(); // pedimos al usuario que posición quiere modificar
                    if ((userInputModifyPosition < 1) || (userInputModifyPosition > miArray.length)) { // un poco de control
                        System.out.println("Son válidos sólo números de 1 a 5.\n");
                        break;
                    }
                    System.out.println("\nDe acuerdo. Modificamos la posición número " + userInputModifyPosition + " que ahora mismo tiene el valor de " + miArray[userInputModifyPosition - 1]); // confirmamos y mostramos el valor actual de la posición escogida por el usuario
                    System.out.println("Escribe el nuevo valor de la posición " + userInputModifyPosition + ":");
                    userInputNewDouble = sc.nextDouble(); // pedimos al usuario el nuevo valor y lo guardamos en un nuevo double
                    miArray[userInputModifyPosition - 1] = userInputNewDouble; // guardamos el valor del nuevo double en el array
                    System.out.println("\n¡Oído cocina! Modificación correcta en la posición " + userInputModifyPosition + ":"); //confirmamos y mostramos de nuevo la cabecera y el array
                    System.out.println("\n\t" + "Posición 1" + "\t" + "Posición 2" + "\t" + "Posición 3" + "\t" + "Posición 4" + "\t" + "Posición 5" + "\t");
                    for (double element : miArray) {
                        System.out.print("\t " + element + " \t");
                    }
                    break;
                case 2: // mostramos el valor más bajo
                    double numMenor = miArray[0]; //inicializamos un nuevo double con el valor del primer elemento del array
                    for (int i = 1; i < miArray.length ; i++) { //hacemos un for loop para comparar los números del array y averiguar el menor empezando a comparar la segunda posición con la primera ya definida fuera del bucle
                        if (miArray[i] < numMenor) {
                            numMenor = miArray[i]; //en caso de que haya uno menor, lo guardamos en el double de fuera del bucle, en caso que no haya ningún número menor resulta que el double ya definido ES el menor
                        }
                    }
                    System.out.println("\nEl número más pequeño es: " + numMenor); //mostramos el número menor
                    break;
                case 3: // mostramos el valor medio
                    double sum = 0; //inicializamos un nuevo double con el valor zero
                    for (int i = 0; i<miArray.length; i++) { //hacemos un bucle for para sumar cada uno de los elementos del array y guardamos la suma
                        sum = sum + miArray[i];
                    }

                    double addAndDivide = sum / miArray.length; //declaramos un nuevo double con valor a la suma de los elementos del array dividida por el número de elementos existentes en el array -> el valor medio
                    System.out.println("\nEl valor medio almacenado es: " + addAndDivide); //mostramos el valor medio
                    break;

                default: // caso default para volver a mostrar el menu en caso de que el usuario eligiera una opción no válida
                    System.out.println("Elige una opción de 0 a 3.\n"); //
            }
        }while (userInputMenuItem != 0) ; // la opción 0 finaliza el programa

    }
}
