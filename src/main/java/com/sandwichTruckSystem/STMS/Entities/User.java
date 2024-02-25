package com.sandwichTruckSystem.STMS.Entities;

import com.sandwichTruckSystem.STMS.Enums.RoleEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name= "USER")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    private RoleEnum role;
}
