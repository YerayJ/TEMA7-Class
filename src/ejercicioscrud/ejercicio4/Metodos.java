package ejercicioscrud.ejercicio4;

import ejercicioscrud.ejercicio3.Pizza;

import java.util.Arrays;

class Metodos {

    /**
     * Método que muestra un menú
     */
    static public void menu() {
        System.out.println("--------MENÚ--------" +
                "\n1. Listado de cuentas." +
                "\n2. Nueva cuenta." +
                "\n3. Ingresar dinero." +
                "\n4. Retirar dinero." +
                "\n5. Eliminar cuenta" +
                "\n6. Salir");
    }

    /**
     * Método que lista todas las cuentas
     */
    public static void listado(CuentaCorriente[] cuentas) {
        // Recorre el array
        for (int pos = 0; pos < cuentas.length; pos++) {
            // Imprime la cuenta
            System.out.println((pos + 1) + " Cuenta:"
                    + " DNI " + cuentas[pos].getDNI()
                    + " Nombre: " + cuentas[pos].getNombre()
                    + " Saldo: " + cuentas[pos].getSaldo());
        }
    }

    /**
     * Inserta una nueva cuenta
     *
     * @param cuentas Contiene las cuentas
     * @param cuenta  Contiene una cuenta
     * @return Devuelve las cuentas
     */
    public static CuentaCorriente[] insertaCuenta(CuentaCorriente[] cuentas, CuentaCorriente cuenta) {
        cuentas = Arrays.copyOf(cuentas, cuentas.length + 1); // Añade una posición al array
        cuentas[cuentas.length - 1] = cuenta; // Añade una pizza en la posición anterior
        return cuentas;
    }

    /**
     * Método que elimina una cuenta bancaria
     *
     * @param cuentas Contiene las cuentas
     * @param DNI     Contiene el DNI
     * @return Devuelve las cuentas
     */
    public static CuentaCorriente[] eliminaCuenta(CuentaCorriente[] cuentas, String DNI) {
        // Recorre el array
        for (int pos = 0; pos < cuentas.length; pos++) {
            // Compara si el DNI de la posición actual coincide con el pasado por parámetros
            if (cuentas[pos].getDNI().equals(DNI)) {
                // Calcula la longitud restando la longitud total menos la posición menos 1
                int longitud = cuentas.length - pos - 1;
                // Copia a partir de la siguiente posición hasta el final y lo pega desde la posición actual
                System.arraycopy(cuentas, pos + 1, cuentas, pos, longitud);
                // Borra la última posición
                cuentas = Arrays.copyOf(cuentas, cuentas.length - 1);
            }
        }
        return cuentas;
    }

}
