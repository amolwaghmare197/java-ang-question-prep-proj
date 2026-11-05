package com.example.crud_oct.Controller;


import com.example.crud_oct.Entity.Technology;
import com.example.crud_oct.Service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    @PostMapping
    public ResponseEntity<Technology> saveTechnology(
            @RequestBody Technology technology) {

        return ResponseEntity.ok(
                technologyService.save(technology));
    }

    @GetMapping("/All")
    public List<Technology> getAll() {

        return technologyService.getAll();
    }

    @GetMapping("/{id}")
    public Technology getById(
            @PathVariable Long id) {

        return technologyService.getById(id);
    }

    @PutMapping("/{id}")
    public Technology update(
            @PathVariable Long id,
            @RequestBody Technology technology) {

        return technologyService.update(id, technology);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {

        technologyService.delete(id);
    }
}
