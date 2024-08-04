package in.anilbarnwal.lld1minejuly22.lld2.observer.subscribers;

public class SmsService implements Subscriber{
    @Override
    public void update() {
        System.out.println("SMS service is up");
    }
}
