package pizza;

public class VeggiePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Veggie pizza";
    }

    @Override
    public double getCost() {
        return 7.9;
    }
    // TODO: implement getDescription() and getCost()
}
