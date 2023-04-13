package boletinenumerados.ejercicio4;

import java.util.Scanner;

public class Main {
    // Creación de escáner
    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        // Creación de array de objetos
        Disco[] discos = new Disco[10];

        coleccionDiscos(discos);

        // Creación de array de objetos
        Disco[] discos2 = new Disco[10];

        coleccionDiscos(discos2);

        // Imprime discos
        listarDisco(discos);
        listarDisco(discos2);

        // Cierre de escáner
        key.close();
    }

    private static void coleccionDiscos(Disco[] discos) {
        // Atributo que contiene la opción
        int opc;
        // Contador que controla la posición del disco
        int posicion;
        // Rellenar por defecto los objetos del array
        for (int i = 0; i < discos.length; i++) {
            discos[i] = new Disco();
        }

        do {
            // Imprime menú
            System.out.println("COLECCIÓN DE DISCOS\n" +
                    "=================\n" +
                    "1. Listado\n" +
                    "2. Nuevo Disco\n" +
                    "3. Modificar\n" +
                    "4. Borrar\n" +
                    "5. Salir\n");

            // Pide la opcion al usuario
            opc = key.nextInt();
            // Switch que tiene como parámetro de entrada opc
            switch (opc) {
                case 1 -> {
                    // Llama al método para que liste los discos
                    listarDisco(discos);
                }
                case 2 -> {
                    //Asigna valor a posición llamando al método posicionLibre
                    posicion = posicionLibre(discos);
                    // Comprueba si la posición es menor que 0 significa que no hay hueco libre
                    if (posicion < 0) {
                        System.out.println("No hay hueco libre");
                    } else { // En el caso de que si haya hueco libre se inserta un disco llamando al método
                        insertarDisco(discos, posicion);
                    }
                }
                case 3 -> {
                // Llama al método modificarDisco
                    modificarDisco(discos);

                }
                case 4 -> {
                    //Asigna valor a posición llamando al método posicionLibre
                    posicion = posicionLibre(discos);
                    // Comprueba si la posición es menor que 0 significa que no hay hueco libre
                    if (posicion < 0) {
                        System.out.println("No hay hueco libre");
                    } else { // En el caso de que si haya hueco libre se inserta un disco llamando al método
                        borrarDisco(discos, posicion);
                    }
                }
                case 5 -> {
                    // En el caso de que se pase el valor 5 saldrá del programa e imprime una indicación de ello
                    System.out.println("Saliendo");
                }
            }
        } while (opc != 5); // Se ejecuta mientras la opción no sea 5
    }

    /**
     * Método que se encarga de borrar el disco
     *
     * @param discos   Array que contiene los discos
     * @param posicion Atributo que contiene la posición
     */
    private static void borrarDisco(Disco[] discos, int posicion) {
        // Pide el código del disco al usuario
        System.out.println("Introduce el código del disco");
        posicion = key.nextInt();
        // Comprueba si la posición pasada está dentro del array
        if (posicion >= 0 && posicion < discos.length) {
            // Al código del objeto de la posición del array le da como valor LIBRE
            discos[posicion].setCodigo("LIBRE");
        } else {
            // En el caso de que no esté dentro del rango se indica que el código no es válido
            System.out.println("Código no válido");
        }
    }

    /**
     * Método que se encarga de insertar un Disco
     *
     * @param discos   Array que contiene los discos
     * @param posicion Atributo que contiene la posición
     * @return Devuelve la posicion
     */
    private static int insertarDisco(Disco[] discos, int posicion) {
        // Pide los datos al usuario
        System.out.println("Deme el autor, título, género y duración para crear un nuevo disco: ");
        // Para añadir el código usa directamente la posición y la guarda com String
        discos[posicion].setCodigo(String.valueOf(posicion));
        // Modifica el disco que se encuentra en la posición posicion y asigna el valor pasándolo por teclado
        discos[posicion].setAutor(key.next());
        discos[posicion].setTitulo(key.next());
        discos[posicion].setGenero(key.next());
        discos[posicion].setDuracion(key.nextInt());
        return posicion;
    }

    /**
     * Método que busca la posición libre
     *
     * @param discos Array que contiene los discos
     * @return Devuelve la posición libre
     */
    private static int posicionLibre(Disco[] discos) {
        // Declara una variable como posición inicializada a 0
        int posicion = 0;
        // Mientras la posición sea menor al final del array y su código no sea libre se ejecuta
        while (posicion < discos.length && !discos[posicion].getCodigo().equals("LIBRE")) {
            // En ese caso la posición se suma
            posicion++;
        }
        // Si la posición llega a ser igual a la longitud del array se le asignará menos 1 para indicar que está fuera
        if (posicion == discos.length) {
            posicion = -1;
        }
        // Devuelve la posición
        return posicion;
    }

    /**
     * Método que muestra los discos usados
     *
     * @param discos Array que contiene los discos
     */
    private static void listarDisco(Disco[] discos) {
        // Recorre el array
        for (int i = 0; i < discos.length; i++) {
            // Comprueba si el código del disco no está libre
            if (!discos[i].getCodigo().equals("LIBRE")) {
                // Lo muestra
                System.out.println(discos[i]);
            }
        }
    }

    /**
     * Método que modifica los valores del disco
     *
     * @param discos Array que contiene los discos
     */
    private static void modificarDisco(Disco[] discos) {
        // Crea variable auxiliar para guardar el código a modificar
        int discoModificar;
        // Pide el código al usuario
        System.out.println("Deme el código del disco que desea modificar");
        discoModificar = key.nextInt();
        // Por último vuelve a pedir los datos al usuario
        System.out.println("Deme el autor, título, género y duración para modificar el disco: ");
        discos[discoModificar].setCodigo(String.valueOf(discoModificar));
        discos[discoModificar].setAutor(key.next());
        discos[discoModificar].setTitulo(key.next());
        discos[discoModificar].setGenero(key.next());
        discos[discoModificar].setDuracion(key.nextInt());


    }

}





