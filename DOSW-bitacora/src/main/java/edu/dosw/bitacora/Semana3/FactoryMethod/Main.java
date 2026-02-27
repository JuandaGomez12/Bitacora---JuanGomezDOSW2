package edu.dosw.bitacora.Semana3.FactoryMethod;

public class Main {
    public static void main(String[] args) {

        ProcesadorPago procesador;
        Pago pago;

        // Pago con tarjeta de crédito
        procesador = new ProcesadorTarjetaCredito();
        pago = procesador.crearPago(100);
        procesador.procesarPago(pago);

        // Pago con PayPal
        procesador = new ProcesadorPaypal();
        pago = procesador.crearPago(500);
        procesador.procesarPago(pago);

        // Pago con transferencia bancaria
        procesador = new ProcesadorTransferencia();
        pago = procesador.crearPago(900);
        procesador.procesarPago(pago);
    }
}