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
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoiseToCompleteTheRace + 3;
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoiseToCompleteTheRace + 3;
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoiseToCompleteTheRace + 3;
                    break;
                case 3:
                    System.out.println("The tortoise has reached the Big Oak Tree!");
                    timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoiseToCompleteTheRace + 3;
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    timeTakenByTortoiseToCompleteTheRace = timeTakenByTortoiseToCompleteTheRace + 3;
                    break;


            }
        }
    }
}


