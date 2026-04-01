package edu.dosw.bitacora.Semana3.Strategy;

// Estrategia que prioriza el paisaje y los puntos de interés
public class RutaEscenica implements EstrategiaRuta {

    @Override
    public void calcularRuta() {
        System.out.println("Calculando la ruta MÁS ESCÉNICA...");
        System.out.println("Pasando por parques y miradores");
        System.out.println("Disfrutando del paisaje");
        System.out.println("Tiempo estimado: 50 minutos");
    }
}