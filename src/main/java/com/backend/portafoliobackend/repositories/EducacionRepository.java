package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.EducacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends CrudRepository<EducacionModel , Long> {

}
