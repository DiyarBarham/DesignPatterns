public class Computer implements ComputerPlan{

    private String CPU;
    private String RAM;
    private String GPU;
    private String motherBoard;
    private String powerSupply;
    private String monitor;
    private String keyBoard;
    private String mouse;

    @Override
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}
