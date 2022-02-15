package com.example.Users.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Users {
    @Id
    @Column
    private long id;

    @Column
   // @NotNull(message="{NotNull.User.firstName}")
    private String firstName;

    @Column
   // @NotNull(message="{NotNull.User.lastName}")
    private String lastName;

    @Column
   // @NotNull(message="{NotNull.User.email}")
    private String email;



}
