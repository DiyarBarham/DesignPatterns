public interface InturanceVisitor {
    int visit(House house);
    int visit(Company company);
    int visit(Shop shop);
}
