package model.service.impl;

import model.Repository.PositionRepository;
import model.bean.employee.Position;
import model.service.IPosition;

import java.util.List;

public class PositionImpl implements IPosition {
    PositionRepository positionRepository=new PositionRepository();

    @Override
    public Position findById(int id) {
        return positionRepository.findPositionById(id);
    }

    @Override
    public List<Position> findAll() {
        return positionRepository.findAllPosition();
    }
}
