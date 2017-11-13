package com.lifuxi.mynote.controller;

import com.lifuxi.mynote.model.Note;
import com.lifuxi.mynote.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/getAllNotes",method = RequestMethod.GET)
    @ResponseBody
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @RequestMapping(value="/addNote",method = RequestMethod.POST)
    @ResponseBody
    public Map addNote(@RequestBody Note note){
        note.setDate(new Date());
        noteService.addNote(note);
        Map map = new HashMap();
        map.put("data","success");
        return map;
    }
}
