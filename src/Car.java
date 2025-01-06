public class Car {
    private String manufacturer;
    private String model;
    private String licensePlate;


    public Car(String manufacturer, String model, String licensePlate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
    }


    public class Engine {
        private String fuelType;
        private int cylinderCount;
        private int mileage;


        public Engine(String fuelType, int cylinderCount, int mileage) {
            this.fuelType = fuelType;
            this.cylinderCount = cylinderCount;
            this.mileage = mileage;
        }


        public void printInfo() {
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Cylinder Count: " + cylinderCount);
            System.out.println("Mileage: " + mileage + " km");
        }

        public int getMileage() {
            return mileage;
        }
    }


    }
