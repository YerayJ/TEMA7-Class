package boletin1.ejercicio1;

public class Main {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("12345678P", "Yeray", 999);

        if (cc.sacaDinero(999)) {
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
