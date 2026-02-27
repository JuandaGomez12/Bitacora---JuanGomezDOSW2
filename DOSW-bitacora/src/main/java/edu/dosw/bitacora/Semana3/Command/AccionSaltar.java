package edu.dosw.bitacora.Semana3.Command;

// Acción que ordena al personaje saltar
public class AccionSaltar implements Accion {

    private Personaje personaje;

    public AccionSaltar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.saltar();
    }
}