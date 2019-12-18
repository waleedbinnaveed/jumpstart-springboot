package com.demo.jumpstart.repository;

import com.demo.jumpstart.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note,Integer> {
}
