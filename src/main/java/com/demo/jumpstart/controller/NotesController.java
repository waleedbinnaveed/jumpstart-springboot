package com.demo.jumpstart.controller;

import com.demo.jumpstart.model.Note;
import com.demo.jumpstart.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notes")
public class NotesController {

    @Autowired private NotesService service;

    @GetMapping
    public List<Note> getAllNotes() {
        return service.getAllNotes();
    }

    @GetMapping("{id}")
    public Note getNoteById(@PathVariable("id") Integer id) {
        return service.getNoteById(id);
    }

    @PostMapping
    public String createNote(@RequestBody Note note) {
        return service.createNote(note);
    }

    @PutMapping("{id}")
    public String updateNote(@PathVariable("id") Integer id, @RequestBody Note note) {
        return service.updateNote(id,note);
    }

    @DeleteMapping("{id}")
    public String deleteNote(@PathVariable("id") Integer id) {
        return service.deleteNote(id);
    }
}