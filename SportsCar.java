class Vehicle {
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }
    public void honk() {
        System.out.println("Vehicle is honking.");
    }
}
class Car extends Vehicle {
    private int doors;
    public Car(String color, int doors) {
        super(color); // Calls Vehicle's constructor
        this.doors = doors;
    }
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
class SportsCar extends Car {
    private int horsepower;
    public SportsCar(String color, int doors, int horsepower) {
        super(color, doors); 
        this.horsepower = horsepower;
    }
    public void turboBoost() {
        System.out.println("SportsCar is turbo boosting.");
    }
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar("Red", 2, 500);
        mySportsCar.honk();
        mySportsCar.accelerate();
        mySportsCar.turboBoost();
    }
}
