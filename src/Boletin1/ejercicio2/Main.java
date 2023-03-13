package Boletin1.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Peppa Pig", "Peppa Pig", 20, 10);

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

    }
}
