package com.incubyte.crud.writeword.Contoller;

import com.incubyte.crud.writeword.Controller.Controller;
import com.incubyte.crud.writeword.Model.Word;
import com.incubyte.crud.writeword.Service.WordService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    @InjectMocks
    Controller controller;

    @Mock
    WordService wordService;

    @Test
    public void testPostContoller(){
        Mockito.when(wordService.addWord(Mockito.any())).thenReturn(this.generateResponse());
        Assert.assertNotNull(controller.saveWord(this.generateResponse()));
    }

    @Test
    public void testGETContoller(){
        List<Word> ls = new ArrayList();
        ls.add(this.generateResponse());
        Mockito.when(wordService.getWords()).thenReturn(ls);
        Assert.assertNotNull(controller.getWords());
    }

    @Test
    public void testPUTContoller(){
        Mockito.when(wordService.addWord(Mockito.any())).thenReturn(this.generateResponse());
        Assert.assertNotNull(controller.updateWord(this.generateResponse()));
    }

    private Word generateResponse(){
        Word wrd = new Word();
        wrd.setId(1L);
        wrd.setWord("Book");
        return wrd;
    }
}
