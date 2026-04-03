package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adaptee: API externa de PayPal con su propia interfaz
public class ApiPayPal {

    public void realizarPago(String referencia, double cantidad) {
        System.out.println("[PayPal API] Pago realizado | Ref: " + referencia + " | Monto: $" + cantidad);
    }
}
