package com.gorbea.jpa.models;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data // Getters, Setters
@NoArgsConstructor
@AllArgsConstructor
//@Builder // Ayuda a crear objectos de la clase
@SuperBuilder
@Entity
@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity{

    /*@Id
    @GeneratedValue
        /*(
            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )
    @TableGenerator(
            name = "author_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1 // -> Para que vaya sumando de a 1, por defecto es 50. Tambien se podria cambiar el valor inicial
    )*/
    /*private Integer id;*/
    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;
    /*Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;
    @Column(
            insertable = false
    )
    private LocalDateTime lastModifiedAt;
    */
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
