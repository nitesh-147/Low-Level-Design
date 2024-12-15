public class ExtraCheese extends BasePizza {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        super();
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 25;
    }
}
