package model.service.impl;

import model.Repository.EducationDegreeRepository;
import model.bean.employee.EducationDegree;
import model.service.IEducationDegree;
import model.service.IEmployeeService;

import java.util.List;

public class EducationDegreeImpl implements IEducationDegree {
    EducationDegreeRepository educationDegreeRepository=new EducationDegreeRepository();

    @Override
    public EducationDegree findById(int id) {
        return educationDegreeRepository.findEducationDegreeById(id);
    }

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAllEducationDegree();
    }
}
