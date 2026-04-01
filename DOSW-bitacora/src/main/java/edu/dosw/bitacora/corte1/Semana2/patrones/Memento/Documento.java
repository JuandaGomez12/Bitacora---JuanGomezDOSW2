package edu.dosw.bitacora.Semana2.patrones.Memento;

public class Documento {

    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    // Crear un Recuerdo con el estado actual
    public Recuerdo guardarRecuerdo() {
        return new Instantanea(contenido);
    }

    // Restaurar el estado desde un Recuerdo
    public void restaurar(Recuerdo recuerdo) {
        this.setContenido(recuerdo.getEstado());
    }
}