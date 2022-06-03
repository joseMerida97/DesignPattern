package observer;

public class NotifyEmail implements IListener{
    @Override
    public void notify(User event) {
        System.out.println("Email captured " + event.getEmail());
        System.out.println("Sending notification to Web master");
    }
}
