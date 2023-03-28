package BoletinEnumerados.ejercicio2;

import BoletinEnumerados.ejercicio1.CuentaCorriente;

public class Libro {
    /**
     * Creación de enumerado que contiene el género de cada libro
     */
    enum Genero {Narrativo, Lirico, Dramatico, Didactico, Poetico}

    /**
     * Atributo de tipo Genero
     */
    private Genero genero;
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
     * @param genero Contiene el género de cada libro
     */
    Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.genero = genero;
    }

    /**
     * Getter
     * @return Devuelve el género
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Setter
     * @param genero Contiene el género del libro de tipo Genero
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Getter
     * @return Devuelve el título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter
     * @param titulo Contiene el título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter
     * @return Devuelve el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Setter
     * @param autor Contiene el autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getter
     * @return Devuelve la cantidad de ejemplares del libro
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * Setter
     * @param ejemplares Contiene la cantidad de ejemplares del libro
     */
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * Setter
     * @return Devuelve la cantidad de ejemplares prestados
     */
    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    /**
     * Setter
     * @param ejemplaresPrestados Contiene la cantidad de ejemplares prestados
     */
    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    /**
     * Método que comprueba si se puede hacer el préstamo de un ejemplar
     *
     * @return Devuelve si se ha podido realizar el préstamo
     */
    public boolean prestamo() {
        boolean estado = false;

        if (ejemplaresPrestados < ejemplares) {
            estado = true;
            ejemplaresPrestados++;
        }

        return estado;
    }

    /**
     * Método que devuelve un ejemplar
     *
     * @return Devuelve si se ha podido realizar la operación
     */
    public boolean devolucion() {
        boolean estado = false;

        if (ejemplaresPrestados > 0) {
            estado = true;
            ejemplaresPrestados--;
        }

        return estado;
    }

    /**
     * Método que devuelve una cadena con la información del libro
     *
     * @return Devuelve una cadena con la información
     */
    public String muestraInfo() {
        return "Genero " + genero + "\nTítulo " + titulo + "\nAutor " + autor + "\nEjemplares " + ejemplares
                + "\nEjemplaresPrestados " + ejemplaresPrestados;
    }

}
