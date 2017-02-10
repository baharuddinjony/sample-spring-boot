package com.bahar.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bahar.models.Movie;

public interface MovieRepositoriy extends CrudRepository<Movie, Long> {
 
    List<Movie> findByYearLessThan(int year);
}
