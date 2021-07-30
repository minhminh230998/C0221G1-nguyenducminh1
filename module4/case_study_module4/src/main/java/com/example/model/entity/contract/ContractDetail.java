package com.example.model.entity.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "contract_id",referencedColumnName = "id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "attach_service_id",referencedColumnName = "id")
    private AttachService attachService;
    private int quantity;

    public ContractDetail(Integer id, Contract contract, AttachService attachService, int quantity) {
        this.id = id;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public ContractDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
