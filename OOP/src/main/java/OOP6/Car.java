package OOP6;

public class Car {

    String model;
    String brand;
    String color;
    String yearOfProduction = "Unknown";

    Car(String carModel, String carBrand, String carColor) {
        model = carModel;
        brand = carBrand;
        color = carColor;
    }

    public String getColor() {
        return this.color;
    }

    public void printInfo() {
        System.out.println("Model samochodu: " + model +
                "\nMarka samochodu: " + brand +
                "\nKolor samochodu: " + color +
                "\nRok produkcji samochodu: " + yearOfProduction);
    }

    public String changeColor(String newColor) {
        this.color = newColor;
        return newColor;
    }


}
