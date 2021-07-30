package com.example.model.repository.contract;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends PagingAndSortingRepository<Contract,Integer> {
    @Query(value="select * from contract  left join contract_detail on contract.id=contract_detail.contract_id group by contract_detail.contract_id",nativeQuery=true)
    Page<Contract> findAllCustomerService(Pageable pageable);
}
