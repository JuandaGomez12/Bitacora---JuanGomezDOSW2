package edu.dosw.bitacora.Semana3.AbstractFactory;

// Mando específico de Xbox
public class MandoXbox implements Mando {

    @Override
    public void conectar() {
        System.out.println("Mando de Xbox conectado");
    }
}