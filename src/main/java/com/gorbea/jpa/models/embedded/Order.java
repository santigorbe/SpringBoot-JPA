package com.gorbea.jpa.models.embedded;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="_order")
public class Order {

    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address; // Esta forma de traer los atributos es mucho mas sencilla y escalable que extend

    private String orderInfo;
    private String anotherField;
}
