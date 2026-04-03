package edu.dosw.bitacora.corte2.semana2.ejercicio2;

public class ValidadorLimite extends ValidadorPago {

    private final int limiteDiario;
    private final int transaccionesHoy;

    public ValidadorLimite(int limiteDiario, int transaccionesHoy) {
        this.limiteDiario = limiteDiario;
        this.transaccionesHoy = transaccionesHoy;
    }

    @Override
    public boolean validar(double monto, String referencia) {
        if (transaccionesHoy >= limiteDiario) {
            System.out.println("[ValidadorLimite] Rechazado: limite diario alcanzado (" + transaccionesHoy + "/" + limiteDiario + ")");
            return false;
        }
        System.out.println("[ValidadorLimite] OK");
        return continuarCadena(monto, referencia);
    }
}
