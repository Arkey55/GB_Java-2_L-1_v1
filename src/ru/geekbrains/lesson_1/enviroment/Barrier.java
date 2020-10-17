package ru.geekbrains.lesson_1.enviroment;

import ru.geekbrains.lesson_1.entity.Participant;

public class Barrier {
    private float barrierHeight;

    public Barrier(float barrierHeight) {
        this.barrierHeight = barrierHeight;
    }

    public void jump (String name, Participant[] participants){
        System.out.println(name + " is jumping");
    }

    public float getBarrierHeight() {
        return barrierHeight;
    }
}
