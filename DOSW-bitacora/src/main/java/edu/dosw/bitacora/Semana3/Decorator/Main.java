package edu.dosw.bitacora.Semana3.Decorator;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        NaveGuerra naveBase = new NaveBase();

        // Mapa de mejoras disponibles
        Map<String, Function<NaveGuerra, NaveGuerra>> mejoras = Map.of(
                "BLINDAJE", MejoraBlindaje::new,
                "RADAR", MejoraRadar::new,
                "MISILES", MejoraMisiles::new,
                "ANTITORPEDOS", MejoraAntiTorpedos::new
        );

        // Configuración de mejoras a aplicar
        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES"
        );

        // Aplica las mejoras en cadena sobre la nave base
        NaveGuerra naveFinal = configuracion.stream()
                .map(mejoras::get)
                .reduce(naveBase,
                        (nave, decorador) -> decorador.apply(nave),
                        (n1, n2) -> n1
                );

        System.out.println(naveFinal.obtenerDescripcion());
        System.out.println("Ataque: " + naveFinal.obtenerAtaque());
        System.out.println("Defensa: " + naveFinal.obtenerDefensa());
    }
}