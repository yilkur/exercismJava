public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceDriven = 0;
    private int numberOfVictories;

    public void drive() {
        distanceDriven += 10;
    }

    public int getDistanceTravelled() {
        return distanceDriven;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
    }
}
