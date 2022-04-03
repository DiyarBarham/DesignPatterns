public class InturanceVisitorImp implements InturanceVisitor{
    @Override
    public int visit(House house) {
        System.out.println("Inturance rate for houses is: "+house.getInturanceRate());
        return house.getInturanceRate();
    }

    @Override
    public int visit(Company company) {
        System.out.println("Inturance rate for companies is: "+company.getInturanceRate());
        return company.getInturanceRate();
    }

    @Override
    public int visit(Shop shop) {
        System.out.println("Inturance rate for shops is: "+shop.getInturanceRate());
        return shop.getInturanceRate();
    }
}
