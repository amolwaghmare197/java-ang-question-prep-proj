package com.example.crud_oct.DTO;

import com.example.crud_oct.Entity.Technology;
import lombok.Builder;

@Builder
public class QuestionDto {

    private Long id;

    private Technology technology;

    private String question;

    private String answer;

    private String difficulty;

    private Boolean markedForRevision;

    private Integer revisionCount;

    public QuestionDto(Long id, Technology technology, String question, String answer, String difficulty, Boolean markedForRevision, Integer revisionCount) {
        this.id = id;
        this.technology = technology;
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
        this.markedForRevision = markedForRevision;
        this.revisionCount = revisionCount;
    }

    public QuestionDto() {
    }

    public Integer getRevisionCount() {
        return revisionCount;
    }

    public void setRevisionCount(Integer revisionCount) {
        this.revisionCount = revisionCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Boolean getMarkedForRevision() {
        return markedForRevision;
    }

    public void setMarkedForRevision(Boolean markedForRevision) {
        this.markedForRevision = markedForRevision;
    }

    @Override
    public String toString() {
        return "QuestionDto{" +
                "id=" + id +
                ", technology=" + technology +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", markedForRevision=" + markedForRevision +
                '}';
    }
}
