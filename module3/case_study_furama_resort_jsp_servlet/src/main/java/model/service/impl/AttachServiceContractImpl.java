package model.service.impl;

import model.Repository.ContractAttachServiceRepository;
import model.bean.contract.Contract;
import model.bean.customerService.AttachServiceContract;
import model.service.IAttachService;
import model.service.IAttachServiceContract;

import java.util.List;

public class AttachServiceContractImpl implements IAttachServiceContract {
    ContractAttachServiceRepository contractAttachServiceRepository=new ContractAttachServiceRepository();
    @Override
    public List<AttachServiceContract> findAll() {
        return contractAttachServiceRepository.findAll();
    }
}
