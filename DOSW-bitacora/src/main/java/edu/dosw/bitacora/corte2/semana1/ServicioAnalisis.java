package edu.dosw.bitacora.corte2.semana1;

import java.util.*;
import java.util.stream.Collectors;

public class ServicioAnalisis {

    // 1. Obtener todos los estudiantes del equipo AZUL
    public List<Estudiante> obtenerEstudiantesEquipoAzul(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .filter(e -> "AZUL".equals(e.getEquipo()))
                .collect(Collectors.toList());
    }

    // 2. Obtener todos los nombres de estudiantes ordenados alfabéticamente
    public List<String> obtenerNombresOrdenados(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .map(Estudiante::getNombre)
                .sorted()
                .collect(Collectors.toList());
    }

    // 3. Calcular el promedio general de todos los scores del sistema
    public double calcularPromedioGeneral(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .flatMap(e -> e.getNotas().stream())
                .mapToDouble(Nota::getCalificacion)
                .average()
                .orElse(0.0);
    }

    // 4. Retornar por estudiante el promedio por materia
    public Map<String, Double> obtenerPromedioPorMateria(Estudiante estudiante) {
        return estudiante.getNotas().stream()
                .collect(Collectors.groupingBy(
                        Nota::getMateria,
                        Collectors.averagingDouble(Nota::getCalificacion)
                ));
    }

    // 5. Retornar el estudiante cuyo promedio general sea el más alto
    public Optional<Estudiante> obtenerMejorEstudiante(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .max(Comparator.comparingDouble(e ->
                        e.getNotas().stream()
                                .mapToDouble(Nota::getCalificacion)
                                .average()
                                .orElse(0.0)
                ));
    }

    // 6. Retornar las materias reprobadas por equipo -> Map<equipo, cantidad reprobadas>
    public Map<String, Long> obtenerReprobadasPorEquipo(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .collect(Collectors.groupingBy(
                        Estudiante::getEquipo,
                        Collectors.summingLong(e ->
                                e.getNotas().stream()
                                        .filter(n -> !n.isAprobada())
                                        .count()
                        )
                ));
    }

    // 7. Top 3 estudiantes con más materias aprobadas (orden descendente)
    public List<Estudiante> obtenerTop3PorAprobadas(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .sorted(Comparator.comparingLong((Estudiante e) ->
                        e.getNotas().stream().filter(Nota::isAprobada).count()
                ).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // 8. Agrupar por estado académico: ALTO RENDIMIENTO >=4.5 | REGULAR 3.5-4.49 | RIESGO <3.5
    public Map<String, List<Estudiante>> clasificarPorRendimiento(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .collect(Collectors.groupingBy(e -> {
                    double promedio = e.getNotas().stream()
                            .mapToDouble(Nota::getCalificacion)
                            .average()
                            .orElse(0.0);
                    if (promedio >= 4.5) return "ALTO RENDIMIENTO";
                    else if (promedio >= 3.5) return "REGULAR";
                    else return "RIESGO";
                }));
    }

    // 9. Obtener la materia con más reprobaciones
    public Optional<String> obtenerMateriaConMasReprobaciones(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .flatMap(e -> e.getNotas().stream())
                .filter(n -> !n.isAprobada())
                .collect(Collectors.groupingBy(Nota::getMateria, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    // 10. Equipo AZUL -> notas aprobadas -> agrupar por materia -> promedio -> orden descendente -> LinkedHashMap
    public LinkedHashMap<String, Double> promedioAprobadosAzulPorMateria(List<Estudiante> estudiantes) {
        return estudiantes.stream()
                .filter(e -> "AZUL".equals(e.getEquipo()))
                .flatMap(e -> e.getNotas().stream())
                .filter(Nota::isAprobada)
                .collect(Collectors.groupingBy(
                        Nota::getMateria,
                        Collectors.averagingDouble(Nota::getCalificacion)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
