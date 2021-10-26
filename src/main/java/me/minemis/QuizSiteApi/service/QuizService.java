package me.minemis.QuizSiteApi.service;

import lombok.RequiredArgsConstructor;
import me.minemis.QuizSiteApi.dao.AnswersRepository;
import me.minemis.QuizSiteApi.dao.QuestionRepository;
import me.minemis.QuizSiteApi.dao.QuizRepository;
import me.minemis.QuizSiteApi.service.enitity.QuizEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;
    private final AnswersRepository answersRepository;

    public boolean newQuiz(String name, String author) {
        Iterable<QuizEntity> repositoryAll = quizRepository.findAll();

        for (QuizEntity entity : repositoryAll) {
            if (entity.getQuizName().equals(name)
            && entity.getAuthor().equals(author)) {
                return false;
            }
        }

        QuizEntity entity = new QuizEntity(name, author);
        quizRepository.save(entity);

        return true;
    }

    public Optional<QuizEntity> getQuiz(Long id) {
        return quizRepository.findById(id);
    }

    public Optional<QuizEntity> getQuiz(String name) {
        Iterable<QuizEntity> repositoryAll = quizRepository.findAll();

        for (QuizEntity entity : repositoryAll) {
            if (entity.getQuizName().equals(name)) return Optional.of(entity);
        }

        return Optional.empty();
    }



}
