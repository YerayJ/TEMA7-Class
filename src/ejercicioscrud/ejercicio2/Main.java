package ejercicioscrud.ejercicio2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Atributo que contiene el código
        int codigo;
        // Atributo que contiene la descripción del artículo
        String descripcion = "";
        // Atributo que contiene el precio de compra del artículo
        double precioCompra;
        // Atributo que contiene el precio de venta del artículo
        double precioVenta;
        // Atributo que contiene el stock del artículo
        int stock;

        // Array que contiene los artículos
        Articulo[] articulos = new Articulo[0];

        // Variable que contiene la opción del usuario
        int opc;

        // Escáner para leer datos
        Scanner key = new Scanner(System.in);

        do {
            // Método que imprime el menú
            menu();

            // Pide opción al usuario
            System.out.println("\nSeleccione una opción: ");
            opc = key.nextInt();
            key.nextLine();

            // Switch que tiene una opción como parámetro
            switch (opc) {
                case 1 -> {
                    // Llama a la función para mostrar artículos
                    listado(articulos);
                }
                case 2 -> {
                    // Pide toda la información del artículo al usuario
                    System.out.println("Deme el código del artículo: ");
                    codigo = key.nextInt();
                    System.out.println("Deme la descripción del artículo: ");
                    descripcion = key.nextLine();
                    System.out.println("Deme el precio de compra del artículo: ");
                    precioCompra = key.nextInt();
                    System.out.println("Deme el precio de venta del artículo: ");
                    precioVenta = key.nextInt();
                    System.out.println("Deme el stock disponible del artículo: ");
                    stock = key.nextInt();

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {
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
        System.out.println("GESTISIMAL \n"
                + "===============\n"
                + "1.Listado\n"
                + "2.Alta\n"
                + "3.Baja\n"
                + "4.Modificación\n"
                + "5.Entrada de mercancía\n"
                + "6.Salida de emergencía\n"
                + "7.Salir");
    }

    /**
     * Método que lista todos los artículos
     *
     * @param articulos Array que contiene los artículos
     */
    private static void listado(Articulo articulos[]) {
        // Recorre el array
        for (int pos = 0; pos < articulos.length; pos++) {
            // Imprime el alumno completo
            System.out.println("Artículos: " + (pos + 1)
                    + " Código " + articulos[pos].getCodigo()
                    + " Descripción: " + articulos[pos].getDescripcion()
                    + " PrecioCompra: " + articulos[pos].getPrecioCompra()
                    + " PrecioVenta: " + articulos[pos].getPrecioVenta()
                    + " Stock: " + articulos[pos].getStock());
        }
    }



}

