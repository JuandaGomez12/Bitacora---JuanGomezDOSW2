package edu.dosw.bitacora.Semana3.Adapter;

// Adapter: convierte litros a KWH para usar el cargador lento
public class AdaptadorCargaLenta implements ServicioAbastecimiento {

    private CargadorLento cargador;

    public AdaptadorCargaLenta(CargadorLento cargador) {
        this.cargador = cargador;
    }

    @Override
    public void abastecer(int litros) {
        System.out.println("Carga lenta equivalente a " + convertirAKwh(litros) + " KWH");
    }

    // Convierte litros a KWH para carga lenta
    private double convertirAKwh(int litros) {
        return litros * 7.0;
    }
}