package com.subhash.springwebapp.repositories;

import com.subhash.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
