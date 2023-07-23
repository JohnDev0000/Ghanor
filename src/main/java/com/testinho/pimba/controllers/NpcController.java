package com.testinho.pimba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testinho.pimba.dto.NpcRequestDTO;
import com.testinho.pimba.dto.NpcResponseDTO;
import com.testinho.pimba.entities.Npc;
import com.testinho.pimba.repositories.NpcRepository;

@RestController // define a classe como Controller
@RequestMapping("npcs") // URL irá começar com /npcs
public class NpcController {

    @Autowired 
    private NpcRepository npcRepository;

    @GetMapping
    public List<NpcResponseDTO> getAll() {

        List<NpcResponseDTO> npcList = npcRepository.findAll().stream().map(NpcResponseDTO::new).toList();
        return npcList;
    }

    @PostMapping
    public void saveNpc(@RequestBody NpcRequestDTO data) {
        Npc npcData = new Npc(data);
        npcRepository.save(npcData);
        return;
    }

    @GetMapping("/hello")
    public String index() {
        return "Hello World!";
    }
    
    @GetMapping("/hoge")
    public String hoge() {
        return "hogehoge";
    }
}
