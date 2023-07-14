package org.example.oophw2;

public class Mission {
    private final Wall height;
    private final Treadmill length;


    public Mission(Treadmill length, Wall height) {
        this.length = length;
        this.height = height;
    }

    public Wall getHeight() {
        return height;
    }

    public Treadmill getLength() {
        return length;
    }
}