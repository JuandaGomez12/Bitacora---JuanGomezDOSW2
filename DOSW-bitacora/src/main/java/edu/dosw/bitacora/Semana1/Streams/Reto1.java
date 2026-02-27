//Reto de numeros pares mayores a 10
package edu.dosw.bitacora.Semana1.Streams;
import java.util.List;

public class Reto1 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(3, 8, 10, 12, 15, 18, 20);

        List<Integer> paresMayoresADiez = numeros.stream()
                .filter(n -> n % 2 == 0)   // solo pares
                .filter(n -> n > 10)       // mayores a 10
                .toList();

        System.out.println(paresMayoresADiez);
    }
}
