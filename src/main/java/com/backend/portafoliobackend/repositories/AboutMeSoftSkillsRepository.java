package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.AboutMeSoftSkillsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeSoftSkillsRepository extends CrudRepository<AboutMeSoftSkillsModel, Long> {
}
