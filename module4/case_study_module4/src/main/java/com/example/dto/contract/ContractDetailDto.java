package com.example.dto.contract;

import com.example.model.entity.contract.AttachService;
import com.example.model.entity.contract.Contract;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ContractDetailDto {
    private Integer id;
    private Contract contract;
    private AttachService attachService;
    @NotNull(message = " Not Null")
    @Min(value = 1,message = "Enter the correct format")
    private int quantity;

    public ContractDetailDto() {
    }

    public ContractDetailDto(Integer id, Contract contract, AttachService attachService, @NotNull(message = " Not Null") @Min(value = 1, message = "Enter the correct format") int quantity) {
        this.id = id;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
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
