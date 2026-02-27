package edu.dosw.bitacora.Semana3.FactoryMethod;

// Procesador que crea pagos con tarjeta de crédito
public class ProcesadorTarjetaCredito extends ProcesadorPago {

    @Override
    Pago crearPago(double monto) {
        return new PagoTarjetaCredito(monto);
    }
}