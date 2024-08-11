package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@RestController
public class PhoneController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/llamar/{numero_de_telefono}")
    public Map<String, String> llamar(@PathVariable("numero_de_telefono") String numeroDeTelefono) {
        Map<String, String> response = new HashMap<>();

        // Verificar si el número es un teléfono fijo
        if (!esTelefonoFijo(numeroDeTelefono)) {
            response.put("error", "El número no es un teléfono fijo.");
            return response;
        }

        // Obtener la provincia (esto es un ejemplo, reemplaza con tu lógica)
        String provincia = obtenerProvincia(numeroDeTelefono);

        // Obtener el emperador (esto es un ejemplo, reemplaza con tu lógica)
        String emperador = obtenerEmperador(provincia);

        // Preparar el cuerpo del correo
        String correo = "prácticasemperador+" + numeroDeTelefono + "@gmail.com";
        String cuerpoCorreo = String.format("{\"número\":\"%s\", \"provincia\":\"%s\", \"operador\":\"%s\"}", numeroDeTelefono, provincia, emperador);

        // Enviar el correo
        try {
            enviarCorreo(correo, "Información del número", cuerpoCorreo);
            response.put("status", "Correo enviado");
        } catch (MessagingException e) {
            response.put("error", "Error al enviar el correo");
        }

        response.put("número", numeroDeTelefono);
        response.put("provincia", provincia);
        response.put("operador", emperador);

        return response;
    }

    private boolean esTelefonoFijo(String numero) {
        Pattern pattern = Pattern.compile("^\\d{9}$");
        Matcher matcher = pattern.matcher(numero);
        return matcher.matches();
    }

    private String obtenerProvincia(String numeroDeTelefono) {
        // Implementa tu lógica para obtener la provincia basada en el número de teléfono
        return "ProvinciaEjemplo";
    }

    private String obtenerEmperador(String provincia) {
        // Implementa tu lógica para obtener el emperador basado en la provincia
        return "EmperadorEjemplo";
    }

    private void enviarCorreo(String to, String subject, String text) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text, true);
        mailSender.send(message);
    }
}