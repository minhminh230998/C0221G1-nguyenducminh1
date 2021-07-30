package model.service.impl;

import model.Repository.EmployeeRepository;
import model.bean.Employee;
import model.service.IEmployeeService;

import java.time.Year;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public String[] createEmployee(Employee employee) {
        boolean check = true;
        String msgName = "";
        String msgBirthday = "";
        if ("".equals(employee.getName())) {
            msgName = "please input name";
            check = false;
        } else if (!employee.getName().matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")) {
            msgName = "Please enter the correct format";
            check = false;
        }
        if ("".equals(employee.getBirthday())) {
            msgBirthday = "please input birthday";
            check = false;
        }else if(Year.now().getValue()- Integer.parseInt(employee.getBirthday().substring(0,4))<18){
            msgBirthday = "Please enter the correct format(age>18)";
            check = false;
        }
        if (check) {
            employeeRepository.createEmployee(employee);
        }
        return check ? new String[]{} : new String[]{msgName,msgBirthday};

    }

    @Override
    public String[] editEmployee(Employee employee) {
        boolean check = true;
        String msgName = "";
        String msgBirthday = "";
        if ("".equals(employee.getName())) {
            msgName = "please input name";
            check = false;
        } else if (!employee.getName().matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")) {
            msgName = "Please enter the correct format";
            check = false;
        }
        if ("".equals(employee.getBirthday())) {
            msgBirthday = "please input birthday";
            check = false;
        }else if(Year.now().getValue()- Integer.parseInt(employee.getBirthday().substring(0,4))<18){
            msgBirthday = "Please enter the correct format(age>18)";
            check = false;
        }
        if (check) {
            employeeRepository.editEmployee(employee);
        }
        return check ? new String[]{} : new String[]{msgName,msgBirthday};
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
