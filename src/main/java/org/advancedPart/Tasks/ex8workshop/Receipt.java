package org.advancedPart.Tasks.ex8workshop;

public class Receipt {

    public Car car;
    private String typeOfService;
    private int amount;
    private int priceOfRepair = 100;

    public Receipt() {
    }

    public Receipt(String typeOfService, int amount) {
        this.typeOfService = typeOfService;
        this.amount = amount;
    }
    public Receipt(Car car, String typeOfService, int amount) {
        this.car = car;
        this.typeOfService = typeOfService;
        this.amount = amount;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String displayReceipt(String typeOfService, int amount) {
        return "For service " + typeOfService + " x " + amount + " times, you have to pay " + (amount * priceOfRepair) + "PLN";
    }

}
