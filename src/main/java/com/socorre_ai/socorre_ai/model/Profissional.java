package com.socorre_ai.socorre_ai.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profissional")
@Data
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "datanascimento")
    private LocalDate dataNascimento;

    @Column(name = "contato")
    private String contato;

    @Column(name = "descricao")
    private String descricao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "profissional_servico",
            joinColumns = @JoinColumn(name = "profissional_id"),
            inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
    private List<Servico> servicos = new ArrayList<>();

}
