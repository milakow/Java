package edu.sda.java.basics.classes.cars;

public class Tire {
    /** --

     create another package (may be subpackage) "tires"
     create class Tire in that package with field "tireName", getter and setter
     add a table of Tires in class Car
     */

    private String tireName;

    public String getTireName() {
        return tireName;
    }

    public void setTireName(String tireName){
        this.tireName = tireName;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "tireName='" + tireName + '\'' +
                '}';
    }
}
