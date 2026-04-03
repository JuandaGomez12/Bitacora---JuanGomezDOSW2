package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adapter: traduce la interfaz de ApiPayPal a ProcesadorPago
public class AdaptadorPayPal implements ProcesadorPago {

    private final ApiPayPal apiPayPal;

    public AdaptadorPayPal(ApiPayPal apiPayPal) {
        this.apiPayPal = apiPayPal;
    }

    @Override
    public boolean procesar(double monto, String referencia) {
        apiPayPal.realizarPago(referencia, monto);
        return true;
    }
}
