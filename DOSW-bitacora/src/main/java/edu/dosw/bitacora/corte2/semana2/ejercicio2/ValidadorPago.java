package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Chain of Responsibility - Handler base
public abstract class ValidadorPago {

    protected ValidadorPago siguiente;

    public ValidadorPago setSiguiente(ValidadorPago siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public abstract boolean validar(double monto, String referencia);

    protected boolean continuarCadena(double monto, String referencia) {
        if (siguiente != null) {
            return siguiente.validar(monto, referencia);
        }
        return true;
    }
}
