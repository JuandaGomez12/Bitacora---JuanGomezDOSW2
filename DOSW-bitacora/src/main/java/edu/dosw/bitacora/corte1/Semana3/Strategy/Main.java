package edu.dosw.bitacora.Semana3.Strategy;

public class Main {

    public static void main(String[] args) {

        // Iniciar con ruta rápida
        AppNavegacion app = new AppNavegacion(new RutaRapida());
        app.iniciarNavegacion();

        // Cambiar a ruta escénica
        app.cambiarEstrategia(new RutaEscenica());
        app.iniciarNavegacion();

        // Cambiar a ruta económica
        app.cambiarEstrategia(new RutaEconomica());
        app.iniciarNavegacion();
    }
}