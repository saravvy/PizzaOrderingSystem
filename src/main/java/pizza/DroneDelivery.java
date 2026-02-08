package pizza;

public class DroneDelivery implements DeliveryStrategy {
    @Override
    public void deliver(Pizza pizza) {
        System.out.println("Delivery typ: Drone");
    }
    // TODO: implement deliver(Pizza pizza)
}
