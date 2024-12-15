public class Mushroom extends ToppingDirector{

    BasePizza basePizza;
    public Mushroom(BasePizza basePizza) {
        super();
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
    
}
