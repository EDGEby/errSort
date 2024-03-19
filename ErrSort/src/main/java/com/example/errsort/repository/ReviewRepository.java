package com.example.errsort.repository;

import com.example.errsort.dto.Review;
import org.springframework.data.repository.CrudRepository;

//import org.springframework.data.jpa.repository.JpaRepository;


public interface ReviewRepository extends CrudRepository<Review, Long> { }

//public interface ReviewRepository extends JpaRepository<Review, Long> {// здесь можно добавить кастомные методы для работы с отзывами}

