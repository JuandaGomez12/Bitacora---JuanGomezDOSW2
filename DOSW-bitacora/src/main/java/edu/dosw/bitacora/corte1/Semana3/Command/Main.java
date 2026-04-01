package edu.dosw.bitacora.Semana3.Command;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Personaje personaje = new Personaje();
        ControlJuego control = new ControlJuego();

        // Secuencia de acciones a ejecutar
        List<Accion> secuencia = List.of(
                new AccionCaminar(personaje),
                new AccionSaltar(personaje),
                new AccionAtacar(personaje),
                new AccionDefender(personaje)
        );

        System.out.println("=== Ejecutando secuencia de acciones ===\n");
        secuencia.forEach(control::presionarBoton);

        System.out.println("\n=== Fin de la secuencia ===");
    }
}