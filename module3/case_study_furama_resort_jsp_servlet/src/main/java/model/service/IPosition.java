package model.service;

import model.bean.employee.Position;

import java.util.List;

public interface IPosition {
    public Position findById(int id);
    public List<Position> findAll();
}
