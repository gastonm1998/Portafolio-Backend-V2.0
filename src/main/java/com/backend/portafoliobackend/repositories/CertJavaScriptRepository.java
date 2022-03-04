package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.CertJavaScriptModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertJavaScriptRepository extends CrudRepository<CertJavaScriptModel, Long> {
}
