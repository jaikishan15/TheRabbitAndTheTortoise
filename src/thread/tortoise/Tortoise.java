package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    private static final int MILESTONES = 5;

    private final Thread tortoise;
    private float timeTakenByTortoiseToCompleteTheRace = 0f;

    public float getTimeTakenByTortoise() {
        return timeTakenByTortoiseToCompleteTheRace;
    }

    public void setTimeTakenByTortoise(float timeTakenByTortoiseToCompleteTheRace) {
        this.timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoiseToCompleteTheRace;
    }

    public Tortoise() {
        this.tortoise = new Thread(this, "tortoise");
    }



    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++){


}



