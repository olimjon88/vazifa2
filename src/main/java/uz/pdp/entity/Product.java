package uz.pdp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "mark", nullable = false)
    private String mark;

    @Column(name = "description")
    private String description;

    @Column(name = "active", columnDefinition = "boolean default true")
    boolean active = true;

    @ManyToOne(optional = false)
    private Category category;

}
