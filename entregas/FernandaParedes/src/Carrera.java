public class Carrera {
    private Caballo[] caballos;
    private Pista pista;
    private Generador generador;
    private Validador validador;
    private Salida salida;
    private static final int CANTIDAD_CABALLOS = 2;

    public Carrera() {
        inicializarCarrera();
    }

    public void jugar() {
        pista.mostrar(caballos);
        while (!validador.hayGanador(caballos)) {
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
        Caballo ganador = validador.obtenerGanador(caballos);
        salida.mostrarGanador(ganador);
    }

    private void inicializarCarrera() {
        pista = new Pista();
        generador = new Generador();
        validador = new Validador();
        salida = new Salida();
        caballos = new Caballo[CANTIDAD_CABALLOS];
        for (int i = 0; i < CANTIDAD_CABALLOS; i++) {
            caballos[i] = new Caballo(i + 1);
        }
    }
}

