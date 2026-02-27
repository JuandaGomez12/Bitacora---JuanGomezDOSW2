package edu.dosw.bitacora.Semana3.Builder;

// Constructor de muñeco de acción
public class MuñecoAccion implements MuñecoBuilder {

    private Muñeco muñeco;

    public MuñecoAccion() {
        this.muñeco = new Muñeco();
    }

    @Override
    public void construirCabeza() {
        this.muñeco.setCabeza("tiene cabeza accion");
    }

    @Override
    public void construirCuerpo() {
        this.muñeco.setCuerpo("tiene cuerpo accion");
    }

    @Override
    public void construirBrazos() {
        this.muñeco.setBrazos("tiene manos accion");
    }

    @Override
    public void construirPiernas() {
        this.muñeco.setPiernas("tiene piernas accion");
    }

    @Override
    public void agregarAccesorios() {
        this.muñeco.setTieneAccesorios(false);
    }

    @Override
    public Muñeco obtenerMuneco() {
        return this.muñeco;
    }
}