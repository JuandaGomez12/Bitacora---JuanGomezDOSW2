package edu.dosw.bitacora.Semana3.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        Consola consola;

        // Ejecutar con PlayStation
        consola = new PlayStation();
        MotorJuego motorPS = new MotorJuego(consola);
        motorPS.ejecutar();

        System.out.println("-----");

        // Ejecutar con Xbox
        consola = new Xbox();
        MotorJuego motorXbox = new MotorJuego(consola);
        motorXbox.ejecutar();
    }
}