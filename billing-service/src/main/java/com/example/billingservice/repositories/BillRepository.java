package com.example.billingservice.repositories;

import com.example.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author ZAKARIA
 **/
@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill, Long> {

}
