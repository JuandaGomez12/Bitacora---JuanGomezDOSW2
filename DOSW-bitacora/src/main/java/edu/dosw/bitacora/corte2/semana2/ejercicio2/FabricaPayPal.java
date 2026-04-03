package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class FabricaPayPal extends FabricaProcesador {

    @Override
    public ProcesadorPago crearProcesador() {
        return new AdaptadorPayPal(new ApiPayPal());
    }
}
