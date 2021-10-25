package me.minemis.QuizSiteApi.dao;

import me.minemis.QuizSiteApi.service.enitity.QuestionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<QuestionEntity, Long> {
}
