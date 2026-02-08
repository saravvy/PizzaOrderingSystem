package pizza;

public class Pickup implements DeliveryStrategy {
    @Override
    public void deliver(Pizza pizza) {

        System.out.println("Delivery typ: Pickup");
    }
    // TODO: implement deliver(Pizza pizza)
}
