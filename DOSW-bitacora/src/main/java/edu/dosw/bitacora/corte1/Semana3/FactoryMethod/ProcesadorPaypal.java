package edu.dosw.bitacora.Semana3.FactoryMethod;

// Procesador que crea pagos de tipo PayPal
public class ProcesadorPaypal extends ProcesadorPago {

    @Override
    Pago crearPago(double monto) {
        return new PagoPaypal(monto);
    }
}