package ru.depi.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.depi.rest.dao.EmployeeDAO;
import ru.depi.rest.entity.Employee;

import java.util.List;

/**
 * @author DePi
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmp(Employee employee) {
        employeeDAO.saveEmp(employee);
    }

    @Override
    @Transactional
    public Employee getEmp(int id) {
        return employeeDAO.getEmp(id);
    }

    @Override
    @Transactional
    public void deleteEmp(int id) {
        employeeDAO.deleteEmp(id);
    }
}
