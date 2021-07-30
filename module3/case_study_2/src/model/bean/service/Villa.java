package model.bean.service;

public class Villa extends Services {
    private String standardRoom;
    private String convenience;
    private float poolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(int id, int idRentType, int idServiceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, float poolArea, int numberFloors) {
        super(id, idRentType, idServiceType, name, area, cost, maxPeople);
        this.standardRoom = standardRoom;
        this.convenience = convenience;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(int idRentType, int idServiceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, float poolArea, int numberFloors) {
        super(idRentType, idServiceType, name, area, cost, maxPeople);
        this.standardRoom = standardRoom;
        this.convenience = convenience;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenience() {
        return convenience;
    }

    public void setConvenience(String convenience) {
        this.convenience = convenience;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
