
package com.napier.sem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type My test.
 */
class MyTest {
    /**
     * The App.
     */
    App app;

    /**
     * Init.
     */
    @BeforeEach
    void init() {
        app = new App();
    }

//    @Test
//    void unitTest()
//    {
//        assertEquals(5, 5);
//    }
//
//    @Test
//    void unitTest2()
//    {
//        assertEquals(5, 4);
//    }
//
//    @Test
//    void unitTest3()
//    {
//        assertEquals(5, 5, "Messages are equal");
//    }
//
//    @Test
//    void unitTest4()
//    {
//        assertEquals(5.0, 5.01, 0.02);
//    }
//
//    @Test
//    void unitTest5()
//    {
//        int[] a = {1, 2, 3};
//        int[] b = {1, 2, 3};
//        assertArrayEquals(a, b);
//    }
//
//    @Test
//    void unitTest6()
//    {
//        assertTrue(5 == 5);
//    }
//
//    @Test
//    void unitTest7()
//    {
//        assertFalse(5 == 4);
//    }
//
//    @Test
//    void unitTest8()
//    {
//        assertNull(null);
//    }
//
//    @Test
//    void unitTest9()
//    {
//        assertNotNull("Hello");
//    }
//
//    @Test
//    void unitTest10()
//    {
//        assertThrows(NullPointerException.class, this::throwsException);
//    }
//
//    void throwsException() throws NullPointerException
//    {
//        throw new NullPointerException();
//    }

    /**
     * Print salaries test contains null.
     */
    @Test

    void printSalariesTestContainsNull() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(null);

        assertDoesNotThrow(() -> app.printSalaries(employees));
    }

    /**
     * Print salaries test null list.
     */
    @Test
    void printSalariesTestNullList() {
        assertDoesNotThrow(() -> app.printSalaries(null));
    }

    /**
     * Print salaries test empty list.
     */
    @Test
    void printSalariesTestEmptyList() {
        ArrayList<Employee> employees = new ArrayList<>();

        assertDoesNotThrow(() -> app.printSalaries(employees));
    }

    /**
     * Print salaries test valid employee.
     */
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

    /**
     * Test display employee.
     */
//testing for display employee
    @Test
    void testDisplayEmployee() {
        App app = new App();
        Employee emp = new Employee();

        emp.emp_no = 2;
        emp.first_name = "Haha";
        emp.last_name = "HeHe";
        emp.title = "Engineer";
        emp.salary = 66000;
        emp.dept = "IT";
        emp.manager = "John Smith";

        app.displayEmployee(emp);
    }

    /**
     * Test display employee null.
     */
    @Test
    void testDisplayEmployeeNull() {
        App app = new App();

        app.displayEmployee(null);
    }
}
