package designPattern.factoryDP;

public class EmailNotificationImpl implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("email notification...!" + message);
    }
}
