package ejercicioscrud.ejercicio3;

public class Pizza {
    /**
     * Atributo que contiene el código
     */
    private int codigo;

    /**
     * Enumerado que contiene el tamaño de la pizza
     */
    private enum Tamanho {Mediana, Familiar}

    /**
     * Enumerado que contiene el tipo de pizza
     */
    private enum Tipo {Margarita, CuatroQuesos, Funghi}

    /**
     * Enumerado que contiene el estado
     */
    private enum Estado {Pedida, Servida}

    /**
     * Atributo que contiene el tamaño
     */
    Tamanho tam;
    /**
     * Atributo que contiene el tipo
     */
    Tipo tipo;
    /**
     * Atributo que contiene el estado
     */
    Estado estado = Estado.Pedida;

    /**
     * Constructor sin parámetros
     */
    public Pizza() {
    }

    /**
     * Constructor con parámetros
     *
     * @param codigo Contienen el código
     * @param tam    Contiene el tamaño
     * @param tipo   Contiene el tipo
     */
    public Pizza(int codigo, String tam, String tipo) {
        if (codigo < 0) { // Comprueba que el código es válido
            codigo = 0;
        }
        this.codigo = codigo;
        if (tam.isEmpty()) { // Comprueba que el tamaño está vacío
            this.tam = Tamanho.Mediana; // Le asigna un valor por defecto
        } else {
            this.tam = Tamanho.valueOf(tam);
        }

        if (tipo.isEmpty()) { // Comprueba que el tipo está vacío
            this.tipo = Tipo.CuatroQuesos; // Le asigna un valor por defecto
        } else {
            this.tipo = Tipo.valueOf(tipo);
        }
    }

    /**
     * Getter
     * @return Devuelve el código
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter
     * @param codigo Contiene el código
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter
     * @return Devuelve el tamaño
     */
    public Tamanho getTam() {
        return tam;
    }

    /**
     * Setter
     * @param tam Contiene el tamaño
     */
    public void setTam(String tam) {
        if (tam.isEmpty()) { // Comprueba que el tamaño está vacío
            this.tam = Tamanho.Mediana; // Le asigna un valor por defecto
        } else {
            this.tam = Tamanho.valueOf(tam);
        }
    }

    /**
     * Getter
     * @return Devuelve el tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Setter
     * @param tipo Contiene el tipo
     */
    public void setTipo(String tipo) {
        if (tipo.isEmpty()) { // Comprueba que el tipo está vacío
            this.tipo = Tipo.CuatroQuesos; // Le asigna un valor por defecto
        } else {
            this.tipo = Tipo.valueOf(tipo);
        }
    }

    /**
     * Getter
     * @return Devuelve el estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Setter
     * @param estado Contiene el estado
     */
    public void setEstado(String estado) {
        if (estado.isEmpty()) { // Comprueba que el tipo está vacío
            this.estado = Estado.Servida; // Le asigna un valor por defecto
        } else {
            this.estado = Estado.valueOf(estado);
        };
    }

    /**
     * Método to String
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return "Pizza " +
                "codigo: " + codigo +
                ", tam: " + tam +
                ", tipo: " + tipo +
                ", estado: " + estado;
    }
}
