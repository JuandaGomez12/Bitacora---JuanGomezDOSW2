package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adaptee: API externa de transferencia bancaria con su propia interfaz
public class ApiTransferencia {

    public void transferir(double monto, String cuentaOrigen, String cuentaDestino) {
        System.out.println("[Transferencia API] Transferencia enviada | " +
                cuentaOrigen + " -> " + cuentaDestino + " | Monto: $" + monto);
    }
}
