package ru.geekbrains.lesson_1.entity;

import ru.geekbrains.lesson_1.enviroment.Barrier;
import ru.geekbrains.lesson_1.enviroment.Track;

public interface Participant {
    boolean isRun(Track track);
    boolean isJump(Barrier barrier);
}
