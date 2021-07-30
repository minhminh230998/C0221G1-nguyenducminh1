package model.bean.service;

public class Services {
    private int id;
    private int idRentType;
    private int idServiceType;
    private String name;
    private String area;
    private double cost;
    private int MaxPeople;

    public Services() {
    }

    public Services(int id, int idRentType, int idServiceType, String name, String area, double cost, int maxPeople) {
        this.id = id;
        this.idRentType = idRentType;
        this.idServiceType = idServiceType;
        this.name = name;
        this.area = area;
        this.cost = cost;
        MaxPeople = maxPeople;
    }

    public Services(int idRentType, int idServiceType, String name, String area, double cost, int maxPeople) {
        this.idRentType = idRentType;
        this.idServiceType = idServiceType;
        this.name = name;
        this.area = area;
        this.cost = cost;
        MaxPeople = maxPeople;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public int getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(int idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return MaxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        MaxPeople = maxPeople;
    }
}
