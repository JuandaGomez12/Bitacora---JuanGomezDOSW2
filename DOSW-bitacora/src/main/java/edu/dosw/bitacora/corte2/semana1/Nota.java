package edu.dosw.bitacora.corte2.semana1;

import java.time.LocalDate;

public class Nota {

    private String materia;
    private double calificacion;
    private LocalDate fecha;
    private boolean aprobada;

    public Nota(String materia, double calificacion, LocalDate fecha, boolean aprobada) {
        this.materia = materia;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.aprobada = aprobada;
    }

    public String getMateria() { return materia; }
    public double getCalificacion() { return calificacion; }
    public LocalDate getFecha() { return fecha; }
    public boolean isAprobada() { return aprobada; }
}
