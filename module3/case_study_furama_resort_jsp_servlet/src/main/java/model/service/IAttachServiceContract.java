package model.service;

import model.bean.contract.AttachService;
import model.bean.customerService.AttachServiceContract;

import java.util.List;

public interface IAttachServiceContract {
    public List<AttachServiceContract>findAll();
}
