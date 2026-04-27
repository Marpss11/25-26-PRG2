public class Carrera {
    private Caballo[] caballos;
    private Pista pista;
    private Generador generador;
    private static final int PISTA_FINAL = 40;
    private static final int CANTIDAD_CABALLOS = 2;

    public Carrera() {
        inicializarCarrera();
    }

    public void jugar() {
        pista.mostrar(caballos);
        while (!hayGanador()) {
            ejecutarTurno();
            pista.mostrar(caballos);
        }
        mostrarGanador();
    }

    private void ejecutarTurno() {
        for (Caballo caballo : caballos) {
            int avance = generador.generarAvance();
            caballo.avanzar(avance);
        }
    }

    private void mostrarGanador() {
        Caballo ganador = obtenerGanador();
        System.out.println("Ganó el caballo " + ganador.obtenerNumero());
    }

    private void inicializarCarrera() {
        pista = new Pista();
        generador = new Generador();
        caballos = new Caballo[CANTIDAD_CABALLOS];
        for (int i = 0; i < CANTIDAD_CABALLOS; i++) {
            caballos[i] = new Caballo(i + 1);
        }
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
