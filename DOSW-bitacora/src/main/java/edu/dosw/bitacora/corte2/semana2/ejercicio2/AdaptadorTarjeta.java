package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adapter: traduce la interfaz de ApiTarjetaCredito a ProcesadorPago
public class AdaptadorTarjeta implements ProcesadorPago {

    private final ApiTarjetaCredito apiTarjeta;

    public AdaptadorTarjeta(ApiTarjetaCredito apiTarjeta) {
        this.apiTarjeta = apiTarjeta;
    }

    @Override
    public boolean procesar(double monto, String referencia) {
        String resultado = apiTarjeta.procesarTransaccion(monto, referencia);
        return "APROBADA".equals(resultado);
    }
}
