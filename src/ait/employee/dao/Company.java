package ait.employee.dao;

import ait.employee.model.Employee;

public interface Company {
    boolean addEmployee(Employee employee);// добавление объекта Employee
    // нельзя добавить null
// нельзя добавить уже существующий объект
// нельзя добавить больше, чем предельное число объектов
// можно добавить новый объект
// ожидаем правильный рост кол-ва объектов

    Employee removeEmployee(int id);// удаляем объект типа Employee, находим его по id
// нельзя удалить второй раз объект
// ожидаем правильное уменьшение кол-ва объектов

    Employee findEmployee(int id);// находим объект типа Employee, находим его по id
    // ожидаем объект Employee, найденный по его id
    int quantity();// считаем кол-во объектов
    // ожидаем правильные значения при изменении кол-ва объектов
    double totalSalary();// расчет зарплаты
    // ожидаем правильные значения
    double avgSalary();

    double totalSales();

    void printEmployees();

}