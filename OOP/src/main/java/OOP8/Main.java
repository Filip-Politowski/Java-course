package OOP8;

public class Main {
    public static void main(String[] args) {

        RoadsterBuilder RoadsterBuilder = new RoadsterBuilder();
        Roadster roadster1 = RoadsterBuilder.BuildRoadster(200.0f, 10.0f, 253.4f, 15.0f);
        Roadster roadster2 = RoadsterBuilder.BuildRoadster(250.0f, 15.0f, 290.2f, 18.9f);
        roadster2.getTopSpeed(true);
        Roadster roadster3 = new Roadster(250.1f, 15.0f);

        System.out.println(roadster1.getTopSpeed(roadster1.crazyMode));
        System.out.println(roadster2.getTopSpeed(roadster2.crazyMode));
        System.out.println(roadster3.getTopSpeed(roadster3.crazyMode) + "Przyspieszenie: " + roadster3.getAcceleration(roadster3.crazyMode));
    }
}
