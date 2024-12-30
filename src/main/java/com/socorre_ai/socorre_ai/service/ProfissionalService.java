package com.socorre_ai.socorre_ai.service;

import com.socorre_ai.socorre_ai.model.Profissional;
import com.socorre_ai.socorre_ai.repository.ProfissionalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfissionalService {

    private final ProfissionalRepository profissionalRepository;

    public Profissional salvaProfissional (Profissional profissional) {
       return profissionalRepository.save(profissional);
    }
}
