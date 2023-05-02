package org.advancedPart.Tasks.ex1Car;

public class Car {

    private String brand;
    private int mileage;
    private int mileageForReview;

    public Car(String brand, int mileage, int mileageForReview) {
        this.brand = brand;
        this.mileage = mileage;
        this.mileageForReview = mileageForReview;
    }

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void displayCarInfo() {
        System.out.println("Car's brand: " + brand + ", car's mileage: " + mileage);
    }

    public int increaseMileage(int distance) {
        int incresingMileage = mileage;
        return incresingMileage += distance;
    }

    public int distanceToGo() {
        return mileageForReview - mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", mileageForReview=" + mileageForReview +
                '}';
    }
}
