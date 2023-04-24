package edu.sda.java.tdd.company;

import edu.sda.java.testing.company.Company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    public void shouldReturnEmptyArrayIfNoneEmployees() {
        Company company = new Company();

        String[] result = company.getEmployee();

        Assertions.assertEquals(0, result.length);
    }

    @Test
    public void shouldReturnTrueIfNewEmployeeWasAdded() {
        Company company = new Company();

        boolean result = company.addEmployee("Jan");

        Assertions.assertTrue(result);
    }

//    @Test
//    public void shouldReturnTrueIfNewEmployeeWasNotAdded() {
//        Company company = new Company();
//
//        boolean result = company.addEmployee("Jan");
//
//        Assertions.assertTrue(result);
//    }

}