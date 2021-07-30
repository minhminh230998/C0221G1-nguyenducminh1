package model.service;

import model.bean.contract.Contract;

import java.sql.Connection;
import java.util.List;

public interface IContract {
    public void createContract(Contract contract);
    public List<Contract> findAll();
    public Contract findById(int id);
    public boolean edit(Contract contract);
}
