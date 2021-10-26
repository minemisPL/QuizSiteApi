package me.minemis.QuizSiteApi.api;

import lombok.RequiredArgsConstructor;
import me.minemis.QuizSiteApi.exception.RequestException;
import me.minemis.QuizSiteApi.service.QuizService;
import me.minemis.QuizSiteApi.service.enitity.QuizEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api")
public class QuizApi {

    private final QuizService quizService;

    @PostMapping("/newQuiz")
    public @ResponseBody
    String newQuiz(@RequestParam String name, @RequestParam String author) {
         boolean isDone = quizService.newQuiz(name, author);

         if (!isDone) {
             throw new RequestException("The quiz with that name already exists!");
         }

         return "Creation successful";
    }

    @GetMapping("/getQuiz")
    public @ResponseBody
    QuizEntity getQuiz(@RequestParam Long id) {
        Optional<QuizEntity> quiz = quizService.getQuiz(id);

        if (quiz.isEmpty()) {
            throw new RequestException("The quiz with given id not found");
        }

        return quiz.get();
    }

    //    public void addQuestion() {
//
//    }
//
//    public void addAnswer() {
//
//    }
}
