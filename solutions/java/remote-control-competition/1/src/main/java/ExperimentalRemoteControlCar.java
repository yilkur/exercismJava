public class ExperimentalRemoteControlCar implements RemoteControlCar, Cloneable  {
    private int distanceDriven = 0;

    public void drive() {
        distanceDriven += 20;
    }

    public int getDistanceTravelled() {
        return distanceDriven;
    }
}
