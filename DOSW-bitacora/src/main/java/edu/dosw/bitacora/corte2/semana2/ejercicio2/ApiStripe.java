package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adaptee: API externa de Stripe con su propia interfaz
public class ApiStripe {

    public boolean cargar(double monto, String descripcion) {
        System.out.println("[Stripe API] Cargo aplicado | " + descripcion + " | Monto: $" + monto);
        return true;
    }
}
