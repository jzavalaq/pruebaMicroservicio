package com.globant.microservicio.dao.api;

import com.globant.microservicio.model.Movimiento;
import org.springframework.data.repository.CrudRepository;

public interface MovimientoDaoAPI extends CrudRepository<Movimiento, Long> {

}
