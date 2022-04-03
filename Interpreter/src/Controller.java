public class Controller {
    public static void main(String[] args){
        Expression ali = new TerminalExpression("Ali");
        Expression married = new TerminalExpression("Married");

        System.out.println("Is Ali married? "+ new AndExpression(ali,married).interpret("Ali Married"));
    }
}
