package edu.dosw.bitacora.Semana3.Strategy;

// Estrategia que prioriza el menor costo de viaje
public class RutaEconomica implements EstrategiaRuta {

    @Override
    public void calcularRuta() {
        System.out.println("Calculando la ruta MÁS ECONÓMICA...");
        System.out.println("Evitando peajes y autopistas de pago");
        System.out.println("Usando vías gratuitas");
        System.out.println("Tiempo estimado: 40 minutos");
    }
}