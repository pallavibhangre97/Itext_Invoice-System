package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.impl.QuizServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizServiceImpl quizService;
    @PostMapping("/quiz")
    public Quiz create(@RequestBody Quiz quiz)
    {
       return quizService.add(quiz);
    }

    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable int id)
    {
        return quizService.get(id);
    }

    @GetMapping("/quizs")
    public List<Quiz> getQuiz()
    {
        return quizService.get();
    }
}
