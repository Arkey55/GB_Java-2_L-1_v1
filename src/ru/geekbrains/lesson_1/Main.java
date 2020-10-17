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
                new Track(40),
                new Barrier(1.7f),
                new Track(50)
        };

        runTheTrack(participants, obstacles);

    }

    private static void runTheTrack(Participant[] participants, Object[] obstacles){
        for (Object obstacle : obstacles) {
            System.out.println(obstacle);
            for (Participant participant : participants) {
                if (obstacle instanceof Track) {
                    if (!participant.isLooser()) {
                        participant.run((Track) obstacle);
                        if (!((Track) obstacle).isRun(participant)) {
                            participant.isLost();
                        }
                    }

                } else {
                    if (!participant.isLooser()) {
                        participant.jump((Barrier) obstacle);
                        if (!((Barrier) obstacle).isJump(participant)) {
                            participant.isLost();
                        }
                    }
                }
            }
        }
    }
}

