package edu.dosw.bitacora.Semana3.Builder;

public class Main {
    public static void main(String[] args) {
        FabricaJuguetes fabrica = new FabricaJuguetes();

        // Construir muñeco de acción
        MuñecoBuilder constructorAccion = new MuñecoAccion();
        Muñeco munecoAccion = fabrica.construir(constructorAccion);
        System.out.println(munecoAccion.getBrazos());

        // Construir muñeco clásico
        MuñecoBuilder constructorClasico = new MuñecoClasico();
        Muñeco munecoClasico = fabrica.construir(constructorClasico);
        System.out.println(munecoClasico.getBrazos());
    }
}