package com.nhnacademy.springbootstudent.account;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;


@EqualsAndHashCode
@Getter
@ToString
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private String number;
    private Integer balance;
}
