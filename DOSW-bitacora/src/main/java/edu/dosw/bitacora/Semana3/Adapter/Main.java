package edu.dosw.bitacora.Semana3.Adapter;

public class Main {

    public static void main(String[] args) {

        // Bomba de gasolina tradicional
        ServicioAbastecimiento bombaGasolina = new BombaGasolina();

        // Cargador rápido adaptado al servicio común
        ServicioAbastecimiento cargaRapida =
                new AdaptadorCargaRapida(new CargadorRapido());

        // Cargador lento adaptado al servicio común
        ServicioAbastecimiento cargaLenta =
                new AdaptadorCargaLenta(new CargadorLento());

        bombaGasolina.abastecer(30);
        cargaRapida.abastecer(30);
        cargaLenta.abastecer(30);
    }
}