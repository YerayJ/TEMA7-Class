package BoletinEnumerados.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creación de variable que contiene el sexo
        String sexo;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide el sexo al usuario
        System.out.println("Deme el sexo del primer titular: ");
        sexo = key.next();

        // Creación de objeto del primer titular
        CuentaCorriente cc = new CuentaCorriente("12345678P", "Yeray", 999, sexo);

        // Pide el sexo al usuario
        System.out.println("Deme el sexo del segundo titular: ");
        sexo = key.next();

        // Creación de objeto del segundo titular
        CuentaCorriente cc2 = new CuentaCorriente("12345678P", "Yeray", 999, sexo);

        // Se realizan operaciones para cada titular
        transacciones(cc);
        transacciones(cc2);

        // Cierre de escáner
        key.close();
    }

    private static void transacciones(CuentaCorriente cc) {
        if (cc.sacaDinero(1000)) {
            System.out.println("La operación ha sido completada");
        } else {
            System.out.println("No se ha podido completar la operación");
        }

        if (cc.sacaDinero(50)) {
            System.out.println("La operación ha sido completada");
        } else {
            System.out.println("No se ha podido completar la operación");
        }

        cc.ingresarDinero(910);

        System.out.println(cc.muestraInfo());
    }
}
