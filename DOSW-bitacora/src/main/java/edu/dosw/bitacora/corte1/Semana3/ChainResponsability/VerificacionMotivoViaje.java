package edu.dosw.bitacora.Semana3.ChainResponsability;

// Verifica que el motivo de viaje declarado sea válido
public class VerificacionMotivoViaje extends EscalonMigratorioBase {

    @Override
    public void procesar(SolicitudIngreso solicitud) {
        if (!solicitud.isMotivoValido()) {
            System.out.println("Motivo de viaje no válido. Ingreso denegado.");
            solicitud.setAprobado(false);
            return;
        }

        System.out.println("✓ Motivo de viaje válido. Continuando...");

        if (siguiente != null) {
            siguiente.procesar(solicitud);
        }
    }
}