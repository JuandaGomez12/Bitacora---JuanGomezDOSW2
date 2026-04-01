package edu.dosw.bitacora.Semana2.patrones.Adapter;

// Impresora que muestra mensaje, fecha y autor
public class ImpresoraDetallada implements Impresora {

    private String autor;
    private Integer fecha;
    private String contenido;

    public ImpresoraDetallada(String autor, Integer fecha, String contenido) {
        this.autor = autor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    // Imprime solo el contenido sin metadatos
    public void imprimirSinMetadatos() {
        System.out.println(contenido);
    }

    @Override
    public void imprimir() {
        System.out.println(contenido + " " + fecha + " " + autor);
    }
}