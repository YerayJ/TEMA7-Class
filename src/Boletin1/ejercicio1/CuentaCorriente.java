package Boletin1.ejercicio1;

/**
 * @author YJ
 */
public class CuentaCorriente {
    /**
     * Contiene el DNI del cliente
     */
    String DNI;
    /**
     * Contiene el nombre del cliente
     */
    String nombre;
    /**
     * Contiene el saldo actual de la cuenta del cliente
      */
    double saldo;

    /**
     * Constructor por defecto
     * @param DNI Le pasa el DNI como dato
     * @param saldo Le pasa el saldo actual como dato
     */
    CuentaCorriente (String DNI,double saldo){
        this.DNI = DNI;
        this.saldo = saldo;
    }

    /**
     * Constructor por defecto
     * @param DNI Le pasa el DNI como dato
     * @param nombre Le pasa el nombre como dato
     * @param saldo Le pasa el saldo actual como dato
     */
    CuentaCorriente (String DNI,String nombre,double saldo){
        this.DNI = DNI;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    /**
     * Método que permite retirar una cantidad determinada de dinero de su saldo disponible
     * @param cantidad Variable de tipo double que contiene la cantidad que se quiere retirar
     * @return Devuelve el estado del saldo, si es false significa que no había saldo suficiente
     */
    public boolean sacaDinero(double cantidad){
        boolean estado = true;
        // Si el saldo es menor es inferior o igual a cero no puede sacar dinero
        if (saldo <= 0) {
            estado= false;
        } else {
            // En el caso de que haya saldo se resta la cantidad querida menos el saldo
            saldo =- cantidad;
        }
        return estado;
    }

    /**
     * Método que permite introducir una cantidad determinada y sumarla al saldo actual
     * @param cantidad Variable de tipo double que contiene la cantidad que se quiere retirar
     */
    public void ingresarDinero(double cantidad){
        saldo += cantidad;
    }

    /**
     * Método que devuelve una cadena con la información de la cuenta bancaria
     * @return Devuelve una cadena con la información
     */
    public String muestraInfo(){
        String cuenta = "DNI " + DNI +"\nNombre " + nombre + "\nSaldo " +saldo;
        return cuenta;
    }

}
