package edu.dosw.bitacora.Semana1.Streams;

import java.util.List;


class UsuarioReto4 {
    private String id;
    private String name;
    private Integer age;
    private Boolean active;

    public UsuarioReto4(String id, String name, Integer age, Boolean active) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getId() {
        return id;
    }
    public Boolean getActive() {
        return active;
    }

     public Integer GetAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


public class Reto4 {
    public static void main(String[] args) {
        List<UsuarioReto4> usuarios = List.of(
            new UsuarioReto4("1", "Juan", 25, true),
            new UsuarioReto4("2", "David", 30, false),
            new UsuarioReto4("3", "Ignacio", 22, true),
            new UsuarioReto4("4", "Mariana", 28, true)
        );

        List<String> users = usuarios.stream()
                .filter(u -> u.getActive())
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .toList();

        System.out.println(users);
    }
}