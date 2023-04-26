package edu.sda.java.testing.company;

import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.*;


public class CompanyAssertJTest {
        @Test
        public void getEmployees() {
            Company company = new Company();
            String[] result = company.getEmployee();
            Assertions.assertThat(result).isEmpty();
        }

        @Test
        public void addEmployee() {
            Company company = new Company();
            boolean result = company.addEmployee("Jakub");
            Assertions.assertThat(result).isTrue();
        }

        @Test
        public void shouldReturnAddedEmployee() {
            Company company = new Company(3);
            company.addEmployee("Jakub");
            String[] result = company.getEmployee();
//            assertEquals("Jakub",result[0]);
//            assertEquals(1, result.length);
            Assertions.assertThat(result[0]).isEqualTo("Jakub");
            Assertions.assertThat(result.length).isEqualTo(1);
        }

        @Test
        public void shouldThrowExceptionIfTooManyEmployeesAreAdded() {
            Company company = new Company(2);
            company.addEmployee("Patrycja");
            company.addEmployee("Jakub");

            assertThatThrownBy(() -> company.addEmployee("Jakub"))
                    .hasMessage("The company is full!").isInstanceOf(IllegalArgumentException.class);
        }

//        @Test
//        public void shouldRemoveEmployeeFromTheList() {
//            Company company = new Company();
//            company.addEmployee("Kuba");
//            boolean result = company.removeEmployee("Kuba");
////            assertEquals(true, result);
////            assertEquals(0, company.getEmployee().length);
//            Assertions.assertThat(result).isTrue();
////            Assertions.assertThat(result.length).isEqual;

//        }
//
        @Test
        public void shouldRemoveEmployeeFromTheListAndReturnEmployees() {
            Company company = new Company(2);
            company.addEmployee("Kuba");
            company.addEmployee("Adam");
            boolean result = company.removeEmployee("Kuba");
//            assertEquals(true, result);
//            assertEquals("Adam", company.getEmployee()[0]);
            assertThat(result).isTrue();
        }
//
//        @Test
//        public void shouldNotRemoveEmployeeThatDoesNotExist() {
//            Company company = new Company(2);
//            company.addEmployee("Kuba");
//            company.addEmployee("Adam");
//            boolean result = company.removeEmployee("Kamila");
//            assertEquals(false, result);
//            assertEquals(2, company.getEmployee().length);
//        }
    }