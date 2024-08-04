package in.anilbarnwal.lld1minejuly22.lld2.observer;

import in.anilbarnwal.lld1minejuly22.lld2.observer.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements Publisher{
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Subscriber observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void orderPlaced(){
        notifyObservers();
    }
}
