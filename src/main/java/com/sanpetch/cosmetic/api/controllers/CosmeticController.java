package com.sanpetch.cosmetic.api.controllers;

import java.util.List;

import com.sanpetch.cosmetic.api.entities.Cosmetic;
import com.sanpetch.cosmetic.api.services.CosmeticService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CosmeticController {

    @Autowired
    CosmeticService cosmeticService = new CosmeticService();

    @RequestMapping("/")
    public String hello() {
        return "Hello I'm Cosmetic API";
    }

    @RequestMapping("/cosmetics")
    public List<Cosmetic> getAllCosmetics() {
        return cosmeticService.getAllCosmetics();
    }

    @RequestMapping(value = "/cosmetics/{id}", method = RequestMethod.DELETE)
    public void deleteCosmetics(@PathVariable String id) {
        cosmeticService.deleteCosmetic(id);
    }

    @RequestMapping(value =  "/cosmetics", method = RequestMethod.POST)
    public void addCosmetic(@RequestBody Cosmetic cosmetic){
        cosmeticService.addCosmetic(cosmetic);
    }

}