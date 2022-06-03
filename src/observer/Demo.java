package observer;

public class Demo {
    public static void main(String[] args) {
        User user = new User("Jose", "example@gmail.com", "https://www.pinterest.es/pin/12/", "60019665");
        IListener notifyEmail = new NotifyEmail();
        IListener notifySms = new NotifySms();
        IListener notifyPinterest = new PinterestProfile();

        UserSuscriber userSuscriber = new UserSuscriber(EventName.REGISTER);
        userSuscriber.subscribe(notifyEmail, EventName.REGISTER);
        userSuscriber.subscribe(notifySms, EventName.REGISTER);
        userSuscriber.subscribe(notifyPinterest,EventName.REGISTER);

        userSuscriber.register(user);
    }
}
