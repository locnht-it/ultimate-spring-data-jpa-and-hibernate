package com.locnht.UltimateSpringDataJpaAndHibernate.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) --> subclass has own table with fields of parents + its fields
//@Inheritance(strategy = InheritanceType.JOINED) --> super table has all fields of super class, and sub class has own table with only its fields and id.
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "resource_type") --> only with InheritanceType.SINGLE_TABLE
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
