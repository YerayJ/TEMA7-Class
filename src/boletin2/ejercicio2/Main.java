package boletin2.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Contador cont = new Contador(6);

        cont.incrementa();

        for (int i = 0; i < 10; i++) {
            cont.decrementar();
        }

        System.out.println(cont.cont);
    }
}
