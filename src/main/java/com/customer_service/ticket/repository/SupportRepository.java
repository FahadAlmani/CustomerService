package com.customer_service.ticket.repository;

import com.customer_service.ticket.model.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepository extends JpaRepository<Support,String> {
}
