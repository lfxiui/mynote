package com.lifuxi.mynote.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public List<Note> getAllNotes() {
        PageHelper.startPage(2, 2);
        List list = noteMapper.selectAll();
        PageInfo<Note> notePageInfo = new PageInfo<Note>(list);
        System.out.println(notePageInfo.getPages());//页数
        //获取列表
        for (Note note : notePageInfo.getList()) {
            System.out.println(note.getTitle());
        }
        return noteMapper.selectAll();
    }

    public void addNote(Note note) {
        noteMapper.insert(note);
    }

    public void deleteNote(Note note) {
        noteMapper.delete(note);
    }
}
