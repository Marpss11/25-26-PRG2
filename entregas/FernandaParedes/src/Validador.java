public class Validador {
    public Validador() {
    }

    public boolean hayGanador(Caballo[] caballos) {
        for (Caballo caballo : caballos) {
            if (esGanador(caballo)) {
                return true;
            }
        }
        return false;
    }

    public Caballo obtenerGanador(Caballo[] caballos) {
        for (Caballo caballo : caballos) {
            if (esGanador(caballo)) {
                return caballo;
            }
        }
        return null;
    }

    private boolean esGanador(Caballo caballo) {
        return caballo.obtenerPosicion() >= Configuracion.PISTA_FINAL;
    }
}
