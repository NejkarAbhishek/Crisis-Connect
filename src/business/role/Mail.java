package business.role;

import java.util.Arrays;
import java.util.List;
import javax.mail.*;
import javax.mail.internet.*;

import java.util.Properties;

public class Mail {

    public void sendEmailtoCitizens(String disasterType, String location, String severity) {
        
        final String fromEmail = "hrishikeshkulkarnius@gmail.com"; 
        final String password = "yyswrwolpfaihpqy";
        
//        List<String> recipientEmails = Arrays.asList(
//            "hrishikeshkulkarni153@gmail.com",
//            "wakulkaradvait@gmail.com"
//        );

        List<String> recipientEmails = CitizenDirectory.getRecipients();

        // SMTP Server details (Gmail in this case)
        String host = "smtp.gmail.com";
        String port = "587";

        // Set up properties for the session
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");  // Enable TLS

        // Create a session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create the email body with dynamic content
            String body = "Urgent: A disaster has occurred.\n\n" +
                          "Disaster Type: " + disasterType + "\n" +
                          "Location: " + location + "\n" +
                          "Severity: " + severity + "\n\n" +
                          "Please take necessary actions and stay safe.";

            // Loop through the list of recipients and send the email to each
            for (String toEmail : recipientEmails) {
                // Create a MimeMessage
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(fromEmail));  // Set sender's email
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail)); // Set recipient's email
                message.setSubject("Disaster Alert: " + disasterType);  // Set the subject

                // Set the body of the email
                message.setText(body);

                // Send the email
                Transport.send(message);
                System.out.println("Email sent to: " + toEmail);
            }

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
        
}
