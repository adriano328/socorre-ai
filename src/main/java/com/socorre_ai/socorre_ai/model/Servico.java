package com.socorre_ai.socorre_ai.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "servico")
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;
}
