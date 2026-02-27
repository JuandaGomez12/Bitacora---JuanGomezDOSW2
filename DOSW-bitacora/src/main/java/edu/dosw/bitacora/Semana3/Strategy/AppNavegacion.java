package edu.dosw.bitacora.Semana3.Strategy;

// Contexto: usa una estrategia de ruta intercambiable en tiempo de ejecución
public class AppNavegacion {

    private EstrategiaRuta estrategiaRuta;

    public AppNavegacion(EstrategiaRuta estrategiaRuta) {
        this.estrategiaRuta = estrategiaRuta;
    }

    // Permite cambiar la estrategia de navegación en cualquier momento
    public void cambiarEstrategia(EstrategiaRuta estrategiaRuta) {
        this.estrategiaRuta = estrategiaRuta;
    }

    // Inicia la navegación usando la estrategia actual
    public void iniciarNavegacion() {
        System.out.println("Iniciando navegación...");
        estrategiaRuta.calcularRuta();
    }
}