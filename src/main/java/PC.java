public class PC {
    private Case computerCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Case getComputerCase() {
        return computerCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public PC(Case computerCase, Motherboard motherboard, Monitor monitor) {
        this.computerCase = computerCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo(int x, int y, String color){
        this.monitor.drawPixel(x, y, color);
    }

    public void description(){
        System.out.println("Welcome to Worst Buy, below is the description of the PC on sale today ....");
        System.out.println(this.toString());
    }

    public void powerUp(String program, int x, int y, String color){
        this.computerCase.pressPowerButton();
        drawLogo(x, y, color);
        this.motherboard.loadProgram(program);
    }


    @Override
    public String toString() {
        return "PC{\n" +
                "computerCase=" + computerCase.toString() +
                "\n\nmotherboard=" + motherboard.toString() +
                "\n\nmonitor=" + monitor.toString() +
                "\n}";
    }
}




