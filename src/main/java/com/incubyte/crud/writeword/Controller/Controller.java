package com.incubyte.crud.writeword.Controller;

import com.incubyte.crud.writeword.Model.Word;
import com.incubyte.crud.writeword.Service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    WordService wordService;

    @PostMapping(value = "/word", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Word saveWord(@RequestBody Word word){
        wordService.addWord(word);
        return word;
    }

    @GetMapping(value = "/word", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Word> getWords(){
        return wordService.getWords();
    }

    @PutMapping(value = "/word", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Word updateWord(@RequestBody Word word){
        wordService.addWord(word);
        return word;
    }

    @DeleteMapping(value = "/word/{wordId}")
    public void deleteWord(@PathVariable("wordId") final Long wordId){
        wordService.deleteWord(wordId);
    }
}
