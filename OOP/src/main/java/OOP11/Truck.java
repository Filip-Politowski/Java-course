package OOP11;

public class Truck {

    String producer;
    String model;
    String color;
    int numberOfWheels;
    final float topSpeed = 100.0f;
    final float acceleration;

    Truck() {
        this.producer = "Freightliner";
        this.model = "9664";
        this.numberOfWheels = 6;
        this.acceleration = 60.0f;
    }
    Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Producent: " + this.producer + "\nmodel: " + model + "\nkolor: " + this.color);
    }


}