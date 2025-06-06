package com.finekuo.springdatajpa.repository;

import com.finekuo.springdatajpa.entity.Skill;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Hidden
@Repository
public interface SkillRepository extends CrudRepository<Skill, Long> {
    Optional<Skill> findByName(String name); // Added findByName
}
