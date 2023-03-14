package Boletin1.ejercicio3;

public class Punto {
    /**
     * Variables que contienen las coordenadas
     */
    int x, y;

    /**
     * Constructor con parámetros
     *
     * @param x Coordenada x
     * @param y Coordenada y
     */
    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método que imprime las coordenadas
     */
    public void imprime() {
        System.out.println("(" + x + "," + y + ")");
    }

    /**
     * Método que reemplaza las coordenadas por las pasadas por parámetros
     * @param x Coordenada x
     * @param y Coordenada y
     */
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    /**
     * Método que suma la cantidad que se desplaza cada coordenada
     * @param dx Cantidad que se distancia la variable x
     * @param dy Cantidad que se distancia la variable y
     */
    public void desplaza(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }

    /**
     * Método que calcula con una operación la distancia entre dos puntos
     * @param p Objeto creado que contiene las coordenadas
     * @return Devuelve el resultado de la distancia
     */
    public int distancia(Punto p){
        // Calcula la distancia entre los dos puntos
        int distancia = (int) Math.sqrt(Math.pow(p.x-this.x,2) + Math.pow(p.y-this.y,2));
        return distancia;
    }
}
