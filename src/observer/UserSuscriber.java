package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserSuscriber implements IUser{

    private HashMap<EventName, List<IListener>> subscribers = new HashMap<>();

    public UserSuscriber(EventName... operations) {
        for (EventName operation : operations){
            this.subscribers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(IListener susbcribe, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.add(susbcribe);
    }

    public void unsubscribe(IListener susbcribe, EventName eventName){
        List<IListener> currentList = subscribers.get(eventName);
        currentList.remove(susbcribe);
    }

    @Override
    public void register(User user){
        System.out.println(user.getName() + " was register");
        this.trigger(EventName.REGISTER, user);
    }

    private void trigger(EventName eventName, User event){
        List<IListener> currentList = subscribers.get(eventName);
        for (IListener listener : currentList){
            listener.notify(event);
        }
    }
}
