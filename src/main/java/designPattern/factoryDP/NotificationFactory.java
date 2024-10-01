package designPattern.factoryDP;

public class NotificationFactory{
    public static Notification createNotification(String input){
        if(input.equals("email")){
            return new EmailNotificationImpl();
        } else if (input.equals("sms")) {
            return new SmsNotificationImpl();
        }
        return null;
    }
}
