package edu.dosw.bitacora.corte2.semana2.ejercicio2;

// Adaptee: API externa de tarjeta de credito con su propia interfaz
public class ApiTarjetaCredito {

    public String procesarTransaccion(double valor, String codigo) {
        System.out.println("[Tarjeta API] Transaccion procesada | Codigo: " + codigo + " | Valor: $" + valor);
        return "APROBADA";
    }
}
