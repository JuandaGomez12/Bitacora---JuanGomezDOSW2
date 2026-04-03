package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adapter: traduce la interfaz de ApiStripe a ProcesadorPago
public class AdaptadorStripe implements ProcesadorPago {

    private final ApiStripe apiStripe;

    public AdaptadorStripe(ApiStripe apiStripe) {
        this.apiStripe = apiStripe;
    }

    @Override
    public boolean procesar(double monto, String referencia) {
        return apiStripe.cargar(monto, referencia);
    }
}
