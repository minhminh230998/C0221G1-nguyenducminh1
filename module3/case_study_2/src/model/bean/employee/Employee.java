package model.bean.employee;

public class Employee {
    private Integer id;
    private int idPosition;
    private int idEducationDegree;
    private int idDivision;
    private String name;
    private String dateOfBirth;
    private String idCard;
    private String gender;
    private double salary;
    private String phone;
    private String email;
    private String address;

    public Employee() {
    }

    public Employee(Integer id, int idPosition, int idEducationDegree, int idDivision, String name, String dateOfBirth, String idCard, String gender, double salary, String phone, String email, String address) {
        this.id = id;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.gender = gender;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Employee(int idPosition, int idEducationDegree, int idDivision, String name, String dateOfBirth, String idCard, String gender, double salary, String phone, String email, String address) {
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.gender = gender;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public int getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(int idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
