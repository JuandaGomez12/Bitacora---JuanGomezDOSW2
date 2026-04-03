package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class ServicioPagos {

    private ProcesadorPago procesador;
    private ValidadorPago cadenaValidacion;

    public void setProcesador(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void setCadenaValidacion(ValidadorPago cadena) {
        this.cadenaValidacion = cadena;
    }

    public boolean procesarPago(double monto, String referencia) {
        if (cadenaValidacion != null && !cadenaValidacion.validar(monto, referencia)) {
            System.out.println("[ServicioPagos] Pago rechazado en validacion | Ref: " + referencia);
            return false;
        }
        boolean resultado = procesador.procesar(monto, referencia);
        System.out.println("[ServicioPagos] Resultado: " + (resultado ? "EXITOSO" : "FALLIDO"));
        return resultado;
    }
}
