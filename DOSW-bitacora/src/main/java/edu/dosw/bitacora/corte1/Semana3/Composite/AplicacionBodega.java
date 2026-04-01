package edu.dosw.bitacora.Semana3.Composite;

public class AplicacionBodega {

    public static void main(String[] args) {

        // Productos individuales
        Producto laptop = new Producto("Laptop", 1200);
        Producto mouse = new Producto("Mouse", 40);
        Producto teclado = new Producto("Teclado", 80);

        // Caja de accesorios
        Caja cajaAccesorios = new Caja("Caja Accesorios");
        cajaAccesorios.agregar(mouse);
        cajaAccesorios.agregar(teclado);

        // Caja principal que contiene laptop y caja de accesorios
        Caja cajaPrincipal = new Caja("Caja Principal");
        cajaPrincipal.agregar(laptop);
        cajaPrincipal.agregar(cajaAccesorios);

        System.out.println("Precio total: $" + cajaPrincipal.obtenerPrecio());
    }
}