package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.AboutMeLenguajesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeLenguajesRepository extends CrudRepository<AboutMeLenguajesModel, Long> {
}
