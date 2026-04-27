public class Caballo {
    private int posicion;
    private int numero;

    public Caballo(int numero) {
        this.numero = numero;
        this.posicion = 0;
    }

    public void avanzar(int casillas) {
        this.posicion += casillas;
    }

    public int obtenerPosicion() {
        return this.posicion;
    }

    public int obtenerNumero() {
        return this.numero;
    }

    public boolean gano(int metaFinal) {
        return this.posicion >= metaFinal;
    }
}
