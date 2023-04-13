package boletin1.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Articulo a1 = new Articulo("Colacao", 3.5, 20);

        System.out.println("Precio con IVA: " + a1.getPVP());

        System.out.printf("Precio con descuento del 25: %.2f €", a1.getPVPDescuento(25));

        if (a1.vender(2)) {
            System.out.println("Se han vendido 2 productos");
        } else {
            System.out.println("No hay artículos disponibles");
        }

        a1.almacenar(10);
    }
}
