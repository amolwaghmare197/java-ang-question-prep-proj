package com.example.crud_oct.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@Column(nullable = false)
    private String technology;*/

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "technology_id", nullable = false)
    private Technology technology;

    @Column(nullable = false, length = 2000)
    private String question;

    @Column(nullable = false, length = 10000)
    private String answer;

    @Column(name = "marked_for_revision ")
    private Boolean markedForRevision = false;

    private String difficulty;


    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    public Question(Long id, Technology technology, String question, String answer, Boolean markedForRevision,String difficulty, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.id = id;
        this.technology = technology;
        this.question = question;
        this.answer = answer;
        this.markedForRevision = markedForRevision;
        this.difficulty = difficulty;
        this.created_at = createdDate;
        this.updated_at = updatedDate;
    }

    public Question() {
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

    public LocalDateTime getCreatedDate() {
        return created_at;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.created_at = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updated_at;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updated_at = updatedDate;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", technology=" + technology +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", markedForRevision=" + markedForRevision +
                ", difficulty='" + difficulty + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}