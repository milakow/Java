package edu.sda.java.testing.company;

import java.util.Arrays;

public class Company {
    private int capacity;
    private String[] employees;
    private int counter = 0;

    public Company(){
        this(1);
    }

    public Company(int capacity) {
        this.capacity = capacity;
        employees = new String[capacity];
    }


    public String[] getEmployee() {
        return Arrays.copyOf(employees, counter);
    }

    public boolean addEmployee(String name) {
        if (counter >= capacity) {
            throw new IllegalArgumentException("Too many new employees! Capacity " + capacity + " is  full!");
        } else {
            employees[counter] = name;
            counter++;
            return true;
        }
    }

    public boolean removeEmployee(String name) {
        String[] newEmployees = new String[capacity];
        int id = 0;
        boolean isSuccessful = false;
        for (String employee : employees) {
            if (employee == name) {
                isSuccessful = true;
                counter--;

            } else {
                newEmployees[id] = employee;
                id++;
            }
        }
        employees = newEmployees;

        return isSuccessful;
    }
}
