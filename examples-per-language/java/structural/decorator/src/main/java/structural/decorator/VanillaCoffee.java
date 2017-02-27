package structural.decorator;

public class VanillaCoffee implements Coffee {

    private final Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public float getCost() {
        return coffee.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", vanilla";
    }
}
