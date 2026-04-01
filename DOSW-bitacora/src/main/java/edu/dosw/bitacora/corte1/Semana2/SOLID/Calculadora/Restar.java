package edu.dosw.bitacora.Semana2.SOLID.Calculadora;

public class Restar implements Operacion {
    @Override
    public double ejecutar(double valorA, double valorB) {
        return valorA - valorB;
    }
}