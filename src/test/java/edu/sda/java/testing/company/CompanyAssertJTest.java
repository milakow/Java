package edu.sda.java.testing.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Company2Test {
    @Test
    public void shouldReturnEmptyArrayIfNoEmployees(){
        Company company = new Company();
        String[] result = company.getEmployee();
        Assertions.assertEquals(0, result.length);
    }
    @Test
    public void shouldReturnTrueIfEmployeeIsAdded(){
        Company company = new Company();
        boolean result = company.addEmployee("Jakub");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void shouldReturnAddedEmployee() {
        Company company = new Company(3);
        company.addEmployee("Jakub");
        String[] result = company.getEmployee();
        Assertions.assertEquals("Jakub", result[0]);
        Assertions.assertEquals(1, result.length);
    }

    @Test
    public void shouldReturnThreeAddedEmployees() {
         Company company = new Company(3);
         company.addEmployee("Jaś");
         company.addEmployee("Staś");
         company.addEmployee("Małgosia");

         String[] result = company.getEmployee();

         Assertions.assertEquals(3, result.length);
    }

    @Test
    public void shouldReturnExceptionIfTooManyEmployeesAreAdded() {
        Company company = new Company(2);
        company.addEmployee("Jakub");
        company.addEmployee("Kamila");

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> company.addEmployee("Matuesz"));
        Assertions.assertEquals("Too many new employees! Capacity 2 is  full!", exception.getMessage());
    }

    @Test
    public void shouldRemoveEmployeeAndReturnTrue() {
        Company company = new Company();
        company.addEmployee("Jakub");

        boolean result = company.removeEmployee("Jakub");

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, company.getEmployee().length);
    }

    @Test
    public void shouldCheckIfCorrectEmployeeIsBeingRemoved() {
        Company company = new Company(2);
        company.addEmployee("Jakub");
        company.addEmployee("Adam");

        boolean result = company.removeEmployee("Jakub");

        Assertions.assertTrue(result);
        Assertions.assertEquals("Adam", company.getEmployee()[0]);
    }

    @Test
    public void shouldReturnEFalseIfInvalidEmployeeToRemove() {
        Company company = new Company(2);
        company.addEmployee("Jakub");
        company.addEmployee("Adam");

        boolean result = company.removeEmployee("Stasiek");

        Assertions.assertFalse(result);
        Assertions.assertEquals(2, company.getEmployee().length);

    }
}