package model.service;

import model.bean.employee.Division;
import model.bean.employee.Position;

import javax.tools.Diagnostic;
import java.util.List;

public interface IDivision {
    public Division findById(int id);
    public List<Division> findAll();
}
