package model.service.impl;

import model.Repository.AttachServiceRepository;
import model.bean.contract.AttachService;
import model.service.IAttachService;

import java.util.List;

public class AttachServiceImpl implements IAttachService {
    AttachServiceRepository attachServiceRepository=new AttachServiceRepository();
    @Override
    public AttachService finById(int id) {
        return attachServiceRepository.finById(id);
    }

    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
