package com.incubyte.crud.writeword.Service.Impl;

import com.incubyte.crud.writeword.Model.Word;
import com.incubyte.crud.writeword.Repository.WordCrudRepository;
import com.incubyte.crud.writeword.Service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordCrudRepository wordCrudRepository;

    @Override
    public Word addWord(Word word) {
        wordCrudRepository.save(word);
        return word;
    }

    @Override
    public List<Word> getWords() {
        List<Word> words = new ArrayList<Word>();
        wordCrudRepository.findAll().forEach(wd -> words.add(wd));
        return words;
    }

    @Override
    public void deleteWord(Long wordId) {
        wordCrudRepository.deleteById(wordId);
    }
}
