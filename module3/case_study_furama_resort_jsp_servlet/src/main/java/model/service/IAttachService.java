package model.service;

import model.bean.contract.AttachService;

import java.util.List;

public interface IAttachService {
    public AttachService finById(int id);
    public List<AttachService> findAll();
}
