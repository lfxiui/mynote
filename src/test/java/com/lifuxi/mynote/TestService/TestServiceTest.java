package com.lifuxi.mynote.TestService;

import com.github.pagehelper.PageInfo;
import com.lifuxi.mynote.model.Note;
import com.lifuxi.mynote.service.NoteService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestServiceTest {
    @Autowired
    private NoteService noteService;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void insert() throws Exception {

    }
}
