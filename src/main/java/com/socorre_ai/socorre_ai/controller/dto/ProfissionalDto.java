package com.socorre_ai.socorre_ai.controller.dto;

import com.socorre_ai.socorre_ai.model.Servico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfissionalDto {
    private String nome;
    private LocalDate dataNascimento;
    private String contato;
    private String descricao;
    private List<Servico> servicos;
}
