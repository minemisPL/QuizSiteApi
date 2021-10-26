package me.minemis.QuizSiteApi.dao;

import me.minemis.QuizSiteApi.service.enitity.QuizEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends CrudRepository<QuizEntity, Long> {
}
