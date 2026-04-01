package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

// Fábrica que crea notificaciones de correo electrónico
public class FabricaCorreo extends FabricaNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionCorreo();
    }
}