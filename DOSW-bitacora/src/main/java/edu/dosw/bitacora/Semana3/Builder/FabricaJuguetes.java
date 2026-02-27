package edu.dosw.bitacora.Semana3.Builder;

// Director que coordina la construcción del muñeco paso a paso
public class FabricaJuguetes {
    private MuñecoBuilder constructor;

    public FabricaJuguetes() {
    }

    // Ejecuta todos los pasos de construcción y retorna el muñeco
    Muñeco construir(MuñecoBuilder constructor) {
        this.constructor = constructor;
        this.constructor.construirCabeza();
        this.constructor.construirCuerpo();
        this.constructor.construirBrazos();
        this.constructor.construirPiernas();
        this.constructor.agregarAccesorios();
        return constructor.obtenerMuneco();
    }
}