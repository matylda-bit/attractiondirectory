package com.matyldam.attractiondirectory.location;


import com.matyldam.attractiondirectory.attraction.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {
}
