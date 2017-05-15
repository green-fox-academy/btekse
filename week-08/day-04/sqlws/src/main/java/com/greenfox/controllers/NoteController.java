package com.greenfox.controllers;

import com.greenfox.model.Note;
import com.greenfox.repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.awt.SystemColor.text;

@Controller
public class NoteController {

  @Autowired //note ctrllerben példánosítunk egy noteRepo-t
    NoteRepo noteRepo;

  @RequestMapping("/")
  public String index(Model model) {
    //noteRepo.save(new Note("my first note")); //save, delete (id-vel), lekérés note típussal(id-val)
    model.addAttribute("notes", noteRepo.findAll());
    return "index";
  }

  @RequestMapping("/addNote")
  public String addNote(Model model,
                        @RequestParam(name = "description", required = false) String text) {
    if (!text.equals("")) {
      noteRepo.save(new Note(text));
      model.addAttribute("notes", noteRepo.findAll());
    }
    return "redirect:/";
  }

  @RequestMapping("/deleteNote/{id}")
  public String deleteNote(Model model,
                           @PathVariable("id") int id) {
    noteRepo.delete(new Long(id));
    model.addAttribute("notes", noteRepo.findAll());
    return "redirect:/";
  }

  @RequestMapping("/updateNote/{id}")
  public String updateNote(Model model,
                            @PathVariable("id") Long id) {
    model.addAttribute("currentId",id);
    return "update_note";
  }

  @RequestMapping("/changeText/{id}")
  public String changeText(Model model,
                           @PathVariable("id") Long id,
                            @RequestParam(name = "newText", required = false) String text) {
    Note note = noteRepo.findOne(id);
    note.setText(text);
    noteRepo.delete(id);
    noteRepo.save(note);

    model.addAttribute("notes",noteRepo.findAll());
    return "redirect:/";
  }
}
