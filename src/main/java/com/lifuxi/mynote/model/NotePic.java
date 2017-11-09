package com.lifuxi.mynote.model;

import javax.persistence.*;

@Table(name = "note_pic")
public class NotePic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "note_id")
    private Integer noteId;

    @Column(name = "pic_id")
    private Integer picId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return note_id
     */
    public Integer getNoteId() {
        return noteId;
    }

    /**
     * @param noteId
     */
    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    /**
     * @return pic_id
     */
    public Integer getPicId() {
        return picId;
    }

    /**
     * @param picId
     */
    public void setPicId(Integer picId) {
        this.picId = picId;
    }
}