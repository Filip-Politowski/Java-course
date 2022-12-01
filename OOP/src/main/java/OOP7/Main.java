package OOP7;

//Overloading


public class Main {
    public static void main(String[] args) {

        MathOverloading math = new MathOverloading();
        System.out.println(math.add(5.0f, 6.0f));

        RectangleOverLoading rect = new RectangleOverLoading();
        System.out.println("rect.side1: " + rect.side1);
        RectangleOverLoading rect2 = new RectangleOverLoading(10.f);
        System.out.println("rect2.side1: " + rect2.side1);

        System.out.println(math.add(rect.side1, rect.side2));
    }
}
