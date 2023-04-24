package ejercicioscrud.ejercicio4;

/**
 * @author YJ
 */
public class CuentaCorriente {
    /**
     * Contiene el DNI del cliente
     */
    private String DNI;
    /**
     * Contiene el nombre del cliente
     */
    private String nombre = "Usuario Vacío";
    /**
     * Contiene el saldo actual de la cuenta del cliente
     */
    private double saldo = 0;

    /**
     * Constructor por defecto
     *
     * @param DNI   Le pasa el DNI como dato
     * @param saldo Le pasa el saldo actual como dato
     */
    CuentaCorriente(String DNI, double saldo) {
        if (DNI.length() != 9) { // Comprueba que el DNI está bien puesto
            DNI = "00000000A"; // Asigna un DNI por defecto
        }
        this.DNI = DNI;
        if (saldo > 0) { // Comprueba que el saldo es menor que 0
            this.saldo = saldo; // Asigna el saldo
        }
    }

    /**
     * Constructor por defecto
     *
     * @param DNI    Le pasa el DNI como dato
     * @param nombre Le pasa el nombre como dato
     * @param saldo  Le pasa el saldo actual como dato
     */
    CuentaCorriente(String DNI, String nombre, double saldo) {
        if (DNI.length() != 9) { // Comprueba que el DNI está bien puesto
            DNI = "00000000A"; // Asigna un DNI por defecto
        }
        this.DNI = DNI;
        if (saldo > 0) { // Comprueba que el saldo es menor que 0
            this.saldo = saldo; // Asigna el saldo
        }
        this.nombre = nombre; // Asigna el nombre
    }

    /**
     * Getter
     * @return Devuelve el DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Setter
     * @param DNI Contiene el DNI
     */
    public void setDNI(String DNI) {
        if (DNI.length() != 9) { // Comprueba que el DNI está bien puesto
            DNI = "00000000A"; // Asigna un DNI por defecto
        }
        this.DNI = DNI;
    }

    /**
     * Getter
     * @return Devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * @param nombre Contiene el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     * @return Devuelve el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter
     * @param saldo Contiene el saldo
     */
    public void setSaldo(double saldo) {
        if (saldo > 0) { // Comprueba que el saldo es menor que 0
            this.saldo = saldo; // Asigna el saldo
        }
    }

    /**
     * Método que permite retirar una cantidad determinada de dinero de su saldo disponible
     *
     * @param cantidad Variable de tipo double que contiene la cantidad que se quiere retirar
     * @return Devuelve el estado del saldo, si es false significa que no había saldo suficiente
     */
    public boolean sacaDinero(double cantidad) {
        boolean estado = true;
        // Si el saldo es menor es inferior o igual a cero no puede sacar dinero
        if (saldo <= 0) {
            estado = false;
        } else {
            // En el caso de que haya saldo se resta la cantidad querida menos el saldo
            saldo -= cantidad;
        }
        return estado;
    }

    /**
     * Método que permite introducir una cantidad determinada y sumarla al saldo actual
     *
     * @param cantidad Variable de tipo double que contiene la cantidad que se quiere retirar
     */
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Método que devuelve una cadena con la información de la cuenta bancaria
     *
     * @return Devuelve una cadena con la información
     */
    public String toString() {
        String cuenta = "DNI " + DNI + "\nNombre " + nombre + "\nSaldo " + saldo;
        return cuenta;
    }

}
