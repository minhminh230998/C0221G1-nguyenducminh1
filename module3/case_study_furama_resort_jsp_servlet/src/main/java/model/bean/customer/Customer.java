package model.bean.customer;

public class Customer {
    private String id;
    private CustomerType CustomerType;
    private String name;
    private String birthday;
    private String gender;
    private int idCard;
    private String phone;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(String id, model.bean.customer.CustomerType customerType, String name, String birthday, String gender, int idCard, String phone, String email, String address) {
        this.id = id;
        CustomerType = customerType;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Customer(model.bean.customer.CustomerType customerType, String name, String birthday, String gender, int idCard, String phone, String email, String address) {
        CustomerType = customerType;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
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

    public model.bean.customer.CustomerType getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(model.bean.customer.CustomerType customerType) {
        CustomerType = customerType;
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
