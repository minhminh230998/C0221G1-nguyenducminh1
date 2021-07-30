package com.example.model.repository.contract;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface IContractDetailRepository extends PagingAndSortingRepository<ContractDetail,Integer> {
    @Query(value="select * from attach_service join contract_detail on attach_service.id=contract_detail.attach_service_id where contract_detail.contract_id = ?1",nativeQuery=true)
    List<ContractDetail> findAllAttachServiceById(Integer contract_id);
}
