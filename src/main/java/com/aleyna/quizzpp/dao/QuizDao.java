package com.aleyna.quizzpp.dao;

import com.aleyna.quizzpp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
