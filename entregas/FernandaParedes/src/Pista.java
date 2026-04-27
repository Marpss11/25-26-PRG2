public class Pista {
    public Pista() {
    }

    public void mostrar(Caballo[] caballos) {
        mostrarSeparador();
        for (Caballo caballo : caballos) {
            mostrarCaballo(caballo);
        }
        mostrarSeparador();
    }

    private void mostrarCaballo(Caballo caballo) {
        StringBuilder linea = crearLinea(caballo.obtenerPosicion());
        System.out.println(linea.toString());
    }

    private StringBuilder crearLinea(int posicion) {
        StringBuilder linea = new StringBuilder();
        for (int i = 0; i < posicion; i++) {
            linea.append(" ");
        }
        linea.append(Configuracion.CABALLO_REPRESENTACION);
        return linea;
    }

    private void mostrarSeparador() {
        System.out.println(Configuracion.SEPARADOR);
    }
}
