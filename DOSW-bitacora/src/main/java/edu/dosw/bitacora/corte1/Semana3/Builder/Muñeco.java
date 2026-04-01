package edu.dosw.bitacora.Semana3.Builder;

// Clase que representa un muñeco con sus partes
public class Muñeco {

    private String cabeza;
    private String cuerpo;
    private String brazos;
    private String piernas;
    private boolean tieneAccesorios;

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getBrazos() {
        return brazos;
    }

    public void setBrazos(String brazos) {
        this.brazos = brazos;
    }

    public String getPiernas() {
        return piernas;
    }

    public void setPiernas(String piernas) {
        this.piernas = piernas;
    }

    public boolean isTieneAccesorios() {
        return tieneAccesorios;
    }

    public void setTieneAccesorios(boolean tieneAccesorios) {
        this.tieneAccesorios = tieneAccesorios;
    }
}