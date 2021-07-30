package model.service.impl;

import model.Repository.DivisionRepository;
import model.bean.employee.Division;
import model.service.IDivision;

import java.util.List;

public class DivisionImpl implements IDivision {
    DivisionRepository divisionRepository=new DivisionRepository();
    @Override
    public Division findById(int id) {
        return divisionRepository.findPositionById(id);
    }

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAllDivision();
    }
}
