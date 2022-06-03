package observer;

public class PinterestProfile implements IListener{
    @Override
    public void notify(User event) {
        System.out.println("Pinterest image captured " + event.getUrlPhoto());
    }
}
