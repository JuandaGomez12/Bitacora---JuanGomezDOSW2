package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

// Clase abstracta que define el factory method para crear notificaciones
public abstract class FabricaNotificacion {

    // Cada subclase define qué tipo de notificación crear
    public abstract Notificacion crearNotificacion();

    // Crea la notificación y la envía
    public void despacharNotificacion() {
        Notificacion notificacion = crearNotificacion();
        notificacion.enviar();
    }
}