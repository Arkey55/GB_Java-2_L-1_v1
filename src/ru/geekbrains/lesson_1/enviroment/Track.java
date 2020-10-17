package ru.geekbrains.lesson_1.enviroment;

import ru.geekbrains.lesson_1.entity.Participant;

public class Track {
    private int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }

    public void run (String name, Participant[] participants){
        System.out.println(name + " is running");
    }

    public int getTrackLength() {
        return trackLength;
    }
}
