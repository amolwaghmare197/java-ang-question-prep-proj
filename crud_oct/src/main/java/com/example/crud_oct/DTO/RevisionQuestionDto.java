package com.example.crud_oct.DTO;

public class RevisionQuestionDto {

    private Long id;

    private Boolean markedForRevision;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getMarkedForRevision() {
        return markedForRevision;
    }

    public void setMarkedForRevision(Boolean markedForRevision) {
        this.markedForRevision = markedForRevision;
    }

    public RevisionQuestionDto(Long id, Boolean markedForRevision) {
        this.id = id;
        this.markedForRevision = markedForRevision;
    }

    @Override
    public String toString() {
        return "RevisionQuestionDto{" +
                "id=" + id +
                ", markedForRevision=" + markedForRevision +
                '}';
    }
}
