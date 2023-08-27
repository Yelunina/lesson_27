package ait.employee.dao;

import ait.employee.model.Employee;

import java.io.Serializable;

public class CompanyImpl implements Company {
    private Employee[] employees;
    private int size;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {// добавление объекта Employee
        // нельзя добавить null
// нельзя добавить уже существующий объект
// нельзя добавить больше, чем предельное число объектов
// можно добавить новый объект
// ожидаем правильный рост кол-ва объектов
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        // удаляем объект типа Employee, находим его по id
// нельзя удалить второй раз объект
// ожидаем правильное уменьшение кол-ва объектов
        return null;
    }

    @Override
    public Employee findEmployee(int id) {// находим объект типа Employee, находим его по id
        // ожидаем объект Employee, найденный по его id
        return null;
    }

    @Override
    public int quantity() {// считаем кол-во объектов
        // ожидаем правильные значения при изменении кол-ва объектов
        return 0;
    }

    @Override
    public double totalSalary() {// расчет зарплаты
        // ожидаем правильные значения
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }
}
