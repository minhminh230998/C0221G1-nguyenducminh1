package com.example.model.service;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();
    void saveContract(Contract contract);
    Contract findById(Integer id);
    Page<Contract> findAllCustomerService(Pageable pageable);
}
