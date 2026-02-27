package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

// Notificación enviada como push
public class NotificacionPush implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Envío de notificación push");
    }
}