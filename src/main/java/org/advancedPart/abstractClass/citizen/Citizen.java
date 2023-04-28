package org.advancedPart.abstractClass.citizen;

public abstract class  Citizen {
    private String name;
    boolean result;

    public Citizen(String name) {
        this.name = name;
    }

    public boolean canVote() {
        return result;
    }

    public String getName() {
        return name;
    }
}
