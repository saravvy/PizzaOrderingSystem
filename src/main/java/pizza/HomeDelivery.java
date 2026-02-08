package pizza;

public class HomeDelivery implements DeliveryStrategy {
    @Override
    public void deliver(Pizza pizza) {
        System.out.println("Delivery typ: Home");
    }
    // TODO: implement deliver(Pizza pizza)
}
