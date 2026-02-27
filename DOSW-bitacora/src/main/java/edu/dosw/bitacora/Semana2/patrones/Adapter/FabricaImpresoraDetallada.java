package edu.dosw.bitacora.Semana2.patrones.Adapter;

// Fábrica que crea impresoras detalladas usando el adaptador
public class FabricaImpresoraDetallada extends Factory {

    @Override
    public Impresora crear(String contenido, String autor, Integer fecha) {
        return new AdaptadorImpresoraDetallada(contenido, autor, fecha);
    }
}