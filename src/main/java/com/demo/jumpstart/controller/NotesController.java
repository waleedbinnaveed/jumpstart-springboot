package com.demo.jumpstart.controller;

import com.demo.jumpstart.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("notes")
public class NotesController {

    @GetMapping
    public List<Note> getAllNotes(){

        Note note = new Note();
        note.setTitle("New Note");
        note.setDescription("A quick brown fox jumps over the lazy dog");
        note.setDate_created(new Date().toString());

        return Collections.singletonList(note);
    }



}
