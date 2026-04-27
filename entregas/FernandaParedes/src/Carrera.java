public class Carrera {
    private Caballo[] caballos;
    private Pista pista;
    private static final int PISTA_FINAL = 40;
    private static final int CANTIDAD_CABALLOS = 2;
    private static final int AVANCE_MINIMO = 0;
    private static final int AVANCE_MAXIMO = 2;

    public Carrera() {
        inicializarCarrera();
    }

    public void jugar() {
        pista.mostrar(caballos);
        while (!hayGanador()) {
            for (Caballo caballo : caballos) {
                int avance = generarAvance();
                caballo.avanzar(avance);
            }
            pista.mostrar(caballos);
        }
        Caballo ganador = obtenerGanador();
        System.out.println("Ganó el caballo " + ganador.obtenerNumero());
    }

    private void inicializarCarrera() {
        pista = new Pista();
        caballos = new Caballo[CANTIDAD_CABALLOS];
        for (int i = 0; i < CANTIDAD_CABALLOS; i++) {
            caballos[i] = new Caballo(i + 1);
        }
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
