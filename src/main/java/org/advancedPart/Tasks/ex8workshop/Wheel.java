package org.advancedPart.Tasks.ex8workshop;

public class Wheel {
    private double pressure;
    private double appropriatePressure;
    private boolean isDamaged;


    public Wheel(double pressure, double appropriatePressure, boolean isDamaged) {
        this.pressure = pressure;
        this.appropriatePressure = appropriatePressure;
        this.isDamaged = isDamaged;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getAppropriatePressure() {return appropriatePressure;}

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }


    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", appropriatePressure=" + appropriatePressure +
                ", isDamaged=" + isDamaged +
                '}';
    }
}
