public class CookChicken implements Order{
    private Cook cook;

    public CookChicken(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.chickenSteak();
    }
}
