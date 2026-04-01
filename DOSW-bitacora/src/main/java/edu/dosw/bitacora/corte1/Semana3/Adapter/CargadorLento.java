package edu.dosw.bitacora.Semana3.Adapter;

// Cargador eléctrico lento (incompatible con ServicioAbastecimiento)
public class CargadorLento {

    public CargadorLento() {
    }

    // Recibe energía en KWH para carga lenta
    void cargarLento(double kwh) {
        System.out.println("Carga lenta eléctrica");
    }
}