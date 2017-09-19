package com.springbootwithmongodb.repository;


import com.springbootwithmongodb.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookRepository extends MongoRepository<Booking, Long>{



    @Query
    Booking findByDeparture(String departure);

    @Query
    Booking findById(long id);


}
