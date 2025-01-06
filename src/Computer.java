public class Computer {
    private String countryOfOrigin;
    private String brand;
    private double price;
    private boolean hasWarranty;


    public Computer(String countryOfOrigin, String brand, double price, boolean hasWarranty) {
        this.countryOfOrigin = countryOfOrigin;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
    }


    public class Monitor {
        private double diagonal;
        private String resolution;
        private int hertz;

        public Monitor(double diagonal, String resolution, int hertz) {
            this.diagonal = diagonal;
            this.resolution = resolution;
            this.hertz = hertz;
        }


        public void printInfo() {
            System.out.println("Monitor - Diagonal: " + diagonal + " inches");
            System.out.println("Resolution: " + resolution);
            System.out.println("Hertz: " + hertz);
        }
    }


    public class Motherboard {
        private int ramSlots;
        private String ramType;
        private double fsbSpeed;


        public Motherboard(int ramSlots, String ramType, double fsbSpeed) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }


        public void printInfo() {
            System.out.println("Motherboard - RAM Slots: " + ramSlots);
            System.out.println("RAM Type: " + ramType);
            System.out.println("FSB Speed: " + fsbSpeed + " MHz");
        }
    }
}


