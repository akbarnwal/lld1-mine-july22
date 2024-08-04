package in.anilbarnwal.lld1minejuly22.lld2.observer.subscribers;

public class EmailService implements Subscriber{
    @Override
    public void update() {
        System.out.println("Email service updated");
    }
}
