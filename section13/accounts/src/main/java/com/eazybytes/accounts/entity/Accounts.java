package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{

    @Column
    private Long customerId;

    @Column
    @Id
    private Long accountNumber;

    @Column
    private String accountType;

    @Column
    private String branchAddress;

    @Column(name = "communication_sw")
    private Boolean communicationSw;
}
