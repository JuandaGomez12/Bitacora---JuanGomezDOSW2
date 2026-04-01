package edu.dosw.bitacora.Semana3.ChainResponsability;

// Clase abstracta base que gestiona el encadenamiento entre eslabones
public abstract class EscalonMigratorioBase implements EscalonMigratorio {

    protected EscalonMigratorio siguiente;

    @Override
    public void definirSiguiente(EscalonMigratorio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public abstract void procesar(SolicitudIngreso solicitud);
}