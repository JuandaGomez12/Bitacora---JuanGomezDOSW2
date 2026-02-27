package edu.dosw.bitacora.Semana3.AbstractFactory;

// Mando específico de PlayStation
public class MandoPlayStation implements Mando {

    public MandoPlayStation() {
    }

    @Override
    public void conectar() {
        System.out.println("Mando de PlayStation conectado");
    }
}