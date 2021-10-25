package me.minemis.QuizSiteApi.service;

import me.minemis.QuizSiteApi.dao.QuizRepository;
import me.minemis.QuizSiteApi.service.enitity.QuestionEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final QuizRepository repository;

    public QuestionService(QuizRepository repository) {
        this.repository = repository;
    }

    public void addQuestion(QuestionEntity questionEntity) {
        repository.save(questionEntity);
    }


}
