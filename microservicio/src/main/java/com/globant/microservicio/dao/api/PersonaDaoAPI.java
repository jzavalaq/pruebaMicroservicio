package com.globant.microservicio.dao.api;

import com.globant.microservicio.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
