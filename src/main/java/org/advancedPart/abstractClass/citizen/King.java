package org.advancedPart.abstractClass.citizen;

public class King extends Citizen {
    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
       return false;
    }

}
