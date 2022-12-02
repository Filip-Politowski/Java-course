package OOP12;

public class Main {
    public static void main(String[] args) {
        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();
        StaticExample staticTest = new StaticExample();


        System.out.println("Plane1.id: " + plane1.id);
        System.out.println("Plane2.id: " + plane2.id);
        System.out.println("Plane3.id: " + plane3.id);
        System.out.println(PlaneWithStatic.nextId);
        PlaneWithStatic.getNextId();
        System.out.println(PlaneWithStatic.nextId);

        System.out.println(StaticExample.add(20,30));// moge sie odwołać po klasie ponieważ metoda jest statyczna
        System.out.println(staticTest.sub(30,15)); // musze stworzyć obiekt danej klasy a następnie odowałć sie do metody za pomoca stworzonego obiektu


    }
}
