package boletin1.ejercicio4;

public class Articulo {
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
     */
    Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    /**
     * Método que imprime los datos del artículo
     */
    public void imprime() {
        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio + "\nExistencias: " + cuantosQuedan);
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
     * @param cantidad Parámetro pasado que determina cuantos artículos quiere el usuario
     * @return Devuelve si se ha podido completar la operación
     */
    public boolean vender(int cantidad) {
        boolean venta = false;
        // Comprueba si hay existencias
        if (cuantosQuedan >= 0) {
            // Resta la cantidad vendida a las existencias
            this.cuantosQuedan-=cantidad;
            venta = true;
        }
        return venta;
    }

    /**
     * Método que aumenta las existencias disponibles
     * @param cantidad Parámetro pasado que indica cuantos artículos se van a almacenar
     */
    public void almacenar(int cantidad){
        this.cuantosQuedan+=cantidad;
    }

}
