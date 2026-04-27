public class Salida {
    public Salida() {
    }

    public void mostrarGanador(Caballo caballo) {
        String mensaje = "Gano el caballo " + caballo.obtenerNumero();
        System.out.println(mensaje);
    }
}
