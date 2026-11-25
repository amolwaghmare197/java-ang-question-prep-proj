package com.example.crud_oct.DTO;

public class RevisionQuestionDto {

    private Long id;

    private Boolean markedForRevision;
    private Integer revisionCount;

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

    public Integer getRevisionCount() {
        return revisionCount;
    }

    public void setRevisionCount(Integer revisionCount) {
        this.revisionCount = revisionCount;
    }

    public RevisionQuestionDto(Long id, Boolean markedForRevision, Integer revisionCount) {
        this.id = id;
        this.markedForRevision = markedForRevision;
        this.revisionCount = revisionCount;
    }

    @Override
    public String toString() {
        return "RevisionQuestionDto{" +
                "id=" + id +
                ", markedForRevision=" + markedForRevision +
                ", revisionCount=" + revisionCount +
                '}';
    }
}
