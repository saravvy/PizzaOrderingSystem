package pizza;

public class PizzaFactory {
    // TODO: implement createPizza(String type)

    public static Pizza create(String type) {
        return switch (type) {
            case "1" -> new MargheritaPizza();
            case "2"   -> new VeggiePizza();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
