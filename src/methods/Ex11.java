package methods;

public class Ex11 {

    //Defineste o metoda cu numele "createNotification", care sa accepte ca si parametri
    // mesajul notificarii, cine a trimis notificarea, si cine va primi notificare.
    //Metoda ar trebui sa returneze textul notificarii.\
    //\
    //Defineste o metoda cu numele sendNotificationText, care sa accepte ca si parametri
    // mesajul notificarii, cine a trimis notificarea, si cine va primi notificare.
    //Metoda ar trebui sa creeze notificarea in functie de parametri, apoi sa afiseze la consola:
    // "notificarea a fost trimisa prin mesaj", urmat de textul notificarii.\
    //\
    //Defineste o metoda cu numele sendNotificationEmail, care sa accepte ca si parametri
    // mesajul notificarii, cine a trimis notificarea, si cine va primi notificare.
    //Metoda ar trebui sa creeze notificarea in functie de parametri, apoi sa afiseze la consola:
    // "notificarea a fost trimisa prin e-mail", urmat de textul notificarii.\
    //\
    //Apeleaza apoi metodele sendNotificationText si sendNotificationEmail din metoda main.
    //Atunci cand le apelezi, paseaza-le ca parametri niste valori citite de la tastatura
    // (mesajele notificarilor, cine le primeste si cine le trimite).

    public static void main(String[] args) {
        //input
        String message = "ai primit un linke";
        String recepient ="Nadrei";
        String sender ="Maria";
        sendNotificationEmail(message,recepient, sender);
        sendNotificationText(message,recepient, sender);
    }

    public static void sendNotificationEmail(String message, String recepient, String sender){
        //algoritmul de trimitere e unui Email
        //creez notificarea
        //trimit prin email

        String notificationMessage =createNotification(message, recepient,sender);
        System.out.println("notificarea a fost trimisa prin mail:" + notificationMessage);
    }

    public static void sendNotificationText(String message, String recepient, String sender){
        //algoritmul de tirmitere a unui sms cu notificarea
        String notificationMessage = createNotification(message, recepient, sender);
        System.out.println("notificarea a fost trimisa prin SMS:" + notificationMessage);
    }

    public static String createNotification (String message, String recepient, String sender){
        String notificationMessage =recepient + " ai primit mesaj de la "+  sender+": "+message;
        return notificationMessage;
    }
}
