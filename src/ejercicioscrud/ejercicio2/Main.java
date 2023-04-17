package ejercicioscrud.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Array que contiene los artículos
    static Articulo[] articulos = new Articulo[0];

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
                    listado();
                }
                case 2 -> {
                    // Pide toda la información del artículo al usuario
                    System.out.println("Deme el código del artículo: ");
                    codigo = key.nextInt();
                    key.nextLine();
                    System.out.println("Deme la descripción del artículo: ");
                    descripcion = key.nextLine();
                    System.out.println("Deme el precio de compra del artículo: ");
                    precioCompra = key.nextDouble();
                    key.nextLine();
                    System.out.println("Deme el precio de venta del artículo: ");
                    precioVenta = key.nextDouble();
                    key.nextLine();
                    System.out.println("Deme el stock disponible del artículo: ");
                    stock = key.nextInt();

                    // Añade el nuevo objeto a la lista
                    alta(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));

                }
                case 3 -> {
                    // Pide toda la información del artículo al usuario
                    System.out.println("Deme el código del artículo para eliminarlo: ");
                    codigo = key.nextInt();
                    // Llama al método baja
                    baja(codigo);

                }
                case 4 -> {
                    // Pide toda la información del artículo al usuario
                    System.out.println("Deme el código del artículo para modificarlo: ");
                    codigo = key.nextInt();
                    System.out.println("Deme la descripción del artículo: ");
                    descripcion = key.nextLine();
                    key.nextLine();
                    System.out.println("Deme el precio de compra del artículo: ");
                    precioCompra = key.nextDouble();
                    key.nextLine();
                    System.out.println("Deme el precio de venta del artículo: ");
                    precioVenta = key.nextDouble();

                    // Llama al método modificación
                    modificacion(codigo, descripcion, precioCompra, precioVenta);

                }
                case 5 -> {
                    System.out.println("Deme el código del artículo para añadir stock: ");
                    codigo = key.nextInt();
                    key.nextLine();
                    System.out.println("Deme cuanto stock quiere añadir: ");
                    stock = key.nextInt();
                    // Llama al método para añadir artículos al stock
                    entradaArticulo(codigo, stock);
                }
                case 6 -> {
                    System.out.println("Deme el código del artículo para sacar stock: ");
                    codigo = key.nextInt();
                    System.out.println("Deme cuanto stock quiere sacar: ");
                    stock = key.nextInt();
                    // Llama al método para añadir artículos al stock
                    salidaArticulo(codigo, stock);
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

        } while (opc != 7);

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
                + "6.Salida de mercancía\n"
                + "7.Salir");
    }

    /**
     * Método que lista todos los artículos
     */
    private static void listado() {
        // Recorre el array
        for (int pos = 0; pos < articulos.length; pos++) {
            // Imprime el alumno completo
            System.out.println((pos + 1) + "Artículos: "
                    + " Código " + articulos[pos].getCodigo()
                    + " Descripción: " + articulos[pos].getDescripcion()
                    + " PrecioCompra: " + articulos[pos].getPrecioCompra()
                    + " PrecioVenta: " + articulos[pos].getPrecioVenta()
                    + " Stock: " + articulos[pos].getStock());
        }
    }

    /**
     * Método que da de alta a los nuevos artículos
     *
     * @param articulo Objeto que contiene toda la información
     */
    private static void alta(Articulo articulo) {
        articulos = Arrays.copyOf(articulos, articulos.length + 1);
        articulos[articulos.length - 1] = articulo;
    }

    /**
     * Método que borra un artículo
     *
     * @param codigo Contiene el código
     */
    private static void baja(int codigo) {
        // Recorre el array
        for (int pos = 0; pos < articulos.length; pos++) {
            // Compara si el código de la posición actual coincide con el pasado por parámetros
            if (articulos[pos].getCodigo() == codigo) {
                // Calcula la longitud restando la longitud total menos la posición menos 1
                int longitud = articulos.length - pos - 1;
                // Copia a partir de la siguiente posición hasta el final y lo pega desde la posición actual
                System.arraycopy(articulos, pos + 1, articulos, pos, longitud);
                // Borra la última posición
                articulos = Arrays.copyOf(articulos, articulos.length - 1);
            }
        }
    }

    /**
     * Método que modifica los valores de un artículo
     *
     * @param codigo       Contiene el código
     * @param descripcion  Contiene la descripción del artículo
     * @param precioCompra Contiene el precio de compra del artículo
     * @param precioVenta  Contiene el precio de venta del artículo
     */
    private static void modificacion(int codigo, String descripcion, double precioCompra, double precioVenta) {
        // Recorre el array
        for (int pos = 0; pos < articulos.length; pos++) {
            // Compara si el código de la posición actual coincide con el pasado por parámetros
            if (articulos[pos].getCodigo() == codigo) {
                // Reemplaza llamando al set la descripción
                articulos[pos].setDescripcion(descripcion);
                // Reemplaza llamando al set el precio de compra
                if (precioVenta >= 0) {
                    articulos[pos].setPrecioCompra(precioCompra);
                } else {
                    articulos[pos].setPrecioCompra(0);
                }
                // Reemplaza llamando al set el precio de venta
                if (precioVenta >= 0) {
                    articulos[pos].setPrecioVenta(precioVenta);
                } else {
                    articulos[pos].setPrecioVenta(0);
                }
            }
        }
    }

    /**
     * Método que rellena el stock de artículos
     *
     * @param codigo   Contiene el código
     * @param cantidad Contiene la cantidad de stock que se va a añadir
     */
    private static void entradaArticulo(int codigo, int cantidad) {
        // Recorre el array
        for (int pos = 0; pos < articulos.length; pos++) {
            // Compara si el código de la posición actual coincide con el pasado por parámetros
            if (articulos[pos].getCodigo() == codigo) {
                // Reemplaza llamando al set la descripción y suma la cantidad correspondiente
                articulos[pos].setStock(articulos[pos].getStock() + cantidad);
            }
        }
    }

    /**
     * * Método que resta el stock de artículos
     *
     * @param codigo   Contiene el código
     * @param cantidad Contiene la cantidad de stock que se va a añadir
     * @return Devuelve si se ha podido realizar la operación
     */
    private static boolean salidaArticulo(int codigo, int cantidad) {
        boolean estado = true;
        // Recorre el array
        for (int pos = 0; pos < articulos.length; pos++) {
            // Compara si el código de la posición actual coincide con el pasado por parámetros
            if (articulos[pos].getCodigo() == codigo) {
                // Solo se ejecuta si la cantidad es menor que el stock actual
                if (articulos[pos].getStock() >= cantidad) {
                    // Reemplaza llamando al set la descripción y resta la cantidad correspondiente
                    articulos[pos].setStock(articulos[pos].getStock() - cantidad);
                } else { // En el caso de que no haya suficiente stock se indica que no es posible llevarlo a cabo
                    estado = false;
                }
            }
        }
        // Devuelve el estado
        return estado;
    }

}


