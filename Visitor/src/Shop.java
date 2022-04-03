public class Shop implements Inturance{
    private int inturanceRate;

    public Shop(int inturanceRate) {
        this.inturanceRate = inturanceRate;
    }

    public int getInturanceRate() {
        return inturanceRate;
    }

    @Override
    public int accept(InturanceVisitor visitor) {
        return visitor.visit(this);
    }
}
