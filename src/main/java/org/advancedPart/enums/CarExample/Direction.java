package org.advancedPart.enums.CarExample;

public enum Direction {
    LEFT(270, "L"),
    RIGHT(90, "R"),
    STRAIGHT(0, "S"),
    BACK(180, "B");

    private int degrees;
    private String viewName;
    Direction(int degrees, String viewName) {
        this.degrees = degrees;
        this.viewName = viewName;
    }

    public int getDegrees() {
        return degrees;
    }

    public String getViewName() {
        return viewName;
    }

    @Override
    public String toString() {
        return viewName;
    }
}
