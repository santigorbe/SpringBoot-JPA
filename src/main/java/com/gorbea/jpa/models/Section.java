package com.gorbea.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data // Getters, Setters
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder // Ayuda a crear objectos de la clase
@Entity
public class Section extends BaseEntity {

    private String name;
    private int sectionOrder;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;


}
