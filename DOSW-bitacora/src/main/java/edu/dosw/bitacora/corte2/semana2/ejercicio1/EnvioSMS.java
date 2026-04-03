package edu.dosw.bitacora.corte2.semana2.ejercicio1;

public class EnvioSMS implements EstrategiaEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[SMS] Para: " + destinatario + " | Mensaje: " + mensaje);
    }
}
