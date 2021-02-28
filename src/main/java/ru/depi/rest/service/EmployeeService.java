package ru.depi.rest.service;


import ru.depi.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmp(Employee employee);

    Employee getEmp(int id);

    void deleteEmp(int id);
}
