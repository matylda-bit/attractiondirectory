package com.matyldam.attractiondirectory.location;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class City extends Location {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    private Region region;


}
