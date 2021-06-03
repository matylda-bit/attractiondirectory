package com.matyldam.attractiondirectory;


import com.matyldam.attractiondirectory.attraction.Attraction;
import com.matyldam.attractiondirectory.location.AttractionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("attractions")
public class AttractionResource {
private AttractionRepository attractionRepository;
public AttractionResource(AttractionRepository attractionRepository){
    this.attractionRepository = attractionRepository;
}

    @GetMapping
    public Iterable<Attraction>attractions(){
        return attractionRepository.findAll();
    }
}
