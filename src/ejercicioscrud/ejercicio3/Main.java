package ejercicioscrud.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de atributo que contiene la opción
        int opc;

        // Creación del código de la pizza
        int codigo;

        // Creación del tamaño de la pizza
        String tamanho;

        // Creación del tipo de la pizza
        String tipo;

        // Creación de array
        Pizza pizzas[] = new Pizza[0];

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        do {
            Metodos.menu(); // Imprime el menú
            opc = key.nextInt();
            key.nextLine(); // Pide la opción al usuario

            switch (opc) {
                case 1 -> {
                    Metodos.listado(pizzas); // Lista todas las pizzas
                }
                case 2 -> {
                    System.out.println("Deme el código de la pizza: ");
                    codigo = key.nextInt(); key.nextLine(); // Pide el código al usuario
                    System.out.println("Deme el tamaño de la pizza: ");
                    tamanho = key.next(); key.nextLine(); // Pide el tamaño al usuario
                    System.out.println("Deme el tipo de la pizza: ");
                    tipo = key.next(); key.nextLine(); // Pide el tipo al usuario
                    Pizza pizza = new Pizza(codigo,tamanho,tipo);

                    pizzas = Metodos.insertaPedido(pizzas, pizza); // Llama a la función insertar y le pasa una pizza
                }
                case 3 -> {
                    System.out.println("Deme el código de la pizza: ");
                    codigo = key.nextInt(); key.nextLine(); // Pide el código al usuario
                    pizzas = Metodos.pizzaServida(pizzas, codigo); // Llama a la función insertar y le pasa una pizza
                }
                case 4 -> {
                    System.out.println("Está saliendo del programa...");
                }
                case default -> {
                    System.out.println("Esa opción no existe");
                }
            }

        } while (opc != 4);
    }
}
