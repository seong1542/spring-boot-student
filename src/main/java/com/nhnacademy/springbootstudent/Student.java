package com.nhnacademy.springbootstudent;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private Long id;

    private String name;
    private Integer score;

}
