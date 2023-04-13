package ejercicioscrud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array que contiene los alumnos
        Alumno[] alumnos = new Alumno[30];

        for (int pos = 0; pos < alumnos.length; pos++) {
            // Rellena de celdas vacías
            alumnos[pos] = new Alumno("",0);
        }

        // Variable que contiene la opción del usuario
        int opc;

        // Variables para introducir la nota y el nombre del alumno
        String nombre;
        double notaMedia;

        // Escáner para leer datos
        Scanner key = new Scanner(System.in);

        do {
            // Llama a la función menú
            menu();

            // Pide opción al usuario
            System.out.println("\nSeleccione una opción: ");
            opc = key.nextInt();
            key.nextLine();

            // Switch que tiene una opción como parámetro
            switch (opc) {
                case 1 -> {
                    // Llama a la función para mostrar alumnos
                    muestraAlumno(alumnos);
                }
                case 2 -> {
                    // Le pide al usuario los datos
                    System.out.println("Deme el nombre del alumno");
                    nombre = key.nextLine();
                    System.out.println("Deme el nota del alumno");
                    notaMedia = key.nextDouble();
                    // Ejecuta la función pasando por parámetros las variables
                    introduceAlumno(notaMedia, nombre, alumnos);

                }
                case 3 -> {
                    // Le pide al usuario los datos
                    System.out.println("Deme el nombre del alumno");
                    nombre = key.nextLine();
                    System.out.println("Deme el nota del alumno");
                    notaMedia = key.nextDouble();
                    // Ejecuta la función para modificar a cada alumno
                    modificarAlumno(notaMedia, nombre, alumnos);
                }
                case 4 -> {
                    // Le pide al usuario los datos
                    System.out.println("Deme el nombre del alumno");
                    nombre = key.nextLine();
                    borrarAlumno(nombre, alumnos);
                }case 5 -> {
                    System.out.println("Ha salido del programa");
                }

                case default -> {
                    System.out.println("Esa opción no existe");
                }
            }
            System.out.println("\nPulse una tecla para continuar");
            key.next();
        } while (opc != 5);


    }

    /**
     * Imprime el menú
     */
    private static void menu() {
        System.out.println("ALUMNOS/AS\n" + "===============\n"
                + "1.Listado\n"
                + "2.Nuevo Alumno\n"
                + "3.Modificar\n"
                + "4.Borrar\n"
                + "5.Salir");
    }

    /**
     * Muestra alumnos
     *
     * @param alumnos Contiene a todos los alumnos
     */
    private static void muestraAlumno(Alumno alumnos[]) {
        // Recorre el array
        for (int pos = 0; pos < alumnos.length; pos++) {
            // Coge el nombre de la posición actual y comprueba si está vacío
            if (!alumnos[pos].getNombre().isEmpty()) {
                // Imprime el alumno completo
                System.out.println((pos + 1) + " Alumno: " + alumnos[pos].getNombre()
                        + " Nota Media: " + alumnos[pos].getNotaMedia());
            }
        }
    }

    /**
     * Método para introducir a un alumno
     *
     * @param nota    Contiene la nota del alumno
     * @param nombre  Contiene el nombre del alumno
     * @param alumnos Array que contiene los alumnos
     */
    private static void introduceAlumno(double nota, String nombre, Alumno alumnos[]) {
        //Creación de variable auxiliar
        int newPos = 0;

        // Recorre el array
        for (int pos = alumnos.length - 1; pos >= 0; pos--) {
            // Comprueba si la posición está libre
            if (alumnos[pos].getNombre().equals("")) {
                newPos = pos;
            }
        }
        // Asigna las variables a ese alumno
        alumnos[newPos].setNombre(nombre);
        alumnos[newPos].setNotaMedia(nota);
    }

    /**
     * Método para modificar la nota del alumno
     *
     * @param nota    Contiene la nota del alumno
     * @param nombre  Contiene el nombre del alumno
     * @param alumnos Array que contiene los alumnos
     */
    private static void modificarAlumno(double nota, String nombre, Alumno alumnos[]) {
        // Recorre el array
        for (int pos = 0; pos < alumnos.length; pos++) {
            // Comprueba si el nombre de esa posición es el mismo que el pasado por parámetro
            if (alumnos[pos].getNombre().equals(nombre)) {
                // Asigna la nota a ese alumno
                alumnos[pos].setNotaMedia(nota);
            }
        }
    }

    /**
     * Método para borrar a un alumno
     *
     * @param nombre  Contiene el nombre del alumno
     * @param alumnos Array que contiene los alumnos
     */
    private static void borrarAlumno(String nombre, Alumno alumnos[]) {
        // Recorre el array
        for (int pos = 0; pos < alumnos.length; pos++) {
            // Comprueba si el nombre de esa posición es el mismo que el pasado por parámetro
            if (alumnos[pos].getNombre().equals(nombre)) {
                // Borra a ese alumno
                alumnos[pos].setNombre("");
            }
        }
    }

}

