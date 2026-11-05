package com.example.crud_oct.Service;


import com.example.crud_oct.DTO.QuestionDto;
import com.example.crud_oct.DTO.RevisionQuestionDto;
import com.example.crud_oct.Entity.Question;
import com.example.crud_oct.Repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class QuestionServiceImpl  {

    @Autowired
    private QuestionRepository repository;


    public QuestionDto save(QuestionDto dto) {

        Question question = new Question();
        question.setTechnology(dto.getTechnology());
        question.setQuestion(dto.getQuestion());
        question.setAnswer(dto.getAnswer());
        question.setDifficulty(dto.getDifficulty());
        question.setCreatedDate(LocalDateTime.now());
        question.setUpdatedDate(LocalDateTime.now());
        question.setMarkedForRevision(dto.getMarkedForRevision());
        //return null;
        return mapToDto(repository.save(question));
    }


    public QuestionDto update(Long id, QuestionDto dto) {

        Question question = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found"));

        question.setTechnology(dto.getTechnology());
        question.setQuestion(dto.getQuestion());
        question.setAnswer(dto.getAnswer());
        question.setDifficulty(dto.getDifficulty());
        question.setUpdatedDate(LocalDateTime.now());
        question.setMarkedForRevision(dto.getMarkedForRevision());
        return mapToDto(repository.save(question));
    }


    public QuestionDto getById(Long id) {

        return mapToDto(
                repository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Question not found"))
        );
    }


    public List<QuestionDto> getAll() {

        return repository.findAll()
                .stream()
                .map(this::mapToDto)
                .toList();
    }

    public Long getCount() {

        return repository.countUsersByEmailDomain();
    }


    public List<QuestionDto> getByTechnology(String technology) {

        return repository.findByTechnologyNameIgnoreCase(technology)
                .stream()
                .map(this::mapToDto)
                .toList();
    }

    public List<QuestionDto> getByTechnologyId(int technology) {

        return repository.findByTechnologyId(technology)
                .stream()
                .map(this::mapToDto)
                .toList();
    }


    public void delete(Long id) {

        repository.deleteById(id);
    }

    private QuestionDto mapToDto(Question question) {

        QuestionDto dto = new QuestionDto();
        dto.setMarkedForRevision(question.getMarkedForRevision());
        dto.setId(question.getId());
        dto.setTechnology(question.getTechnology());
        dto.setQuestion(question.getQuestion());
        dto.setAnswer(question.getAnswer());
        dto.setDifficulty(question.getDifficulty());
        return dto;
    }

    public void updateRevisionQuestions(
            List<RevisionQuestionDto> questions) {

        for (RevisionQuestionDto dto : questions) {

            Question question = repository
                    .findById(dto.getId())
                    .orElseThrow(() ->
                            new RuntimeException("Question Not Found"));

            question.setMarkedForRevision(
                    dto.getMarkedForRevision());

            repository.save(question);
        }
    }
}
