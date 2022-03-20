public class ExpensiveComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public ExpensiveComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("i7 12th generation.");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("64GB of RAM.");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("RTX3090.");
    }

    @Override
    public void buildMotherBoard() {
        computer.setMotherBoard("ASUS ROG Maximus z690 extreme glactical.");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("Corsair AX1600i");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("Samsung Odyssey.");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyBoard("K100 CORSAIR.");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("Logitech G502.");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
