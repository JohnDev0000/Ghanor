package com.testinho.pimba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testinho.pimba.entities.Npc;

public interface NpcRepository extends JpaRepository<Npc, Long> {
    
}
