package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    private static final int MILESTONES = 5;

    private final Thread tortoise;
    private float timeTakenByTortoiseToCompleteTheRace = 0f;

    public float getTimeTakenByTortoise() {
        return timeTakenByTortoise;
    }

    public void setTimeTakenByTortoise(float timeTakenByTortoise) {
        this.timeTakenByTortoise = timeTakenByTortoise;
    }


}



