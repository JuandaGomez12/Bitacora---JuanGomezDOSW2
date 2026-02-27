package edu.dosw.bitacora.Semana2.patrones.FactoryMethod;

public class Main {
    public static void main(String[] args) {

        // Despachar notificación por correo
        FabricaNotificacion fabricaCorreo = new FabricaCorreo();
        fabricaCorreo.despacharNotificacion();

        // Despachar notificación por SMS
        FabricaNotificacion fabricaSMS = new FabricaSMS();
        fabricaSMS.despacharNotificacion();

        // Despachar notificación push
        FabricaNotificacion fabricaPush = new FabricaPush();
        fabricaPush.despacharNotificacion();
    }
}