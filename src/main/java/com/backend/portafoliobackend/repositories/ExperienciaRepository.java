package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.ExperienciaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends CrudRepository<ExperienciaModel, Long> {


}
