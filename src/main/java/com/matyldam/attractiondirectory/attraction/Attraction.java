package com.matyldam.attractiondirectory.attraction;


import com.matyldam.attractiondirectory.location.City;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Attraction {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    private City city;
}
