package com.globant.microservicio.dao.api;

import com.globant.microservicio.model.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaDaoAPI extends CrudRepository<Cuenta, Long> {

}
