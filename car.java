class Car {
    public String car_color;
    public String car_brand;
    public String fuel_type;
    public int mileage;

    // Constructor
    Car(String car_color, String car_brand, String fuel_type, int mileage) {
        this.car_color = car_color;
        this.car_brand = car_brand;
        this.fuel_type = fuel_type;
        this.mileage = mileage;
        System.out.println("Welcome to car garage");
        System.out.println("");
    }

    // Method to start the car
    public void start() {
        System.out.println("Start!!");
    }

    // Method to service the car
    public void service() {
        System.out.println("Your car is at our service.");
        System.out.println("Car color: " + car_color);
        System.out.println("Fuel type: " + fuel_type);
        System.out.println("Mileage: " + mileage);
    }

    // Method to stop the car
    public void stop() {
        System.out.println("Stop");
        System.out.println("");
    }

    public static void main(String[] args) {
        // Create car objects
        Car car1 = new Car("Red", "Maruti", "Diesel", 20);
        car1.start();
        car1.service();
        car1.stop();

        Car car2 = new Car("Black", "Mercedes", "Diesel", 40);
        car2.start();
        car2.service();
        car2.stop();

        Car car3 = new Car("White", "Mahindra", "Diesel", 30);
        car3.start();
        car3.service();
        car3.stop();
    }
}
