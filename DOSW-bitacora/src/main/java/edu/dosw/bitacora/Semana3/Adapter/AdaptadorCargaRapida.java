package edu.dosw.bitacora.Semana3.Adapter;

// Adapter: convierte litros a KWH para usar el cargador rápido
public class AdaptadorCargaRapida implements ServicioAbastecimiento {

    private CargadorRapido cargador;

    public AdaptadorCargaRapida(CargadorRapido cargador) {
        this.cargador = cargador;
    }

    @Override
    public void abastecer(int litros) {
        System.out.println("Carga rápida equivalente a " + convertirAKwh(litros) + " KWH");
    }

    // Convierte litros a KWH para carga rápida
    private double convertirAKwh(int litros) {
        return litros * 8.0;
    }
}