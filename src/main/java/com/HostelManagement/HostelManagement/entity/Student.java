package com.HostelManagement.HostelManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String fatherName;
    private String cnic;
    private String phone;
    private String studentId;

    private Date checkInDate = new Date();

    private int floor;
    private int roomNo;

    @OneToOne(cascade = CascadeType.ALL)
    private HostelPayments hostelPayments;

    @OneToOne(cascade = CascadeType.ALL)
    private MessPayments messPayments;
}
