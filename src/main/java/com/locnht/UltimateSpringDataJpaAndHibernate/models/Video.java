package com.locnht.UltimateSpringDataJpaAndHibernate.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@DiscriminatorValue("V") --> only with InheritanceType.SINGLE_TABLE
//@PrimaryKeyJoinColumn(name = "video_id") --> only with InheritanceType.JOINED
public class Video extends Resource{

    private int length;
}
