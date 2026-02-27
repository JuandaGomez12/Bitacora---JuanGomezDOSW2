package edu.dosw.bitacora.Semana3.Command;

// Acción que ordena al personaje caminar
public class AccionCaminar implements Accion {

    private Personaje personaje;

    public AccionCaminar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.caminar();
    }
}