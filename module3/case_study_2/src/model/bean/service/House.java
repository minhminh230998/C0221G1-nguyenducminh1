package model.bean.service;

public class House extends Services {
    private String standardRoom;
    private String convenience;
    private int numberFloors;

    public House() {
    }

    public House(int id, int idRentType, int idServiceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, int numberFloors) {
        super(id, idRentType, idServiceType, name, area, cost, maxPeople);
        this.standardRoom = standardRoom;
        this.convenience = convenience;
        this.numberFloors = numberFloors;
    }

    public House(int idRentType, int idServiceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, int numberFloors) {
        super(idRentType, idServiceType, name, area, cost, maxPeople);
        this.standardRoom = standardRoom;
        this.convenience = convenience;
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

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
