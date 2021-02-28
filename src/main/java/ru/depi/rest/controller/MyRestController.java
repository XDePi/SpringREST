package ru.depi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.depi.rest.entity.Employee;
import ru.depi.rest.exceptionHandling.EmployeeIncorrectData;
import ru.depi.rest.exceptionHandling.NoSuchEmployeeException;
import ru.depi.rest.service.EmployeeService;

import java.util.List;

/**
 * @author DePi
 **/
@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmps() {
        List<Employee> allEmps = employeeService.getAllEmployees();
        return allEmps;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmp(id);

        if (employee == null)
            throw new NoSuchEmployeeException("There is no employee with id=" + id + " in db");

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmp(@RequestBody Employee employee) {
        employeeService.saveEmp(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmp(@RequestBody Employee employee) {
        employeeService.saveEmp(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmp(@PathVariable int id) {
        Employee employee = employeeService.getEmp(id);
        if (employee == null)
            throw new NoSuchEmployeeException("There's no employee with id=" + id + " in db");
        employeeService.deleteEmp(id);
        return "Employee with id=" + id + " was deleted from db";
    }
}
