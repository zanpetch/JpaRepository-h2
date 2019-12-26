package com.sanpetch.cosmetic.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class CosmeticController {
    
    List<Cosmetic> cosmetics = new ArrayList<>(Arrays.asList(
        new Cosmetic("LIP001", "XOXO Lipstick", 1),
        new Cosmetic("BRO001", "NYX Brush On Palette", 1)
    ));

    @RequestMapping("/")
    public String hello() {
        return "Hello I'm Spring Boot!";
    }

    @RequestMapping("/cosmetics")
    public List<Cosmetic> getAllCosmetics() {
        return cosmetics;
    }

    @RequestMapping(value = "/cosmetics/delete={id}", method = RequestMethod.GET) // RequestMethod.DELETE
    public void deleteCosmetics(@PathVariable String id) {
        for(int i = 0; i < cosmetics.size(); i++){
            if (cosmetics.get(i).getId().equals(id)){
                cosmetics.remove(i);
                break;
            }
        }
    }

}