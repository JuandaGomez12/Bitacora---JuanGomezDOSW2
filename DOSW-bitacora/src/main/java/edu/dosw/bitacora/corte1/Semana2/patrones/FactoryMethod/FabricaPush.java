package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

// Fábrica que crea notificaciones push
public class FabricaPush extends FabricaNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionPush();
    }
}