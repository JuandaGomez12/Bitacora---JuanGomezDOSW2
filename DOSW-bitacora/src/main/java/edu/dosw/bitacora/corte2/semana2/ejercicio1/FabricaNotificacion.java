package edu.dosw.bitacora.corte2.semana2.ejercicio1;

// Factory Method: define como se crea una estrategia de envio
public abstract class FabricaNotificacion {
    public abstract EstrategiaEnvio crearEstrategia();
}
