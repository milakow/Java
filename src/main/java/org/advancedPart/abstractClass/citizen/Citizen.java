package org.advancedPart.abstractClass.citizen;

public abstract class  Citizen {
    String name;
    boolean result;

    public Citizen(String name) {
        this.name = name;
    }

    public boolean canVote() {
        return result;
    }
}
