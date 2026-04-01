package edu.dosw.bitacora.Semana2.patrones.Memento;

public class Instantanea implements Recuerdo {

    private final String contenido;

    public Instantanea(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String getEstado() {
        return this.getContenido();
    }
}