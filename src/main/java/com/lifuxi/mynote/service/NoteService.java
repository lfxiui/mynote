package com.lifuxi.mynote.service;

import com.lifuxi.mynote.mapper.NoteMapper;
import com.lifuxi.mynote.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NoteService {
    @Autowired
    private NoteMapper noteMapper;
    public List<Note> getNoteTitles(){
        return noteMapper.selectAll();
    }
}
