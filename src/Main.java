public class Main {
    public static void main(String[] args) {

        Notification sms = new Notification("John", "Jane", "Happy New Year!") {
            @Override
            public void send() {
                System.out.println("Sending SMS: " + getMessageText());
            }

            @Override
            public void receive() {
                System.out.println("Receiving SMS: " + getMessageText());
            }
        };

        sms.send();
        sms.receive();


        Computer computer = new Computer("USA", "Dell", 1200.0, true);


        Computer.Monitor monitor = computer.new Monitor(24.0, "1920x1080", 60);
        Computer.Motherboard motherboard = computer.new Motherboard(4, "DDR4", 2400.0);

        monitor.printInfo();
        motherboard.printInfo();
        Library library = new Library(1, "Central Library");
        library.printInfo();


        Library.Book book = library.new Book(101, "Java Programming");
        book.printInfo();
        University university = new University("Tech University", true, 6);
        university.printInfo();


        University.Student student = university.new Student("John", "Doe", 20, "ID12345", 8.5, 2);
        student.printInfo();
        Car[] cars = new Car[2];
        cars[0] = new Car("Toyota", "Corolla", "XYZ123");
        cars[1] = new Car("BMW", "X5", "ABC456");


        Car.Engine engine1 = cars[0].new Engine("Gasoline", 4, 500000);
        Car.Engine engine2 = cars[1].new Engine("Diesel", 6, 700000);


        Car.Engine maxMileageEngine = engine1.getMileage() > engine2.getMileage() ? engine1 : engine2;
        System.out.println("Car with the highest mileage:");
        maxMileageEngine.printInfo();
    }
}



