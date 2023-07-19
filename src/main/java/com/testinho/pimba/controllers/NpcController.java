package com.testinho.pimba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testinho.pimba.repositories.NpcRepository;

@Controller
@RequestMapping(path = "/npcs") //
public class NpcController {


    @Autowired //
    private NpcRepository npcRepository;
}
