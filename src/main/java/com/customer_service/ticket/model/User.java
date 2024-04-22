package com.customer_service.ticket.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "userRole", discriminatorType = DiscriminatorType.STRING)
public abstract class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  private String username;
  private String password;
  private Date birthDate;
  private String phoneNumber;
  private String email;
  
}
