package edu.dosw.bitacora.Semana3.FactoryMethod;

// Pago realizado con tarjeta de crédito
public class PagoTarjetaCredito extends Pago {

    public PagoTarjetaCredito(double monto) {
        super(monto);
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con tarjeta de crédito por monto: " + this.getMonto());
    }
}