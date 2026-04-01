package edu.dosw.bitacora.corte2.semana1;

import java.util.List;

public class Estudiante {

    private String id;
    private String nombre;
    private String equipo;
    private List<Nota> notas;

    public Estudiante(String id, String nombre, String equipo, List<Nota> notas) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.notas = notas;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEquipo() { return equipo; }
    public List<Nota> getNotas() { return notas; }
}
