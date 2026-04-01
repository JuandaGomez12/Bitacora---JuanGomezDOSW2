package edu.dosw.bitacora.Semana3.AbstractFactory;

// Pantalla/UI específica de PlayStation
public class PantallaPlayStation implements PantallaUI {

    @Override
    public void renderizar() {
        System.out.println("Interfaz de PlayStation renderizada");
    }
}