package edu.dosw.bitacora.Semana3.ChainResponsability;

// Datos de la solicitud de ingreso que recorre la cadena
public class SolicitudIngreso {

    private boolean pasaporteValido;
    private boolean antecedentesLimpios;
    private boolean motivoValido;
    private boolean aprobado;

    public SolicitudIngreso(boolean pasaporteValido, boolean antecedentesLimpios, boolean motivoValido) {
        this.pasaporteValido = pasaporteValido;
        this.antecedentesLimpios = antecedentesLimpios;
        this.motivoValido = motivoValido;
        this.aprobado = false;
    }

    public boolean isPasaporteValido() {
        return pasaporteValido;
    }

    public boolean isAntecedentesLimpios() {
        return antecedentesLimpios;
    }

    public boolean isMotivoValido() {
        return motivoValido;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
}