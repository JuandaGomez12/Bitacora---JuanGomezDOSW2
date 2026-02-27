package edu.dosw.bitacora.Semana3.AbstractFactory;

// Pantalla/UI específica de Xbox
public class PantallaXbox implements PantallaUI {

    @Override
    public void renderizar() {
        System.out.println("Interfaz de Xbox renderizada");
    }
}