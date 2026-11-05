package com.example.crud_oct.Repo;

import com.example.crud_oct.Entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TechnologyRepository
        extends JpaRepository<Technology, Long> {

    Optional<Technology> findByNameIgnoreCase(String name);
}
