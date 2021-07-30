package model.service;

import model.bean.employee.EducationDegree;
import model.bean.employee.Position;

import java.util.List;

public interface IEducationDegree {
    public EducationDegree findById(int id);
    public List<EducationDegree> findAll();
}
