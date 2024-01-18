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
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String FatherName;
    private String cnic;
    private String phone;
    private String studentId;

    private Date checkInDate = new Date();

    private int floor;
    private int roomNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hostel_payment_id", referencedColumnName = "id")
    private HostelPayments hostelPayments;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mess_payment_id", referencedColumnName = "id")
    private MessPayments messPayments;
}
