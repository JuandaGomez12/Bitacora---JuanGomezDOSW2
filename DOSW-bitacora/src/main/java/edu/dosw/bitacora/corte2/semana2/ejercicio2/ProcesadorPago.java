package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adapter - Target: interfaz interna que el sistema conoce
public interface ProcesadorPago {
    boolean procesar(double monto, String referencia);
}
