package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class ValidadorSaldo extends ValidadorPago {

    private final double saldoDisponible;

    public ValidadorSaldo(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean validar(double monto, String referencia) {
        if (monto > saldoDisponible) {
            System.out.println("[ValidadorSaldo] Rechazado: saldo insuficiente ($" + saldoDisponible + ")");
            return false;
        }
        System.out.println("[ValidadorSaldo] OK");
        return continuarCadena(monto, referencia);
    }
}
