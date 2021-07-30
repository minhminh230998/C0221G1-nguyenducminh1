package com.example.model.repository.contract;

import com.example.model.entity.contract.AttachService;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAttachServiceRepository extends PagingAndSortingRepository<AttachService,Integer> {
}
