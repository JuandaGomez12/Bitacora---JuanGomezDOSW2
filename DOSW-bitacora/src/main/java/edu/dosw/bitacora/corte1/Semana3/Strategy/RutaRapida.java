package edu.dosw.bitacora.Semana3.Strategy;

// Estrategia que prioriza el menor tiempo de viaje
public class RutaRapida implements EstrategiaRuta {

    @Override
    public void calcularRuta() {
        System.out.println("Calculando la ruta MÁS RÁPIDA...");
        System.out.println("Usando autopistas y vías rápidas");
        System.out.println("Evitando tráfico pesado");
        System.out.println("Tiempo estimado: 25 minutos");
    }
}