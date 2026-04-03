package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class FabricaTransferencia extends FabricaProcesador {

    private final String cuentaOrigen;
    private final String cuentaDestino;

    public FabricaTransferencia(String cuentaOrigen, String cuentaDestino) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public ProcesadorPago crearProcesador() {
        return new AdaptadorTransferencia(new ApiTransferencia(), cuentaOrigen, cuentaDestino);
    }
}
