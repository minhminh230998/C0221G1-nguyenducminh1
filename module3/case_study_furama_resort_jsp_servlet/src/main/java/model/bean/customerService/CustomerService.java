package model.bean.customerService;

public class CustomerService {
    private String nameCustomer;
    private String startDate;
    private String endDate;
    private String nameService;
    private String idContract;

    public CustomerService() {
    }

    public CustomerService(String nameCustomer, String startDate, String endDate, String nameService, String idContract) {
        this.nameCustomer = nameCustomer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nameService = nameService;
        this.idContract = idContract;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }
}
