package com.example.model.service;

import com.example.model.entity.contract.AttachService;
import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractDetailService {
    void saveContractDetail(ContractDetail contractDetail);
    List<AttachService> findAllAttachService();
    List<ContractDetail>findAllAttachServiceById(Integer idContract);
}
