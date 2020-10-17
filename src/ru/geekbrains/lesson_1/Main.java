package ru.geekbrains.lesson_1;

import ru.geekbrains.lesson_1.entity.Participant;
import ru.geekbrains.lesson_1.entity.Cat;
import ru.geekbrains.lesson_1.entity.Human;
import ru.geekbrains.lesson_1.entity.Robot;
import ru.geekbrains.lesson_1.enviroment.Barrier;
import ru.geekbrains.lesson_1.enviroment.Track;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Jim", 30, 1.3f),
                new Cat("Tom", 50, 2.5f),
                new Robot("Bender", 40, 1f)
        };

        Object[] obstacles = {
                new Track(10),
                new Barrier(1.3f),
                new Track(15),
                new Barrier(1.7f),
                new Track(20)
        };

        aaa(participants, obstacles);

    }
    static void aaa(Participant[] participants, Object[] obstacles){
        for (Participant participant : participants) {
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Track) {
                    if (!participant.isRun((Track) obstacle)) break;
                } else {
                    if (!participant.isJump((Barrier) obstacle)) break;
                }
            }
        }
    }
}

