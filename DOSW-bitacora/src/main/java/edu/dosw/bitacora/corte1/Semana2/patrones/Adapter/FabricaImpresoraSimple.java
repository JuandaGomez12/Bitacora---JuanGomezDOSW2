package edu.dosw.bitacora.Semana2.patrones.Adapter;

// Fábrica que crea impresoras simples (ignora autor y fecha)
public class FabricaImpresoraSimple extends Factory {

    @Override
    public Impresora crear(String contenido, String autor, Integer fecha) {
        return new ImpresoraSimple(contenido);
    }
}