package ru.geekbrains.lesson_1.entity;

import ru.geekbrains.lesson_1.enviroment.Barrier;
import ru.geekbrains.lesson_1.enviroment.Track;

public class Robot implements Participant {
    private String name;
    private int maxDistance;
    private float maxJumpHeight;

    public Robot(String name, int maxDistance, float maxJumpHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean isRun(Track track) {
        System.out.println(name + " runs " + track.getTrackLength() + " m.");
        if (track.getTrackLength() < maxDistance){
            System.out.println(name + " ran the distance");
            return true;
        }
        System.out.println(name + " fail to run the distance");
        return false;
    }

    @Override
    public boolean isJump(Barrier barrier) {
        System.out.println(name + " is jumping for " + barrier.getBarrierHeight() + " m.");
        if (barrier.getBarrierHeight() < maxJumpHeight){
            System.out.println(name + " jumped over the barrier");
            return true;
        }
        System.out.println(name + " didn't jump over the barrier");
        return false;
    }
}
