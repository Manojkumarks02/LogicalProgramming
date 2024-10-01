package designPattern.factoryDP;

public class SmsNotificationImpl implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("sms notification...!"+ message);
    }
}
