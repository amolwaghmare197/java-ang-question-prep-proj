package com.example.crud_oct.Repo;


import com.example.crud_oct.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    //List<Question> findByTechnologyIgnoreCase(String technology);

    List<Question> findByTechnologyNameIgnoreCase(String name);

    //List<Question> findByTechnologyIdIgnoreCase(int name);

    List<Question> findByTechnologyId(int name);

    @Query("SELECT COUNT(u) FROM Question u")
    long countUsersByEmailDomain();

}
