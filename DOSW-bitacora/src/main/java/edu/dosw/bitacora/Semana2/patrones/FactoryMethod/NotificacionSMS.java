package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

// Notificación enviada por SMS
public class NotificacionSMS implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Envío de notificación por SMS");
    }
}