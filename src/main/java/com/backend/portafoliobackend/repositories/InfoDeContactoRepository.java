package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.InfoDeContactoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoDeContactoRepository extends CrudRepository<InfoDeContactoModel, Long> {

}
