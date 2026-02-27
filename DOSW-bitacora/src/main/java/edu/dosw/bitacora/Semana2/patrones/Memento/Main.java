package edu.dosw.bitacora.Semana2.patrones.Memento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Documento documento = new Documento("Hola");
        List<Recuerdo> historial = new ArrayList<>();

        historial.add(documento.guardarRecuerdo());

        documento.setContenido("Hola mundo");
        historial.add(documento.guardarRecuerdo());

        documento.setContenido("Hola mundo Memento");
        historial.add(documento.guardarRecuerdo());

        System.out.println("Texto actual: " + documento.getContenido());

        historial.remove(historial.size() - 1);
        documento.restaurar(historial.get(historial.size() - 1));

        System.out.println("Después de deshacer: " + documento.getContenido());
    }
}