package com.AlcoM0312;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        INTERFAZ a = new INTERFAZ();
        a.formulario();

/*
        String remitente = "1930256@upv.edu.mx";
        String clave = "tuberculosis.";
        String destino = "1930248@upv.edu.mx";
        ArrayList<String> destinatarios = new ArrayList<>();
        destinatarios.add("1930345@upv.edu.mx");
        destinatarios.add("1930167@upv.edu.mx");
        destinatarios.add("1930536@upv.edu.mx");

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", clave);

        Session session = Session.getDefaultInstance(props);
        MimeMessage mensaje = new MimeMessage(session);

        try{
            for(int i=0; i<destinatarios.size(); i++) {
                mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatarios.get(i)));
            }
            mensaje.setSubject("Prueba destinatarios");
            BodyPart parte_Tex = new MimeBodyPart();
            parte_Tex.setContent("<b>HOLA GUAPOS<b> <br> Ando calando los multiples destinatarios" , "text/html");
            BodyPart parte_File = new MimeBodyPart();
            parte_File.setDataHandler(new DataHandler(new FileDataSource("/home/arturo/Descargas/IMAGEN.jpeg")));
            parte_File.setFileName("Imagen.jpeg");
            MimeMultipart todas = new MimeMultipart();
            todas.addBodyPart(parte_Tex);
            todas.addBodyPart(parte_File);
            mensaje.setContent(todas);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, clave);
            transport.sendMessage(mensaje, mensaje.getAllRecipients());
            transport.close();
            System.out.println("Se envio el mensjae...\n\n\n\n ??o no?");
        }catch(Exception e){
            e.printStackTrace();
        }

 */


    }
}
