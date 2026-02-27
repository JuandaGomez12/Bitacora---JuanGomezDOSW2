package edu.dosw.bitacora.Semana2.SOLID.Calculadora;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double resultadoSuma = calculadora.calcular(new Sumar(), 10, 5);
        System.out.println("Suma: " + resultadoSuma);  // 15.0

        double resultadoResta = calculadora.calcular(new Restar(), 10, 5);
        System.out.println("Resta: " + resultadoResta);  // 5.0

        double resultadoMult = calculadora.calcular(new Multiplicar(), 10, 5);
        System.out.println("Multiplicación: " + resultadoMult);  // 50.0

        double resultadoDiv = calculadora.calcular(new Dividir(), 10, 5);
        System.out.println("División: " + resultadoDiv);  // 2.0
    }
}