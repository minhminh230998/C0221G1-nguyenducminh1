package model.service;

import model.bean.service.House;
import model.bean.service.Room;
import model.bean.service.Villa;

public interface IService {
    public void createVilla(Villa villa);
    public void createHouse(House house);
    public void createRoom(Room room);

}
