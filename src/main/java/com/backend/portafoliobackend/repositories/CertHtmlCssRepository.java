package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.CertHtmlCssModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertHtmlCssRepository extends CrudRepository<CertHtmlCssModel, Long> {
}
