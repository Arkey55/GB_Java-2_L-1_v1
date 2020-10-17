package ru.geekbrains.lesson_1.enviroment;

import ru.geekbrains.lesson_1.entity.Participant;

public class Barrier {
    private float barrierHeight;

    public Barrier(float barrierHeight) {
        this.barrierHeight = barrierHeight;
    }
    public boolean isJump (Participant participants){
        if (barrierHeight <= participants.getMaxJumpHeight()){
            System.out.println(participants.getName() + " successfully jumped over the barrier");
            return true;
        }
        System.out.println(participants.getName() + " didn't jump over the barrier");
        return false;
    }

    @Override
    public String toString() {
        return "Participants jump for " + barrierHeight + " m.";
    }
}
