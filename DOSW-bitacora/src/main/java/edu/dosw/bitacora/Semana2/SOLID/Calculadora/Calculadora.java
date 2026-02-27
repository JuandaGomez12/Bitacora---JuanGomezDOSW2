package edu.dosw.bitacora.Semana2.SOLID.Calculadora;

public class Calculadora {
    // Ejecuta la operación recibida con los dos valores dados
    public double calcular(Operacion operacion, double valorA, double valorB) {
        return operacion.ejecutar(valorA, valorB);
    }
}