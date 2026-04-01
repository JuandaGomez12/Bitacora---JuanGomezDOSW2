package edu.dosw.bitacora.Semana3.ChainResponsability;

// Último eslabón: aprueba el ingreso si todos los controles pasaron
public class AprobacionFinal extends EscalonMigratorioBase {

    @Override
    public void procesar(SolicitudIngreso solicitud) {
        System.out.println("Todos los controles superados.");
        System.out.println("INGRESO APROBADO. ¡Bienvenido!");
        solicitud.setAprobado(true);
    }
}