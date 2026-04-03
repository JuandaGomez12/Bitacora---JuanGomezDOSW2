package edu.dosw.bitacora.corte2.semana2.ejercicio1;

// Singleton: una sola instancia gestiona todos los envios del sistema
public class ServicioNotificaciones {

    private static ServicioNotificaciones instancia;
    private EstrategiaEnvio estrategia;

    private ServicioNotificaciones() {}

    public static ServicioNotificaciones getInstancia() {
        if (instancia == null) {
            instancia = new ServicioNotificaciones();
        }
        return instancia;
    }

    public void setEstrategia(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia;
    }

    public void enviarNotificacion(String destinatario, String mensaje) {
        if (estrategia == null) {
            throw new IllegalStateException("No se ha configurado una estrategia de envio");
        }
        estrategia.enviar(destinatario, mensaje);
    }

    // Solo para pruebas unitarias: reinicia la instancia
    static void resetear() {
        instancia = null;
    }
}
