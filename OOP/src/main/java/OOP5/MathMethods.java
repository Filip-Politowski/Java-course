package OOP5;


public class MathMethods {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public CircleObject getNewCircleObject(float radius) {
        return new CircleObject(radius);
    }

    public float circleArea(float radius) {
        return 3.14f * (radius * radius);
    }


}