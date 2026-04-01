package edu.dosw.bitacora.corte2.semana1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ServicioAnalisisTest {

    private ServicioAnalisis servicio;
    private List<Estudiante> estudiantes;

    @BeforeEach
    void configurar() {
        servicio = new ServicioAnalisis();

        Estudiante ana = new Estudiante("1", "Ana Torres", "AZUL", List.of(
                new Nota("DOSW",  4.8, LocalDate.of(2024, 3, 1),  true),
                new Nota("BD",    4.6, LocalDate.of(2024, 3, 5),  true),
                new Nota("REDES", 2.8, LocalDate.of(2024, 3, 10), false)
        ));

        Estudiante carlos = new Estudiante("2", "Carlos Ruiz", "AZUL", List.of(
                new Nota("DOSW",  3.0, LocalDate.of(2024, 3, 1),  false),
                new Nota("BD",    3.2, LocalDate.of(2024, 3, 5),  false),
                new Nota("REDES", 4.0, LocalDate.of(2024, 3, 10), true)
        ));

        Estudiante lucia = new Estudiante("3", "Lucia Mora", "DORADO", List.of(
                new Nota("DOSW",  4.9, LocalDate.of(2024, 3, 1),  true),
                new Nota("BD",    4.7, LocalDate.of(2024, 3, 5),  true),
                new Nota("REDES", 4.8, LocalDate.of(2024, 3, 10), true)
        ));

        Estudiante pedro = new Estudiante("4", "Pedro Soto", "VERDE", List.of(
                new Nota("DOSW",  2.5, LocalDate.of(2024, 3, 1),  false),
                new Nota("BD",    2.0, LocalDate.of(2024, 3, 5),  false),
                new Nota("REDES", 3.8, LocalDate.of(2024, 3, 10), true)
        ));

        Estudiante sofia = new Estudiante("5", "Sofia Diaz", "AZUL", List.of(
                new Nota("DOSW",  5.0, LocalDate.of(2024, 3, 1),  true),
                new Nota("BD",    4.9, LocalDate.of(2024, 3, 5),  true),
                new Nota("REDES", 4.7, LocalDate.of(2024, 3, 10), true)
        ));

        estudiantes = List.of(ana, carlos, lucia, pedro, sofia);
    }

    // --- Ejercicio 1 ---
    @Test
    void obtenerEstudiantesEquipoAzul_retornaSoloEquipoAzul() {
        List<Estudiante> resultado = servicio.obtenerEstudiantesEquipoAzul(estudiantes);
        assertEquals(3, resultado.size());
        assertTrue(resultado.stream().allMatch(e -> "AZUL".equals(e.getEquipo())));
    }

    @Test
    void obtenerEstudiantesEquipoAzul_listaVaciaRetornaVacio() {
        assertTrue(servicio.obtenerEstudiantesEquipoAzul(List.of()).isEmpty());
    }

    // --- Ejercicio 2 ---
    @Test
    void obtenerNombresOrdenados_retornaOrdenAlfabetico() {
        List<String> resultado = servicio.obtenerNombresOrdenados(estudiantes);
        assertEquals(List.of("Ana Torres", "Carlos Ruiz", "Lucia Mora", "Pedro Soto", "Sofia Diaz"), resultado);
    }

    @Test
    void obtenerNombresOrdenados_unEstudianteRetornaUnoSolo() {
        List<String> resultado = servicio.obtenerNombresOrdenados(List.of(estudiantes.get(0)));
        assertEquals(1, resultado.size());
    }

    // --- Ejercicio 3 ---
    @Test
    void calcularPromedioGeneral_retornaPromedioValido() {
        double resultado = servicio.calcularPromedioGeneral(estudiantes);
        assertTrue(resultado > 0.0);
        assertTrue(resultado <= 5.0);
    }

    @Test
    void calcularPromedioGeneral_listaVaciaRetornaCero() {
        assertEquals(0.0, servicio.calcularPromedioGeneral(List.of()));
    }

    // --- Ejercicio 4 ---
    @Test
    void obtenerPromedioPorMateria_retornaPromediosCorrectos() {
        Estudiante ana = estudiantes.get(0);
        Map<String, Double> resultado = servicio.obtenerPromedioPorMateria(ana);
        assertEquals(3, resultado.size());
        assertEquals(4.8, resultado.get("DOSW"),  0.001);
        assertEquals(4.6, resultado.get("BD"),    0.001);
        assertEquals(2.8, resultado.get("REDES"), 0.001);
    }

    @Test
    void obtenerPromedioPorMateria_variasNotasMismaMateria() {
        Estudiante estudiante = new Estudiante("99", "Test", "AZUL", List.of(
                new Nota("DOSW", 3.0, LocalDate.now(), true),
                new Nota("DOSW", 5.0, LocalDate.now(), true)
        ));
        Map<String, Double> resultado = servicio.obtenerPromedioPorMateria(estudiante);
        assertEquals(4.0, resultado.get("DOSW"), 0.001);
    }

    // --- Ejercicio 5 ---
    @Test
    void obtenerMejorEstudiante_retornaEstudianteConPromedioMasAlto() {
        Optional<Estudiante> resultado = servicio.obtenerMejorEstudiante(estudiantes);
        assertTrue(resultado.isPresent());
        assertEquals("Sofia Diaz", resultado.get().getNombre()); // Sofia: 5.0, 4.9, 4.7 = 4.87
    }

    @Test
    void obtenerMejorEstudiante_listaVaciaRetornaVacio() {
        assertTrue(servicio.obtenerMejorEstudiante(List.of()).isEmpty());
    }

    // --- Ejercicio 6 ---
    @Test
    void obtenerReprobadasPorEquipo_retornaCantidadesCorrectas() {
        Map<String, Long> resultado = servicio.obtenerReprobadasPorEquipo(estudiantes);
        assertEquals(3L, resultado.get("AZUL"));   // Ana(1) + Carlos(2) = 3
        assertEquals(0L, resultado.get("DORADO")); // Lucia: 0 reprobadas
        assertEquals(2L, resultado.get("VERDE"));  // Pedro: 2 reprobadas
    }

    @Test
    void obtenerReprobadasPorEquipo_sinReprobadasRetornaCero() {
        Estudiante perfecto = new Estudiante("99", "Perfecto", "DORADO", List.of(
                new Nota("DOSW", 5.0, LocalDate.now(), true)
        ));
        Map<String, Long> resultado = servicio.obtenerReprobadasPorEquipo(List.of(perfecto));
        assertEquals(0L, resultado.get("DORADO"));
    }

    // --- Ejercicio 7 ---
    @Test
    void obtenerTop3PorAprobadas_retornaMaximoTres() {
        List<Estudiante> resultado = servicio.obtenerTop3PorAprobadas(estudiantes);
        assertEquals(3, resultado.size());
    }

    @Test
    void obtenerTop3PorAprobadas_estaOrdenadoDescendente() {
        List<Estudiante> resultado = servicio.obtenerTop3PorAprobadas(estudiantes);
        long primero  = resultado.get(0).getNotas().stream().filter(Nota::isAprobada).count();
        long segundo  = resultado.get(1).getNotas().stream().filter(Nota::isAprobada).count();
        long tercero  = resultado.get(2).getNotas().stream().filter(Nota::isAprobada).count();
        assertTrue(primero >= segundo && segundo >= tercero);
    }

    @Test
    void obtenerTop3PorAprobadas_menosDeTresRetornaTodos() {
        List<Estudiante> resultado = servicio.obtenerTop3PorAprobadas(List.of(estudiantes.get(0)));
        assertEquals(1, resultado.size());
    }

    // --- Ejercicio 8 ---
    @Test
    void clasificarPorRendimiento_categoriaAltoRendimiento() {
        Map<String, List<Estudiante>> resultado = servicio.clasificarPorRendimiento(estudiantes);
        assertTrue(resultado.containsKey("ALTO RENDIMIENTO"));
        List<String> nombres = resultado.get("ALTO RENDIMIENTO").stream().map(Estudiante::getNombre).toList();
        assertTrue(nombres.contains("Lucia Mora"));
        assertTrue(nombres.contains("Sofia Diaz"));
    }

    @Test
    void clasificarPorRendimiento_categoriaRiesgo() {
        Map<String, List<Estudiante>> resultado = servicio.clasificarPorRendimiento(estudiantes);
        // Pedro: (2.5+2.0+3.8)/3 = 2.77 -> RIESGO
        assertTrue(resultado.containsKey("RIESGO"));
        assertTrue(resultado.get("RIESGO").stream().anyMatch(e -> "Pedro Soto".equals(e.getNombre())));
    }

    @Test
    void clasificarPorRendimiento_categoriaRegular() {
        Map<String, List<Estudiante>> resultado = servicio.clasificarPorRendimiento(estudiantes);
        // Ana: (4.8+4.6+2.8)/3 = 4.07 -> REGULAR
        assertTrue(resultado.containsKey("REGULAR"));
        assertTrue(resultado.get("REGULAR").stream().anyMatch(e -> "Ana Torres".equals(e.getNombre())));
    }

    // --- Ejercicio 9 ---
    @Test
    void obtenerMateriaConMasReprobaciones_retornaMateriaCorrecta() {
        Optional<String> resultado = servicio.obtenerMateriaConMasReprobaciones(estudiantes);
        assertTrue(resultado.isPresent());
        // DOSW: Carlos(fail), Pedro(fail) = 2; BD: Carlos(fail), Pedro(fail) = 2 -> empate
        assertTrue(Set.of("DOSW", "BD").contains(resultado.get()));
    }

    @Test
    void obtenerMateriaConMasReprobaciones_sinReprobadasRetornaVacio() {
        Estudiante perfecto = new Estudiante("99", "Perfecto", "AZUL", List.of(
                new Nota("DOSW", 5.0, LocalDate.now(), true)
        ));
        assertTrue(servicio.obtenerMateriaConMasReprobaciones(List.of(perfecto)).isEmpty());
    }

    // --- Ejercicio 10 ---
    @Test
    void promedioAprobadosAzulPorMateria_soloNotasAprobadasDeAzul() {
        LinkedHashMap<String, Double> resultado = servicio.promedioAprobadosAzulPorMateria(estudiantes);
        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
        assertTrue(resultado.containsKey("DOSW") || resultado.containsKey("BD") || resultado.containsKey("REDES"));
    }

    @Test
    void promedioAprobadosAzulPorMateria_estaOrdenadoDescendente() {
        LinkedHashMap<String, Double> resultado = servicio.promedioAprobadosAzulPorMateria(estudiantes);
        List<Double> valores = new ArrayList<>(resultado.values());
        for (int i = 0; i < valores.size() - 1; i++) {
            assertTrue(valores.get(i) >= valores.get(i + 1));
        }
    }

    @Test
    void promedioAprobadosAzulPorMateria_sinEquipoAzulRetornaVacio() {
        List<Estudiante> sinAzul = estudiantes.stream()
                .filter(e -> !"AZUL".equals(e.getEquipo()))
                .toList();
        assertTrue(servicio.promedioAprobadosAzulPorMateria(sinAzul).isEmpty());
    }
}
