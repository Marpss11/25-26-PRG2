public class Carrera {
    private Caballo[] caballos;
    private static final int PISTA_FINAL = 40;
    private static final int CANTIDAD_CABALLOS = 2;

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
        // Se implementará en siguientes commits
        return 0;
    }

    private Caballo obtenerGanador() {
        // Se implementará en siguientes commits
        return null;
    }

    private boolean hayGanador() {
        // Se implementará en siguientes commits
        return false;
    }
}
