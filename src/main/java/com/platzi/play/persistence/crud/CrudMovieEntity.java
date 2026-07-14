package com.platzi.play.persistence.crud;

import com.platzi.play.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

//Hereda funcionalidades CRUD
public interface CrudMovieEntity extends CrudRepository<MovieEntity,Long> {
}
