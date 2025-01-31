public class Car {
    public String brand;
    public String model;
    public int year;
    private double fuelLevel;
    private double mileage; // Total kilometers driven


    public Car(String brand, String model, int year,double fuelLevel,double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public String isOld() {
        int currentYear = java.time.Year.now().getValue();
        if ((currentYear - year) > 10) {
            return "The car is old";
        } else {
            return "The car is new";
        }
    }

    public void refuel(double amount) {
        if (amount > 0 && amount <= (100-fuelLevel)) {
            fuelLevel += amount;
            System.out.println("Refueled. Current fuel level: " + fuelLevel);
        } else {
            System.out.println("Invalid fuel amount!");
        }
    }

    public void checkMileage() {
        System.out.println("Total mileage: " + mileage + " km.");
    }


    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Corolla", 2010,40,152845.6);
        System.out.println("Car 1 - "+myCar1.brand +" "+myCar1.model+":");
        System.out.println(myCar1.isOld());
        myCar1.refuel(30);
        myCar1.checkMileage();

        System.out.println(" ");

        Car myCar2 = new Car("Nissan", "Pathfinder", 2021,65,22564);
        System.out.println("Car 2 - "+myCar2.brand +" "+myCar2.model+":");
        System.out.println(myCar2.isOld());
        myCar2.refuel(35);
        myCar2.checkMileage();
    }
}
