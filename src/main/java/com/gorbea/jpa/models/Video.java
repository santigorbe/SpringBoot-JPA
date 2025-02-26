package com.gorbea.jpa.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity

//@PrimaryKeyJoinColumn(name = "video_id") // Join Table. Para darle un nombre en particular al id que tambien es FK
//@DiscriminatorValue("V") // Single table inheritance

public class Video extends Resource {

    private int length;
}
