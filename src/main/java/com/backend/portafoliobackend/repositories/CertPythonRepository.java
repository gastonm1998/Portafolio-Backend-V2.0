package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.CertPythonModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertPythonRepository extends CrudRepository<CertPythonModel,Long> {
}
