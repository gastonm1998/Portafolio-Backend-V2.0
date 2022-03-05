package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.CertComplementosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertComplementosRepository extends CrudRepository<CertComplementosModel,Long> {
}
