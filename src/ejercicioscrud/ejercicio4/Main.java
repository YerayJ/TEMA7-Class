package ejercicioscrud.ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de atributo que contiene la opción
        int opc;
        // Atributo que contiene el DNI
        String DNI;
        // Atributo que contiene el nombre
        String nombre;
        // Atributo que contiene el saldo
        double saldo;

        // Creación de array
        CuentaCorriente cuentas[] = new CuentaCorriente[0];

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        do {
            Metodos.menu(); // Imprime el menú
            opc = key.nextInt();
            key.nextLine(); // Pide la opción al usuario

            switch (opc) {
                case 1 -> {
                    Metodos.listado(cuentas);
                }
                case 2 -> {
                    System.out.println("Deme el DNI del titular de la cuenta: ");
                    DNI = key.next();
                    key.nextLine(); // Pide el DNI al usuario
                    System.out.println("Deme el nombre: ");
                    nombre = key.next();
                    key.nextLine(); // Pide el nombre al usuario
                    System.out.println("Deme el saldo actual de la cuenta: ");
                    saldo = key.nextInt();
                    key.nextLine(); // Pide el tipo al usuario
                    CuentaCorriente cuenta = new CuentaCorriente(DNI, nombre, saldo);

                    cuentas = Metodos.insertaCuenta(cuentas, cuenta);
                }
                case 3 -> {
                    System.out.println("Deme el DNI del titular de la cuenta: ");
                    DNI = key.next();
                    key.nextLine(); // Pide el DNI al usuario

                    System.out.println("Deme el saldo que quiere introducir: ");
                    saldo = key.nextInt();
                    key.nextLine(); // Pide el tipo al usuario
                    if (saldo < 0) { // Comprueba que el saldo no sea negativo
                        saldo = 0;
                    }
                    // Recorre el array
                    if (cuentas.length > 0) {
                        for (int pos = 0; pos < cuentas.length; pos++) {
                            // Compara si el DNI de la posición actual coincide con el pasado por parámetros
                            if (cuentas[pos].getDNI().equals(DNI)) {
                                cuentas[pos].ingresarDinero(saldo); // Ingresa dinero en la cuenta
                            }
                        }
                    } else {
                        System.out.println("No hay cuentas disponibles");
                    }

                }
                case 4 -> {
                    System.out.println("Deme el DNI del titular de la cuenta: ");
                    DNI = key.next();
                    key.nextLine(); // Pide el DNI al usuario

                    System.out.println("Deme el saldo que quiere sacar: ");
                    saldo = key.nextInt();
                    key.nextLine(); // Pide el tipo al usuario
                    if (saldo < 0) { // Comprueba que el saldo no sea negativo
                        saldo = 0;
                    }
                    // Recorre el array
                    if (cuentas.length > 0) {
                        for (int pos = 0; pos < cuentas.length; pos++) {
                            // Compara si el DNI de la posición actual coincide con el pasado por parámetros
                            if (cuentas[pos].getDNI().equals(DNI)) {
                                cuentas[pos].sacaDinero(saldo); // Saca dinero en la cuenta
                            }
                        }
                    } else {
                        System.out.println("No hay cuentas disponibles");
                    }
                }
                case 5 -> {
                    System.out.println("Deme el DNI: ");
                    DNI = key.next();
                    key.nextLine();
                    if (DNI.length() != 9) { // Comprueba que el DNI está bien puesto
                        DNI = "00000000A"; // Asigna un DNI por defecto
                    }
                    cuentas = Metodos.eliminaCuenta(cuentas, DNI);
                }
                case 6 -> {
                    System.out.println("Está saliendo del programa...");
                }
                case default -> {
                    System.out.println("Esa opción no existe");
                }
            }

        } while (opc != 6);

    }
}
