package edu.dosw.bitacora.Semana2.SOLID.Calculadora;

public class Dividir implements Operacion {
    @Override
    public double ejecutar(double valorA, double valorB) {
        return valorA / valorB;
    }
}