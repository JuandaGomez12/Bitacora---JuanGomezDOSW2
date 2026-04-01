package edu.dosw.bitacora.Semana3.ChainResponsability;

public class Main {

    public static void main(String[] args) {

        // Definir los eslabones de la cadena
        EscalonMigratorio controlPasaporte = new VerificacionPasaporte();
        EscalonMigratorio controlAntecedentes = new VerificacionAntecedentes();
        EscalonMigratorio controlMotivo = new VerificacionMotivoViaje();
        EscalonMigratorio aprobacion = new AprobacionFinal();

        // Encadenar los controles
        controlPasaporte.definirSiguiente(controlAntecedentes);
        controlAntecedentes.definirSiguiente(controlMotivo);
        controlMotivo.definirSiguiente(aprobacion);

        // Crear solicitud de ingreso
        SolicitudIngreso solicitud = new SolicitudIngreso(
                true,
                true,
                false
        );

        // Procesar la solicitud por la cadena
        System.out.println("=== Procesando solicitud de ingreso ===");
        controlPasaporte.procesar(solicitud);

        System.out.println("\n=== Resultado Final ===");
        System.out.println("Estado de aprobación: " + (solicitud.isAprobado() ? "APROBADO" : "RECHAZADO"));
    }
}