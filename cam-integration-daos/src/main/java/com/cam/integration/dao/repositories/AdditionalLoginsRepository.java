package com.cam.integration.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cam.integration.dao.entities.AdditionalLogins;

@Repository
public interface AdditionalLoginsRepository extends CrudRepository<AdditionalLogins, String>{

}
