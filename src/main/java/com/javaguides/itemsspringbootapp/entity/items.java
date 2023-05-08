package com.javaguides.itemsspringbootapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="items")
public class items {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="item_name")
    private String item_name;

    @Column(name="item_amount")
    private Integer item_amount;

    @Column(name="item_price")
    private  Integer item_price;

    public long getId() {
        return id;
    }
}
