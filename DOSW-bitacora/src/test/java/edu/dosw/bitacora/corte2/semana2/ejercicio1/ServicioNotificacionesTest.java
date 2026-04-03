package edu.dosw.bitacora.corte2.semana2.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioNotificacionesTest {

    @BeforeEach
    void limpiarSingleton() {
        ServicioNotificaciones.resetear();
    }

    // --- Singleton ---
    @Test
    void getInstancia_retornaSiempreLaMismaInstancia() {
        ServicioNotificaciones primera = ServicioNotificaciones.getInstancia();
        ServicioNotificaciones segunda = ServicioNotificaciones.getInstancia();
        assertSame(primera, segunda);
    }

    // --- Strategy: Email ---
    @Test
    void enviarNotificacion_conEstrategiaEmail_noLanzaExcepcion() {
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();
        servicio.setEstrategia(new EnvioEmail());
        assertDoesNotThrow(() -> servicio.enviarNotificacion("juan@email.com", "Bienvenido"));
    }

    // --- Strategy: SMS ---
    @Test
    void enviarNotificacion_conEstrategiaSMS_noLanzaExcepcion() {
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();
        servicio.setEstrategia(new EnvioSMS());
        assertDoesNotThrow(() -> servicio.enviarNotificacion("3001234567", "Tu codigo es 1234"));
    }

    // --- Strategy: Push ---
    @Test
    void enviarNotificacion_conEstrategiaPush_noLanzaExcepcion() {
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();
        servicio.setEstrategia(new EnvioPush());
        assertDoesNotThrow(() -> servicio.enviarNotificacion("dispositivo-abc", "Tienes un mensaje nuevo"));
    }

    // --- Strategy: cambio dinamico ---
    @Test
    void setEstrategia_permitecambiarCanalEnTiempoDeEjecucion() {
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();

        servicio.setEstrategia(new EnvioEmail());
        assertDoesNotThrow(() -> servicio.enviarNotificacion("user@mail.com", "Hola"));

        servicio.setEstrategia(new EnvioSMS());
        assertDoesNotThrow(() -> servicio.enviarNotificacion("3009876543", "Hola por SMS"));
    }

    // --- Sin estrategia ---
    @Test
    void enviarNotificacion_sinEstrategiaConfigurada_lanzaExcepcion() {
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();
        assertThrows(IllegalStateException.class,
                () -> servicio.enviarNotificacion("alguien", "mensaje"));
    }

    // --- Factory Method: Email ---
    @Test
    void fabricaEmail_creaEstrategiaDeEmail() {
        FabricaNotificacion fabrica = new FabricaEmail();
        EstrategiaEnvio estrategia = fabrica.crearEstrategia();
        assertInstanceOf(EnvioEmail.class, estrategia);
    }

    // --- Factory Method: SMS ---
    @Test
    void fabricaSMS_creaEstrategiaDeSMS() {
        FabricaNotificacion fabrica = new FabricaSMS();
        EstrategiaEnvio estrategia = fabrica.crearEstrategia();
        assertInstanceOf(EnvioSMS.class, estrategia);
    }

    // --- Factory Method: Push ---
    @Test
    void fabricaPush_creaEstrategiaDePush() {
        FabricaNotificacion fabrica = new FabricaPush();
        EstrategiaEnvio estrategia = fabrica.crearEstrategia();
        assertInstanceOf(EnvioPush.class, estrategia);
    }

    // --- Integracion: fabrica + singleton + strategy ---
    @Test
    void flujoCompleto_fabricaCreaEstrategiaYServicioEnvia() {
        FabricaNotificacion fabrica = new FabricaEmail();
        ServicioNotificaciones servicio = ServicioNotificaciones.getInstancia();
        servicio.setEstrategia(fabrica.crearEstrategia());
        assertDoesNotThrow(() -> servicio.enviarNotificacion("admin@dosw.com", "Sistema listo"));
    }
}
