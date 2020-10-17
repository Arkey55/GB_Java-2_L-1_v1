package ru.geekbrains.lesson_1.entity;

import ru.geekbrains.lesson_1.enviroment.Barrier;
import ru.geekbrains.lesson_1.enviroment.Track;

public interface Participant {
    void run(Track track);
    void jump(Barrier barrier);
    void isLost();
    boolean isLooser();
    String getName();
    int getMaxDistance();
    float getMaxJumpHeight();
}
