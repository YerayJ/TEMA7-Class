package Boletin1.ejercicio2;

public class Libro {
    /**
     * Contiene el título del libro
     */
    String titulo;
    /**
     * Contiene el nombre del autor del libro
     */
    String autor;
    /**
     * Contiene el número de ejemplares del libro
     */
    int ejemplares;
    /**
     * Contiene el número de ejemplares prestados del libro
     */
    int ejemplaresPrestados;

    /**
     * Constructor por defecto
     */
    Libro() {
        // Constructor por defecto
    }

    /**
     * Constructor con parámetros
     *
     * @param titulo              Contiene el título del libro
     * @param autor               Contiene el nombre del autor del libro
     * @param ejemplares          Contiene el número de ejemplares prestados del libro
     * @param ejemplaresPrestados Contiene el número de ejemplares prestados del libro
     */
    Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    /**
     * Método que comprueba si se puede hacer el préstamo de un ejemplar
     * @return Devuelve si se ha podido realizar el préstamo
     */
    public boolean prestamo() {
        boolean estado = true;

        if (ejemplares <= 0) {
            estado = false;
        }else {
            ejemplares--;
            ejemplaresPrestados++;
        }

        return estado;
    }

    /**
     * Método que devuelve un ejemplar
     * @return Devuelve si se ha podido realizar la operación
     */
    public boolean devolucion() {
        boolean estado = true;

        if (ejemplaresPrestados <= 0) {
            estado = false;
        }else {
            ejemplares++;
            ejemplaresPrestados--;
        }

        return estado;
    }

}
