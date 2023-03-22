package Boletin2.ejercicio1;

public class Hora {
    /**
     * Variable que contiene la hora
     */
    int hora;
    /**
     * Variable que contiene los minutos
     */
    int min;
    /**
     * Variable que contiene los segundos
     */
    int seg;

    /**
     * Constructor por defecto
     */
    Hora() {
        // Constructor por defecto
    }

    /**
     * Constructor con parámetros
     *
     * @param hora Variable que contiene la hora
     * @param min  Variable que contiene los minutos
     * @param seg  Variable que contiene los segundos
     */
    Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    /**
     * Setter
     *
     * @param hora Variable que contiene la hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Getter
     *
     * @return Devuelve la hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Setter
     *
     * @param min Variable que contiene los min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * Getter
     *
     * @return Devuelve los minutos
     */
    public int getMin() {
        return min;
    }

    /**
     * Setter
     *
     * @param seg Variable que contiene los segundos
     */
    public void setSeg(int seg) {
        this.seg = seg;
    }

    /**
     * Getter
     *
     * @return Devuelve los segundos
     */
    public int getSeg() {
        return seg;
    }

    /**
     * Método que incrementa la hora
     *
     * @param incrementa Parámetro que pasa el usuario en segundos
     */
    public void incrementaSegundo(int incrementa) {
        seg += incrementa;
        if (seg >= 60) {
            min++;
            seg -= 60;
        } else if (min >= 60) {
            hora++;
            min -= 60;
        } else if (hora > 23) {
            hora = 0;
        }
    }

}
