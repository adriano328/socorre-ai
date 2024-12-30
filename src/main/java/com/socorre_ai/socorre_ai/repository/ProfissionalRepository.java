package com.socorre_ai.socorre_ai.repository;

import com.socorre_ai.socorre_ai.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
}
