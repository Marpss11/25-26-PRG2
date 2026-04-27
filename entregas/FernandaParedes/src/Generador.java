public class Generador {
    public Generador() {
    }

    public int generarAvance() {
        return (int) (Math.random() * (Configuracion.AVANCE_MAXIMO - Configuracion.AVANCE_MINIMO + 1)) + Configuracion.AVANCE_MINIMO;
    }
}
