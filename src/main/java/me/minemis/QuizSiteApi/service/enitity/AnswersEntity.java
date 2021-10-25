package me.minemis.QuizSiteApi.service.enitity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "answers")
@Getter @Setter
public class AnswersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity questionEntity;

    public AnswersEntity(String answer, QuestionEntity questionEntity) {
        this.answer = answer;
        this.questionEntity = questionEntity;
    }
}
