package edu.dosw.bitacora.Semana3.ChainResponsability;

// Interfaz para cada eslabón de la cadena de control migratorio
public interface EscalonMigratorio {

    void definirSiguiente(EscalonMigratorio siguiente);

    void procesar(SolicitudIngreso solicitud);
}