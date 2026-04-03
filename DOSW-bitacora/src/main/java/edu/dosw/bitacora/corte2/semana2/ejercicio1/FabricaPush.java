package edu.dosw.bitacora.corte2.semana2.ejercicio1;

public class FabricaPush extends FabricaNotificacion {

    @Override
    public EstrategiaEnvio crearEstrategia() {
        return new EnvioPush();
    }
}
