class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int totalDistance;
    private int totalBattery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return totalBattery < batteryDrain;
    }

    public int distanceDriven() {
        return totalDistance;
    }

    public void drive() {
        if (totalBattery >= batteryDrain) {
            totalDistance += speed;
            totalBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        double drivesNeeded = (double) distance / car.getSpeed();
        double totalBatteryNeeded = drivesNeeded * car.getBatteryDrain();

        return 100 >= totalBatteryNeeded;
    }
}
