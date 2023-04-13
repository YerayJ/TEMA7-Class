package boletin1.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Creación del objeto
        Punto coord = new Punto(2,4);
        // Imprime las coordenadas
        coord.imprime();
        // Reemplaza los valores dados
        coord.setXY(4,5);
        // Desplaza el punto
        coord.desplaza(-1,2);
        // Calcula la distancia entre dos puntos
        Punto p = new Punto(6,8);
        System.out.println(coord.distancia(p));
    }
}
