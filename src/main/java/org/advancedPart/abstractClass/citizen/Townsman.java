package org.advancedPart.abstractClass.citizen;

public class Townsman extends Citizen {
    public Townsman(String name) {
        super(name);
    }
    @Override
    public boolean canVote() {
        return false;
    }
}
