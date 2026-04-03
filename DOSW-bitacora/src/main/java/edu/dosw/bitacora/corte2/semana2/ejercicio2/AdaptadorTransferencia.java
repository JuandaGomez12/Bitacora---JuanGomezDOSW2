package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adapter: traduce la interfaz de ApiTransferencia a ProcesadorPago
public class AdaptadorTransferencia implements ProcesadorPago {

    private final ApiTransferencia apiTransferencia;
    private final String cuentaOrigen;
    private final String cuentaDestino;

    public AdaptadorTransferencia(ApiTransferencia apiTransferencia, String cuentaOrigen, String cuentaDestino) {
        this.apiTransferencia = apiTransferencia;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public boolean procesar(double monto, String referencia) {
        apiTransferencia.transferir(monto, cuentaOrigen, cuentaDestino);
        return true;
    }
}
