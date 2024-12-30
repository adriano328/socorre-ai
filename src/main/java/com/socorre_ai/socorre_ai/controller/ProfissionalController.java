package com.socorre_ai.socorre_ai.controller;

import com.socorre_ai.socorre_ai.controller.dto.ProfissionalDto;
import com.socorre_ai.socorre_ai.model.Profissional;
import com.socorre_ai.socorre_ai.service.ProfissionalService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "profissional")
@RequiredArgsConstructor
public class ProfissionalController {

    private final ProfissionalService profissionalService;

    private final ModelMapper modelMapper;

    @PostMapping
    ResponseEntity<ProfissionalDto> salvarProfissional(@RequestBody ProfissionalDto profissionalDto) {
        profissionalService.salvaProfissional(modelMapper.map(profissionalDto, Profissional.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

