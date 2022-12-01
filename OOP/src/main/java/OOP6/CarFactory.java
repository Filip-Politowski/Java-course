package OOP6;

public class CarFactory {
    CarFactory() {
    }

    public Car buildCar() {
        String colors[] = {"Yellow", "Green", "White"};
        int randomColorIndex;
        randomColorIndex = (int) Math.floor(Math.random() * colors.length);
        String randColor = colors[randomColorIndex];


        return new Car("Mustang", "Ford", randColor);
    }

}
