package com.gorbea.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Table per class
//@Inheritance(strategy = InheritanceType.JOINED) // Join Table
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Single table inheritance
//@DiscriminatorColumn(name = "resource_type") // Una nueva columna para saber el tipo del recurso. Single table inheritance
public class Resource {
    // Single table inheritance. Pongo todos los atributos de las diferentes clases en la misma tabla que Resource.
    // Es bueno cuando el numero de clases es bajo. Hago un "extend Resource" en las clases hijas, y "@Entity"

    // Join Table. Una tabla separada para cada clase con una Foreing Key a la tabla Resource. Cada tabla
    // tiene los valores que unicos de ese tipo y la FK.

    // Tabla per class. Cada clase hija tiene todos los atributos de resource y los propios.
    // es bueno cuando son pocas clases hijas con muchos atributos extra cada una

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;
    @OneToOne
    @JoinColumn(name="lecture_id")
    private Lecture lecture;
}
