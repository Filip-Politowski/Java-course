package OOP10;

public class Main {
    public static void main(String[] args) {
        PointWithConstants point = new PointWithConstants(33, 44);
        point.changePosition(20,20);
        System.out.println("x: " + point.x + " y: " + point.y);


    }
}
