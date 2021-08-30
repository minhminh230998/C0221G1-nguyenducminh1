package com.example.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer manufacturerId;
    private String manufacturerCode;
    private String manufacturerName;
    private String manufacturerAddress;
    private String manufacturerEmail;
    private String manufacturerPhoneNumber;
    private String manufacturerDebts;
    private Integer manufacturerNote ;
    @OneToMany(mappedBy = "manufacturer")
    private List<ImportBill> importBills;
    @OneToMany(mappedBy = "manufacturer")
    private List<ExportBill> exportBills;

    public Manufacturer() {
    }

    public Manufacturer(Integer manufacturerId, String manufacturerCode, String manufacturerName, String manufacturerAddress, String manufacturerEmail, String manufacturerPhoneNumber, String manufacturerDebts, Integer manufacturerNote, List<ImportBill> importBills, List<ExportBill> exportBills) {
        this.manufacturerId = manufacturerId;
        this.manufacturerCode = manufacturerCode;
        this.manufacturerName = manufacturerName;
        this.manufacturerAddress = manufacturerAddress;
        this.manufacturerEmail = manufacturerEmail;
        this.manufacturerPhoneNumber = manufacturerPhoneNumber;
        this.manufacturerDebts = manufacturerDebts;
        this.manufacturerNote = manufacturerNote;
        this.importBills = importBills;
        this.exportBills = exportBills;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    public String getManufacturerEmail() {
        return manufacturerEmail;
    }

    public void setManufacturerEmail(String manufacturerEmail) {
        this.manufacturerEmail = manufacturerEmail;
    }

    public String getManufacturerPhoneNumber() {
        return manufacturerPhoneNumber;
    }

    public void setManufacturerPhoneNumber(String manufacturerPhoneNumber) {
        this.manufacturerPhoneNumber = manufacturerPhoneNumber;
    }

    public String getManufacturerDebts() {
        return manufacturerDebts;
    }

    public void setManufacturerDebts(String manufacturerDebts) {
        this.manufacturerDebts = manufacturerDebts;
    }

    public Integer getManufacturerNote() {
        return manufacturerNote;
    }

    public void setManufacturerNote(Integer manufacturerNote) {
        this.manufacturerNote = manufacturerNote;
    }

    public List<ImportBill> getImportBills() {
        return importBills;
    }

    public void setImportBills(List<ImportBill> importBills) {
        this.importBills = importBills;
    }

    public List<ExportBill> getExportBills() {
        return exportBills;
    }

    public void setExportBills(List<ExportBill> exportBills) {
        this.exportBills = exportBills;
    }
}
