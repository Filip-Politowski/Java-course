package OOP8;

public class RoadsterBuilder {



    RoadsterBuilder() {

    }

    public Roadster BuildRoadster(float topSpeed,float acceleration,float crazyTopSpeed,float crazyAcceleration){
        return new Roadster(topSpeed,acceleration,crazyTopSpeed,crazyAcceleration);
    }

    }

