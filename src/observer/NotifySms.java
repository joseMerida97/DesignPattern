package observer;

public class NotifySms implements IListener{
    @Override
    public void notify(User event) {
        System.out.println("Sending greeting sms to " + event.getPhone());
    }
}
