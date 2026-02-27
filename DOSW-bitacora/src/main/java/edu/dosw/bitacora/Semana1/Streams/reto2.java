//Dada una lista de palabras, se requiere: Filtrar las palabras que tengan mas de 4 caracteres, convertirlas en Mayusculas, ordenarlas alfabeticamente y obtener la cantidad total de palabras resultantes
package edu.dosw.bitacora.Semana1.Streams;

import java.util.List;

public class reto2 {
       public static void main(String[] args) {

        List<String> palabras = List.of("java", "api", "funcional", "code", "git");

        List<String> palabrasProcesadas = palabras.stream()
                .filter(p -> p.length() > 4 )   
                .map(p -> p.toUpperCase())
                .sorted()
                .toList();
          long cantidad = palabrasProcesadas.size();

        System.out.println(palabrasProcesadas);
        System.out.println("Cantidad: " + cantidad);

}}
