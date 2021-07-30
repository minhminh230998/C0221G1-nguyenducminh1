package model.bean.customer;

public class Customer {
    private int id;
    private int idCustomerType;
    private String name;
    private String birthday;
    private String gender;
    private int idCard;
    private String phone;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, int idCustomerType, String name, String birthday, String gender, int idCard, String phone, String email, String address) {
        this.id = id;
        this.idCustomerType = idCustomerType;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Customer(int idCustomerType, String name, String birthday, String gender, int idCard, String phone, String email, String address) {
        this.idCustomerType = idCustomerType;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(int idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
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
