package com.testinho.pimba.entities;

import org.springframework.beans.BeanUtils;

import com.testinho.pimba.dto.NpcRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_npc")
@Getter // lombok cria em runtime todos os métodos de get para cada propriedade da classe 
@NoArgsConstructor // declara um construtor sem argumentos
@AllArgsConstructor // declara um construtor que recebe todos os argumentos //*parâmetros */ 
@EqualsAndHashCode(of = "id")
@Table(name = "tb_npc")
public class Npc {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private Double height;
    private String classType;
    private String locale;
    
    @Column(columnDefinition = "TEXT")
    private String description;


    public Npc(NpcRequestDTO data) {
    this.name = data.name();
    this.age = data.age();
    this.height = data.height();
    this.classType = data.classType();
    this.locale = data.locale();
    this.description = data.description();
   }


}
