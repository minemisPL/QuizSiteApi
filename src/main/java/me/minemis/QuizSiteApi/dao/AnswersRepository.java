package me.minemis.QuizSiteApi.dao;

import me.minemis.QuizSiteApi.service.enitity.AnswersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends CrudRepository<AnswersEntity, Long> {
}
