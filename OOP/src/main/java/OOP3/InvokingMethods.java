package OOP3;

class Triangle {
    float a;//dłuośc podstawy trójkąta
    float h;//wysokość trójkąta
    float surfaceArea;// pole powierzchni

    Triangle(float base, float high) {
        a = base;
        h = high;
    }

    public void surfaceArea() {
        surfaceArea = (a * h) / 2;
        System.out.println("Pole powierzchni trójkąta wynosi: " + surfaceArea);
    }

}

class MyMath {

    public void add(int a, int b) {

        int result = a + b;
        System.out.println("result: " + result);
    }

}

public class InvokingMethods {
    public static void main(String[] args) {

        MyMath math = new MyMath();
        int a = 10;
        int b = 7;

        math.add(a, b);

        Triangle triangle = new Triangle(10.f, 5.0f);
        triangle.surfaceArea();

    }
}
