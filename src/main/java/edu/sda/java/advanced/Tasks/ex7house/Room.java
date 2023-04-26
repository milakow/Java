package edu.sda.java.advanced.Tasks.ex7house;

import java.util.Arrays;

public class Room {
    private Bed bed;
    private Window[] windows;

    public Room (Bed bed, Window[] windows) {
        this.bed = bed;
        this.windows = windows;
    }

    public void cleanRoom() {
        bed.changeBedding();
        for (int i = 0; i < windows.length; i++) {
            windows[i].openWindow();
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", window=" + Arrays.toString(windows) +
                '}';
    }
//    Room[] room = new Room[]{bed, Window window[2]};

}
