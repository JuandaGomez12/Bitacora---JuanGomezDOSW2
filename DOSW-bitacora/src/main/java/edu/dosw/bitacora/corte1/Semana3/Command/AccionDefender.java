package edu.dosw.bitacora.Semana3.Command;

// Acción que ordena al personaje defenderse
public class AccionDefender implements Accion {

    private Personaje personaje;

    public AccionDefender(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.defender();
    }
}