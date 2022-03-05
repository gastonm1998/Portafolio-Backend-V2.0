package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.CertIotModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertIotRepository extends CrudRepository<CertIotModel, Long> {
}
