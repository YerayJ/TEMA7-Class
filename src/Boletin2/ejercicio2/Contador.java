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
        if (cont < 0) {
            this.cont = 0;
        } else {
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
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}
