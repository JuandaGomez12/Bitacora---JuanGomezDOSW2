package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class FabricaStripe extends FabricaProcesador {

    @Override
    public ProcesadorPago crearProcesador() {
        return new AdaptadorStripe(new ApiStripe());
    }
}
