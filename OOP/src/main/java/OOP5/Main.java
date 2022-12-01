package OOP5;

public class Main {
    public static void main(String[] args) {

        MathMethods math = new MathMethods();
        int a = 12;
        int b = 3;
        int subtraction = math.subtract(a,b);
        int addition = math.add(a,b);

        //System.out.println("Subtraction = " + subtraction);
        //System.out.println("Addition = " + addition);

        CircleObject circle = math.getNewCircleObject(10.f);
        CircleObject circle2 = math.getNewCircleObject(20.0f);

       float poleKola = math.circleArea(circle.radius);
       float poleKola2 = math.circleArea(circle2.radius);

        System.out.println(poleKola + "\n" + poleKola2);

    }
    }

