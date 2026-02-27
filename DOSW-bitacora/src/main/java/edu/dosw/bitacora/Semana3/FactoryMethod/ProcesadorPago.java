package edu.dosw.bitacora.Semana3.FactoryMethod;

// Clase abstracta que define el proceso de pago (Factory Method)
public abstract class ProcesadorPago {

    // Método factory: cada subclase crea su tipo de pago
    abstract Pago crearPago(double monto);

    // Ejecuta el pago recibido
    void procesarPago(Pago pago) {
        pago.realizarPago();
    }
}