package edu.dosw.bitacora.Semana3.ChainResponsability;

// Verifica que el viajero no tenga antecedentes penales
public class VerificacionAntecedentes extends EscalonMigratorioBase {

    @Override
    public void procesar(SolicitudIngreso solicitud) {
        if (!solicitud.isAntecedentesLimpios()) {
            System.out.println("Antecedentes penales detectados. Ingreso denegado.");
            solicitud.setAprobado(false);
            return;
        }

        System.out.println("Antecedentes limpios. Continuando...");

        if (siguiente != null) {
            siguiente.procesar(solicitud);
        }
    }
}