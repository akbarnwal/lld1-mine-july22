package in.anilbarnwal.lld1minejuly22.lld2.observer;


import in.anilbarnwal.lld1minejuly22.lld2.observer.subscribers.Subscriber;

public interface Publisher {
    void subscribe(Subscriber observer);
    void unsubscribe(Subscriber observer);
    void notifyObservers();
}
