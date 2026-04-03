package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class FabricaTarjeta extends FabricaProcesador {

    @Override
    public ProcesadorPago crearProcesador() {
        return new AdaptadorTarjeta(new ApiTarjetaCredito());
    }
}
