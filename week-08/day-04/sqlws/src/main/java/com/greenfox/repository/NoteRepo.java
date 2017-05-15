package com.greenfox.repository;

import com.greenfox.model.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepo extends CrudRepository<Note, Long> {
}
