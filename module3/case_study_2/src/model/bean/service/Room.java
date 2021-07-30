package model.bean.service;

public class Room extends Services {

    private  String freeService;

    public Room() {
    }

    public Room(int id, int idRentType, int idServiceType, String name, String area, double cost, int maxPeople) {
        super(id, idRentType, idServiceType, name, area, cost, maxPeople);

    }

    public Room(int idRentType, int idServiceType, String name, String area, double cost, int maxPeople) {
        super(idRentType, idServiceType, name, area, cost, maxPeople);

    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}




