package Boletin2.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Hora h = new Hora(20, 20, 59);

        h.incrementaSegundo(5);

        System.out.println(h.getHora() + ":" + h.getMin() + ":" + h.getSeg());

    }
}
