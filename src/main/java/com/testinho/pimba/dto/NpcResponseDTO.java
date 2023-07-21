package com.testinho.pimba.dto;

import com.testinho.pimba.entities.Npc;

public record NpcResponseDTO(Long id, String name, Integer age, Double height, String classType, String locale, String description) {

    public NpcResponseDTO(Npc npc) {
        this(npc.getId(), npc.getName(), npc.getAge(), npc.getHeight(), npc.getClassType(), npc.getLocale(), npc.getDescription());

    }
}
