package model.service;

import model.bean.customer.Customer;
import model.bean.employee.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> findAll();
    public void createEmployee(Employee employee);
    public boolean editEmployee(Employee employee);
    public boolean deleteEmployee(int id);
    public Employee findById(int id);
    public List<Employee>findByName(String name);
}
