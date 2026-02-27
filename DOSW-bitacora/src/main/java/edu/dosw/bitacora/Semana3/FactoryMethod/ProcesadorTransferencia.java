package edu.dosw.bitacora.Semana3.FactoryMethod;

// Procesador que crea pagos por transferencia bancaria
public class ProcesadorTransferencia extends ProcesadorPago {

    @Override
    Pago crearPago(double monto) {
        return new PagoTransferencia(monto);
    }
}