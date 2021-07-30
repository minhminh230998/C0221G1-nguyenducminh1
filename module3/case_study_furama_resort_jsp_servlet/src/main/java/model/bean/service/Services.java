package model.bean.service;

public class Services {
    private String id;
    private RentType rentType;
    private ServiceType serviceType;
    private String name;
    private String area;
    private double cost;
    private int MaxPeople;
    private String standardRoom;
    private String convenience;
    private float poolArea;
    private int numberFloors;

    public Services() {
    }

    public Services(String id, RentType rentType, ServiceType serviceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, float poolArea, int numberFloors) {
        this.id = id;
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.name = name;
        this.area = area;
        this.cost = cost;
        MaxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.convenience = convenience;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Services(RentType rentType, ServiceType serviceType, String name, String area, double cost, int maxPeople, String standardRoom, String convenience, float poolArea, int numberFloors) {
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.name = name;
        this.area = area;
        this.cost = cost;
        MaxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.convenience = convenience;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
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
