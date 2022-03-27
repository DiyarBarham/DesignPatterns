public class CookMeat implements Order{
    private Cook cook;

    public CookMeat(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.meatSteak();
    }
}
