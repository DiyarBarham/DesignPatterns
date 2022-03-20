public class Controller {
    public static void main(String[] args){
        ComputerBuilder expensive = new ExpensiveComputerBuilder();
        ComputerEngineer engineer = new ComputerEngineer(expensive);

        engineer.buildComputer();
        Computer computer = engineer.getComputer();
        System.out.println("The engineer Constructed: "+computer);
    }
}
