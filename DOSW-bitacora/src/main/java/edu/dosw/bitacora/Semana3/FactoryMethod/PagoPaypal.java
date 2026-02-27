package edu.dosw.bitacora.Semana3.FactoryMethod;

// Pago realizado mediante PayPal
public class PagoPaypal extends Pago {

    public PagoPaypal(double monto) {
        super(monto);
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con PayPal por monto: " + this.getMonto());
    }
}