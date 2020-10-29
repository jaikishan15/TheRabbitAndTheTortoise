package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Race<winner> {
    public static void main(String[] args) throws InterruptedException {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.getTortoise().start();
        String winner = null;

        }
    }
}
