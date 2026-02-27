package edu.dosw.bitacora.Semana3.AbstractFactory;

// Motor que inicializa y ejecuta los componentes de una consola
public class MotorJuego {
    private Mando mando;
    private Videojuego videojuego;
    private PantallaUI pantalla;

    public MotorJuego(Consola consola) {
        this.inicializar(consola);
    }

    // Crea los componentes usando la fábrica recibida
    void inicializar(Consola consola) {
        mando = consola.crearMando();
        pantalla = consola.crearPantalla();
        videojuego = consola.crearVideojuego();
    }

    // Ejecuta todos los componentes de la consola
    void ejecutar() {
        mando.conectar();
        videojuego.iniciar();
        pantalla.renderizar();
    }
}