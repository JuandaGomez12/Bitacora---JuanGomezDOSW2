package edu.dosw.bitacora.Semana2.patrones.Adapter;

// Impresora que solo muestra el mensaje sin información adicional
public class ImpresoraSimple implements Impresora {

    private String contenido;

    public ImpresoraSimple(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public void imprimir() {
        System.out.println(this.getContenido());
    }
}