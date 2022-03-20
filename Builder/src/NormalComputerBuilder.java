public class NormalComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public NormalComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("i7 10th generation.");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB of RAM.");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("RTX2060.");
    }

    @Override
    public void buildMotherBoard() {
        computer.setMotherBoard("ASUS ROG Crosshair VII.");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("Pystar 1000W.");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("Gigabyte G27F.");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyBoard("Lenovo 510.");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("Logitech M235.");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
