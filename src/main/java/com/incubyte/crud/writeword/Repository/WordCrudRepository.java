package com.incubyte.crud.writeword.Repository;

import com.incubyte.crud.writeword.Model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordCrudRepository extends JpaRepository<Word, Long> {
}
