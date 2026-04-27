/**
 * Clase que representa un caballo en la carrera.
 * Cada caballo tiene un identificador único y una posición en la pista.
 */
public class Caballo {
    private int posicion;
    private int numero;

    /**
     * Constructor que inicializa un caballo con su número.
     * 
     * @param numero El número identificador del caballo
     */
    public Caballo(int numero) {
        this(numero, 0);
    }

    /**
     * Constructor encapsulado que inicializa un caballo con número y posición.
     * 
     * @param numero El número identificador del caballo
     * @param posicionInicial La posición inicial en la pista
     */
    private Caballo(int numero, int posicionInicial) {
        this.numero = numero;
        this.posicion = posicionInicial;
    }

    /**
     * Avanza el caballo en la pista.
     * 
     * @param casillas Número de casillas a avanzar
     */
    public void avanzar(int casillas) {
        this.posicion += casillas;
    }

    /**
     * Obtiene la posición actual del caballo.
     * 
     * @return La posición en la pista
     */
    public int obtenerPosicion() {
        return this.posicion;
    }

    /**
     * Obtiene el número identificador del caballo.
     * 
     * @return El número del caballo
     */
    public int obtenerNumero() {
        return this.numero;
    }

    /**
     * Verifica si el caballo ha ganado la carrera.
     * 
     * @param metaFinal La posición final de la pista
     * @return true si el caballo ha alcanzado o superado la meta
     */
    public boolean gano(int metaFinal) {
        return this.posicion >= metaFinal;
    }
}
