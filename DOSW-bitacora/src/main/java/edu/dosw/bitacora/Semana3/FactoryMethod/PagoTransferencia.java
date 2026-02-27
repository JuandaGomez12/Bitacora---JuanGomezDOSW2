package edu.dosw.bitacora.Semana3.FactoryMethod;

// Pago realizado mediante transferencia bancaria
public class PagoTransferencia extends Pago {

    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago con transferencia bancaria por monto: " + this.getMonto());
    }
}