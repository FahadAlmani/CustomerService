package com.customer_service.ticket.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends User {
}
