package com.sanpetch.cosmetic.api.repositories;

import com.sanpetch.cosmetic.api.entities.Cosmetic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CosmeticRepository extends JpaRepository<Cosmetic, String>{
    
}