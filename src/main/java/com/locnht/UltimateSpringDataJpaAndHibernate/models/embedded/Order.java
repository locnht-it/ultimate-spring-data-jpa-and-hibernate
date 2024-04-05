package com.locnht.UltimateSpringDataJpaAndHibernate.models.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "_order")
public class Order {

    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address;

    private String orderInfo;

    private String anotherField;
}
