
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int number :birdsPerDay)
        {
            if(number==0)
            return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int numberOfBirdVisitsUntilGivenLimit=0;
        if(numberOfDays>birdsPerDay.length)
        numberOfDays=birdsPerDay.length;
        for (int i=0;i<numberOfDays;i++)
        numberOfBirdVisitsUntilGivenLimit+=birdsPerDay[i];
        return numberOfBirdVisitsUntilGivenLimit;
    }

    public int getBusyDays() {
        int numberOfBusyDays=0;
        for (int number : birdsPerDay)
        if(number>=5)
        numberOfBusyDays++;

        return numberOfBusyDays;
    }
}
