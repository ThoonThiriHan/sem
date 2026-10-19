
package com.napier.sem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyTest {
    App app;

    @BeforeEach
    void init() {
        app = new App();
    }

    @Test
    void printSalariesTestContainsNull() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(null);

        assertDoesNotThrow(() -> app.printSalaries(employees));
    }

    @Test
    void printSalariesTestNullList() {
        assertDoesNotThrow(() -> app.printSalaries(null));
    }

    @Test
    void printSalariesTestEmptyList() {
        ArrayList<Employee> employees = new ArrayList<>();

        assertDoesNotThrow(() -> app.printSalaries(employees));
    }

    @Test
    void printSalariesTestValidEmployee() {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;

        employees.add(emp);

        assertDoesNotThrow(() -> app.printSalaries(employees));
    }
}
