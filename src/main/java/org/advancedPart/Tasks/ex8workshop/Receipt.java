package org.advancedPart.Tasks.ex8workshop;

public class Receipt {

    public Car car;
    private String typeOfService;
    private int amount;
    private float totalPrice;

    public Receipt() {

    }


    public Receipt(String typeOfService, int amount, float totalPrice) {
        this.typeOfService = typeOfService;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }
    public Receipt(Car car, String typeOfService, int amount, float totalPrice) {
        this.car = car;
        this.typeOfService = typeOfService;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String displayReceipt(String typeOfService, int amount, float totalPrice) {
        return "Service " + typeOfService + " x " + amount + " you have to pay" + totalPrice;
    }

}
