package com.blinov.bars.dao;

import com.blinov.bars.model.ContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepo extends JpaRepository<ContractEntity, Long> {
}
