package model.service.impl;

import model.Repository.ContractDetailRepository;
import model.bean.contract.ContractDetail;
import model.service.IContractDetail;

public class ContractDetailService implements IContractDetail {
    ContractDetailRepository contractDetailRepository=new ContractDetailRepository();

    @Override
    public void createContractDetail(ContractDetail contractDetail) {
        contractDetailRepository.createContractDetail(contractDetail);
    }
}
