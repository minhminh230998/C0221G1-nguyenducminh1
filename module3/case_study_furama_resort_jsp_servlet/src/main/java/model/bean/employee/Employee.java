package model.bean.employee;

public class Employee {
    private String id;
    private Position idPosition;
    private EducationDegree educationDegree;
    private Division division;
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

    public Employee(String id, Position idPosition, EducationDegree educationDegree, Division division, String name, String dateOfBirth, String idCard, String gender, double salary, String phone, String email, String address) {
        this.id = id;
        this.idPosition = idPosition;
        this.educationDegree = educationDegree;
        this.division = division;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.gender = gender;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Employee(Position idPosition, EducationDegree educationDegree, Division division, String name, String dateOfBirth, String idCard, String gender, double salary, String phone, String email, String address) {
        this.idPosition = idPosition;
        this.educationDegree = educationDegree;
        this.division = division;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.gender = gender;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Position idPosition) {
        this.idPosition = idPosition;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
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
