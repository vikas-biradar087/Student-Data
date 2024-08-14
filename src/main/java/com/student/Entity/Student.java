package com.student.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstName",length = 28,nullable = false)
    private String firstName;
    @Column(name = "lastName",length = 28,nullable = false)
    private String lastName;

    @Column(name = "email",length = 28,nullable = false)
    private String email;
    @Column(name = "mobile",length = 10,nullable = false)
    private String mobile;

}
