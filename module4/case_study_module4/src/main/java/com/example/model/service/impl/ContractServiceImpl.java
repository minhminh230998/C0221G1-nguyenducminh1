package com.example.model.service.impl;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import com.example.model.repository.contract.IContractRepository;
import com.example.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements IContractService {
    @Autowired
    IContractRepository iContractRepository;

    @Override
    public List<Contract> findAll() {
        return (List<Contract>) iContractRepository.findAll();
    }

    @Override
    public void saveContract(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public Contract findById(Integer id) {
        return iContractRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Contract> findAllCustomerService(Pageable pageable) {
        return iContractRepository.findAllCustomerService(pageable);
    }
}
