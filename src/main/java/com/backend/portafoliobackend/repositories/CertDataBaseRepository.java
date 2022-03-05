package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.CertDataBaseModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertDataBaseRepository extends CrudRepository<CertDataBaseModel, Long> {
}
