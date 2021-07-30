package model.service.impl;

import model.Repository.EmployeeRepository;
import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.createEmployee(employee);
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return employeeRepository.editEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int id) {
        return employeeRepository.deleteEmployee(id);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }
}
