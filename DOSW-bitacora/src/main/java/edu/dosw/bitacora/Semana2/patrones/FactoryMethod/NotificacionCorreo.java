package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

// Notificación enviada por correo electrónico
public class NotificacionCorreo implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Envío de notificación por correo electrónico");
    }
}