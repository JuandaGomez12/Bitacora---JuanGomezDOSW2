package edu.dosw.bitacora.Semana3.ChainResponsability;

// Verifica que el pasaporte del viajero sea válido
public class VerificacionPasaporte extends EscalonMigratorioBase {

    @Override
    public void procesar(SolicitudIngreso solicitud) {
        if (!solicitud.isPasaporteValido()) {
            System.out.println("Pasaporte inválido. Ingreso denegado.");
            solicitud.setAprobado(false);
            return;
        }

        System.out.println("✓ Pasaporte válido. Continuando...");

        if (siguiente != null) {
            siguiente.procesar(solicitud);
        }
    }
}