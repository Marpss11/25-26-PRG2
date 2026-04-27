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
        mostrarPista();
        while (!hayGanador()) {
            for (Caballo caballo : caballos) {
                int avance = generarAvance();
                caballo.avanzar(avance);
            }
            mostrarPista();
        }
        Caballo ganador = obtenerGanador();
        System.out.println("Ganó el caballo " + ganador.obtenerNumero());
    }

    private void inicializarCarrera() {
        caballos = new Caballo[CANTIDAD_CABALLOS];
        for (int i = 0; i < CANTIDAD_CABALLOS; i++) {
            caballos[i] = new Caballo(i + 1);
        }
    }

    private void mostrarPista() {
        System.out.println("----------------------------------------------");
        for (Caballo caballo : caballos) {
            StringBuilder linea = new StringBuilder();
            for (int i = 0; i < caballo.obtenerPosicion(); i++) {
                linea.append(" ");
            }
            linea.append(";-;'");
            System.out.println(linea.toString());
        }
        System.out.println("----------------------------------------------");
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
