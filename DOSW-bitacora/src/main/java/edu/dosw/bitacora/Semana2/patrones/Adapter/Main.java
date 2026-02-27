package edu.dosw.bitacora.Semana2.patrones.Adapter;

public class Main {
    public static void main(String[] args) {

        // Impresora detallada
        Factory fabricaDetallada = new FabricaImpresoraDetallada();
        Impresora impresora1 = fabricaDetallada.crear("Hola Mundo", "Juan", 2024);
        impresora1.imprimir();

        fabricaDetallada.ejecutarImpresion("Hola Mundo", "Juan", 2024);

        // Impresora simple
        Factory fabricaSimple = new FabricaImpresoraSimple();
        Impresora impresora2 = fabricaSimple.crear("Mensaje simple", null, null);
        impresora2.imprimir();

        fabricaSimple.ejecutarImpresion("Mensaje simple", null, null);
    }
}