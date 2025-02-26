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
public class Course extends BaseEntity{


    private String name;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                    @JoinColumn(name="course_id") // The primary key of the owner id
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
