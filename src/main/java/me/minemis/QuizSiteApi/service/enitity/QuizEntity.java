package me.minemis.QuizSiteApi.service.enitity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quizzes")
@Getter @Setter @NoArgsConstructor
public class QuizEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String quizName;
    private String author;

    @OneToMany(
            mappedBy = "quizEntity",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<QuestionEntity> questions = new ArrayList<>();

    public QuizEntity(String quizName, String author) {
        this.quizName = quizName;
        this.author = author;
    }
}
