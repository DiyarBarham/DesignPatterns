public class Company implements Inturance{
    private int inturanceRate;

    public Company(int inturanceRate) {
        this.inturanceRate = inturanceRate*3;
    }

    public int getInturanceRate() {
        return inturanceRate;
    }

    @Override
    public int accept(InturanceVisitor visitor) {
        return visitor.visit(this);
    }
}
