package ejercicioscrud.ejercicio2;

public class Articulo {
    /**
     * Atributo que contiene el código del artículo
     */
    private int codigo;
    /**
     * Atributo que contiene la descripción del artículo
     */
    private String descripcion = "";
    /**
     * Atributo que contiene el precio de compra del artículo
     */
    private double precioCompra;
    /**
     * Atributo que contiene el precio de venta del artículo
     */
    private double precioVenta;
    /**
     * Atributo que contiene el stock del artículo
     */
    private int stock;

    /**
     * Constructor por defecto
     */
    public Articulo() {
        // Constructor por defecto
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param codigo       Atributo que contiene el código del artículo
     * @param descripcion  Atributo que contiene la descripción del artículo
     * @param precioCompra Atributo que contiene el precio de compra del artículo
     * @param precioVenta  Atributo que contiene el precio de venta del artículo
     * @param stock        Atributo que contiene el stock del artículo
     */
    public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        if (codigo < 0) {
            this.codigo = 0;
        }
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        if (precioCompra < 0) {
            this.precioCompra = 0;
        }
        this.precioVenta = precioVenta;
        if (precioVenta < 0) {
            this.precioVenta = 0;
        }
        this.stock = stock;
        if (stock < 0) {
            this.stock = 0;
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
     * @param codigo Atributo que contiene el código del artículo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter
     * @return Devuelve la descripción
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter
     * @param descripcion Atributo que contiene la descripción del artículo
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter
     * @return Devuelve el precio de compra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * Setter
     * @param precioCompra Atributo que contiene el precio de compra del artículo
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * Getter
     * @return Devuelve el precio de venta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Setter
     * @param precioVenta Atributo que contiene el precio de venta del artículo
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Getter
     * @return Devuelve el stock del artículo
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter
     * @param stock Atributo que contiene el stock del artículo
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Método toString que devuelve una cadena con todos los atributos
     * @return Devuelve una cadena con los atributos
     */
    public String toString() {
        return "Articulo{" +
                "Código=" + codigo +
                ", Descripción='" + descripcion + '\'' +
                ", Precio compra=" + precioCompra +
                ", Precio venta=" + precioVenta +
                ", Stock=" + stock +
                '}';
    }
}
