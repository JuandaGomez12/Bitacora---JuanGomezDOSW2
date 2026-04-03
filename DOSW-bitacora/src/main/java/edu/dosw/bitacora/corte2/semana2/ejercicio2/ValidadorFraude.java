package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class ValidadorFraude extends ValidadorPago {

    private final double montoSospechoso;

    public ValidadorFraude(double montoSospechoso) {
        this.montoSospechoso = montoSospechoso;
    }

    @Override
    public boolean validar(double monto, String referencia) {
        if (monto >= montoSospechoso) {
            System.out.println("[ValidadorFraude] Rechazado: monto sospechoso ($" + monto + ")");
            return false;
        }
        System.out.println("[ValidadorFraude] OK");
        return continuarCadena(monto, referencia);
    }
}
