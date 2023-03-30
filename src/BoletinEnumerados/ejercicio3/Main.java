package BoletinEnumerados.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de variable que contiene el sexo
        String departamento;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Pide el departamento al usuario
        System.out.println("Deme el departamento al que pertenece el artículo: ");
        departamento = key.next();

        Articulo a1 = new Articulo("Colacao", 3.5, 22, Articulo.Departamento.valueOf(departamento));

        ArticuloMercado(a1);

        // Pide el departamento al usuario
        System.out.println("Deme el departamento al que pertenece el artículo: ");
        departamento = key.next();

        Articulo a2 = new Articulo("Coca Cola", 2.5, 10, Articulo.Departamento.valueOf(departamento));

        ArticuloMercado(a2);
    }

    /**
     * Método con pruebas funcionales para la clase artículo
     * @param a1 objeto pasado por parámetros
     */
    private static void ArticuloMercado(Articulo a1) {
        System.out.println("Precio con IVA: " + a1.getPVP());

        System.out.printf("Precio con descuento del 25: %.2f €", a1.getPVPDescuento(25));

        if (a1.vender(2)) {
            System.out.println("Se han vendido 2 productos");
        } else {
            System.out.println("No hay artículos disponibles");
        }

        a1.almacenar(10);

        a1.imprime();
    }
}
