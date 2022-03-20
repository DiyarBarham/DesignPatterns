public class ComputerEngineer {
    private ComputerBuilder computerBuilder;

    public ComputerEngineer(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return this.computerBuilder.getComputer();
    }

    public void buildComputer(){
        this.computerBuilder.buildCPU();
        this.computerBuilder.buildGPU();
        this.computerBuilder.buildMotherBoard();
        this.computerBuilder.buildRAM();
        this.computerBuilder.buildPowerSupply();
        this.computerBuilder.buildMonitor();
        this.computerBuilder.buildKeyboard();
        this.computerBuilder.buildMouse();
    }
}
