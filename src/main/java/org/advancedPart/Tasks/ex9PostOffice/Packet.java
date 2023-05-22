package org.advancedPart.Tasks.ex9PostOffice;

public class Packet {
    private String sender;
    private String recipient;
    private double weight;
    private boolean isPriority = false;
    private Status status;

    public Packet(){
    }
    public Packet(String sender, String recipient, double weight, boolean isPriority) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.isPriority = isPriority;
        checkData();
    }
    public Packet(String sender, String recipient, double weight, boolean isPriority, Status status) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.isPriority = isPriority;
        this.status = Status.CREATED;
        checkData();
    }

    public void checkData() {
        if (sender.isEmpty() || sender == null) {
            System.out.println("Error! Specify sender!");
        }
        if (recipient.isEmpty() || recipient == null) {
            System.out.println("Error! Specify recipient!");
        }
        if (weight < 1 || weight > 100000) {
            System.out.println("Error! Weight is not in the range of 1-100 000g!");
        }
    }
    public double getPriceOfPackage() {
        double price = 0;
        if (weight <= 500) {
            price = 5;
        } else if (weight <= 1000) {
            price = 8;
        } else if (weight <= 2000) {
            price = 12;
        } else {
            price = 12 + (weight - 2000);
        }
        if (isPriority) {
            price *= 1.1;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", isPriority=" + isPriority +
                '}';
    }
}
