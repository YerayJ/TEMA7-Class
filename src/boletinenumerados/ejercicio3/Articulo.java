package boletinenumerados.ejercicio3;

public class Articulo {
    /**
     * Creación de enumerado que contiene el departamento de cada artículo
     */
    enum Departamento {Electronica, Alimentacion, Drogueria}

    /**
     * Atributo de tipo Departamento
     */
    private Departamento departamento;
    /**
     * Guarda el nombre del artículo
     */
    String nombre;
    /**
     * Guarda el precio del producto sin IVA
     */
    double precio;
    /**
     * El IVA del producto
     */
    final int IVA = 21;
    /**
     * Contiene las existencias de cada artículo
     */
    int cuantosQuedan;

    /**
     * Constructor con parámetros
     *
     * @param nombre        Guarda el nombre del artículo
     * @param precio        Guarda el precio del producto sin IVA
     * @param cuantosQuedan Contiene las existencias de cada artículo
     * @param departamento  Contiene el tipo de departamento al que pertenece
     */
    Articulo(String nombre, double precio, int cuantosQuedan, Departamento departamento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
        this.departamento = departamento;
    }

    /**
     * Getter
     *
     * @return Devuelve el tipo de departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Setter
     *
     * @param departamento Contiene el tipo del departamento del artículo
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Getter
     *
     * @return Devuelve el nombre del artículo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * @param nombre Contiene el nombre del artículo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     * @return Devuelve el precio del artículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter
     * @param precio Contiene el precio del artículo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter
     * @return Devuelve el IVA del artículo
     */
    public int getIVA() {
        return IVA;
    }

    /**
     * Getter
     * @return Devuelve el stock del artículo
     */
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    /**
     * Setter
     * @param cuantosQuedan Contiene el stock del artículo
     */
    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    /**
     * Método que imprime los datos del artículo
     */
    public void imprime() {
        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio + "\nExistencias: " + cuantosQuedan
                + "\nDepartamento: " + departamento);

    }

    /**
     * Método que devuelve el precio del artículo con el IVA incluido
     *
     * @return Devuelve el precio con el IVA
     */
    public double getPVP() {
        double precioVP = (this.precio * IVA / 100) + this.precio;
        return precioVP;
    }

    /**
     * Método que devuelve el precio del artículo con el descuento incluido
     *
     * @return Devuelve el precio con el descuento
     */
    public double getPVPDescuento(int descuento) {
        double precioDescuento = this.getPVP() - (this.getPVP() * descuento / 100);
        return precioDescuento;
    }

    /**
     * Método que vende un artículo
     *
     * @param cantidad Parámetro pasado que determina cuantos artículos quiere el usuario
     * @return Devuelve si se ha podido completar la operación
     */
    public boolean vender(int cantidad) {
        boolean venta = false;
        // Comprueba si hay existencias
        if (cuantosQuedan >= 0) {
            // Resta la cantidad vendida a las existencias
            this.cuantosQuedan -= cantidad;
            venta = true;
        }
        return venta;
    }

    /**
     * Método que aumenta las existencias disponibles
     *
     * @param cantidad Parámetro pasado que indica cuantos artículos se van a almacenar
     */
    public void almacenar(int cantidad) {
        this.cuantosQuedan += cantidad;
    }

}
