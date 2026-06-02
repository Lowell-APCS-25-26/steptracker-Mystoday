package org.APCSLowell;

public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int actDays;

    public StepTracker(int activityThreshold){
minSteps=activityThreshold;
totalSteps=0;
actDays=0;
totalDays=0;

    }

    void addDailySteps(int stepCount) {
totalSteps+=steps;
totalDays=totalDays+1;
if(steps>=minSteps){
    actDays++;
}

    }
    int activeDays() {
        return actDays;
    }
    double averageSteps() {
if(totalDays==0){
return 0.0;
}
else{
    return (double)totalSteps/totalDays;
}
    }
}
