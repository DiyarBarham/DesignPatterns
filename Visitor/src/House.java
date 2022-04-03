public class House implements Inturance{
    private int inturanceRate;

    public House(int inturanceRate) {
        this.inturanceRate = inturanceRate*2;
    }

    public int getInturanceRate() {
        return inturanceRate;
    }

    @Override
    public int accept(InturanceVisitor visitor) {
        return visitor.visit(this);
    }
}
