package com.globant.microservicio.dao.api;

import com.globant.microservicio.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDaoAPI extends CrudRepository<Cliente, Long> {

}
