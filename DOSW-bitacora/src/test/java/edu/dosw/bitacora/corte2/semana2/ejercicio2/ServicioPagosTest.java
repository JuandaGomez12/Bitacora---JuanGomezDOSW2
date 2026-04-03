package edu.dosw.bitacora.corte2.semana2.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioPagosTest {

    private ServicioPagos servicio;

    @BeforeEach
    void configurar() {
        servicio = new ServicioPagos();
    }

    // --- Adapter: PayPal ---
    @Test
    void adaptadorPayPal_procesaPagoExitosamente() {
        servicio.setProcesador(new AdaptadorPayPal(new ApiPayPal()));
        assertTrue(servicio.procesarPago(100.0, "REF-001"));
    }

    // --- Adapter: Stripe ---
    @Test
    void adaptadorStripe_procesaPagoExitosamente() {
        servicio.setProcesador(new AdaptadorStripe(new ApiStripe()));
        assertTrue(servicio.procesarPago(200.0, "REF-002"));
    }

    // --- Adapter: Tarjeta de credito ---
    @Test
    void adaptadorTarjeta_procesaPagoExitosamente() {
        servicio.setProcesador(new AdaptadorTarjeta(new ApiTarjetaCredito()));
        assertTrue(servicio.procesarPago(150.0, "REF-003"));
    }

    // --- Adapter: Transferencia ---
    @Test
    void adaptadorTransferencia_procesaPagoExitosamente() {
        servicio.setProcesador(new AdaptadorTransferencia(new ApiTransferencia(), "001-123", "002-456"));
        assertTrue(servicio.procesarPago(500.0, "REF-004"));
    }

    // --- Chain: validador de saldo aprueba ---
    @Test
    void validadorSaldo_apruebaCuandoHaySaldoSuficiente() {
        ValidadorPago cadena = new ValidadorSaldo(1000.0);
        servicio.setCadenaValidacion(cadena);
        servicio.setProcesador(new AdaptadorPayPal(new ApiPayPal()));
        assertTrue(servicio.procesarPago(500.0, "REF-005"));
    }

    // --- Chain: validador de saldo rechaza ---
    @Test
    void validadorSaldo_rechazaCuandoNoHaySaldo() {
        ValidadorPago cadena = new ValidadorSaldo(100.0);
        servicio.setCadenaValidacion(cadena);
        servicio.setProcesador(new AdaptadorPayPal(new ApiPayPal()));
        assertFalse(servicio.procesarPago(500.0, "REF-006"));
    }

    // --- Chain: validador de fraude aprueba ---
    @Test
    void validadorFraude_apruebaCuandoMontoEsNormal() {
        ValidadorPago cadena = new ValidadorFraude(10000.0);
        servicio.setCadenaValidacion(cadena);
        servicio.setProcesador(new AdaptadorStripe(new ApiStripe()));
        assertTrue(servicio.procesarPago(200.0, "REF-007"));
    }

    // --- Chain: validador de fraude rechaza ---
    @Test
    void validadorFraude_rechazaCuandoMontoEsSospechoso() {
        ValidadorPago cadena = new ValidadorFraude(1000.0);
        servicio.setCadenaValidacion(cadena);
        servicio.setProcesador(new AdaptadorStripe(new ApiStripe()));
        assertFalse(servicio.procesarPago(5000.0, "REF-008"));
    }

    // --- Chain: validador de limite aprueba ---
    @Test
    void validadorLimite_apruebaCuandoNoSeAlcanzoElLimite() {
        ValidadorPago cadena = new ValidadorLimite(10, 3);
        servicio.setCadenaValidacion(cadena);
        servicio.setProcesador(new AdaptadorTarjeta(new ApiTarjetaCredito()));
        assertTrue(servicio.procesarPago(100.0, "REF-009"));
    }

    // --- Chain: validador de limite rechaza ---
    @Test
    void validadorLimite_rechazaCuandoSeAlcanzoElLimite() {
        ValidadorPago cadena = new ValidadorLimite(5, 5);
        servicio.setCadenaValidacion(cadena);
        servicio.setProcesador(new AdaptadorTarjeta(new ApiTarjetaCredito()));
        assertFalse(servicio.procesarPago(100.0, "REF-010"));
    }

    // --- Chain: cadena completa aprueba ---
    @Test
    void cadenaCompleta_apruebaCuandoTodasLasValidacionesPasan() {
        ValidadorPago saldo  = new ValidadorSaldo(1000.0);
        ValidadorPago fraude = new ValidadorFraude(5000.0);
        ValidadorPago limite = new ValidadorLimite(10, 2);

        saldo.setSiguiente(fraude).setSiguiente(limite);

        servicio.setCadenaValidacion(saldo);
        servicio.setProcesador(new AdaptadorPayPal(new ApiPayPal()));
        assertTrue(servicio.procesarPago(300.0, "REF-011"));
    }

    // --- Chain: cadena completa falla en el segundo validador ---
    @Test
    void cadenaCompleta_rechazaCuandoFallaValidadorIntermedio() {
        ValidadorPago saldo  = new ValidadorSaldo(1000.0);
        ValidadorPago fraude = new ValidadorFraude(100.0); // rechaza montos >= 100
        ValidadorPago limite = new ValidadorLimite(10, 2);

        saldo.setSiguiente(fraude).setSiguiente(limite);

        servicio.setCadenaValidacion(saldo);
        servicio.setProcesador(new AdaptadorPayPal(new ApiPayPal()));
        assertFalse(servicio.procesarPago(300.0, "REF-012"));
    }

    // --- Factory Method ---
    @Test
    void fabricaPayPal_creaAdaptadorDePayPal() {
        ProcesadorPago procesador = new FabricaPayPal().crearProcesador();
        assertInstanceOf(AdaptadorPayPal.class, procesador);
    }

    @Test
    void fabricaStripe_creaAdaptadorDeStripe() {
        ProcesadorPago procesador = new FabricaStripe().crearProcesador();
        assertInstanceOf(AdaptadorStripe.class, procesador);
    }

    @Test
    void fabricaTarjeta_creaAdaptadorDeTarjeta() {
        ProcesadorPago procesador = new FabricaTarjeta().crearProcesador();
        assertInstanceOf(AdaptadorTarjeta.class, procesador);
    }

    @Test
    void fabricaTransferencia_creaAdaptadorDeTransferencia() {
        ProcesadorPago procesador = new FabricaTransferencia("001", "002").crearProcesador();
        assertInstanceOf(AdaptadorTransferencia.class, procesador);
    }

    // --- Sin cadena de validacion: pasa directo al procesador ---
    @Test
    void sinCadenaValidacion_procesaDirectamente() {
        servicio.setProcesador(new FabricaStripe().crearProcesador());
        assertTrue(servicio.procesarPago(99.0, "REF-013"));
    }
}
