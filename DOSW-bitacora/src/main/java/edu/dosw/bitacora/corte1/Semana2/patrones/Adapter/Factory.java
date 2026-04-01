package edu.dosw.bitacora.Semana2.patrones.Adapter;

// Clase abstracta factory para crear e imprimir mensajes
public abstract class Factory {

    // Cada subclase decide qué tipo de impresora crear
    public abstract Impresora crear(String mensaje, String autor, Integer fecha);

    // Crea la impresora y ejecuta la impresión
    public void ejecutarImpresion(String mensaje, String autor, Integer fecha) {
        Impresora impresora = crear(mensaje, autor, fecha);
        impresora.imprimir();
    }
}