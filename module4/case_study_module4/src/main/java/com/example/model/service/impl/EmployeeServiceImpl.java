package com.example.model.service.impl;

import com.example.model.entity.employee.*;
import com.example.model.repository.employee.IDivisionRepository;
import com.example.model.repository.employee.IEducationDegreeRepository;
import com.example.model.repository.employee.IEmployeeRepository;
import com.example.model.repository.employee.IPositionRepository;
import com.example.model.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Autowired
    IDivisionRepository iDivisionRepository;
    @Autowired
    IEducationDegreeRepository iEducationDegreeRepository;
    @Autowired
    IPositionRepository iPositionRepository;
    @Override
    public List<Employee> findAllEmployee() {
        return (List<Employee>) iEmployeeRepository.findAll();
    }

    @Override
    public Employee findByIdEmployee(Integer id) {
        return iEmployeeRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Employee> findByNameEmployee(String name, Pageable pageable) {
        return iEmployeeRepository.findByNameContaining("%"+name+"%",pageable);
    }

    @Override
    public void saveEmployee(Employee employee) {
       iEmployeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
       iEmployeeRepository.deleteById(id);
    }

    @Override
    public List<Position> findAllPosition() {
        return (List<Position>) iPositionRepository.findAll();
    }

    @Override
    public List<Division> findAllDivision() {
        return (List<Division>) iDivisionRepository.findAll();
    }

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return (List<EducationDegree>) iEducationDegreeRepository.findAll();
    }

    @Override
    public Employee findByUser(Long id) {
        return iEmployeeRepository.findEmployeeByAppUserUserId(id);
    }
}
