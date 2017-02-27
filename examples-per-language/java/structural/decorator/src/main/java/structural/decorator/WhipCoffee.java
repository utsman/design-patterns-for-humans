package structural.decorator;

public class WhipCoffee implements Coffee {

    private final Coffee coffee;

    public WhipCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public float getCost() {
        return coffee.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", whip";
    }
}
