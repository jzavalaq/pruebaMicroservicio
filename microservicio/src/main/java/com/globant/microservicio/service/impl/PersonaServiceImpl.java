package com.globant.microservicio.service.impl;

import com.globant.microservicio.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.globant.microservicio.commons.GenericServiceImpl;
import com.globant.microservicio.dao.api.PersonaDaoAPI;
import com.globant.microservicio.model.Persona;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {

	@Autowired
	private PersonaDaoAPI personaDaoAPI;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDaoAPI;
	}

}
