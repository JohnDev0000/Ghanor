package com.testinho.pimba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testinho.pimba.entities.Npc;
import com.testinho.pimba.repositories.NpcRepository;

@RestController // define a classe como Controller
@RequestMapping("npcs") // URL irá começar com /npcs
public class NpcController {

    @Autowired 
    private NpcRepository npcRepository;

    @GetMapping
    public List<Npc> getAll() {

        List<Npc> npcList = npcRepository.findAll();
        return npcList;
    }
}
