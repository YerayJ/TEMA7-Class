package BoletinEnumerados.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de variable que contiene el sexo
        String genero;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide el género al usuario
        System.out.println("Deme el género del primer libro: ");
        genero = key.next();

        Libro libro1 = new Libro("Peppa Pig", "Peppa Pig", 20, 11,
                Libro.Genero.valueOf(genero));

        // Pide el género al usuario
        System.out.println("Deme el género del segundo libro: ");
        genero = key.next();

        Libro libro2 = new Libro("Hola", "Yo", 10, 9,
                Libro.Genero.valueOf(genero));

        prestamosLibros(libro1);
        prestamosLibros(libro2);

        // Cierre de escáner
        key.close();
    }

    private static void prestamosLibros(Libro libro1) {
        if (libro1.prestamo()) {
            System.out.println("Libro prestado ");
        } else {
            System.out.println("No hay ejemplares para prestar");
        }

        if (libro1.devolucion()) {
            System.out.println("El libro se ha devuelto");
        } else {
            System.out.println("No hay ejemplares para devolver");
        }

        System.out.println(libro1.muestraInfo());
    }
}
