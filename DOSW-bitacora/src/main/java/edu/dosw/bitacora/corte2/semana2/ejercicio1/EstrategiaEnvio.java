package edu.dosw.bitacora.corte2.semana2.ejercicio1;

// Strategy: define el contrato que todas las estrategias de envio deben cumplir
public interface EstrategiaEnvio {
    void enviar(String destinatario, String mensaje);
}
