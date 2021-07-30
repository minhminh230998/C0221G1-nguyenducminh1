package model.service.impl;

import model.Repository.ContractRepository;
import model.bean.contract.Contract;
import model.service.IContract;

import java.util.List;

public class ContractImpl implements IContract {
    ContractRepository contractRepository=new ContractRepository();
    @Override
    public void createContract(Contract contract) {
        contractRepository.createContract(contract);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Contract findById(int id) {
        return contractRepository.findById(id);
    }

    @Override
    public boolean edit(Contract contract) {
        return contractRepository.editContract(contract);
    }
}
