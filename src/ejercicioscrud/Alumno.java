package ejercicioscrud;

public class Alumno {
    /**
     * Atributo que contiene el nombre del alumno
     */
    private String nombre;

    /**
     * Atributo que contiene la nota media del alumno
     */
    private double notaMedia;

    /**
     * Constructor con parámetros
     *
     * @param nombre    Contiene el nombre del alumno
     * @param notaMedia Contiene la nota media del alumno
     */
    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        if (notaMedia >= 0 || notaMedia <= 10) {
            this.notaMedia = notaMedia;
        }
    }

    /**
     * Constructor por defecto
     */
    public Alumno() {
        nombre = "";
        // Constructor por defecto
    }

    /**
     * Getter
     *
     * @return Devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     *
     * @param nombre Contiene el nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     *
     * @return Devuelve la nota media
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * Setter
     *
     * @param notaMedia Contiene la nota media del alumno
     */
    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0 || notaMedia <= 10) {
            this.notaMedia = notaMedia;
        }
    }

    /**
     * Método que devuelve todos los atributos como String
     *
     * @return Devuelve una String
     */
    public String toString() {
        return "Notas {" +
                "Nombre='" + nombre + '\'' +
                ", Nota=" + notaMedia +
                '}';
    }
}
