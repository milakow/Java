package edu.sda.java.advanced.Tasks.ex8workshop;

public class Wheel {
    private double pressure;
    private double appropriatePressure;

//    boolean result;


    public Wheel(double pressure) {
        this.pressure = pressure;
    }
    public Wheel(double pressure, double appropriatePressure) {
        this.pressure = pressure;
        this.appropriatePressure = appropriatePressure;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getAppropriatePressure() {return appropriatePressure;}

//    boolean checkingWheelPressure(double pressure, double appropriatePressure) {
//        if (pressure < appropriatePressure) {
//            boolean result = false;
//        }
//        return result;
//    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", appropriatePressure=" + appropriatePressure +
                '}';
    }
}
