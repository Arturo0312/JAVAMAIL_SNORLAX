package com.AlcoM0312;

import java.util.Scanner;

public class INTERFAZ {
    private String remitente="", clave="", destino="", asunto = "", contenido = "",
            fileRoute = "", fileName = "";
    public void formulario(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Sistema de envio de correos UPV");
        System.out.println("Ingrese su correo");
        remitente = leer.nextLine();
        System.out.println("Ingrese la contraseña de su cuenta");
        clave=leer.nextLine();
        System.out.println("Ingrese el correo de destino");
        destino=leer.nextLine();
        System.out.println("Ingrese el asunto del correo");
        asunto=leer.nextLine();
        System.out.println("Ingrese el cuerpo del correo");
        contenido=leer.nextLine();
        MENSAJERO a = new MENSAJERO(remitente,clave,destino,asunto,contenido,fileName,fileRoute);
        a.Enviar();

    }
}
