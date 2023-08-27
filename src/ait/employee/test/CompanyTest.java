package ait.employee.test;

import ait.employee.dao.Company;
import ait.employee.dao.CompanyImpl;
import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company company;
    Employee[] employees;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }

    }

    @Test
    void addEmployee() {// добавление объекта Employee
        // нельзя добавить null
// нельзя добавить уже существующий объект
// нельзя добавить больше, чем предельное число объектов
// можно добавить новый объект
// ожидаем правильный рост кол-ва объектов
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employees[1]));
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        employee = new SalesManager(6000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));
    }

    @Test
    void removeEmployee() {// удаляем объект типа Employee, находим его по id
// нельзя удалить второй раз объект
// ожидаем правильное уменьшение кол-ва объектов
        assertFalse(company.removeEmployee(int id));
        assertTrue(company.removeEmployee(int id));
    }

    @Test
    void findEmployee() { //находим объект типа Employee, находим его по id
        // ожидаем объект Employee, найденный по его id
        assertTrue(company.findEmployee(int id));
    }

    @Test
    void quantity() {// считаем кол-во объектов
        // ожидаем правильные значения при изменении кол-ва объектов

    }

    @Test
    void totalSalary() {// расчет зарплаты
        // ожидаем правильные значения
    }

    @Test
    void avgSalary() {// расчет  средней зарплаты
        // ожидаем правильные значения
    }

    @Test
    void totalSales() {// расчет обьема продаж
        // ожидаем правильные значения
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }
}