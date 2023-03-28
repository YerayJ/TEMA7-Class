package Boletin2.ejercicio2;

public class Contador {
    /**
     * Atributo que se usa como un contador
     */
    int cont;

    /**
     * Constructor por defecto
     */
    Contador() {
        // Constructor
    }

    /**
     * Constructor que comprueba que el contador no sea negativo
     *
     * @param cont Variable que contiene el contador
     */
    Contador(int cont) {
        // Si el contador pasado es menor que 0 se inicializa a 0 nuevamente
        if (cont < 0) {
            this.cont = 0;
        } else {
            // Si no se le da como valor al contador el pasado por parámetro
            this.cont = cont;
        }
    }

    /**
     * Constructor copia
     *
     * @param contCopia Objeto creado como copia
     */
    Contador(Contador contCopia) {
        this.cont = contCopia.cont;
    }

    /**
     * Setter
     *
     * @param cont Variable que contiene el contador
     */
    public void setCont(int cont) {
        this.cont = cont;
    }

    /**
     * Getter
     *
     * @return Devuelve el contador
     */
    public int getCont() {
        return cont;
    }

    /**
     * Método que incrementa el contador en uno
     */
    public void incrementa() {
        this.cont++;
    }

    /**
     * Método que decrementa en uno el contador y comprueba que no sea negativo
     */
    public void decrementar() {
        // Decrementa el contador
        cont--;
        // Comprueba si el contador es menor que 0 y lo inicializa a 0 nuevamente
        if (cont < 0) {
            cont = 0;
        }
    }
}
