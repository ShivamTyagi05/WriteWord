package com.incubyte.crud.writeword.Service;

import com.incubyte.crud.writeword.Model.Word;

import java.util.List;

public interface WordService {
    public Word addWord(Word word);
    public List<Word> getWords();
    public void deleteWord(Long word);
}
