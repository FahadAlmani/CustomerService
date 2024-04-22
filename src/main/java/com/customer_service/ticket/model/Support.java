package com.customer_service.ticket.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("Support")
public class Support extends User {
    private Double salary;
}
