package com.incubyte.crud.writeword.Service;

import com.incubyte.crud.writeword.Model.Word;
import com.incubyte.crud.writeword.Repository.WordCrudRepository;
import com.incubyte.crud.writeword.Service.Impl.WordServiceImpl;
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
public class WordServiceImplTest {
    @Mock
    WordCrudRepository wordCrudRepository;

    @InjectMocks
    WordServiceImpl wordServiceImpl;

    @Test
    public void testAddWord(){
        Mockito.when(wordCrudRepository.save(Mockito.any())).thenReturn(this.generateResponse());
        Assert.assertNotNull(wordServiceImpl.addWord(this.generateResponse()));
    }

    @Test
    public void testGetWords(){
        List<Word> ls = new ArrayList();
        ls.add(this.generateResponse());
        Mockito.when(wordCrudRepository.findAll()).thenReturn(ls);
        Assert.assertNotNull(wordServiceImpl.getWords());
    }

    private Word generateResponse(){
        Word wrd = new Word();
        wrd.setId(1L);
        wrd.setWord("Book");
        return wrd;
    }
}
