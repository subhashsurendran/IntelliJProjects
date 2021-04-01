package com.subhash.springwebapp.repositories;

import com.subhash.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
