package ru.depi.rest.dao;

import ru.depi.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmp(Employee employee);

    Employee getEmp(int id);

    void deleteEmp(int id);

}
