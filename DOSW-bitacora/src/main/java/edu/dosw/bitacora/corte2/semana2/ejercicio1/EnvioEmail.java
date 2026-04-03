package edu.dosw.bitacora.corte2.semana2.ejercicio1;

public class EnvioEmail implements EstrategiaEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[EMAIL] Para: " + destinatario + " | Mensaje: " + mensaje);
    }
}
