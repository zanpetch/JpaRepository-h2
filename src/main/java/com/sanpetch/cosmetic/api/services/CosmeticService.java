package com.sanpetch.cosmetic.api.services;

import java.util.List;

import com.sanpetch.cosmetic.api.repositories.CosmeticRepository;
import com.sanpetch.cosmetic.api.entities.Cosmetic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CosmeticService {

    @Autowired
    private CosmeticRepository cosmeticRepository;

    public List<Cosmetic> getAllCosmetics(){
        return cosmeticRepository.findAll();
    }

    public void addCosmetic(Cosmetic cosmetic){
        cosmeticRepository.save(cosmetic);
    }

    public void deleteCosmetic(String id){
        cosmeticRepository.deleteById(id);
    }
}