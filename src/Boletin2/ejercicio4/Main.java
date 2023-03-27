package Boletin2.ejercicio4;

import java.util.Scanner;

public class Main {
    // Creación de escáner
    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {

        // Creación de array de objetos
        Disco[] discos = new Disco[10];

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
            switch (opc) {
                case 1 -> {
                    listarDisco(discos);
                }
                case 2 -> {
                    posicion = posicionLibre(discos);
                    if (posicion < 0) {
                        System.out.println("No hay hueco libre");
                    } else {
                        insertarDisco(discos, posicion);
                    }
                }
                case 3 -> {
                    modificarDisco(discos);

                }
                case 4 -> {
                    posicion = posicionLibre(discos);
                    if (posicion < 0) {
                        System.out.println("No hay hueco libre");
                    } else {
                        borrarDisco(discos, posicion);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo");
                }
            }


        } while (opc != 5);
        // Cierre de escáner
        key.close();
    }

    /**
     * Método que se encarga de borrar el disco
     *
     * @param discos   Array que contiene los discos
     * @param posicion Atributo que contiene la posición
     */
    private static void borrarDisco(Disco[] discos, int posicion) {
        System.out.println("Introduce el código del disco");
        posicion = key.nextInt();
        if (posicion >= 0 && posicion < discos.length) {
            discos[posicion].setCodigo("LIBRE");
        } else {
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
        System.out.println("Deme el autor, título, género y duración para crear un nuevo disco: ");
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
        int posicion = 0;

        while (posicion < discos.length && !discos[posicion].getCodigo().equals("LIBRE")) {
            posicion++;
        }
        if (posicion == discos.length) {
            posicion = -1;
        }
        return posicion;
    }

    /**
     * Método que muestra los discos usados
     *
     * @param discos Array que contiene los discos
     */
    private static void listarDisco(Disco[] discos) {
        for (int i = 0; i < discos.length; i++) {
            if (!discos[i].getCodigo().equals("LIBRE")) {
                System.out.println(discos[i]);
            }
        }
    }

    /**
     * Método que modifica los valores del disco
     *
     * @param discos   Array que contiene los discos
     */
    private static void modificarDisco(Disco[] discos) {
        int discoModificar;
        System.out.println("Deme el código del disco que desea modificar");
        discoModificar = key.nextInt();

        System.out.println("Deme el autor, título, género y duración para modificar el disco: ");
        discos[discoModificar].setCodigo(String.valueOf(discoModificar));
        discos[discoModificar].setAutor(key.next());
        discos[discoModificar].setTitulo(key.next());
        discos[discoModificar].setGenero(key.next());
        discos[discoModificar].setDuracion(key.nextInt());


    }

}





