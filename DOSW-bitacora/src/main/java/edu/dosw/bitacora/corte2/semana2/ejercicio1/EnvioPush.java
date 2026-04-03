package edu.dosw.bitacora.corte2.semana2.ejercicio1;

public class EnvioPush implements EstrategiaEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[PUSH] Para: " + destinatario + " | Mensaje: " + mensaje);
    }
}
