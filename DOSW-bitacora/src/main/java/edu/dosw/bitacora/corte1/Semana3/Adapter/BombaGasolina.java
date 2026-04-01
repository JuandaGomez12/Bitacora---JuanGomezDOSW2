package edu.dosw.bitacora.Semana3.Adapter;

// Bomba de gasolina tradicional
public class BombaGasolina implements ServicioAbastecimiento {

    public BombaGasolina() {
    }

    @Override
    public void abastecer(int litros) {
        System.out.println("Se llenó de gasolina con " + litros + " litros");
    }
}