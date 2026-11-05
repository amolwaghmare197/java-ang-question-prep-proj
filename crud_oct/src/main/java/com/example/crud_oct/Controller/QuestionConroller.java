package com.example.crud_oct.Controller;


import com.example.crud_oct.DTO.QuestionDto;
import com.example.crud_oct.DTO.RevisionQuestionDto;
import com.example.crud_oct.Service.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionConroller {

    @Autowired
    private QuestionServiceImpl service;

    @PostMapping
    public QuestionDto save(@RequestBody QuestionDto dto) {

        return service.save(dto);
        //return null;
    }

    @PutMapping("/{id}")
    public QuestionDto update(@PathVariable Long id,
           @RequestBody QuestionDto dto) {

        return service.update(id, dto);
    }

    @GetMapping("/{id}")
    public QuestionDto getById(
            @PathVariable Long id) {

        return service.getById(id);
    }

    @GetMapping("/count")
    public Long getCount() {

        return service.getCount();
    }

    @GetMapping
    public List<QuestionDto> getAll() {

        return service.getAll();
    }

    /*@GetMapping("/technology/{technology}")
    public List<QuestionDto> getByTechnology(
            @PathVariable String technology) {

        return service.getByTechnology(technology);
    }*/

    @GetMapping("/technology/{id}")
    public List<QuestionDto> getByTechnologyId(
            @PathVariable int id) {

        return service.getByTechnologyId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {

        service.delete(id);
    }

    @PutMapping("/revision")
    public ResponseEntity<String> updateRevisionQuestions(
            @RequestBody List<RevisionQuestionDto> questions) {

        service.updateRevisionQuestions(questions);

        return ResponseEntity.ok("Updated Successfully");
    }
}
