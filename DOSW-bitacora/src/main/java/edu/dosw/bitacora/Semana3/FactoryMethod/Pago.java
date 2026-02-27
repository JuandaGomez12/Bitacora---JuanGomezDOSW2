package edu.dosw.bitacora.Semana3.FactoryMethod;

// Clase base para todos los tipos de pago
public abstract class Pago {
    private double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    // Cada tipo de pago define cómo se realiza
    abstract void realizarPago();
}