public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(10, 20);
        Monitor monitor = new Monitor(resolution, "XF050", "acer");
        Dimension dimension = new Dimension(12, 12, 6);
        Case computerCase = new Case("T880-A", "Fractal", "EVGA", dimension);
        Motherboard motherboard = new Motherboard("Z-ff28", "Aorus", 4, 3, "UEFI" );
        PC pc = new PC(computerCase, motherboard, monitor);

        pc.description();
        System.out.println("-------------");
        pc.powerUp("Windows 10", 100, 100, "Blue");

    }
}
