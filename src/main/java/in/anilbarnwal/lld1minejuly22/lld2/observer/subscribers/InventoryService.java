package in.anilbarnwal.lld1minejuly22.lld2.observer.subscribers;

public class InventoryService implements Subscriber{
    @Override
    public void update() {
        System.out.println("Inventory service update");
    }
}
