package ru.geekbrains.lesson_1.entity;

import ru.geekbrains.lesson_1.enviroment.Barrier;
import ru.geekbrains.lesson_1.enviroment.Track;

public class Human implements Participant {
    private String name;
    private int maxDistance;
    private float maxJumpHeight;
    private boolean looser = false;

    public Human(String name, int maxDistance, float maxJumpHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(Track track) {
        if (!looser){
            System.out.println(name + " is running");
        }
    }

    @Override
    public void jump(Barrier barrier) {
        if (!looser){
            System.out.println(name + " is jumping");
        }
    }

    @Override
    public void isLost() {
        looser = true;
    }

    public String getName() {
        return name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public float getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public boolean isLooser() {
        return looser;
    }
}
