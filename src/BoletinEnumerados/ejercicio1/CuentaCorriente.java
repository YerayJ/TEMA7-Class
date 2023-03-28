package BoletinEnumerados.ejercicio1;

/**
 * @author YJ
 */
public class CuentaCorriente {
    /**
     * Creación de enumerado que contiene el sexo
     */
    enum Sexo {Femenino, Masculino}

    /**
     * Atributo de tipo sexo
     */
    private Sexo sexo;
    /**
     * Contiene el DNI del cliente
     */
    private String DNI;
    /**
     * Contiene el nombre del cliente
     */
    private String nombre;
    /**
     * Contiene el saldo actual de la cuenta del cliente
     */
    private double saldo;

    /**
     * Getter
     *
     * @return Devuelve el sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Setter
     *
     * @param sexo Contiene el sexo de tipo String
     */
    public void setSexo(String sexo) {
        // Se convierte a tipo sexo para guardarlo
        this.sexo = Sexo.valueOf(sexo);
    }

    /**
     * Getter
     *
     * @return Devuelve el DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Setter
     *
     * @param DNI Contiene el DNI de tipo String
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
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
     * @param nombre Contiene el nombre de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     *
     * @return Devuelve el saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter
     *
     * @param saldo Contiene el saldo actual del usuario en tipo double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor por defecto
     *
     * @param DNI   Le pasa el DNI como dato
     * @param saldo Le pasa el saldo actual como dato
     */
    CuentaCorriente(String DNI, double saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    /**
     * Constructor por defecto
     *
     * @param DNI    Le pasa el DNI como dato
     * @param nombre Le pasa el nombre como dato
     * @param saldo  Le pasa el saldo actual como dato
     * @param sexo   Le pasa el sexo de la persona
     */
    CuentaCorriente(String DNI, String nombre, double saldo, String sexo) {
        this.DNI = DNI;
        this.saldo = saldo;
        this.nombre = nombre;
        this.sexo = Sexo.valueOf(sexo);
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
            saldo = -cantidad;
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
    public String muestraInfo() {
        return "DNI " + DNI + "\nNombre " + nombre + "\nSaldo " + saldo + "\nSexo " + sexo;
    }

}
