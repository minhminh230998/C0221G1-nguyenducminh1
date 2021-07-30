package model.service;

import model.bean.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> findAll();
    public String[] createEmployee(Employee employee);
    public String[] editEmployee(Employee employee);
    public boolean deleteEmployee(int id);
    public Employee findById(int id);
    public List<Employee> findByName(String name);
}
