package com.example.model.service.impl;

import com.example.model.entity.contract.AttachService;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import com.example.model.repository.contract.IAttachServiceRepository;
import com.example.model.repository.contract.IContractDetailRepository;
import com.example.model.service.IContractDetailService;
import com.example.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements IContractDetailService {
    @Autowired
    IContractDetailRepository iContractDetailRepository;
    @Autowired
    IAttachServiceRepository iAttachServiceRepository;
    @Override
    public void saveContractDetail(ContractDetail contractDetail) {
        iContractDetailRepository.save(contractDetail);
    }

    @Override
    public List<AttachService> findAllAttachService() {
        return (List<AttachService>) iAttachServiceRepository.findAll();
    }

    @Override
    public List<ContractDetail> findAllAttachServiceById(Integer idContract) {
        return iContractDetailRepository.findAllAttachServiceById(idContract);
    }

}
