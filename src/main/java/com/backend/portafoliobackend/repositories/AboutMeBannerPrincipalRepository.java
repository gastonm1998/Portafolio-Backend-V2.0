package com.backend.portafoliobackend.repositories;

import com.backend.portafoliobackend.models.AboutMeBannerPrincipalModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeBannerPrincipalRepository extends CrudRepository <AboutMeBannerPrincipalModel, Long > {
}
