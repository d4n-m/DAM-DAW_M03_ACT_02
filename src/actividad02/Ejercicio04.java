package actividad02;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        int userInputMenuItem; //para el menú
        String userItemAsig; //para elegir asignatura
        Scanner sc = new Scanner(System.in);

        String[][] miArray = {{"Matematica", "Biología", "Química"},{"5", "8", "10"},{"7", "6", "8"},{"9", "8", "9"},{"9", "6", "10"}}; //definimos e inicializamos el array
        //mostramos la cabecera
        System.out.println(miArray[0][0] + "\t" + miArray[0][1] + "\t" + miArray[0][2]);
        //el primer bucle recorre desde 1 a 5 (menos la cabecera)
        for(int i = 1; i < miArray.length; i++){
            //el segundo bucle recorre desde 0 a 3
            for(int j = 0; j < miArray[0].length; j++){
                System.out.print("\t" + miArray[i][j] + "   " + "\t");
            }
            System.out.println(" ");
        }
        do {
            System.out.println("\nIndica la opción a realizar:"); // mostramos el menú
            System.out.println("1 - Mostrar el nombre de todas las asignaturas.");
            System.out.println("2 - Mostrar las puntuaciones de una asignatura.");
            System.out.println("3 - Mostrar la puntuación media de una asignatura.");
            System.out.println("4 - Mostrar la puntuación más alta de una asignatura.");
            System.out.println("0 - Finalizar.\n");

            userInputMenuItem = sc.nextInt(); //pedimos al usuario un case(opción)
            switch (userInputMenuItem) {
                case 0: // finaliza el programa
                    System.out.println("¡Hasta luego!");
                    break;
                case 1: // muestra el nombre de todas las asignaturas
                    for (int i = 0; i < miArray[0].length; i++) {
                        System.out.println(miArray[0][i]);
                    }
                    break;
                case 2: // muestra las puntuaciones de una asignatura
                    System.out.println("Elige una asignatura: Matematica, Biología o Química.");
                    sc.nextLine(); //obtenemos la opción del usuario
                    userItemAsig = sc.nextLine();
                    if (userItemAsig.equalsIgnoreCase(miArray[0][0])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        System.out.print("\nEstas son las notas de la asignatura " + miArray[0][0] + ": ");
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y mostrar las notas de la opción elegida
                            if (i < miArray.length - 1) {
                                System.out.print(miArray[i][0] + ", "); //mostramos las notas seguidas de una virgulilla ","
                            } else {
                                System.out.print(miArray[i][0] + "."); //al llegar a la última nota ponemos el punto "."
                            }
                        }
                        System.out.println();
                        break;
                    } else if (userItemAsig.equalsIgnoreCase(miArray[0][1])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        System.out.print("\nEstas son las notas de la asignatura " + miArray[0][1] + ": ");
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y mostrar las notas de la opción elegida
                            if (i < miArray.length - 1) {
                                System.out.print(miArray[i][1] + ", "); //mostramos las notas seguidas de una virgulilla ","
                            } else {
                                System.out.print(miArray[i][1] + "."); //al llegar a la última nota ponemos el punto "."
                            }
                        }
                        System.out.println();
                        break;
                    } else if (userItemAsig.equalsIgnoreCase(miArray[0][2])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        System.out.print("\nEstas son las notas de la asignatura " + miArray[0][2] + ": ");
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y mostrar las notas de la opción elegida
                            if (i < miArray.length - 1) {
                                System.out.print(miArray[i][2] + ", "); //mostramos las notas seguidas de una virgulilla ","
                            } else {
                                System.out.print(miArray[i][2] + "."); //al llegar a la última nota ponemos el punto "."
                            }
                        }
                        System.out.println();
                        break;
                    } else { //si no se elige una opción correcta se muestra un aviso
                        System.out.println("Elige una asignación entre Matematica, Biología o Química!");
                        break;
                    }
                case 3: // mostramos la puntuación media de una asignatura
                    System.out.println("Elige una asignatura: Matematica, Biología o Química.");
                    sc.nextLine(); //obtenemos la opción del usuario
                    userItemAsig = sc.nextLine();
                    if (userItemAsig.equalsIgnoreCase(miArray[0][0])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        System.out.print("\nLa puntuación media de la asignatura " + miArray[0][0] + " es: ");
                        int sum = 0;
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y sumar las notas de la opción elegida
                            sum = sum + Integer.parseInt(String.valueOf(miArray[i][0]));
                        }
                        double addAndDivide = sum / (double)(miArray.length - 1); //en un double guardamos el resultado de la suma y división de las notas
                        System.out.print(addAndDivide + "."); //mostramos el valor medio
                        System.out.println();
                        break;
                    } else if (userItemAsig.equalsIgnoreCase(miArray[0][1])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        System.out.print("\nLa puntuación media de la asignatura " + miArray[0][1] + " es: ");
                        int sum = 0;
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y sumar las notas de la opción elegida
                            sum = sum + Integer.parseInt(String.valueOf(miArray[i][1]));
                        }
                        double addAndDivide = sum / (double)(miArray.length - 1); //en un double guardamos el resultado de la suma y división de las notas
                        System.out.print(addAndDivide + "."); //mostramos el valor medio
                        System.out.println();
                        break;
                    } else if (userItemAsig.equalsIgnoreCase(miArray[0][2])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        System.out.print("\nLa puntuación media de la asignatura " + miArray[0][2] + " es: ");
                        int sum = 0;
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y sumar las notas de la opción elegida
                            sum = sum + Integer.parseInt(String.valueOf(miArray[i][2]));
                        }
                        double addAndDivide = sum / (double)(miArray.length - 1); //en un double guardamos el resultado de la suma y división de las notas
                        System.out.print(addAndDivide + "."); //mostramos el valor medio
                        System.out.println();
                        break;
                    } else { //si no se elige una opción correcta se muestra un aviso
                        System.out.println("Elige una asignación entre Matematica, Biología o Química!");
                        break;
                    }
                case 4: // muestra la puntuación más alta de una asignatura
                    System.out.println("Elige una asignatura: Matematica, Biología o Química.");
                    sc.nextLine(); //obtenemos la opción del usuario
                    userItemAsig = sc.nextLine();
                    if (userItemAsig.equalsIgnoreCase(miArray[0][0])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        int lowestAsig = Integer.parseInt(String.valueOf(miArray[1][0])); //inicializamos un int con valor a la primera posición de notas de la columna elegida del array
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y comparar las notas de la opción elegida
                            if ((Integer.parseInt(String.valueOf(miArray[i][0]))) > lowestAsig) { //debemos convertir de string a int cada nota del array
                                lowestAsig = Integer.parseInt(String.valueOf(miArray[i][0])); //en caso de que haya una nota mayor, la guardamos en el int de fuera del bucle, en caso que no haya ninguna mayor resulta que el int ya definido ES la mayor nota
                            }
                        }
                        System.out.print("\nLa puntuación más alta de la asignatura " + miArray[0][0] + " es: " + lowestAsig + ".\n"); //mostramos la nota mayor
                        break;
                    } else if (userItemAsig.equalsIgnoreCase(miArray[0][1])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        int lowestAsig = Integer.parseInt(String.valueOf(miArray[1][1])); //inicializamos un int con valor a la primera posición de notas de la columna elegida del array
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y comparar las notas de la opción elegida
                            if ((Integer.parseInt(String.valueOf(miArray[i][1]))) > lowestAsig) { //debemos convertir de string a int cada nota del array
                                lowestAsig = Integer.parseInt(String.valueOf(miArray[i][1])); //en caso de que haya una nota mayor, la guardamos en el int de fuera del bucle, en caso que no haya ninguna mayor resulta que el int ya definido ES la mayor nota
                            }
                        }
                        System.out.print("\nLa puntuación más alta de la asignatura " + miArray[0][1] + " es: " + lowestAsig + ".\n"); //mostramos la nota mayor
                        break;
                    } else if (userItemAsig.equalsIgnoreCase(miArray[0][2])) { //comparamos la opción del usuario con el contenido de la cabecera del array
                        int lowestAsig = Integer.parseInt(String.valueOf(miArray[1][2])); //inicializamos un int con valor a la primera posición de notas de la columna elegida del array
                        for (int i = 1; i < miArray.length; i++) { //for loop para recorrer y comparar las notas de la opción elegida
                            if ((Integer.parseInt(String.valueOf(miArray[i][2]))) > lowestAsig) { //debemos convertir de string a int cada nota del array
                                lowestAsig = Integer.parseInt(String.valueOf(miArray[i][2])); //en caso de que haya una nota mayor, la guardamos en el int de fuera del bucle, en caso que no haya ninguna mayor resulta que el int ya definido ES la mayor nota
                            }
                        }
                        System.out.print("\nLa puntuación más alta de la asignatura " + miArray[0][2] + " es: " + lowestAsig + ".\n"); //mostramos la nota mayor
                        break;
                    } else { //si no se elige una opción correcta se muestra un aviso
                        System.out.println("Elige una asignación entre Matematica, Biología o Química!");
                        break;
                    }
                default: // caso default para volver a mostrar el menu en caso de que el usuario eligiera una opción no válida
                    System.out.println("Elige una opción de 0 a 4.\n"); //
            }
        } while (userInputMenuItem != 0) ; // la opción 0 finaliza el programa
    }
}
