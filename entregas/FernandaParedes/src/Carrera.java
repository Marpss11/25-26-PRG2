public class Carrera {
    private Caballo[] caballos;
    private static final int PISTA_FINAL = 40;
    private static final int CANTIDAD_CABALLOS = 2;
    private static final int AVANCE_MINIMO = 0;
    private static final int AVANCE_MAXIMO = 2;

    public Carrera() {
        inicializarCarrera();
    }

    public void jugar() {
        // Se implementará en siguientes commits
    }

    private void inicializarCarrera() {
        caballos = new Caballo[CANTIDAD_CABALLOS];
        for (int i = 0; i < CANTIDAD_CABALLOS; i++) {
            caballos[i] = new Caballo(i + 1);
        }
    }

    private void mostrarPista() {
        // Se implementará en siguientes commits
    }

    private int generarAvance() {
        return (int) (Math.random() * (AVANCE_MAXIMO - AVANCE_MINIMO + 1)) + AVANCE_MINIMO;
    }

    private Caballo obtenerGanador() {
        for (Caballo caballo : caballos) {
            if (caballo.gano(PISTA_FINAL)) {
                return caballo;
            }
        }
        return null;
    }

    private boolean hayGanador() {
        for (Caballo caballo : caballos) {
            if (caballo.gano(PISTA_FINAL)) {
                return true;
            }
        }
        return false;
    }
}
