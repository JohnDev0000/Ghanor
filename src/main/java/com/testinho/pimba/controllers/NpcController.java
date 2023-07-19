package com.testinho.pimba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testinho.pimba.entities.Npc;
import com.testinho.pimba.repositories.NpcRepository;

@Controller // define a classe como Controller
@RequestMapping(path = "/npcs") // URL irá começar com /npcs
public class NpcController {

    @Autowired 
    private NpcRepository npcRepository;

    @GetMapping
    public List<Npc> getAll() {

        List<Npc> npcList = npcRepository.findAll();
        return npcList;
    }
}
