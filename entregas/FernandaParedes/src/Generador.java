public class Generador {
    private static final int AVANCE_MINIMO = 0;
    private static final int AVANCE_MAXIMO = 2;

    public Generador() {
    }

    public int generarAvance() {
        return (int) (Math.random() * (AVANCE_MAXIMO - AVANCE_MINIMO + 1)) + AVANCE_MINIMO;
    }
}
