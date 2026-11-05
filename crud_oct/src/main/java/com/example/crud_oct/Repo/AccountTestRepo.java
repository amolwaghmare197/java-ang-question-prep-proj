package com.example.crud_oct.Repo;

import com.example.crud_oct.Entity.accountTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTestRepo extends JpaRepository<accountTest,Long> {

}
