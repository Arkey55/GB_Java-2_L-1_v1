package ru.geekbrains.lesson_1.enviroment;

import ru.geekbrains.lesson_1.entity.Participant;

public class Track {
    private int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }
    public boolean isRun (Participant participants){
        if (trackLength <= participants.getMaxDistance()){
            System.out.println(participants.getName() + " ran successfully");
            return true;
        }
        System.out.println(participants.getName() + " fail to run the distance");
        return false;
    }

    @Override
    public String toString() {
        return "Participants run " + trackLength + " m.";
    }
}
