package Boletin2.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(2,13,2005);

        f1.diaSiguiente();
        f1.fechaCorrecta();

        System.out.println(f1.toString());

    }
}
