package com.katherinewyers.secureapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String username;
    private String email;
    private String password;
    private Boolean enabled;
    private LocalDateTime createdAt;
}
