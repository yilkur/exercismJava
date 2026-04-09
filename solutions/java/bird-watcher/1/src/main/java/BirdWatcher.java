
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int lastIdx = birdsPerDay.length - 1;
        birdsPerDay[lastIdx]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int day: birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int day: birdsPerDay) {
            if (day > 4) {
                busyDays++;
            }
        }
        
        return busyDays;
    }
}
