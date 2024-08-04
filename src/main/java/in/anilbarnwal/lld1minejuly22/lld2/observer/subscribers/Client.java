package in.anilbarnwal.lld1minejuly22.lld2.observer.subscribers;

import in.anilbarnwal.lld1minejuly22.lld2.observer.Amazon;

public class Client {
    public static void main(String[] args) {
        demoObserverPattern();
    }

    private static void demoObserverPattern() {
        Subscriber emailService = new EmailService();
        Subscriber smsService = new SmsService();
        Subscriber inventoryService = new InventoryService();
        Subscriber logisticsService = new LogisticsService();

        Amazon amazon = new Amazon();
        //Subsribe
        amazon.subscribe(emailService);
        amazon.subscribe(smsService);
        amazon.subscribe(inventoryService);

        //Unsubscribe
        amazon.unsubscribe(emailService);

        //Subscribe
        amazon.subscribe(logisticsService);

        amazon.orderPlaced();


    }
}
