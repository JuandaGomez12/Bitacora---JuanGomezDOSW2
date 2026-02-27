package edu.dosw.bitacora.Semana3.Command;

// Acción que ordena al personaje atacar
public class AccionAtacar implements Accion {

    private Personaje personaje;

    public AccionAtacar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void ejecutar() {
        personaje.atacar();
    }
}