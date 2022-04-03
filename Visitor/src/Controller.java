public class Controller {
    public static void main(String[] args){
        Inturance houseInturance = new House(3);
        Inturance companyInturance = new Company(3);
        Inturance shopInturance = new Shop(3);
        InturanceVisitor visitor = new InturanceVisitorImp();
        houseInturance.accept(visitor);
        companyInturance.accept(visitor);
        shopInturance.accept(visitor);

    }
}
