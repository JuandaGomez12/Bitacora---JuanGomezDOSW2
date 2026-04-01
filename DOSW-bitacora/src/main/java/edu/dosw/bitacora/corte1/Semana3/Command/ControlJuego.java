package edu.dosw.bitacora.Semana3.Command;

// Invocador: recibe y ejecuta acciones sin conocer su implementación
public class ControlJuego {

    public void presionarBoton(Accion accion) {
        accion.ejecutar();
    }
}