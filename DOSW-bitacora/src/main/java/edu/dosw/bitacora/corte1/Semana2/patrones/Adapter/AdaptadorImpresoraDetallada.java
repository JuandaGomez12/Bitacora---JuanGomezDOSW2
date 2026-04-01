package edu.dosw.bitacora.Semana2.patrones.Adapter;

// Adapter: expone ImpresoraDetallada como una Impresora simple
public class AdaptadorImpresoraDetallada implements Impresora {

    private ImpresoraDetallada impresoraDetallada;

    public AdaptadorImpresoraDetallada(String contenido, String autor, Integer fecha) {
        this.impresoraDetallada = new ImpresoraDetallada(autor, fecha, contenido);
    }

    @Override
    public void imprimir() {
        System.out.println(impresoraDetallada.getContenido());
    }
}