package edu.sda.java.basics.practise.temperature;

public class TemperatureDemo {

    public static void main(String[] args) {
        Temperature temp1 = new Temperature(86.89);
        System.out.println("Temp 1 in C: " + temp1.returnTempInC());
        System.out.println("Temp 1 in F: " + temp1.returnTempInF());

        Temperature temp2 = new Temperature(12.5, "F");
        System.out.println("Temp 2 in C: " + temp2.returnTempInC());
        System.out.println("Temp 2 in F: " + temp2.returnTempInF());

    }
}
