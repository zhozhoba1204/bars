package com.blinov.bars.service;

import com.blinov.bars.dao.ContractRepo;
import com.blinov.bars.model.ContractEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService{

    @Autowired
    private ContractRepo contractRepo;

    public List<ContractEntity> findAll() {
        return contractRepo.findAll();
    }

}
