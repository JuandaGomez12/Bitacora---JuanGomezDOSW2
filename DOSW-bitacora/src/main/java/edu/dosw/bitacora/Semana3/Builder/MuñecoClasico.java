package edu.dosw.bitacora.Semana3.Builder;

// Constructor de muñeco clásico
public class MuñecoClasico implements MuñecoBuilder {

    private Muñeco muñeco;

    public MuñecoClasico() {
        this.muñeco = new Muñeco();
    }

    @Override
    public void construirCabeza() {
        this.muñeco.setCabeza("tiene cabeza clasica");
    }

    @Override
    public void construirCuerpo() {
        this.muñeco.setCuerpo("tiene cuerpo clasica");
    }

    @Override
    public void construirBrazos() {
        this.muñeco.setBrazos("tiene manos clasica");
    }

    @Override
    public void construirPiernas() {
        this.muñeco.setPiernas("tiene piernas clasica");
    }

    @Override
    public void agregarAccesorios() {
        this.muñeco.setTieneAccesorios(true);
    }

    @Override
    public Muñeco obtenerMuneco() {
        return this.muñeco;
    }
}