import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("piotr.mierniczak", "Programista75"));
        email.setSSLOnConnect(true);
        email.setFrom("piotr.mierniczak@interia.pl");
        email.setSubject("Test77");
        email.setMsg("Witam, robię super kurs programowania!");
        email.addTo("piotr.mierniczak.ami@gmail.com");
        System.out.println("Rozpoczęto wysyłanie wiadomości email");
        email.send();
        System.out.println("Wiadomość wysłana");
    }
}
