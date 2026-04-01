package edu.dosw.bitacora.corte2.semana1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class EjecutorAnalisis implements CommandLineRunner {

    @Override
    public void run(String... args) {

        // ─── Datos de prueba ───────────────────────────────────────────────
        List<Estudiante> estudiantes = List.of(
            new Estudiante("1", "Ana Torres", "AZUL", List.of(
                new Nota("DOSW",  4.8, LocalDate.of(2024, 3, 1),  true),
                new Nota("BD",    4.6, LocalDate.of(2024, 3, 5),  true),
                new Nota("REDES", 2.8, LocalDate.of(2024, 3, 10), false)
            )),
            new Estudiante("2", "Carlos Ruiz", "AZUL", List.of(
                new Nota("DOSW",  3.0, LocalDate.of(2024, 3, 1),  false),
                new Nota("BD",    3.2, LocalDate.of(2024, 3, 5),  false),
                new Nota("REDES", 4.0, LocalDate.of(2024, 3, 10), true)
            )),
            new Estudiante("3", "Lucia Mora", "DORADO", List.of(
                new Nota("DOSW",  4.9, LocalDate.of(2024, 3, 1),  true),
                new Nota("BD",    4.7, LocalDate.of(2024, 3, 5),  true),
                new Nota("REDES", 4.8, LocalDate.of(2024, 3, 10), true)
            )),
            new Estudiante("4", "Pedro Soto", "VERDE", List.of(
                new Nota("DOSW",  2.5, LocalDate.of(2024, 3, 1),  false),
                new Nota("BD",    2.0, LocalDate.of(2024, 3, 5),  false),
                new Nota("REDES", 3.8, LocalDate.of(2024, 3, 10), true)
            )),
            new Estudiante("5", "Sofia Diaz", "AZUL", List.of(
                new Nota("DOSW",  5.0, LocalDate.of(2024, 3, 1),  true),
                new Nota("BD",    4.9, LocalDate.of(2024, 3, 5),  true),
                new Nota("REDES", 4.7, LocalDate.of(2024, 3, 10), true)
            ))
        );

        ServicioAnalisis servicio = new ServicioAnalisis();

        System.out.println("\n========== DOSW Learning Analytics System ==========\n");

        // 1
        System.out.println("1. Estudiantes equipo AZUL:");
        servicio.obtenerEstudiantesEquipoAzul(estudiantes)
                .forEach(e -> System.out.println("   - " + e.getNombre()));

        // 2
        System.out.println("\n2. Nombres ordenados alfabeticamente:");
        servicio.obtenerNombresOrdenados(estudiantes)
                .forEach(n -> System.out.println("   - " + n));

        // 3
        System.out.printf("%n3. Promedio general del sistema: %.2f%n",
                servicio.calcularPromedioGeneral(estudiantes));

        // 4
        System.out.println("\n4. Promedio por materia (Ana Torres):");
        servicio.obtenerPromedioPorMateria(estudiantes.get(0))
                .forEach((materia, promedio) ->
                        System.out.printf("   - %s: %.2f%n", materia, promedio));

        // 5
        System.out.println("\n5. Estudiante con promedio mas alto:");
        servicio.obtenerMejorEstudiante(estudiantes)
                .ifPresent(e -> System.out.println("   - " + e.getNombre()));

        // 6
        System.out.println("\n6. Materias reprobadas por equipo:");
        servicio.obtenerReprobadasPorEquipo(estudiantes)
                .forEach((equipo, cantidad) ->
                        System.out.println("   - " + equipo + ": " + cantidad + " reprobada(s)"));

        // 7
        System.out.println("\n7. Top 3 estudiantes con mas materias aprobadas:");
        servicio.obtenerTop3PorAprobadas(estudiantes)
                .forEach(e -> {
                    long aprobadas = e.getNotas().stream().filter(Nota::isAprobada).count();
                    System.out.println("   - " + e.getNombre() + " (" + aprobadas + " aprobadas)");
                });

        // 8
        System.out.println("\n8. Clasificacion por rendimiento academico:");
        servicio.clasificarPorRendimiento(estudiantes)
                .forEach((estado, lista) -> {
                    System.out.println("   [" + estado + "]");
                    lista.forEach(e -> System.out.println("      - " + e.getNombre()));
                });

        // 9
        System.out.println("\n9. Materia con mas reprobaciones:");
        servicio.obtenerMateriaConMasReprobaciones(estudiantes)
                .ifPresent(m -> System.out.println("   - " + m));

        // 10
        System.out.println("\n10. Promedio aprobados AZUL por materia (desc):");
        servicio.promedioAprobadosAzulPorMateria(estudiantes)
                .forEach((materia, promedio) ->
                        System.out.printf("    - %s: %.2f%n", materia, promedio));

        System.out.println("\n====================================================\n");
    }
}
