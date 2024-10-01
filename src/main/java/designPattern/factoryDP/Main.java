package designPattern.factoryDP;

public class Main {
    public static void main(String[] args) {

        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.sendMessage("Hello from sms");

        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.sendMessage("Hello from email");
    }
}

