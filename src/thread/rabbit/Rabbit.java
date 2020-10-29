package thread.rabbit;

import javax.swing.*;

public class Rabbit implements Runnable {

    private static final int MILESTONES = 5;

    private final Thread rabbit;
    private float timeTakenByRabbitToCompleteTheRace = 0f;

    public Rabbit() {
        this.rabbit = new Thread(this, "Rabbit");
    }

    public Thread getRabbit() {
        return rabbit;
    }

    public float getTimeTakenByRabbit() {
        return timeTakenByRabbitToCompleteTheRace;
    }

    public void setTimeTakenByRabbit(float timeTakenByRabbit) {
        this.timeTakenByRabbitToCompleteTheRace = timeTakenByRabbit;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Rabbit has started from the start line!");
                    timeTakenByRabbitToCompleteTheRace = (float) (timeTakenByRabbitToCompleteTheRace + 1.5);
                    break;
                case 1:
                    System.out.println("The Rabbit has reached the Cool River!");
                    timeTakenByRabbitToCompleteTheRace = (float) (timeTakenByRabbitToCompleteTheRace + 1.5);
                    break;
                case 2:
                    System.out.println("The Rabbit has reached the Mountain Hill!");
                    timeTakenByRabbitToCompleteTheRace = (float) (timeTakenByRabbitToCompleteTheRace + 1.5);
                    break;
                case 3:
                    System.out.println("The Rabbit has reached the Big Oak Tree!");
                    System.out.println("The Rabbit is leading and hence is going to sleep!");
                    timeTakenByRabbitToCompleteTheRace = (float) (timeTakenByRabbitToCompleteTheRace + 1.5);
                    try {
                        Thread.sleep(9000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Rabbit's sleep got interrupted!");
                    }
                    timeTakenByRabbitToCompleteTheRace = timeTakenByRabbitToCompleteTheRace + 9;
                    break;
                case 4:
                    System.out.println("The Rabbit has reached the finish line!");
                    timeTakenByRabbitToCompleteTheRace = (int) (timeTakenByRabbitToCompleteTheRace + 1.5);
                    break;
            }
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Rabbit has completed the race!",
                "Rabbit",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
