package me.minemis.QuizSiteApi.service.enitity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questions")
@Getter @Setter @NoArgsConstructor
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int points;
    private String question;
    private String content;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private QuizEntity quizEntity;

    @OneToMany(
            mappedBy = "questionEntity",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<AnswersEntity> answers = new ArrayList<>();

    public QuestionEntity(int points, String question, String content, QuizEntity quizEntity) {
        this.points = points;
        this.question = question;
        this.content = content;
        this.quizEntity = quizEntity;
    }
}
