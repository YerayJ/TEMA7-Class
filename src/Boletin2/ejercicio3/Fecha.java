package Boletin2.ejercicio3;

/**
 * Clase fecha
 */
public class Fecha {
    /**
     * Atributo que contiene el día en formato entero
     */
    private int dia;
    /**
     * Atributo que contiene el mes en formato entero
     */
    private int mes;
    /**
     * Atributo que contiene el año en formato entero
     */
    private int anho;

    /**
     * Constructor por defecto
     */
    public Fecha() {
        // Constructor por defecto
    }

    /**
     * Constructor con parámetros
     *
     * @param dia  Variable que contiene el día
     * @param mes  Variable que contiene el mes
     * @param anho Variable que contiene el año
     */
    public Fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    /**
     * Getter
     *
     * @return Devuelve el día
     */
    public int getDia() {
        return dia;
    }

    /**
     * Setter
     *
     * @param dia Tiene como parámetro la variable que contiene el día
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Getter
     *
     * @return Devuelve el mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Setter
     *
     * @param mes Tiene como parámetro la variable que contiene el mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Getter
     *
     * @return Devuelve el año
     */
    public int getAnho() {
        return anho;
    }

    /**
     * Setter
     *
     * @param anho Tiene como parámetro la variable que contiene el año
     */
    public void setAnho(int anho) {
        this.anho = anho;
    }

    /**
     * Método que comprueba si el año es bisiesto
     *
     * @return Devuelve si el año es bisiesto mediante true o false
     */
    public boolean esBisiesto() {
        boolean estado = false;
        if (this.anho % 4 == 0) {
            estado = true;
        }
        return estado;
    }

    /**
     * Método que comprueba que la fecha es correcta
     *
     * @return Devuelve si la fecha es correcta o no mediante un booleano
     */
    public boolean fechaCorrecta() {
        boolean estado = false;
        if (this.dia > 1) {
            switch (this.mes) {
                case 1: {
                }
                case 3: {
                }
                case 5: {
                }
                case 7: {
                }
                case 8: {
                }
                case 10: {
                }
                case 12: {
                    if (this.dia <= 31) {
                        estado = true;
                    }
                    break;
                }
                case 2: {
                    if ((esBisiesto() && this.dia == 29) || this.dia <= 28) {
                        estado = true;
                    }
                    break;
                }
                case 4: {
                }
                case 6: {
                }
                case 9: {
                }
                case 11: {
                    if (this.dia <= 30) {
                        estado = true;
                    }
                    break;
                }
            }
        }
        return estado;
    }

    /**
     * Método que suma el día y comprueba que la fecha sea correcta
     */
    public void diaSiguiente() {
        dia++;
        switch (this.mes) {
            case 1: {
            }
            case 3: {
            }
            case 5: {
            }
            case 7: {
            }
            case 8: {
            }
            case 10: {
            }
            case 12: {
                if (this.dia == 31) {
                    dia = 1;
                    mes++;
                }
                break;
            }
            case 2: {
                if ((esBisiesto() && this.dia == 29) || this.dia == 28) {
                    dia = 1;
                    mes++;
                }
                break;
            }
            case 4: {
            }
            case 6: {
            }
            case 9: {
            }
            case 11: {
                if (this.dia == 30) {
                    dia = 1;
                    mes++;
                }
                break;
            }
        }
        if (mes > 12) {
            anho++;
            mes = 1;
        }
    }

    /**
     * Método que pasa a una String la fecha y comprueba si el día y el mes
     * @return Devuelve el resultado con la fecha
     */
    public String toString() {
        String res = "";
        if (dia <= 9) {
            res += "0";
        }
            res += dia + ":";

        if (mes <= 9) {
            res += "0";
        }
            res += mes + ":";

        res += anho;
        return res;
    }
}
