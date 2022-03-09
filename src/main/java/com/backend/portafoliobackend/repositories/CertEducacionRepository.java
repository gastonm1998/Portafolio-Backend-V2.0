package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.CertEducacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertEducacionRepository extends CrudRepository<CertEducacionModel, Long> {
}
