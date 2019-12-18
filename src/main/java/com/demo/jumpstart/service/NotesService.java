package com.demo.jumpstart.service;

import com.demo.jumpstart.model.Note;
import com.demo.jumpstart.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotesService {

    @Autowired private NotesRepository repository;

    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    public Note getNoteById(Integer id) {
        Optional<Note> note = repository.findById(id);

        if(!note.isPresent())
            return null;
        else
            return note.get();
    }

    public String createNote(Note note) {
        repository.save(note);
        return "Note has been created successfully";
    }

    public String updateNote(Integer id, Note note) {

        Note exisitngNote = getNoteById(id);

        if(exisitngNote!=null)
            repository.save(note);
        else{
            return "Note with id doesn't exist";
        }

        return "Note has been updated successfully";

    }

    public String deleteNote(Integer id) {
        Note exisitngNote = getNoteById(id);
        if(exisitngNote!=null){
            repository.delete(exisitngNote);
        }
        else{
            return "Note with id doesn't exist";

        }
        return "Note has been deleted successfully";

    }
}
