package ejercicioscrud.ejercicio3;

import java.util.Arrays;

public class Metodos {
    static public void menu() {
        System.out.println("--------MENÚ--------" +
                "\n1. Listado de pizzas." +
                "\n2. Nuevo pedido." +
                "\n3. Pizza servida" +
                "\n4. Salir");
    }

    /**
     * Método que lista todas las pizzas
     */
    public static void listado(Pizza[] pizzas) {
        // Recorre el array
        for (int pos = 0; pos < pizzas.length; pos++) {
            // Imprime la pizza
            System.out.println((pos + 1) + " Pizza:"
                    + " Código " + pizzas[pos].getCodigo()
                    + " Tamaño: " + pizzas[pos].getTam()
                    + " Tipo: " + pizzas[pos].getTipo()
                    + " Estado: " + pizzas[pos].getEstado());
        }
    }

    /**
     * Inserta un nuevo pedido
     * @param pizzas Contiene las pizzas
     * @return Devuelve las pizzas
     */
    public static Pizza[] insertaPedido(Pizza[] pizzas, Pizza pizza){
        pizzas = Arrays.copyOf(pizzas, pizzas.length + 1); // Añade una posición al array
        pizzas[pizzas.length - 1] = pizza; // Añade una pizza en la posición anterior
        return pizzas;
    }

    /**
     * Método para saber que las pizzas están servidas
     * @param pizzas Contiene las pizzas
     * @param codigo Contiene el código
     * @return Devuelve las pizzas
     */
    public static Pizza[] pizzaServida(Pizza[] pizzas, int codigo){
        for (int pos = 0; pos < pizzas.length; pos++) {
            // Compara si el código de la posición actual coincide con el pasado por parámetros
            if (pizzas[pos].getCodigo() == codigo) { // Busca la pizza por el código
                pizzas[pos].setEstado("Servida"); // Indica que la pizza está servida
            }
        }
        return pizzas; // Devuelve las pizzas
    }

}
