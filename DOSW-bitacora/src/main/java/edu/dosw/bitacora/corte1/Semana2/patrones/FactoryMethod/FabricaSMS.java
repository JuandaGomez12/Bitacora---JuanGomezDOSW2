package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

// Fábrica que crea notificaciones SMS
public class FabricaSMS extends FabricaNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}