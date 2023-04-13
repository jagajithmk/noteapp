package com.example.noteapp;

import com.example.noteapp.entity.Note;
import com.example.noteapp.repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NoteAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoteAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(NoteRepository noteRepository) {
        return args -> {
            // add some sample notes to the database
            Note note1 = new Note();
            note1.setTitle("Note 1");
            note1.setContent("Content of note 1");
            noteRepository.save(note1);

            Note note2 = new Note();
            note2.setTitle("Note 2");
            note2.setContent("Content of note 2");
            noteRepository.save(note2);
        };
    }
}
