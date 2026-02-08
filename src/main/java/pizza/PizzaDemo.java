package pizza;

import java.util.Scanner;

public class PizzaDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PizzaFactory factory = new PizzaFactory();
        DroneDelivery droneDelivery = new DroneDelivery();
        HomeDelivery homeDelivery = new HomeDelivery();
        Pickup pickup = new Pickup();

        //Pizza Margeritha = new CheeseTopping(new MargheritaPizza());
        //Pizza Veggie = new CheeseTopping(new PepperoniTopping(new VeggiePizza()));

        //System.out.println(Margeritha.getDescription() + " " + Margeritha.getCost());
        //System.out.println(Veggie.getDescription() + " " + Veggie.getCost());

        //Order hej = new Order(Veggie);
        //hej.setDeliveryStrategy(droneDelivery);
        //hej.processOrder();

        System.out.println("Chose pizza type:" +
                " 1. Margherita" +  " 2. Veggie");
           String type = scan.nextLine();
         Pizza pizza = factory.create(type);


          boolean toppings = true;
          while (toppings) {
              System.out.println("Add topings?");
              String answer = scan.nextLine();

              switch (answer) {
                  case "y":
                      System.out.println("Chose tooping:" + " 1. Cheese" + " 2. Pepperoni");
                      String topping = scan.nextLine();

                      switch (topping) {
                          case "1":
                              pizza = new CheeseTopping(pizza);
                              break;
                          case "2":
                              pizza = new PepperoniTopping(pizza);
                              break;
                      }
                      ;
                      break;
                  case "n": toppings = false ; break;
              } } Order hejhej = new Order(pizza);
              System.out.println("Select deliverytype:" +
                      "1.Drone" +
                      " 2.Home" +
                      " 3.Pickup");
              String delivery = scan.nextLine();
              switch (delivery) {
                  case "1": hejhej.setDeliveryStrategy(droneDelivery);
                  break;
                  case "2": hejhej.setDeliveryStrategy(homeDelivery); break;
                  case "3": hejhej.setDeliveryStrategy(pickup);

              }
        hejhej.processOrder();
              }

          }

        // TODO: Create a pizza using the factory
        // TODO: Add some toppings (decorators)
        // TODO: Place an order with a delivery strategy

