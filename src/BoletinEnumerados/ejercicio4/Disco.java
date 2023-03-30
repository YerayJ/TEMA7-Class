package BoletinEnumerados.ejercicio4;

public class Disco {
    /**
     * Creación de enumerado que contiene el género de cada artículo
     */
    enum Genero {Rock ,Electronica, Pop, Reggaeton}

    /**
     * Atributo de tipo Genero
     */
    private Genero genero;
    /**
     * Atributo que contiene el código y por defecto tendrá el valor LIBRE
     */
    private String codigo = "LIBRE";
    /**
     * Atributo que contiene el autor
     */
    private String autor = "";
    /**
     * Atributo que contiene el título
     */
    private String titulo = "";
    /**
     * Atributo que contiene la duración
     */
    private int duracion = 0;

    /**
     * Constructor por defecto
     */
    public Disco() {
        // Constructor por defecto
    }

    /**
     * Constructor con parámetros
     *
     * @param codigo   Contiene el código
     * @param autor    Contiene el autor
     * @param titulo   Contiene el titulo
     * @param genero   Contiene el genero
     * @param duracion Contiene la duracion del disco
     */
    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = Genero.valueOf(genero);
        this.duracion = duracion;
    }

    /**
     * Constructor copia
     *
     * @param disc Objeto copia
     */
    public Disco(Disco disc) {
        this.codigo = disc.codigo;
        this.autor = disc.autor;
        this.titulo = disc.titulo;
        this.genero = disc.genero;
        this.duracion = disc.duracion;
    }

    /**
     * Getter
     *
     * @return Devuelve el código
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Setter
     *
     * @param codigo Introduce el parámetro código
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter
     *
     * @return Devuelve el autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Setter
     *
     * @param autor Introduce el parámetro autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getter
     *
     * @return Devuelve el título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter
     *
     * @param titulo Introduce el título
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter
     *
     * @return Devuelve la duración
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Setter
     *
     * @param duracion Introduce la duración
     */
    public void setDuracion(int duracion) {
        if (duracion > 0) {
            this.duracion = duracion;
        }
    }

    /**
     * Setter
     * @param genero Contiene el género del disco
     */
    public void setGenero(String genero) {
        this.genero = Genero.valueOf(genero);
    }

    /**
     * Método que devuelve todos los atributos como String
     *
     * @return Devuelve una String
     */
    public String toString() {
        return "Disco" +
                "codigo='" + codigo + '\'' +
                ", autor='" + autor + '\'' +
                ", título='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion;
    }
}
